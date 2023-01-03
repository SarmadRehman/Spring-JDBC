package com.springcore.jdbc.Entities;

public class Student {
private int ID ;
private String name;
private String city;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student() {
	super();
	}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Student(int iD, String name, String city) {
	super();
	ID = iD;
	this.name = name;
	this.city = city;
}

}
