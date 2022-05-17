package aiss.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
		
		try
		{
		    Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		
		
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
			rd = request.getRequestDispatcher("/successSoccer.jsp");
			
			
			String home = "home";
			String away = "away";
			String idlocal = competitorLocal.getCompetitor().getId();
			String idvisitante = competitorVisitante.getCompetitor().getId();
			Statistics__1 estadisticasLocal = competitorLocal.getCompetitor().getStatistics();
			request.setAttribute("nombreLocal", competitorLocal.getCompetitor().getName());
			
			Integer golesAFavorLocal = temporada.getStandings().stream().filter(t -> t.getType().equals(home)).findFirst().get()
																.getGroups().stream().findFirst().get()
																.getStandings().stream().filter(t -> t.getCompetitor().getId().equals(idlocal)).findFirst().get()
																.getGoalsFor();
			
			Integer partidosJugadosLocal = temporada.getStandings().stream().filter(t -> t.getType().equals(home)).findFirst().get()
					.getGroups().stream().findFirst().get()
					.getStandings().stream().filter(t -> t.getCompetitor().getId().equals(idlocal)).findFirst().get()
					.getPlayed();
			
			
				
			Double promedioGolesFavorLocal = temporada.getStandings().stream().filter(t -> t.getType().equals(home)).findFirst().get()
					.getGroups().stream().findFirst().get()
					.getStandings().stream().mapToDouble(t -> (Math.round(((double)t.getGoalsFor() / (double)t.getPlayed())*100.0)/100.0)).average().orElse(0);  
		
			//----------------------------------------------------------------------------------
			
			
			Integer golesEnContraVisitante = temporada.getStandings().stream().filter(t -> t.getType().equals(away)).findFirst().get()
					.getGroups().stream().findFirst().get()
					.getStandings().stream().filter(t -> t.getCompetitor().getId().equals(idvisitante)).findFirst().get()
					.getGoalsAgainst();
			
			Integer partidosJugadosVisitante = temporada.getStandings().stream().filter(t -> t.getType().equals(away)).findFirst().get()
					.getGroups().stream().findFirst().get()
					.getStandings().stream().filter(t -> t.getCompetitor().getId().equals(idvisitante)).findFirst().get()
					.getPlayed();
			
			//---------------------------------------------------------------------------
			
			
			Double hf = Math.round(((double)golesAFavorLocal/(double)partidosJugadosLocal)*100.0)/100.0;
			Double hf_r = Math.round((hf/promedioGolesFavorLocal)*100.0)/100.0;
			
			Double ac = Math.round(((double)golesEnContraVisitante/(double)partidosJugadosVisitante)*100.0)/100.0;
			Double ac_r = Math.round((ac/promedioGolesFavorLocal)*100.0)/100.0;
			
			Double golesEsperadosLocal = Math.round((hf_r * ac_r * promedioGolesFavorLocal)*100.0)/100.0;
			
			
			request.setAttribute("Hf", hf);
			request.setAttribute("Hf_r", hf_r);
			request.setAttribute("promedioFavorLocal", Math.round(promedioGolesFavorLocal*100.0)/100.0);
			request.setAttribute("golesEsperadosEquipoLocal", golesEsperadosLocal);
									
			
			request.setAttribute("Ac", ac);
			request.setAttribute("Ac_r", ac_r);
			request.setAttribute("promedioEnContraVisitante", Math.round(promedioGolesFavorLocal*100.0)/100.0);
			
	//--------------------------VISITANTE-----------------------------------------------
			
			
			Integer golesEnAFavorVisitante = temporada.getStandings().stream().filter(t -> t.getType().equals(away)).findFirst().get()
					.getGroups().stream().findFirst().get()
					.getStandings().stream().filter(t -> t.getCompetitor().getId().equals(idvisitante)).findFirst().get()
					.getGoalsFor();
			
			Double promedioGolesEnContraLocal = temporada.getStandings().stream().filter(t -> t.getType().equals(home)).findFirst().get()
					.getGroups().stream().findFirst().get()
					.getStandings().stream().mapToDouble(t -> (Math.round(((double)t.getGoalsAgainst() / (double)t.getPlayed())*100.0)/100.0)).average().orElse(0);  
		
	
			
			
						
			Double af = Math.round(((double)golesEnAFavorVisitante/(double)partidosJugadosVisitante)*100.0)/100.0;
			Double af_r = Math.round((af/promedioGolesEnContraLocal)*100.0)/100.0;
			
			
			
			
			Integer golesEnContraLocal = temporada.getStandings().stream().filter(t -> t.getType().equals(home)).findFirst().get()
					.getGroups().stream().findFirst().get()
					.getStandings().stream().filter(t -> t.getCompetitor().getId().equals(idlocal)).findFirst().get()
					.getGoalsAgainst();
					
			
			Double hc = Math.round(((double)golesEnContraLocal/(double)partidosJugadosLocal)*100.0)/100.0;
			Double hc_r = Math.round((hc/promedioGolesEnContraLocal)*100.0)/100.0;
			
			Double golesEsperadosVisitante = Math.round((af_r * hc_r * promedioGolesEnContraLocal)*100.0)/100.0;
			
			request.setAttribute("Af", af);
			request.setAttribute("Af_r", af_r);
			request.setAttribute("promedioFavorVisitante", Math.round(promedioGolesEnContraLocal*100.0)/100.0);
			
									
			
			request.setAttribute("Hc", hc);
			request.setAttribute("Hc_r", hc_r);
			request.setAttribute("promedioEnContraLocal", Math.round(promedioGolesEnContraLocal*100.0)/100.0);
			request.setAttribute("golesEsperadosEquipoVisitante", golesEsperadosVisitante);
			
			
			
			//------------------------------------------------------------------------------------------------------------//
			
			List<Double> poissonLocal = soccer.distPoissonPorGol(golesEsperadosLocal);
			List<Double> poissonVisitante = soccer.distPoissonPorGol(golesEsperadosVisitante);
			
			
		
				Integer var = 100;
				double[][] res = new double[11][11];
				
				for(int a = 0; a<poissonLocal.size(); a++) {
					Double l = poissonLocal.get(a);
					
					for(int b = 0; b<poissonVisitante.size(); b++) {
						Double v = poissonVisitante.get(b);
						res[a][b] = (l*v)*var; 
					}
				}
				
				
				Double homelocal = 0.0;
				Double awayvisitante = 0.0;
				Double draw = 0.0;

				
				for(int a = 0; a<poissonLocal.size(); a++) {
					for(int b = 0; b<poissonVisitante.size(); b++) {
						if(a==b) {
							draw += res[a][b];
						}if(a<b) {
							awayvisitante += res[a][b];
						}if(a>b) {
							homelocal += res[a][b];
						}
						
					}
				}
				
				request.setAttribute("L", Math.round(homelocal*100.0)/100.0);
				request.setAttribute("D", Math.round(draw*100.0)/100.0);
				request.setAttribute("V", Math.round(awayvisitante*100.0)/100.0);
				
				
				
				
			
			
			
			
			
			
			
			request.setAttribute("prueba", (poissonLocal.get(1)*poissonVisitante.get(1))*100);
			
			
			
			//request.setAttribute("golesEnContraLocal");
			
			//request.setAttribute("partidosJugadosLocal");
			
			
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
