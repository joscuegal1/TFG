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

<h2><c:out value="${requestScope.Hf}"/> media de goles a favor como local </h2>
<h2><c:out value="${requestScope.Hf_r}"/> media de goles a favor como local respecto al resto </h2>
<h2><c:out value="${requestScope.Hc}"/> media de goles en contra como loca</h2>
<h2><c:out value="${requestScope.Hc_r}"/> media de goles en contra como local respecto al resto </h2>
<h2><c:out value="${requestScope.promedioFavorLocal}"/> promedio goles a favor locales </h2>
<h2><c:out value="${requestScope.promedioEnContraLocal}"/> promedio goles en contra locales </h2>
<h2><c:out value="${requestScope.golesEsperadosEquipoLocal}"/> GOLES ESPERADOS POR EL EQUIPO LOCAL</h2>
<h2><c:out value="${requestScope.L}"/> LOCAL</h2>
<h2><c:out value="${requestScope.D}"/> DRAW</h2>
<h2><c:out value="${requestScope.V}"/> VISITANTE</h2>



<h2> con un promedio de: </h2>
<h2><c:out value="${requestScope.gFxPLocal}"/>  goles por partido a favor </h2> 
<h2><c:out value="${requestScope.gCxPLocal}"/> goles por partido en contra </h2> 
<h2><c:out value="${requestScope.aPxPLocal}"/> tiros a puerta por partido a favor </h2> 
</fieldset>

<fieldset id="visitante">
<legend>Equipo visitante: <c:out value="${requestScope.nombreVisitante}"/></legend>

<h2><c:out value="${requestScope.Ac}"/> media de goles en contra como visitante </h2>
<h2><c:out value="${requestScope.Ac_r}"/> media de goles en contra como visitante respecto al resto </h2>
<h2><c:out value="${requestScope.Af}"/> media de goles a favor como visitante </h2>
<h2><c:out value="${requestScope.Af_r}"/> media de goles a favor como visitante respecto al resto </h2>
<h2><c:out value="${requestScope.promedioFavorVisitante}"/> promedio goles a favor visitante </h2>
<h2><c:out value="${requestScope.promedioEnContraVisitante}"/> promedio goles en contra visitante </h2>
<h2><c:out value="${requestScope.golesEsperadosEquipoVisitante}"/> GOLES ESPERADOS POR EL EQUIPO VISITANTE</h2>

<h2> con un promedio de: </h2>
<h2><c:out value="${requestScope.gFxPVisitante}"/>  goles por partido a favor </h2> 
<h2><c:out value="${requestScope.gCxPVisitante}"/> goles por partido en contra </h2> 
<h2><c:out value="${requestScope.aPxPVisitante}"/> tiros a puerta por partido a favor </h2> 
</fieldset>


</body>
</html>