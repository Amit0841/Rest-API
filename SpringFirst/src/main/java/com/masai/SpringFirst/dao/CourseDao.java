package com.masai.SpringFirst.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.SpringFirst.entities.Course;

public interface CourseDao extends JpaRepository<Course, Integer>{

}
