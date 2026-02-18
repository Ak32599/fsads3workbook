package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Student;
import com.klu.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentService srvc;
	
	//Welcome
	@GetMapping("/greet")
	public String getWlcmMsg()
	{
		return srvc.getWlcmMsg();
	}
	
	//create
	@PostMapping("/stdents/add")
	public Student CrteStd(@RequestBody Student std)
	{
		return srvc.CrteStd(std);
	}
	
	//get all the details
	@GetMapping("/student/getall")
	public List<Student> getAllStds()
	{
		return srvc.getAllStds();
	}
	
	//get by id
	@GetMapping("/student/getid/{id}")
	public Student getStdById(@PathVariable int id)
	{
		return srvc.getStdById(id);
	}
	
	//update
	@PutMapping("/student/update/{id}")
	public Student updStd(@PathVariable int id,@RequestBody Student std)
	{
		return srvc.updStd(id,std);
	}
	
	//delete
	@DeleteMapping("/student/del/{id}")
	public String dltStd(@PathVariable int id)
	{
		return srvc.dltStd(id);
	}
	
	//search
	@GetMapping("/student/search")
	public List<Student> srchStd(@RequestParam String nm,@RequestParam String crse)
	{
		return srvc.srchStd(nm,crse);
	}
}

//
//String getWlcmMsg();
//Student CrteStd(Student std);
//Student getStdById(int id);
//List<Student> getAllStds();
//Student updStd(int id,Student std);
//String dltStd(int id);
//List<Student> srchStd(String nm,String course);