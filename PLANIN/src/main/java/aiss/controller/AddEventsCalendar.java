package aiss.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.googleCalendar.End;
import aiss.model.googleCalendar.Event;
import aiss.model.googleCalendar.Start;
import aiss.model.resource.GoogleCalendarResource;

/**
 * Servlet implementation class AddEventsCalendar
 */
public class AddEventsCalendar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(AddEventsCalendar.class.getName());

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddEventsCalendar() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accessToken = (String) request.getSession().getAttribute("GoogleCalendar-token");

		String descripcion = request.getParameter("descripcion");
		String startDate = request.getParameter("startDate") + ":00";
		String nombreEvento = request.getParameter("nombreEvento");
		String endDate = request.getParameter("endDate") + ":00";

		if (accessToken != null && !"".equals(accessToken)) {
			log.info("Token de Calendar conseguido. Mostrando los eventos usuario.");

			GoogleCalendarResource event = new GoogleCalendarResource(accessToken);
			
			Start start = Start.create(startDate);
			start.setTimeZone("Europe/Madrid");

			End end = End.create(endDate);
			end.setTimeZone("Europe/Madrid");

			Event evento = Event.create(nombreEvento, descripcion, "public", start, end);

			String eventId = event.createEvent(evento);
			request.setAttribute("eventId", eventId);
			
			String currentUri = request.getRequestURI().toString();
			String newUrl = request.getRequestURL().toString().replace(currentUri, "/eventos");
			response.sendRedirect(newUrl);
		} else {
			log.info("Trying to acces to Google Calendar without an acces token, redirecting to OAuth servlet");
			request.getRequestDispatcher("/AuthController/GoogleCalendar").forward(request, response);
		}
	}

}
