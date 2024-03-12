<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1> Libros </h1>

		<button> 
			<a href="${pageContext.request.contextPath}/libros/findOne?opcion=1"> 
				Agregar 
			</a>
		</button>

	  
	<table>
		<thead>
			<tr>
				<th>id_libro</th>
				<th>titulo</th>				
				<th>editorial</th>
				<th>num_paginas</th>
				<th>edicion</th>
				<th>idioma</th>
				<th>fecha_publicacion</th>
				<th>descripcion</th>
				<th>tipo_pasta</th>
				<th>ISBN</th>
				<th>num_ejemplares</th>
				<th>portada</th>
				<th>presentacion</th>
				<th>precio</th>
				<th>id_categoria</th>
				<th>id_autor</th>
				<th>Acciones</th>				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${libros}">
				<tr>				
					<td>${item.idLibro}</td>
					<td>${item.titulo}</td>				
					<td>${item.editorial}</td>
					<td>${item.numPaginas}</td>
					<td>${item.edicion}</td>
					<td>${item.idioma}</td>
					<td>${fn:substring(item.fechaPublicacion)}</td>
					<td>${item.descripcion}</td>
					<td>${item.tipoPasta}</td>
					<td>${item.ISBN}</td>
					<td>${item.numEjemplares}</td>
					<td><img width="100" height="100" src="${pageContext.request.contextPath}/resources/img/${item.portada}" /></td>
					<td>${item.presentacion}</td>
					<td>${item.precio}</td>
					<td>${item.categoria.categoria}</td>
					<td>${item.autor.nombre} ${item.autor.apellido}</td>
					<td>
						<button><a href="${pageContext.request.contextPath}/libros/findOne?idLibro=${item.idLibro}&opcion=1">Actualizar</a></button>
						<button><a href="${pageContext.request.contextPath}/libros/findOne?idLibro=${item.idLibro}&opcion=2">Eliminar</a></button>
					</td>		
			
				</tr>
			</c:forEach>
			
		</tbody>
	</table>


</body>
</html>