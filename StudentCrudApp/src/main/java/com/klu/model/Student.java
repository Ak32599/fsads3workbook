package com.klu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id 
	private int id;
	private String nm;
	private String course;
	public Student()
	{}
	public Student(int id,String nm,String crs)
	{
		this.id=id;
		this.nm=nm;
		this.course=crs;
	}
	  
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNm() {
	        return nm;
	    }

	    public void setNm(String nm) {
	        this.nm = nm;
	    }

	    public String getCourse() {
	        return course;
	    }

	    public void setCourse(String course) {
	        this.course = course;
	    }
}