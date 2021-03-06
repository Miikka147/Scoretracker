package fi.lehtinen.Scoretracker.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


	public interface CourseRepository extends CrudRepository<Course, Long> {

	    Optional<Course> findById(Long id);
	    List<Course> findByName(String name);
		Object getOne(Long courseId);
	    
		Course save(Course course);
	}

