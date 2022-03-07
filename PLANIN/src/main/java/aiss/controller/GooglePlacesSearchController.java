package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.google.maps.PlaceSearch;
import aiss.model.resource.GooglePlacesResource;



/**
 * Servlet implementation class SearchController
 */
public class GooglePlacesSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger log = Logger.getLogger(GooglePlacesSearchController.class.getName());
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GooglePlacesSearchController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    
  
    
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String query = request.getParameter("searchQuery");
		RequestDispatcher rd = null;
		
		// Search for places in GoogleMaps
		log.log(Level.FINE, "Searching for OMDb movies that contain " + query);
		GooglePlacesResource gp = new GooglePlacesResource();
		PlaceSearch psResults = gp.getPlaces(query);
		
		if (psResults!=null){
			rd = request.getRequestDispatcher("/success.jsp");
			request.setAttribute("places", psResults.getCandidates());

		} else {
			log.log(Level.SEVERE, "OMDb object: " + psResults);
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
    
//    
}
	
