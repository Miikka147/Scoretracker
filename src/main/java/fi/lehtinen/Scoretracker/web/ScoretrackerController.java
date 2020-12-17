package fi.lehtinen.Scoretracker.web;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	@Autowired
	private CourseRepository crepository;
	@Autowired
	private GameRepository grepository;
	@Autowired
	private HoleRepository hrepository;


    @RequestMapping(value= {"/", "/courselist"})
    public String courseList(Model model) {	
        model.addAttribute("courses", crepository.findAll());
        return "courselist";
    }
    @RequestMapping(value = "/recentgames")
    public String viewRecentgames(Model model) {
    	model.addAttribute("games", grepository.findAll());
    	return "recentgames";
    }
    @RequestMapping(value= "/addcourse")
    public String addCourse(Model model) {
    	model.addAttribute("course", new Course());
    	return "addcourse";
    }
    
  

    

    @RequestMapping(value = "/addhole/{id}") 
    public String addHole(@PathVariable("id") Long courseId, Model model){
    	model.addAttribute("course", crepository.getOne(courseId));
    	model.addAttribute("hole", new Hole());
        return "addhole";
    }
    @RequestMapping(value = "addhole/save", method = RequestMethod.POST)
    public String save(Hole hole){
        hrepository.save(hole);
        return "redirect:../courselist";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Course course){
        crepository.save(course);
        return "redirect:/courselist";
    }

    @RequestMapping(value = "/addgame/{id}")
    public String addGame(@PathVariable("id") Long courseId, Model model){
    	model.addAttribute("course", crepository.getOne(courseId));
    	model.addAttribute("game", new Game());
        return "addgame";
    }

    
    @RequestMapping(value = "addgame/save", method = RequestMethod.POST)
    public String save(Game game){
        grepository.save(game);
        return "redirect:../courselist";
    }    

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteHole(@PathVariable("id") Long holeId, Model model) {
    	hrepository.deleteById(holeId);
        return "redirect:../courselist";
    }     
    @RequestMapping(value = "/view/{id}")
    public String viewCourse(@PathVariable("id") Long courseId, Model model) {
    	model.addAttribute("courses", crepository.getOne(courseId));
    	model.addAttribute("games", grepository.findByCourse(crepository.findById(courseId)));
    	model.addAttribute("holes", hrepository.findByCourse(crepository.findById(courseId)));
    	return "viewcourse";
    }   
  
	@GetMapping(value = "/edit/{id}")
	public String editHole(@PathVariable("id") Long holeId, Model model) {
		model.addAttribute("hole", hrepository.getOne(holeId));
		return "edithole";
	}
}