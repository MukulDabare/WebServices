<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<script type="text/javascript">
function login() 
{
    alert("Hello Login");
    var username = document.getElementById("un").value;
    var password = document.getElementById("ps").value;
    alert(username);
    alert(password );
    
    var req= new XMLHttpRequest();
    var url= "http://localhost:9091/getCon/"+username+"/"+password+"";
    req.open("GET", url, true);
    req.send();
    
}

</script>
<body>
<form action="login">
UserName:
<input type="text" name="username" id="un"> <br>
Password:
<input type="text" name="password" id="ps"> <br>

<input type="button" value="login" onclick="login()">
</form>
</body>
</html>