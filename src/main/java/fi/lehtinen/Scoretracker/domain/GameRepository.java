package fi.lehtinen.Scoretracker.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {
	
	Optional<Game> findById(Long id);
	List<Game>findByCourse(Optional<Course> optional);
	Object getOne(Long courseId);
	
	
	
	
    
}