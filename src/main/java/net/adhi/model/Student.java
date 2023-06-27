package net.adhi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;
private String name;
private String course;
private double fee;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(Long id, String name, String course, double fee) {
	super();
	this.id = id;
	this.name = name;
	this.course = course;
	this.fee = fee;
}
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
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
}


}
