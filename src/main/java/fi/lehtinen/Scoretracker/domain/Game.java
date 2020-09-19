package fi.lehtinen.Scoretracker.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GAME")
public class Game {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private Long showbyid;

private String date;
private int one;
private int two;
private int three;
private int four;
private int five;
private int six;
private int seven;
private int eight;
private int nine;
private int ten;
private int eleven;
private int twelve;
private int thirteen;
private int fourteen;
private int fifteen;
private int sixteen;
private int seventeen;
private int eighteen;

@ManyToOne
@JoinColumn(name="courseId")
private Course course;

public Game() {
	
}
public Game(Long showbyid) {
	this.showbyid = showbyid;
	
}

public Long getShowbyid() {
	return showbyid;
}
public void setShowbyid(Long showbyid) {
	this.showbyid = showbyid;
}
public int getOne() {
	return one;
}

public void setOne(int one) {
	this.one = one;
}

public int getTwo() {
	return two;
}

public void setTwo(int two) {
	this.two = two;
}

public int getThree() {
	return three;
}

public void setThree(int three) {
	this.three = three;
}

public int getFour() {
	return four;
}

public void setFour(int four) {
	this.four = four;
}

public int getFive() {
	return five;
}

public void setFive(int five) {
	this.five = five;
}

public int getSix() {
	return six;
}

public void setSix(int six) {
	this.six = six;
}

public int getSeven() {
	return seven;
}

public void setSeven(int seven) {
	this.seven = seven;
}

public int getEight() {
	return eight;
}

public void setEight(int eight) {
	this.eight = eight;
}

public int getNine() {
	return nine;
}

public void setNine(int nine) {
	this.nine = nine;
}

public int getTen() {
	return ten;
}

public void setTen(int ten) {
	this.ten = ten;
}

public int getEleven() {
	return eleven;
}

public void setEleven(int eleven) {
	this.eleven = eleven;
}

public int getTwelve() {
	return twelve;
}

public void setTwelve(int twelve) {
	this.twelve = twelve;
}

public int getThirteen() {
	return thirteen;
}

public void setThirteen(int thirteen) {
	this.thirteen = thirteen;
}

public int getFourteen() {
	return fourteen;
}

public void setFourteen(int fourteen) {
	this.fourteen = fourteen;
}

public int getFifteen() {
	return fifteen;
}

public void setFifteen(int fifteen) {
	this.fifteen = fifteen;
}

public int getSixteen() {
	return sixteen;
}

public void setSixteen(int sixteen) {
	this.sixteen = sixteen;
}

public int getSeventeen() {
	return seventeen;
}

public void setSeventeen(int seventeen) {
	this.seventeen = seventeen;
}

public int getEighteen() {
	return eighteen;
}

public void setEighteen(int eighteen) {
	this.eighteen = eighteen;
}


public Game(String date) {
	super();
	this.date = date;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public Course getCourse() {
	return course;
}

public void setCourse(Course course) {
	this.course = course;
}


}
