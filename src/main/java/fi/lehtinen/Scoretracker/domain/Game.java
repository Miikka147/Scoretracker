package fi.lehtinen.Scoretracker.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Game {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private int score;

@ManyToOne
@JoinColumn(name="course_id")
public Course course;

public Game() {
	
}
public Game(int score,Course course) {
	super();
	this.score=score;
	this.course=course;
}


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}

}