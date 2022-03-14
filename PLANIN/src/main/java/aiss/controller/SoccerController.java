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
import aiss.model.estadisticas.Estadisticas;
import aiss.model.estadisticas.Statistics__1;
import aiss.model.google.maps.PlaceNearbySearch;
import aiss.model.resource.ApixuResource;
import aiss.model.resource.GooglePlacesResource;
import aiss.model.resource.SoccerResource;
import aiss.model.soccer.Competitor;
import aiss.model.soccer.Equipo;

/**
 * Servlet implementation class SearchController
 */
public class SoccerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger log = Logger.getLogger(SoccerController.class.getName());
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SoccerController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		
		String local = request.getParameter("Local");
		String visitante = request.getParameter("Visitante");
		RequestDispatcher rd = null;
		
		// Search for movies in OMDb
		//log.log(Level.FINE, "Searching for OMDb movies that contain " + query);
		SoccerResource soccer = new SoccerResource();
		Estadisticas competitorLocal = soccer.getEstadisticas(local);
		Estadisticas competitorVisitante = soccer.getEstadisticas(visitante);

		

		if (competitorLocal!=null && competitorVisitante!=null && !(competitorLocal.getCompetitor().getId()==competitorVisitante.getCompetitor().getId())){
			rd = request.getRequestDispatcher("/successApixu.jsp");
			Statistics__1 estadisticasLocal = competitorLocal.getCompetitor().getStatistics();
			request.setAttribute("nombreLocal", competitorLocal.getCompetitor().getName());
			request.setAttribute("golesAFavorLocal", estadisticasLocal.getGoalsScored());
			request.setAttribute("golesEnContraLocal", estadisticasLocal.getGoalsConceded());
			request.setAttribute("gFxPLocal", Math.round(((double)estadisticasLocal.getGoalsScored() / (double)estadisticasLocal.getMatchesPlayed())*100.0)/100.0);
			request.setAttribute("gCxPLocal", Math.round(((double)estadisticasLocal.getGoalsConceded() / (double)estadisticasLocal.getMatchesPlayed())*100.0)/100.0);
			
			
			
			Statistics__1 estadisticasVisitante = competitorVisitante.getCompetitor().getStatistics();
			request.setAttribute("nombreVisitante", competitorVisitante.getCompetitor().getName());
			request.setAttribute("golesAFavorVisitante", estadisticasVisitante.getGoalsScored());
			request.setAttribute("golesEnContraVisitante", estadisticasVisitante.getGoalsConceded());
			request.setAttribute("gFxPVisitante", Math.round(((double)estadisticasVisitante.getGoalsScored() / (double)estadisticasVisitante.getMatchesPlayed())*100.0)/100.0);
			request.setAttribute("gCxPVisitante", Math.round(((double)estadisticasVisitante.getGoalsConceded() / (double)estadisticasVisitante.getMatchesPlayed())*100.0)/100.0);
		
		}else {
			log.log(Level.SEVERE, "OMDb object: " + competitorLocal);
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
