<!DOCTYPE>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Map"%>

<%@page import="com.techelevator.ShoppingCart"%>
<html>
<header>
	<title>Cart</title>
</header>
	<h1>Shopping Cart Exercise</h1>
	<h2>Shopping Cart Contents</h2>
	
	<table border="1" style="width:100%">
	<tr>            
    	<th>Product</th>
    	<th>Price Per Item</th>		
    	<th>Quantity</th>
    	<th>Total Cost</th>
 	 </tr>
 	 <%
	ShoppingCart myCart = (ShoppingCart)session.getAttribute("ShoppingCart");
 	
 	for (Map.Entry<String,Integer> entry : myCart.getProductMap().entrySet()) {
 		String key = entry.getKey();
 	%>
 	<tr>
 		<td><%=myCart.getName(key) %></td>
 		<td>$<%=myCart.getPricePerItem(key) %></td>
 		 <td><%=myCart.getProductMap().get(key) %></td>
 		 <td><%=myCart.getPricePerItem(key)*myCart.getProductMap().get(key) %>
 	</tr>
 	<%
 	}
 	%>
 		
 	

 	 <tr>
 	 	<td colspan="3" align="right">Total</td>
 	 	<td><%= myCart.getTotalCost()%></td>
 	 </tr>
 	 
	<br>
	<a href="index.html"><<< Return to catalog</a>
	

</html>