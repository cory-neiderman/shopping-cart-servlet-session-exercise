package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
	
	
	public HashMap<String, Integer> productMap;

	public ShoppingCart(){
		
		productMap=new HashMap<>();
	}
	
	
	public void addProduct(String productName, int amount){
		if(!productMap.containsKey(productName)){
			productMap.put(productName, amount);
		}
		else{
			int currentAmount=productMap.get(productName);
			productMap.put(productName, currentAmount+amount);
		}
	}
	
	public HashMap<String, Integer> getProductMap(){
		return productMap;
	}
	
	public double getTotalCost(){
		
		double totalCost=0;
		
		for(Map.Entry<String,Integer> entry : productMap.entrySet()) {
			  String key = entry.getKey();
			  Product myProduct=new Product(key);
			  totalCost=totalCost+productMap.get(key)*myProduct.getPricePerItem();
		}
		return totalCost;
	}
	
	public double getPricePerItem(String name){
		Product myProduct = new Product(name);
		return myProduct.getPricePerItem();
		
	}
	
	public String getName(String name){
		Product myProduct = new Product(name);
		return myProduct.getDisplayName();
	}
}
