package fi.lehtinen.Scoretracker.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


	public interface CourseRepository extends CrudRepository<Course, Long> {

	    Optional<Course> findById(Long id);
		Object getOne(Long courseId);
	    
	}

