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
    @RequestMapping(value= "/addcourse")
    public String addCourse(Model model) {
    	model.addAttribute("course", new Course());
    	return "addcourse";
    }
    
  
    @RequestMapping(value = "/addgame")
    public String addGame(Model model){
    	model.addAttribute("course", crepository.findAll());
    	model.addAttribute("game", new Game());
        return "addgame";
    }
    @RequestMapping(value = "csave", method = RequestMethod.POST)
    public String save(Course course){
        crepository.save(course);
        return "redirect:./courselist";
    } 
    
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Game game){
        grepository.save(game);
        return "redirect:./courselist";
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
    @RequestMapping(value = "/recentgames")
    public String viewRecentgames(Model model) {
    	model.addAttribute("games", grepository.findAll());
    	return "recentgames";
    }
}