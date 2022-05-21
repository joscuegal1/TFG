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

<h1>PREDICCIÓN FINAL</h1>

<h3><c:out value="${requestScope.LocalPrediction}"/>% LOCAL</h3>
<h3><c:out value="${requestScope.DrawPrediction}"/>% EMPATE</h3>
<h3><c:out value="${requestScope.VisitantePrediction}"/>% VISITANTE</h3>

<h1>PROBABILIDAD DE POISSON</h1>

<h3><c:out value="${requestScope.L}"/>% LOCAL</h3>
<h3><c:out value="${requestScope.D}"/>% EMPATE</h3>
<h3><c:out value="${requestScope.V}"/>% VISITANTE</h3>

<h1>HISTÓRICO ENTRE AMBOS ÚLTIMOS <c:out value="${requestScope.partidosTotales}"/> PARTIDOS</h1>

<h3><c:out value="${requestScope.porcentajeVictoriaLocal}"/>%  victorias Local</h3>
<h3><c:out value="${requestScope.porcentajeEmpates}"/>% empates</h3>
<h3><c:out value="${requestScope.porcentajeVictoriaVisitante}"/>% victorias Visitante</h3>

<h1>RACHA COMBINADA ÚLTIMOS 5 PARTIDOS </h1>

<h3><c:out value="${requestScope.combinadoLocal}"/>% racha local últimos partidos</h3>
<h3><c:out value="${requestScope.combinadoEmpate}"/>% racha empate últimos partidos</h3>
<h3><c:out value="${requestScope.combinadoVisitante}"/>% racha visitante últimos partidos</h3>

</body>

<div>
<table class="liveresults-sports-immersive__lr-imso-ss-wp-tnp">
	<tbody>
	<tr class="liveresults-sports-immersive__lr-imso-ss-wp-tnr">
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-ft">Local</td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-d">Empate</td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-st">Visitante</td>
	</tr>
	
	<tr class="liveresults-sports-immersive__lr-imso-ss-wp-tp">
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-ft" style="color:#ff4b13">37%</td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-dp">30%</td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-st" style="color:#8BB9E5">33%</td>
	</tr>
	</tbody>
</table>

<table class="liveresults-sports-immersive__lr-imso-ss-wp-b">
	<tbody>
	<tr class="liveresults-sports-immersive__lr-imso-ss-wp-br">
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#ff4b13" width="37%"></td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#D6D6D6" width="30%"></td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#8BB9E5" width="33%"></td>
	</tr>
	</tbody>
</table>
</div>





</html>