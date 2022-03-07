<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/bootstrap_dashboard.css" rel="stylesheet">


<title>Muestra eventos</title>


</head>



			<div class="col-6 col-md-4" id="calendar">
				<div
					class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
					<h1 class="h2">Eventos de tu Calendario de Google</h1>
				</div>
				<c:forEach var="evento" items="${requestScope.calendarEvents}">
					<c:out value="${evento.summary} - ${evento.description}" />
					<br>
					<c:out value="Inicio: ${evento.start.dateTime}"/>
					<br>
					<c:out value="Fin: ${evento.end.dateTime}"/>
					<br>
				
				</c:forEach>
				</div>
		
		


</body>
</html>