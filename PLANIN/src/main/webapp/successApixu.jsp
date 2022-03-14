<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<link rel="stylesheet" type="text/css" href="css/Tablas.css" >
<title>Search results</title>
</head>
<body>

<h1>El equipo LOCAL es el <c:out value="${requestScope.nombreLocal}"/> y lleva: </h1>

<h2><c:out value="${requestScope.golesAFavorLocal}"/> goles a favor </h2>
<h2><c:out value="${requestScope.golesEnContraLocal}"/> en contra </h2>
<h2> con un promedio de: </h2>
<h2><c:out value="${requestScope.gFxPLocal}"/>  goles por partido a favor </h2> 
<h2><c:out value="${requestScope.gCxPLocal}"/> en contra </h2> 

<h1>El equipo VISITANTE es el <c:out value="${requestScope.nombreVisitante}"/> y lleva <c:out value="${requestScope.golesAFavorVisitante}"/> goles a favor 
y  <c:out value="${requestScope.golesEnContraVisitante}"/> en contra, con un promedio de <c:out value="${requestScope.gFxPVisitante}"/>
 goles por partido a favor y <c:out value="${requestScope.gCxPVisitante}"/> en contra </h1>

<c:choose>
    <c:when test="${!empty requestScope.places2}">
<c:forEach items="${requestScope.places2}" var="placesi">

<table id="customers">
  <tr>
    <th>Lugar</th>
    <th>Latitud</th>
    <th>longitud</th>
    
  </tr>
  <tr>
    <td><span><c:out value="${placesi.name}"/></span></td>
    <td><span><c:out value="${placesi.geometry.location.lat}"/></span></td>
    <td><span><c:out value="${placesi.geometry.location.lng}"/></span></td>
  </tr>
</table>
</c:forEach>

</c:when>    
    <c:otherwise>
<span> No se ha encontrado ningún <c:out value="${param.tipositio}"/> cerca de <c:out value="${requestScope.titulo.name}"/></span>
 <br />
    </c:otherwise>
</c:choose>

<div id="searchDiv" class="centrarBoton">
		<form id="searchForm" action="/successCalendar.jsp" method="post">
			 
			<input type="submit" name="searchBtn" title="search" value="Ir a crear evento">
		</form>
</div>


<h1>El tiempo en <c:out value="${requestScope.titulo.name}"/></h1>



<c:forEach items="${requestScope.tiempo}" var="eltiempo">

<table id="customers">
  <tr>
    <th>Día</th>
    <th>Temperaturas máximas</th>
    <th>Temperaturas minimas</th>
    <th>Total precipitaciones</th>
    <th>Condición meteorológica</th>
  </tr>
  <tr>
    <td><span><c:out value="${eltiempo.date}"/></span></td>
    <td><span><c:out value="${eltiempo.day.maxtempC}"/></span></td>
    <td><span><c:out value="${eltiempo.day.mintempC}"/></span></td>
    <td><span><c:out value="${eltiempo.day.totalprecipMm}"/></span></td>
    <td><span><c:out value="${eltiempo.day.condition.text}"/></span></td>
  </tr>
</table>
</c:forEach>

</body>
</html>