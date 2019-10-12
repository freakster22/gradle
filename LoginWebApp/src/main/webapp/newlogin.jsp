<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Html</title>
</head>
<body style="background-color:black">
$useNm
<form action="login" method="post">
    <div class="container" style="color:white">Username: 
      <input type="text" placeholder="Enter Username" name="username" required>
<br>Password:
      <input type="password" placeholder="Enter Password" name="password" required>
<br>       
      <button type="submit" value="submit">Login</button>
    
      <button type="button" class="cancelbtn">Cancel</button>
      </div>
  </form>
</body>
</html>