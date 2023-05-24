package com.masai.SpringFirst.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
private int id;
private String title;
private String description;
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(int id, String title, String description) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
}
public long getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Course [id=" + id + ", title=" + title + ", description=" + description + "]";
}

}
