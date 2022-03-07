<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/Calendar.css">
<title>Search results</title>
</head>
<body>

<div class="modal fade" id="addEventCalendar">
						<div class="modal-dialog">
							<div class="modal-content">

								<!-- Modal Header -->
								<div class="modal-header">
									<h4 class="modal-title">Crear evento en el calendario</h4>
									
								</div>

								<!-- Modal body -->
								<div class="modal-body">
									<form method="post" action="/AddEventsCalendar">
										<label for="descripcion">Descripción* :</label>
										<input class="form-control" type="text" id="descripcion"
											name="descripcion"/>
										<br>

										<label for="startDate">Inicio* :</label>
										<input class="form-control" type="datetime-local" id="startDate"
											name="startDate"/>
										<br>
										
										<label for="endDate">Fin* :</label>
										<input class="form-control" type="datetime-local" id="endDate"
											name="endDate"/>
										<br>

										<label for="nombreEvento">Nombre* :</label>
										<input class="form-control" type="text" id="nombreEvento"
											name="nombreEvento"/>
										<br>

										<!-- Modal footer -->
										<div class="modal-footer">

											<button type="submit" class="btn btn-success">Crear</button>
										</div>
									</form>
								</div>

							</div>
						</div>
					</div>
				<br>
<br>
</body>
</html>