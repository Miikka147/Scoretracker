package fi.lehtinen.Scoretracker;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.lehtinen.Scoretracker.domain.CourseRepository;
import fi.lehtinen.Scoretracker.domain.GameRepository;
import fi.lehtinen.Scoretracker.domain.HoleRepository;
import fi.lehtinen.Scoretracker.domain.UsrRepository;






@SpringBootApplication
public class ScoretrackerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ScoretrackerApplication.class, args);
	}
	@Bean
	public CommandLineRunner Ticketguru(CourseRepository courserepository,GameRepository gamerepository,HoleRepository holerepository,UsrRepository usrrepository) {
		return (args) -> {
	
		};
	}
}

