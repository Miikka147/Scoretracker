package fi.lehtinen.Scoretracker.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HOLE")
public class Hole {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String name;
private int par;
private int distance;

@ManyToOne
@JoinColumn(name="course_id")
public Course course;

public Hole() {
	
}
public Hole(String name,int par,int distance, Course course) {
	super();
	this.name=name;
	this.par=par;
	this.distance=distance;
	this.course=course;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getPar() {
	return par;
}
public void setPar(int par) {
	this.par = par;
}
public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
