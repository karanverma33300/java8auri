package com.karan.main;
import com.karan.model.products;
import com.karan.model.ShoppingCart;

public class App {

	public static void main(String[] args) {
		products p1= new products(21, "Laptop" , 4000 ,"HP"); 
		products p2 =new products();
		products p3=new products();
		p3.setData(244, "Iphone", 45000, "Apple");
		
		ShoppingCart s1 = new ShoppingCart(3,p1,p2,p3);
		
		ShoppingCart s2 = new ShoppingCart();
		ShoppingCart s3 = new ShoppingCart();
		s3.setShoppingCart(3,p1,p2,p3);
		
		
		System.out.println("###########################");
		s1.showCart();
		System.out.println("###########################");
		s2.showCart();
		System.out.println("###########################");
		s3.showCart();
	}

}
