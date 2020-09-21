package fi.lehtinen.Scoretracker.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {

	List<Game>findByCourse(Optional<Course> optional);
	
	
	
	
    
}