package fi.lehtinen.Scoretracker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.lehtinen.Scoretracker.domain.Game;
import fi.lehtinen.Scoretracker.domain.Course;
import fi.lehtinen.Scoretracker.domain.CourseRepository;
import fi.lehtinen.Scoretracker.domain.GameRepository;
import fi.lehtinen.Scoretracker.domain.HoleRepository;



@SpringBootApplication
public class ScoretrackerApplication {
	//private static final Logger log = LoggerFactory.getLogger(ScoretrackerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ScoretrackerApplication.class, args);
	}
	/*
	@Bean
	public CommandLineRunner Scoretracker(CourseRepository crepository,GameRepository grepository,HoleRepository hrepository) {
		return (args) -> {
			log.info("save courses");
			
			
			crepository.save(new Course("Siltamäki","Helsinki","siltamäentie",18));
			crepository.save(new Course("Kivikko frisbeegolf","Helsinki","peltotie 19",18));	
			grepository.save(new Game(20,crepository.findByName("Siltamäki").get(0)));
			grepository.save(new Game(20,crepository.findByName("Kivikko frisbeegolf").get(0)));
			log.info("fetch all courses");
			for (Course course : crepository.findAll()) {
				log.info(course.toString());
			}

		};
	}
*/
} 
