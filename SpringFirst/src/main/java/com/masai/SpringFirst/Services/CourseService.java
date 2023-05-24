package com.masai.SpringFirst.Services;

import java.util.List;

import com.masai.SpringFirst.entities.Course;

public interface CourseService {
public List<Course>getCourses();
public Course getCourses(int courseId);
public Course addCourse(Course course);
public Course updateCourse(Course c);
public void deleteCourse(int parseInt);
}
