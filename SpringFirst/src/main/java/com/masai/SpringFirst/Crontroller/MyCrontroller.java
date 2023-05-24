package com.masai.SpringFirst.Crontroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.SpringFirst.Services.CourseService;
import com.masai.SpringFirst.entities.Course;

@RestController
public class MyCrontroller {
	
@GetMapping("/Home")
	public String home() {
		return "Welcome";
	}
// create object
@Autowired
private CourseService cs;
// get
	@GetMapping("/course")
public List<Course>  getCourses(){
	return this.cs.getCourses();
  }
	// get by id
	@GetMapping("/course/{courseId}")
	public Course getCourses1(@PathVariable String courseId) {
		return this.cs.getCourses(Integer.parseInt(courseId));
	}
	// post request
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return this.cs.addCourse(course);
	}
	// put / update request
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course c) {
		return this.cs.updateCourse(c);
	}
	// delete 
	@DeleteMapping("/course/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			this.cs.deleteCourse(Integer.parseInt(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
}
