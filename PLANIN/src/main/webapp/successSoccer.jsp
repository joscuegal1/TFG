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

<center>
<p>PREDICCIÓN FINAL</p>

<h2 style="color:white; background:#ff4b13"><c:out value="${requestScope.LocalPrediction}"/>% PROBABILIDAD DE VICTORIA <c:out value="${requestScope.nombreLocal}"/></h2>
<br>
<h2 style="color:black; background:#D6D6D6"><c:out value="${requestScope.DrawPrediction}"/>% PROBABILIDAD DE EMPATE</h2>
<br>
<h2 style="color:white; background:#1a5276"><c:out value="${requestScope.VisitantePrediction}"/>% PROBABILIDAD DE VICTORIA <c:out value="${requestScope.nombreVisitante}"/></h2>

<div>


<table class="liveresults-sports-immersive__lr-imso-ss-wp-b">
	<tbody>
	<tr class="liveresults-sports-immersive__lr-imso-ss-wp-br">
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#ff4b13" width="<c:out value="${requestScope.LocalPrediction}"/>%"></td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#D6D6D6" width="<c:out value="${requestScope.DrawPrediction}"/>%"></td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color: #1a5276 " width="<c:out value="${requestScope.VisitantePrediction}"/>%"></td>
	</tr>
	</tbody>
</table>
</div>

<br>
<br>
<p>LA PROBABILIDAD DE POISSON APORTA UN PESO DEL <c:out value="${requestScope.pesoPoisson}"/>%</p>

<h3><c:out value="${requestScope.L}"/>% probabilidad de victoria local</h3>
<h3><c:out value="${requestScope.D}"/>% probabilidad de empate</h3>
<h3><c:out value="${requestScope.V}"/>% probabilidad de victoria visitante</h3>

<div>
<table class="liveresults-sports-immersive__lr-imso-ss-wp-b">
	<tbody>
	<tr class="liveresults-sports-immersive__lr-imso-ss-wp-br">
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#ff4b13" width="<c:out value="${requestScope.L}"/>%"></td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#D6D6D6" width="<c:out value="${requestScope.D}"/>%"></td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#1a5276" width="<c:out value="${requestScope.V}"/>%"></td>
	</tr>
	</tbody>
</table>
</div>

<br>
<br>
<p>EL HISTÓRICO ENTRE AMBOS ÚLTIMOS <c:out value="${requestScope.partidosTotales}"/> PARTIDOS APORTA UN PESO DEL <c:out value="${requestScope.pesoHistorico}"/>%</p>

<h3><c:out value="${requestScope.porcentajeVictoriaLocal}"/>%  victorias del local</h3>
<h3><c:out value="${requestScope.porcentajeEmpates}"/>% empates</h3>
<h3><c:out value="${requestScope.porcentajeVictoriaVisitante}"/>% victorias del visitante</h3>

<div>
<table class="liveresults-sports-immersive__lr-imso-ss-wp-b">
	<tbody>
	<tr class="liveresults-sports-immersive__lr-imso-ss-wp-br">
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#ff4b13" width="<c:out value="${requestScope.porcentajeVictoriaLocal}"/>%"></td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#D6D6D6" width="<c:out value="${requestScope.porcentajeEmpates}"/>%"></td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#1a5276" width="<c:out value="${requestScope.porcentajeVictoriaVisitante}"/>%"></td>
	</tr>
	</tbody>
</table>
</div>

<br>
<br>

<p>LA RACHA COMBINADA ÚLTIMOS 5 PARTIDOS APORTA UN PESO DEL <c:out value="${requestScope.pesoRacha}"/>%</p>

<h3><c:out value="${requestScope.combinadoLocal}"/>% racha local últimos partidos</h3>
<h3><c:out value="${requestScope.combinadoEmpate}"/>% racha empate últimos partidos</h3>
<h3><c:out value="${requestScope.combinadoVisitante}"/>% racha visitante últimos partidos</h3>

<div>
<table class="liveresults-sports-immersive__lr-imso-ss-wp-b">
	<tbody>
	<tr class="liveresults-sports-immersive__lr-imso-ss-wp-br">
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#ff4b13" width="<c:out value="${requestScope.combinadoLocal}"/>%"></td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#D6D6D6" width="<c:out value="${requestScope.combinadoEmpate}"/>%"></td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#1a5276" width="<c:out value="${requestScope.combinadoVisitante}"/>%"></td>
	</tr>
	</tbody>
</table>
</div>

<br>
<br>
</center>
</body>







</html>