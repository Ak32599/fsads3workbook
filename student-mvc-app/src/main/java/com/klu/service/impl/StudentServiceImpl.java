package com.klu.service.impl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.klu.model.*;
import com.klu.service.StudentService;
//
//@Service
//public class StudentServiceImpl implements StudentService {
//	
//	private List<Student> stdLst = new ArrayList<>();
//	
//	//Welcome msg
//	@Override
//	public String getWlcmMsg()
//	{
//		return "Welcome to student MVC apllication";
//	}
//	
//	//Create method
//	public Student CrteStd(Student std)
//	{
//		stdLst.add(std);
//		return std;
//	}
//	
//	//Read - get by Id
//	@Override
//	public Student getStdById(int id)
//	{
//		for(Student s: stdLst)
//		{
//			if(s.getId()==id)
//			{
//				return s;
//			}
//		}
//		return null;
//	}
//	//get all std's
//	public List<Student> getAllStds()
//	{
//		return stdLst;
//	}
//	
//	//update students
//	@Override
//	public Student updStd(int id,Student stdd)
//	{
//		for(int i=0;i<stdLst.size();i++)
//		{
//			if(stdLst.get(i).getId()==id)
//			{
//				stdd.setId(id);
//				stdLst.set(i, stdd);
//				return stdd;
//			}
//		}
//		return null;
//	}
//	
//	//delete
//	@Override
//	public String dltStd(int id)
//	{
//		for(Student s:stdLst)
//		{
//			if(s.getId()==id)
//			{
//				stdLst.remove(s);
//				return "Stud rcd dlted succlly";
//			}
//		}
//		return "No std rcd fnd";
//	}
//	
//	//search
//	@Override
//	public List<Student> srchStd(String nm,String course)
//	{
//		List<Student> res=new ArrayList<>();
//		for(Student s:stdLst)
//		{
//			if(s.getName().equalsIgnoreCase(nm) && s.getCourse()==course)
//			{
//				res.add(s);
//			}
//		}
//		return res;
//	}
//}
@Service
public class StudentServiceImpl implements StudentService {

    private List<Student> stdLst = new ArrayList<>();

    @Override
    public String getWlcmMsg() {
        return "Welcome to student MVC application";
    }

    @Override
    public Student CrteStd(Student std) {
        stdLst.add(std);
        return std;
    }

    @Override
    public Student getStdById(int id) {
        for (Student s : stdLst) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Student> getAllStds() {
        return stdLst;
    }

    @Override
    public Student updStd(int id, Student stdd) {
        for (int i = 0; i < stdLst.size(); i++) {
            if (stdLst.get(i).getId() == id) {
                stdd.setId(id);
                stdLst.set(i, stdd);
                return stdd;
            }
        }
        return null;
    }

    @Override
    public String dltStd(int id) {
        for (int i = 0; i < stdLst.size(); i++) {
            if (stdLst.get(i).getId() == id) {
                stdLst.remove(i);
                return "Stud rcd dlted succlly";
            }
        }
        return "No std rcd fnd";
    }

    @Override
    public List<Student> srchStd(String nm, String course) {
        List<Student> res = new ArrayList<>();
        for (Student s : stdLst) {
            if (s.getName().equalsIgnoreCase(nm)
                    && s.getCourse().equalsIgnoreCase(course)) {
                res.add(s);
            }
        }
        return res;
    }
}
