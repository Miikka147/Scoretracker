package fi.lehtinen.Scoretracker.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface HoleRepository extends CrudRepository<Hole, Long> {
	
	Object getOne(Long holeId);
	Optional<Hole> findById(Long id);
	List<Hole>findByCourse(Optional<Course> optional);
	
	
	
	
    
}