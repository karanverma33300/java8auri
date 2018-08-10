package com.karan.model;


public class products {
	
	int pid;
	String name;
	int price;
	String brand;
	
	public products() {
		pid= 0;
		name ="NA";
		price = 0;
		brand = "NA";
	
	}
	 
	public products(int i,String n,int p,String b) {
		pid = i;
		name = n;
		price = p;
		brand=b;
	}
	public void setData(int i, String n, int p,String b){
		pid = i;
		name = n;
		price = p;
		brand=b;
	}
	public void showProduct(){
		System.out.println(name+" is the name of product of brand"+brand+" having product id "+pid+" and and price is "+price);
	}
}
