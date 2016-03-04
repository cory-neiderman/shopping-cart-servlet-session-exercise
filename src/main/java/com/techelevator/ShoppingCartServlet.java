package com.techelevator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
 
public class ShoppingCartServlet extends HttpServlet {
    
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String productName=request.getParameter("productName");
		int amount = Integer.parseInt(request.getParameter("amount"));
		//double pricePerItem=Double.parseDouble(request.getParameter("pricePerItem"));
		Product newProduct = new Product(productName);
		
		HttpSession session = request.getSession();
		
		ShoppingCart myCart = (ShoppingCart)session.getAttribute("ShoppingCart");
		
		if (request.getSession().getAttribute("ShoppingCart") == null){
            myCart = new ShoppingCart();
            request.getSession().setAttribute("ShoppingCart", myCart);
        }
		
		myCart.addProduct(newProduct.getName(), amount);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.html");
		dispatcher.forward(request, response);
		
		

		
		
	
		
	
    }
}