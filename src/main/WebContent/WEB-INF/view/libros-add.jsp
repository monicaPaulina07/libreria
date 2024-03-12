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
	<h1> Libros </h1>
	
	<form action="add" method="POST" enctype="multipart/form-data" >
	
	 
	 idLibro
	 <input type="hidden" id="idLibro" name="idLibro" value="">
	 <br/><br/>
	 titulo
	 <input type="text" id="titulo" name="titulo" value="a">
	 <br/><br/>
	 editorial
	 <input type="text" id="editorial" name="editorial" value="2">
	 <br/><br/>
	 numPaginas
	 <input type="number" id="numPaginas" name="numPaginas" value="a">
	 <br/><br/>
	 edicion
	 <input type="text" id="edicion" name="edicion" value="a">
	 <br/><br/>
	 idioma
	 <input type="text" id="idioma" name="idioma" value="a">
	 <br/><br/>
	 fechaPublicacion
	 <input type="date" id="fechaPublicacion" name="fechaPublicacion" value="${fn:substring(libro.fechaPublicacion,0,10)}">
	 <br/><br/>
	 descripcion
	 <input type="text" id="descripcion" name="descripcion" value="a">
	 <br/><br/>
	 tipoPasta
	 <input type="text" id="tipoPasta" name="tipoPasta" value="a">
	 <br/><br/>
	 ISBN
	 <input type="text" id="ISBN" name="ISBN" value="a">
	 <br/><br/>
	 numEjemplares
	 <input type="number" id="numEjemplares" name="numEjemplares" value="2">
	 <br/><br/>
	 portada
	 <input type="text" id="portada" name="portada" value="2">
	 <br/><br/>
	 presentacion
	 <input type="text" id="presentacion" name="presentacion" value="a">
	 <br/><br/>
	 precio
	 <input type="number" step="any" id="precio" name="precio" value="2.2">
	 <br/><br/>
	 
	 Autor
	 <select id="idAutor" name="idAutor">	 	
	 	<c:forEach var="item" items="${autores}" >
	 		<option value="1">${item.nombre} ${item.apellido}</option>
	 	</c:forEach>	 		 		 		 
	 </select>
	 <br/><br/>
	 	 
	 Categoria
	 <select id="idCategoria" name="idCategoria">
	 	<c:forEach var="item" items="${categorias}">
	 		<option value="1">${item.categoria}</option>
	 	</c:forEach>
	 </select>	 	 
	 <br/><br/>
	
	
	
	
	</form>


</body>
</html>