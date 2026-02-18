package com.klu.service;
import java.util.List;
import com.klu.model.*;
public interface StudentService {
	String getWlcmMsg();
	Student CrteStd(Student std);
	Student getStdById(int id);
	List<Student> getAllStds();
	Student updStd(int id,Student std);
	String dltStd(int id);
	List<Student> srchStd(String nm,String course);
	
}
