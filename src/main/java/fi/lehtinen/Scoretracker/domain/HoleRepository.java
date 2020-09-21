package fi.lehtinen.Scoretracker.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface HoleRepository extends CrudRepository<Hole, Long> {

	List<Hole>findByCourse(Optional<Course> optional);
	
	
	
	
    
}