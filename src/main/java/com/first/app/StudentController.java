package com.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent()
	{
		return new Student("Vidya","Vani");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> std=new ArrayList();
		std.add(new Student("Ram","Leela"));
		std.add(new Student("Radhe","Shyam"));
		std.add(new Student("Ram","HAri"));
		std.add(new Student("Om","Sai"));
		return std;
	}
	
	//@pathvariable annotation used to give input to the variables using uri
	//localhost:8080/student/vidya/vani
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student setStudentNames(@PathVariable("firstName") String firstName,@PathVariable("lastName")String lastName) {
		return new Student(firstName,lastName);
	}
	
	//build rest api using query parameters
	//localhost:8080/student?firstname=vidya&lastname=vani
	@GetMapping("/studentQuery")
	public Student setStudentQueryParam(@RequestParam(name="firstName")String firstName,@RequestParam(name="lastName")String lastName) {
		return new Student(firstName,lastName);
	}
	
}
