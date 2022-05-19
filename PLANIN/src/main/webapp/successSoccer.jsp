<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<link rel="stylesheet" type="text/css" href="css/Tablas.css" >
<title>Predicción</title>
</head>
<body>


<h2><c:out value="${requestScope.L}"/>% LOCAL</h2>
<h2><c:out value="${requestScope.D}"/>% DRAW</h2>
<h2><c:out value="${requestScope.V}"/>% VISITANTE</h2>

<h3><c:out value="${requestScope.victoriasLocal}"/> victorias Local</h3>
<h3><c:out value="${requestScope.victoriasVisitante}"/> victorias Visitante</h3>
<h3><c:out value="${requestScope.empates}"/> empates</h3>
<h3><c:out value="${requestScope.partidosTotales}"/> total ultimos partidos</h3>

<h4><c:out value="${requestScope.porcentajeVictoriaLocal}"/>% local</h4>
<h4><c:out value="${requestScope.porcentajeVictoriaVisitante}"/>% visitante</h4>
<h4><c:out value="${requestScope.porcentajeEmpates}"/>% empates</h4>







</body>
</html>