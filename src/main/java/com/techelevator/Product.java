package com.techelevator;

public  class Product {
	
	String name;
	String displayName;
	double pricePerItem;
	
	
	Product(String name, double pricePerItem){
		this.name=name;
		this.pricePerItem=pricePerItem;
	}
	
	Product(String name){
		this.name=name;
		if(this.name.equals("carrot")){
			pricePerItem= 2.49;
			displayName="Carrots";
		}
		else if(this.name.equals("cucumber")){
			pricePerItem=2.99;
			displayName="Cucumbers";
		}
		else if(this.name.equals("radish")){
			pricePerItem=1.99;
			displayName="Radishes";
		}
		else if(this.name.equals("tomato")){
			pricePerItem=4.99;
			displayName="Heirloom Tomatoes";
		}
		else if(this.name.equals("pepper")){
			pricePerItem=5.99;
			displayName="Bell Peppers";
		}
	}
	
	public String getName(){
		return name;
	}
	
	public double getPricePerItem(){
		return pricePerItem;
	}
	
	public String getDisplayName(){
		return displayName;
	}
	
	
}
