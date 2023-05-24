package com.masai.SpringFirst.Services;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.SpringFirst.dao.CourseDao;
import com.masai.SpringFirst.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
private CourseDao courseDao;
	
public CourseServiceImpl() {

}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourses(int courseId) {
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course c) {
		courseDao.save(c);
		return c;
	}

	@Override
	public void deleteCourse(int parseInt) {
	Course ent=courseDao.getOne(parseInt);
	courseDao.delete(ent);
		
	}

}
