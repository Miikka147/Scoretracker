package fi.lehtinen.Scoretracker.domain;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Course {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long course_id;
    
	private String name, city, address,rating;
	private int holesqty;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
	private List<Game> games;
	
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
	private List<Hole> holes;
	
	public void setHoles(List<Hole> holes) {
		this.holes = holes;
	}
	public List<Hole> getHoles(){
		return holes;
	}
	
public Course(String name, String city, String address, int holesqty) {
	this.name = name;
	this.city = city;
	this.address = address;
	this.holesqty = holesqty;
}
public Course() {}


public Long getCourse_id() {
	return course_id;
}
public void setCourse_id(Long course_id) {
	this.course_id = course_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getHolesqty() {
	return holesqty;
}
public void setHolesqty(int holesqty) {
	this.holesqty = holesqty;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}

}