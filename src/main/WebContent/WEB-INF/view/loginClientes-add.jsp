<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<h1> Login Clientes </h1>


<form action="add" method="POST">


	id
	<input type="hidden" id="id" name="id" value="${logincliente.id}">
	<br/><br>
	user
	 	<input type="text" id="user" name="user" value="${logincliente.user}">
	<br/><br>
	password
		<input type="text" id="password" name="password" value="${logincliente.password}">
	<br/><br>
	newpassword
		<input type="text" id="newpassword" name="newpassword" value="${logincliente.newpassword}">
	<br/><br>
	confirmpassword
		<input type="text" id="confirmpassword" name="confirmpassword" value="${logincliente.confirmpassword}">
	<br/><br>
	loginCorreo
		<input type="text" id="loginCorreo" name="loginCorreo" value="${logincliente.loginCorreo}">
	<br/><br>
	loginToken
		<input type="text" id="loginToken" name="loginToken" value="${logincliente.loginToken}">
	<br/><br>
	
	 SessiontimeIn
	 <input type="date" id="sessiontimeIn" name="sessiontimeIn" value="${fn:substring(logincliente.sessiontimeIn,0,10)}">
	 <br/><br/>
	 SessiontimeOUT
	 <input type="date" id="sessiontimeOUT" name="sessiontimeOUT" value="${fn:substring(logincliente.sessiontimeOUT,0,10)}">
	 <br/><br/>
		Sessiontiempo
		<input type="text" id="sessiontiempo" name="sessiontiempo" value="${logincliente.sessiontiempo}">
	<br/><br>
	<button type="submit">Guardar</button>
	<button type="button" onclick="window.location.href='/ismac-emprendimientos1-web/loginclientes/findAll';return false;">Cancelar</button>
	 
	 


</form>

</body>
</html>