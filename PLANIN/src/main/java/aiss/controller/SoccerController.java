package aiss.controller;

import java.io.IOException;
import java.util.OptionalDouble;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

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
import aiss.model.temporada.Temporada;

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
		
		try
		{
		    Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		Temporada temporada = soccer.getTemporada();
	

		

		if (competitorLocal!=null && competitorVisitante!=null && !(competitorLocal.getCompetitor().getId()==competitorVisitante.getCompetitor().getId())){
			rd = request.getRequestDispatcher("/successApixu.jsp");
			
			
			String home = "home";
			String idlocal = competitorLocal.getCompetitor().getId();
			Statistics__1 estadisticasLocal = competitorLocal.getCompetitor().getStatistics();
			request.setAttribute("nombreLocal", competitorLocal.getCompetitor().getName());
			
			Integer golesAFavorLocal = temporada.getStandings().stream().filter(t -> t.getType().equals(home)).findFirst().get()
																.getGroups().stream().findFirst().get()
																.getStandings().stream().filter(t -> t.getCompetitor().getId().equals(idlocal)).findFirst().get()
																.getGoalsFor();
			Integer golesEnContraLocal = temporada.getStandings().stream().filter(t -> t.getType().equals(home)).findFirst().get()
					.getGroups().stream().findFirst().get()
					.getStandings().stream().filter(t -> t.getCompetitor().getId().equals(idlocal)).findFirst().get()
					.getGoalsAgainst();
			
			Integer partidosJugadosLocal = temporada.getStandings().stream().filter(t -> t.getType().equals(home)).findFirst().get()
					.getGroups().stream().findFirst().get()
					.getStandings().stream().filter(t -> t.getCompetitor().getId().equals(idlocal)).findFirst().get()
					.getPlayed();
			
			Double promedioGolesFavorLocal = temporada.getStandings().stream().filter(t -> t.getType().equals(home)).findFirst().get()
					.getGroups().stream().findFirst().get()
					.getStandings().stream().mapToDouble(t -> (Math.round(((double)t.getGoalsFor() / (double)t.getPlayed())*100.0)/100.0)).average().orElse(0);  
		
			
			request.setAttribute("Hf", Math.round(((double)golesAFavorLocal/(double)partidosJugadosLocal)*100.0)/100.0);
			request.setAttribute("Hf_r", Math.round((((double)golesAFavorLocal/(double)partidosJugadosLocal)/promedioGolesFavorLocal)*100.0)/100.0);
			//request.setAttribute("golesEnContraLocal");
			
			//request.setAttribute("partidosJugadosLocal");
			
			request.setAttribute("promedioFavorLocal", promedioGolesFavorLocal);
			request.setAttribute("aPxPLocal", Math.round(((double)estadisticasLocal.getShotsOnTarget() / (double)estadisticasLocal.getMatchesPlayed())*100.0)/100.0);
			request.setAttribute("gFxPLocal", Math.round(((double)estadisticasLocal.getGoalsScored() / (double)estadisticasLocal.getMatchesPlayed())*100.0)/100.0);
			request.setAttribute("gCxPLocal", Math.round(((double)estadisticasLocal.getGoalsConceded() / (double)estadisticasLocal.getMatchesPlayed())*100.0)/100.0);
			
			
			
			Statistics__1 estadisticasVisitante = competitorVisitante.getCompetitor().getStatistics();
			request.setAttribute("nombreVisitante", competitorVisitante.getCompetitor().getName());
			request.setAttribute("golesAFavorVisitante", estadisticasVisitante.getGoalsScored());
			request.setAttribute("golesEnContraVisitante", estadisticasVisitante.getGoalsConceded());
			request.setAttribute("aPuertaVisitante", estadisticasVisitante.getShotsOnTarget());
			request.setAttribute("aPxPVisitante", Math.round(((double)estadisticasVisitante.getShotsOnTarget() / (double)estadisticasVisitante.getMatchesPlayed())*100.0)/100.0);
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
