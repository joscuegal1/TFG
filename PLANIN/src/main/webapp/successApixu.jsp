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

<fieldset id="local">
<legend>Equipo local:  <c:out value="${requestScope.nombreLocal}"/></legend>

<h2><c:out value="${requestScope.golesAFavorLocal}"/> goles a favor </h2>
<h2><c:out value="${requestScope.golesEnContraLocal}"/> goles en contra </h2>
<h2><c:out value="${requestScope.aPuertaLocal}"/> tiros a puerta a favor </h2>

<h2> con un promedio de: </h2>
<h2><c:out value="${requestScope.gFxPLocal}"/>  goles por partido a favor </h2> 
<h2><c:out value="${requestScope.gCxPLocal}"/> goles por partido en contra </h2> 
<h2><c:out value="${requestScope.aPxPLocal}"/> tiros a puerta por partido a favor </h2> 
</fieldset>

<fieldset id="visitante">
<legend>Equipo visitante: <c:out value="${requestScope.nombreVisitante}"/></legend>

<h2><c:out value="${requestScope.golesAFavorVisitante}"/> goles a favor </h2>
<h2><c:out value="${requestScope.golesEnContraVisitante}"/> goles en contra </h2>
<h2><c:out value="${requestScope.aPuertaVisitante}"/> tiros a puerta a favor </h2>

<h2> con un promedio de: </h2>
<h2><c:out value="${requestScope.gFxPVisitante}"/>  goles por partido a favor </h2> 
<h2><c:out value="${requestScope.gCxPVisitante}"/> goles por partido en contra </h2> 
<h2><c:out value="${requestScope.aPxPVisitante}"/> tiros a puerta por partido a favor </h2> 
</fieldset>


</body>
</html>