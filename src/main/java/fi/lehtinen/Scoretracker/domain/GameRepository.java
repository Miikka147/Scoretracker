package fi.lehtinen.Scoretracker.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {

	List<Game>findByCourse(Course course, Sort sort);
	Optional<Game> findById(Long id);
	Object getOne(Long gameId);
	
	
    
}