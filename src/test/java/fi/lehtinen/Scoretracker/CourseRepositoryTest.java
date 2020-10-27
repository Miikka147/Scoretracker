package fi.lehtinen.Scoretracker;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import fi.lehtinen.Scoretracker.domain.Course;
import fi.lehtinen.Scoretracker.domain.CourseRepository;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CourseRepositoryTest {

	@Autowired
	private CourseRepository crepository;
	
	@Test
	public void findByNameShouldReturnCourse() {
		List<Course> courses = crepository.findByName("Kivikko");
	
		assertThat(courses).hasSize(1);		
	}
	
	@Test
	public void addCourse() {
		Course course = new Course("Esimerkki","Kaupunki", "joku osoite", 18);
		crepository.save(course);
		assertThat(course.getCourse_id()).isNotNull();
	}
}
