<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1> Clientes </h1>
	
	<form action="add" method="POST" >
		
		 idCliente
		 <input type="hidden" id="idCliente" name="idCliente" value="${cliente.idCliente}">
		 <br/><br/>
		 cedula
		 <input type="text" id="cedula" name="cedula" value="${cliente.cedula}">
		 <br/><br/>
		 nombre
		 <input type="text" id="nombre" name="nombre" value="${cliente.nombre}">
		 <br/><br/>
		 apellido
		 <input type="text" id="apellido" name="apellido" value="${cliente.apellido}">
		 <br/><br/>
		 direccion
		 <input type="text" id="direccion" name="direccion" value="${cliente.direccion}">
		 <br/><br/>
		 telefono
		 <input type="text" id="telefono" name="telefono" value="${cliente.telefono}">
		 <br/><br/>
		 correo
		 <input type="email" id="correo" name="correo" value="${cliente.correo}">
		 <br/><br/>	 
		 <button type="submit">Guardar</button>	
		 <button type="button" onclick="window.location.href='/ismac-spring-libreria-web/clientes/findAll'; return false;">Cancelar</button>
	</form>

</body>
</html>