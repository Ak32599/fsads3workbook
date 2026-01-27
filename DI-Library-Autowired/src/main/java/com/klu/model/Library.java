package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {
	private int libId;
	private String libName;
	private Book bk; //dependency this is
	public Library()
	{
		this.libId=99;
		this.libName="Centural library";
	}
	
	//setter injection
	@Autowired
	public void setBook(Book bk)
	{
		this.bk=bk;
	}
	public void dispDet()
	{
		System.out.println("Library Id: "+libId);
		System.out.println("Library Name: "+libName);
		System.out.println("Book Details: "+bk);
	}
	

}
