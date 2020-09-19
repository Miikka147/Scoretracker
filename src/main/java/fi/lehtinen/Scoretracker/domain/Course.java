package fi.lehtinen.Scoretracker.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "COURSE")
public class Course {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
	private String name, city, address;
	private int holesqty;
	
	@OneToMany(mappedBy="course")
	private List<Game> games;
	
	

public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
public Course(String name, String city, String address, int holesqty) {
	this.name = name;
	this.city = city;
	this.address = address;
	this.holesqty = holesqty;
}
public Course() {}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
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

}