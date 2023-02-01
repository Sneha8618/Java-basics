<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>

<form action = "details" method = "Post">
<pre> 
FirstName <input type = "text" name = "fname"/>
LastName <input type = "text" name = "Lname"/>
Gender Male <input type = "radio" name = "gender"/>
       Female <input type = "radio" name = "gender" value="male"/>
       Others <input type = "radio" name = "gender" value = "female"/>
 Address <input type = "text" name = "address" value = "others"/>
 Reason <textarea rows = "5" cols = "25" name = "reason"> </textarea>
<input type = "submit" value = "send"/>
</pre>
</form>



</body>
</html>