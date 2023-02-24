<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
crossorigin="anonymous">

<script 
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
  crossorigin="anonymous">
</script>
</head>
<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img
     src = "https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
     alt = "" width = "80" height = "48" class = "d-line-block align-text-top" > 
 </a>
 
 <a href = "index.jsp"> Home </a>
 </div>
 </nav>
 
 <form action = "egg" method = "Post">
 <pre>
HotelName   <input type = "text" name = "hotelName"/>
DishName   <select name = "dishName">
<option> Select </option>
<option> Omlet </option>
<option> Egg-Rice </option>
<option> Half Boil </option>
<option> Egg puff </option>
<option> Egg Burge </option>
<option> Egg Masala </option>
<option> Egg Bonda </option>
<option> Egg Chilli </option>
<option> Egg Maggie </option>
</select>

Egg Type   <select name = "type">
<option> Select </option>
<option> Nati </option>
<option> Farm </option>
<option> Boiler </option>
<option> Duck </option>
</select>

Price  <input type = "number" name = "price"/>
Quantity   <input type = "number" name = "quantity"/>
TakeAway yes <input type = "radio" name = "takeAway" value = "yes"/>
         no <input type = "radio" name = "takeAway" value = "no"/>
       <input type = "submit" value = "send"/>
 </pre>  
 </form>

</body>
</html>