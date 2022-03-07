<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<link rel="stylesheet" type="text/css" href="css/styleSuccess.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

<title>Search results</title>
</head>
<body>


<fieldset id="places">
<legend><i>Se encuentra en:</i> <c:out value="${param.searchQuery}"/></legend>
<c:forEach items="${requestScope.places}" var="placesi">
	<br>
	<i class="material-icons">location_city</i>
	<a>
	<span><font>Lugar:</font> <c:out value="${placesi.name}"/></span><br/>
	<i class="material-icons">star</i>
	<span><font>Rating:</font> <c:out value="${placesi.rating}"/></span><br/>
	<i class="material-icons">place</i>
	<span><font>Dirección:</font> <c:out value="${placesi.formattedAddress}"/></span><br/>
	</a>
	<br>

	<div id="searchDiv">
		<form id="searchForm" action="SearchController" method="post" accept-charset="UTF-8">
			
			<input type="hidden" name="searchTiempo" value="${placesi.geometry.location.lat},${placesi.geometry.location.lng}" required/> 
			 <select name="tipositio">
  <option value="restaurant">Restaurantes</option>
<option value="museum">Museos</option>
<option value="cafe">Cafés</option>
<option value="park">Parques</option>
<option value="shopping_mall">Centros comerciales</option>
<option value="spa">Spas</option>
<option value="zoo">Zoologicos</option>
<option value="bar">Bares</option>

  
</select>
	   
			<input type="submit" name="searchBtn" title="search" value="Predicción meteorológica">  <i class="material-icons">wb_sunny</i>
		
		</form>
		
	</div>
	
</c:forEach>
</fieldset>




</body>
</html>