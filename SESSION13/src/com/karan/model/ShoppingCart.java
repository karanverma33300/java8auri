package com.karan.model;

public class ShoppingCart {
	int cartSize;
	int cartPrice;
	products[] Product;
	
	public ShoppingCart(){
		cartSize =0;
		cartPrice=0;
		Product =new products[3];
		}
	
	public ShoppingCart(int s,products a,products b,products c){
		Product =new products[3];
		cartSize = s;
		Product[0]=a;
		Product[1]=b;
		Product[2]=c;
		cartPrice= a.price+b.price+c.price;
		
	}
	
	public void setShoppingCart(int s,products a,products b,products c){
		cartSize =s;
		Product[0]=a;
		Product[1]=b;	
		Product[2]=c;
		cartPrice= a.price+b.price+c.price;
		
	}
	
	public void showCart(){
		System.out.println("==Cart Details==");
		for (int i=0;i<3;i++)
		{Product[i].showProduct();
	}
		System.out.println("Total Price="+cartPrice);
	}

}
