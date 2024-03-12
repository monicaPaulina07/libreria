<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1>LogIn Clientes</h1>
	
	<button> 
	<a href="${pageContext.request.contextPath}/loginclientes/findOne?opcion=1"> Agregar </a>
	</button>
	
	
	<table>
	
		<thead>
	
				<tr>
				
				<th>id</th>
				<th>user</th>
				<th>password</th>
				<th>newpassword</th>
				<th>confirmpassword</th>
				<th>loginCorreo</th>
				<th>loginToken</th>
				<th>SessiontimeIn</th>
				<th>SessiontimeOUT</th>
				<th>Sessiontiempo</th>
			
				<th>Acciones</th>
				
				</tr>
	
	</thead>
	
	<tbody>
	
	<tr>	
	
			<td>id</td>
		<td>user</td>
		<td>password</td>
		<td>newpassword</td>
		<td>confirmpassword</td>
		<td>loginCorreo</td>
		<td>loginToken</td>
		<td>SessiontimeIn</td>
		<td>SessiontimeOUT</td>
		<td>Sessiontiempo</td>
	
		<td>Acciones</td>

	</tr>
	
	</tbody>

		<c:forEach var="item" items="${loginClientes}">
			<tr>	
			
			
		<td>${item.id}</td>
		<td>${item.user}</td>
		<td>${item.password}</td>
		<td>${item.newpassword}</td>
		<td>${item.confirmpassword}</td>
		<td>${item.loginCorreo}</td>
		<td>${item.loginToken}</td>
		<td>${item.sessiontimeIn}</td>
		<td>${item.sessiontimeOUT}</td>
		<td>${item.sessiontiempo}</td>
	
		<td>
	<button> <a href="${pageContext.request.contextPath}/loginclientes/findOne?id=${item.id}&opcion=1"> Actualizar </a></button>
		<button> <a href="${pageContext.request.contextPath}/loginclientes/findOne?id=${item.id}&opcion=2"> Eliminar </a></button>

		</td>

	</tr>
		</c:forEach>
	
	</table>

</body>
</html>