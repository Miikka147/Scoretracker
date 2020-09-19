package fi.lehtinen.Scoretracker.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import fi.lehtinen.Scoretracker.domain.Course;
import fi.lehtinen.Scoretracker.domain.CourseRepository;
import fi.lehtinen.Scoretracker.domain.Game;
import fi.lehtinen.Scoretracker.domain.GameRepository;



@Controller
public class ScoretrackerController {
	@Autowired
	private CourseRepository crepository;
	@Autowired
	private GameRepository grepository;
	


    @RequestMapping(value= {"/", "/courselist"})
    public String studentList(Model model) {	
        model.addAttribute("courses", crepository.findAll());
        return "courselist";
    }
  
    @RequestMapping(value = "/add/{id}")
    public String addGame(@PathVariable("id") Long courseId, Model model){
    	model.addAttribute("game", new Game(courseId));
    	model.addAttribute("courses", crepository.getOne(courseId));
        return "addgame";
    }     
    
    @RequestMapping(value = "/add/save", method = RequestMethod.POST)
    public String save(Game game){
        grepository.save(game);
        return "redirect:../courselist";
    }    

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteBook(@PathVariable("id") Long courseId, Model model) {
    	crepository.deleteById(courseId);
        return "redirect:../booklist";
    }     
    @RequestMapping(value = "/view/{id}")
    public String viewCourse(@PathVariable("id") Long courseId, Model model) {
    	model.addAttribute("courses", crepository.getOne(courseId));
    	model.addAttribute("games", grepository.findAll());
    	return "viewcourse";
    }   
}