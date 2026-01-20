package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductOrder {
	private int ordid;
	private String custname;
	private String prodname;
	private int quantity;
	
	//constructor dependency injection
	public ProductOrder(@Value("102") int ordid, @Value("AK") String custname)
	{
		this.ordid=ordid;
		this.custname=custname;
	}
	@Value("Mouse")
	public void setProductName(String prodname)
	{
		this.prodname=prodname;
	}
	@Value("10")
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public void disp()
	{
		System.out.println("Following is the ordered details=");
		System.out.println("OrderId is : "+ordid);
		System.out.println("Customer name : "+custname);
		System.out.println("Product name : "+prodname);
		System.out.println("Quantity : "+quantity);
	}
}