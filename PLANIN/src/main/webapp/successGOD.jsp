<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<link rel="stylesheet" type="text/css" href="css/Tablas.css" >
<title>Predicci�n</title>
</head>
<body>

<div>


<table class="liveresults-sports-immersive__lr-imso-ss-wp-b">
	<tbody>
	<tr class="liveresults-sports-immersive__lr-imso-ss-wp-br">
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#ff4b13" width="<c:out value="${requestScope.LocalPrediction}"/>%"></td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#D6D6D6" width="<c:out value="${requestScope.DrawPrediction}"/>%"></td>
		<td class="liveresults-sports-immersive__lr-imso-ss-wp-bc" style="background-color:#8BB9E5" width="<c:out value="${requestScope.VisitantePrediction}"/>%"></td>
	</tr>
	</tbody>
</table>
</div>


</body>


</html>