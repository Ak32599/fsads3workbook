package com.klu.model;

public class Student {
	private int id;
	private String name;
	private String course;
	public Student()
	{
		
	}
	public Student(int id,String name,String course)
	{
		this.id=id;
		this.name=name;
		this.course=course;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String nm)
	{
		this.name=nm;
	}
	public String getCourse()
	{
		return course;
	}
	public void setCourse(String crse)
	{
		this.course=crse;
	}
}