package fi.lehtinen.Scoretracker.web;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fi.lehtinen.Scoretracker.domain.Course;
import fi.lehtinen.Scoretracker.domain.CourseRepository;
import fi.lehtinen.Scoretracker.domain.Game;
import fi.lehtinen.Scoretracker.domain.GameRepository;
import fi.lehtinen.Scoretracker.domain.Hole;
import fi.lehtinen.Scoretracker.domain.HoleRepository;



@Controller

public class ScoretrackerController {
	
	@Bean
	public Validator validator() {
	    return new LocalValidatorFactoryBean();
	}

	public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
	    validatingListener.addValidator("afterCreate", (org.springframework.validation.Validator) validator());
	    validatingListener.addValidator("beforeCreate", (org.springframework.validation.Validator) validator());
	    validatingListener.addValidator("afterSave", (org.springframework.validation.Validator) validator());
	    validatingListener.addValidator("beforeSave", (org.springframework.validation.Validator) validator());
	}
	
	
	@Autowired
	private CourseRepository crepository;
	@Autowired
	private GameRepository grepository;
	@Autowired
	private HoleRepository hrepository;


	@PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    @RequestMapping(value= {"/", "/courselist"})
    public String courseList(Model model) {	
        model.addAttribute("courses", crepository.findAll());
        return "courselist";
    }
	@PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    @RequestMapping(value = "/recentgames")
    public String viewRecentgames(Model model) {
    	model.addAttribute("games", grepository.findAll());
    	return "recentgames";
    }
	@PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value= "/addcourse")
    public String addCourse(Model model) {
    	model.addAttribute("course", new Course());
    	return "addcourse";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/addhole/{id}") 
    public String addHole(@PathVariable("id") Long courseId, Model model){
    	model.addAttribute("course", crepository.getOne(courseId));
    	model.addAttribute("hole", new Hole());
        return "addhole";
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "addhole/save", method = RequestMethod.POST)
    public String save(Hole hole){
        hrepository.save(hole);
        return "redirect:../courselist";
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Course course){
        crepository.save(course);
        return "redirect:/courselist";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    @RequestMapping(value = "/addgame/{id}")
    public String addGame(@PathVariable("id") Long courseId, Model model){
    	model.addAttribute("course", crepository.getOne(courseId));
    	model.addAttribute("game", new Game());
        return "addgame";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "addgame/save", method = RequestMethod.POST)
    public String save(Game game){
        grepository.save(game);
        return "redirect:../courselist";
    }    

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteHole(@PathVariable("id") Long holeId, Model model) {
    	hrepository.deleteById(holeId);
        return "redirect:../courselist";
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    @RequestMapping(value = "/view/{id}")
    public String viewCourse(@PathVariable("id") Long courseId, Model model) {
    	model.addAttribute("courses", crepository.getOne(courseId));
    	model.addAttribute("games", grepository.findByCourse(crepository.findById(courseId)));
    	model.addAttribute("holes", hrepository.findByCourse(crepository.findById(courseId)));
    	return "viewcourse";
    }   
  
    @PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value = "/edit/{id}")
	public String editHole(@PathVariable("id") Long holeId, Model model) {
		model.addAttribute("hole", hrepository.getOne(holeId));
		return "edithole";
	}
}