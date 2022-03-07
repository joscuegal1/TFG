package aiss.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.googleCalendar.Event;
import aiss.model.resource.GoogleCalendarResource;


/**
 * Servlet implementation class Run4LifeRoutes
 */
public class ListaEventos extends HttpServlet {
	private static final Logger log = Logger.getLogger(ListaEventos.class.getName());
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaEventos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accessToken=(String)request.getSession().getAttribute("GoogleCalendar-token");
		
		//Mostrar eventos del usuario de Google Calendar
		if(accessToken!=null && !"".equals(accessToken)){
			log.info("Token de Calendar conseguido. Mostrando las actividades más recientes del usuario.");
				GoogleCalendarResource event = new GoogleCalendarResource(accessToken);
				
				log.info(event.toString());
				List<Event> eventos = event.getEvents().getItems();
		
				if(eventos!=null){
					request.setAttribute("calendarEvents", eventos);
					//for (Event e : eventos) {
						//String start = e.getStart().getDateTime();
						//String end = e.getEnd().getDateTime();
						
						//e.setStart(Start.create(start.substring(0, start.indexOf("+"))));
						//e.setEnd(End.create(end.substring(0, end.indexOf("+"))));
					//}
					
					request.getRequestDispatcher("/muestra.jsp").forward(request, response);
				}else{
					log.info("The files returned are null... probably your token has experied. Redirecting to OAuth servlet.");
					request.getRequestDispatcher("/AuthController/GoogleCalendar").forward(request,response);
				}
		}else{
			log.info("Trying to acces to google drive without an acces token, redirecting to OAuth servlet");
			request.getRequestDispatcher("/AuthController/GoogleCalendar").forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
