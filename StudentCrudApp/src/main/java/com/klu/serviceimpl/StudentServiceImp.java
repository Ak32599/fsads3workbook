package com.klu.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.model.Student;
import com.klu.repo.StudentRepo;
import com.klu.service.StudentService;

@Service
public class StudentServiceImp implements StudentService{
	@Autowired
	private StudentRepo stdrepo;
	
	@Override
	public Student CrteStd(Student std)
	{
		return stdrepo.save(std);
	}
	
	@Override
	public Student getStdById(int id)
	{
		return stdrepo.findById(id).orElse(null);
	}
	//get all std's
	public List<Student> getAllStds()
	{
		return stdrepo.findAll();
	}
	
	//update students
	@Override
	public Student updStd(int id,Student std)
	{
		 if (stdrepo.existsById(id)) {
             std.setId(id);
             return stdrepo.save(std);
         }
         return null;
	}
	
	//delete
	@Override
	public String dltStd(int id)
	{
		  if (stdrepo.existsById(id)) {
              stdrepo.deleteById(id);
              return "Student deleted successfully";
          }
          return "Student not found";
	}
	
	//search
	@Override
	public List<Student> srchStd(String nm,String course)
	{
		 return stdrepo.findByNmIgnoreCaseAndCourseIgnoreCase(nm, course);
	}
}
//Student CrteStd(Student std);
//Student getStdById(int id);
//List<Student> getAllStds();
//Student updStd(int id,Student std);
//String dltStd(int id);
//List<Student> srchStd(String nm,String course);