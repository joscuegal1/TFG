package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.apixu.ElTiempo;
import aiss.model.estadisticas.Estadisticas;
import aiss.model.racha.Racha;
import aiss.model.soccer.Competitor;
import aiss.model.soccer.Equipo;
import aiss.model.temporada.Temporada;
import aiss.model.versus.Versus;




public class SoccerResource {

	private static final String SOCCER_API_KEY = "6c7vnp5mx6fn87fy5xjgq7y4";  // TODO: Change this API KEY for your personal Key
	private static final Logger log = Logger.getLogger(SoccerResource.class.getName());
	
	public  Equipo getCompetitor(String query) throws UnsupportedEncodingException {
		// Aseguramos que la cadena de busqueda esta en el formato correcto
		String equipo = URLEncoder.encode(query, "UTF-8");
		// Escribir url de busqueda
		String uri ="https://api.sportradar.us/soccer/trial/v4/en/competitors/sr:competitor:" + equipo + "/profile.json?api_key=" + SOCCER_API_KEY;
		//Añadimos un log
		log.log(Level.FINE, "SoccerURI: " + uri);
		//Pedir al servicio RESTful el recurso que queremos en formato json
		ClientResource cr= new ClientResource(uri);
		//Convertir dicho recurso a formato java
		Equipo competitor = cr.get(Equipo.class);
		return competitor;
	}
	
	public Estadisticas getEstadisticas(String competitorId) throws UnsupportedEncodingException{
		
		// Aseguramos que la cadena de busqueda esta en el formato correcto
		String equipo = URLEncoder.encode(competitorId, "UTF-8");
		
		// Escribir url de busqueda para un equipo en concreto de la temporada actual
		String uri = "https://api.sportradar.us/soccer/trial/v4/en/seasons"
				+ "/sr:season:84048/competitors/sr:competitor:" 
		+ equipo + "/statistics.json?api_key=" + SOCCER_API_KEY;
		
		//Añadimos un log
		log.log(Level.FINE, "SoccerURI: " + uri);
		
		//Pedir al servicio RESTful el recurso que queremos en formato json
		ClientResource cr= new ClientResource(uri);
		
		//Convertir dicho recurso a formato java
		Estadisticas estadisticas = cr.get(Estadisticas.class);
		
		return estadisticas;
	
	}
	
	public Temporada getTemporada() throws UnsupportedEncodingException{
		
		// Escribir url de busqueda para todas las estadisticas de la temporada actual
		String uri = "https://api.sportradar.us/soccer/trial/v4/en/seasons/sr:season:84048"
				+ "/standings.json?api_key=" + SOCCER_API_KEY;
		
		//Añadimos un log
		log.log(Level.FINE, "SoccerURI: " + uri);
		
		//Pedir al servicio RESTful el recurso que queremos en formato json
		ClientResource cr= new ClientResource(uri);
		
		//Convertir dicho recurso a formato java
		Temporada temporada = cr.get(Temporada.class);
		
		return temporada;
	
	}
	
	
	//------------------------------------------------------------------------------------
	
	public Integer getFactorial(Integer numero) {
		  if (numero==0)
		    return 1;
		  else
		    return numero * getFactorial(numero-1);
		}
	
	public Double DistPoisson (Integer k, Double lambda) {
		Double res = 0.0;
		Double e = Math.E;
		res = (Math.pow(e, -lambda) * Math.pow(lambda,k)) / getFactorial(k);
		return res;		
	}
	
	public List<Double> distPoissonPorGol(Double lambda){
		List<Double> res = new ArrayList<Double>();
		List<Integer> goles = new ArrayList<Integer>();
		goles.add(0);
		goles.add(1);
		goles.add(2);
		goles.add(3);
		goles.add(4);
		goles.add(5);
		goles.add(6);
		goles.add(7);
		goles.add(8);
		goles.add(9);
		goles.add(10);
		for(int i = 0; i<11; i++) {
			Double p = DistPoisson(goles.get(i), lambda);
			res.add(p);
		}
		return res;
	}
	
	//--------------------------------------------------------------------------------------
	
	
	public Versus getVersus(String competitorId1, String competitorId2) 
			throws UnsupportedEncodingException{
		
		// Aseguramos que la cadena de busqueda esta en el formato correcto
		String equipo1 = URLEncoder.encode(competitorId1, "UTF-8");
		String equipo2 = URLEncoder.encode(competitorId2, "UTF-8");
		
		// Escribir url de busqueda para el historial de un equipo contra otro
		String uri = "https://api.sportradar.us/soccer/trial/v4/en/competitors"
				+ "/sr:competitor:" + equipo1 + 
				"/versus/sr:competitor:" + equipo2 + "/summaries.json?api_key=" 
				+ SOCCER_API_KEY;
		
		//Añadimos un log
		log.log(Level.FINE, "SoccerURI: " + uri);
		
		//Pedir al servicio RESTful el recurso que queremos en formato json
		ClientResource cr= new ClientResource(uri);
		
		//Convertir dicho recurso a formato java
		Versus versus = cr.get(Versus.class);
		
		return versus;
	
	}
	
	
	public Racha getRacha(String competitorId) 
			throws UnsupportedEncodingException{
		
		// Aseguramos que la cadena de busqueda esta en el formato correcto
		String equipo = URLEncoder.encode(competitorId, "UTF-8");

		// Escribir url de busqueda para la racha actual de un equipo
		String uri = "https://api.sportradar.us/soccer/trial/v4/en"
				+ "/competitors/sr:competitor:"
		+ equipo + "/summaries.json?api_key=" + SOCCER_API_KEY;
		
		//Añadimos un log
		log.log(Level.FINE, "SoccerURI: " + uri);
		
		//Pedir al servicio RESTful el recurso que queremos en formato json
		ClientResource cr= new ClientResource(uri);
		
		//Convertir dicho recurso a formato java
		Racha racha = cr.get(Racha.class);
		
		return racha;
	
	}
	
	
	
	
	

	
	
}