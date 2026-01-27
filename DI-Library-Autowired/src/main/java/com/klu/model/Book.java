package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private String isbn,tit,auth;
	private double price;
	public Book()
	{
		this.isbn="ISBN-101";
		this.tit="Meow meow pilli ...";
		this.auth="Akhilesh";
		this.price=999999999.99999;
	}
	
	public String getIsbn()
	{
		return isbn;
	}
	public String getTit()
	{
		return tit;
	}
	public String getAuth()
	{
		return auth;
	}
	public double getPrice()
	{
		return price;
	}
	@Override
	public String toString()
	{
		return "Book ->\n"+"		isbn=" + isbn + "\n"+"		title=" + tit +"\n"+"		author=" + auth +"\n"+"		price=" + price;
		
	}
	
}
