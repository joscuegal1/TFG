package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.apixu.ElTiempo;
import aiss.model.google.maps.PlaceNearbySearch;
import aiss.model.resource.ApixuResource;
import aiss.model.resource.GooglePlacesResource;

/**
 * Servlet implementation class SearchController
 */
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger log = Logger.getLogger(SearchController.class.getName());
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String query2 = request.getParameter("tipositio");
		String query = request.getParameter("searchTiempo");
		RequestDispatcher rd = null;
		
		// Search for movies in OMDb
		log.log(Level.FINE, "Searching for OMDb movies that contain " + query);
		ApixuResource apixu = new ApixuResource();
		ElTiempo eltiempo = apixu.getTiempo(query);
		GooglePlacesResource gp2 = new GooglePlacesResource();
		PlaceNearbySearch psResults2 = gp2.getNearbyPlaces(query, query2);
		

		if (eltiempo!=null){
			rd = request.getRequestDispatcher("/successApixu.jsp");
			request.setAttribute("tiempo", eltiempo.getForecast().getForecastday());
			request.setAttribute("titulo", eltiempo.getLocation());
			request.setAttribute("places2", psResults2.getResults());
		} else {
			log.log(Level.SEVERE, "OMDb object: " + eltiempo);
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
