package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.apixu.ElTiempo;
import aiss.model.estadisticas.Estadisticas;
import aiss.model.soccer.Competitor;
import aiss.model.soccer.Equipo;
import aiss.model.temporada.Temporada;




public class SoccerResource {

	private static final String SOCCER_API_KEY = "2jk92tej6gh49ccvxm68awvp";  // TODO: Change this API KEY for your personal Key
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
		
		String equipo = URLEncoder.encode(competitorId, "UTF-8");
				
		String uri = "https://api.sportradar.us/soccer/trial/v4/en/seasons/sr:season:84048/competitors/sr:competitor:" + equipo + "/statistics.json?api_key=" + SOCCER_API_KEY;
		
		log.log(Level.FINE, "SoccerURI: " + uri);
		ClientResource cr= new ClientResource(uri);
		
		Estadisticas estadisticas = cr.get(Estadisticas.class);
		return estadisticas;
	
	}
	
	public Temporada getTemporada(String seasonId) throws UnsupportedEncodingException{
		
		String season = URLEncoder.encode(seasonId, "UTF-8");
		season = "84048";
				
		String uri = "https://api.sportradar.us/soccer/trial/v4/en/seasons/sr:season:" + season + "/standings.json?api_key=" + SOCCER_API_KEY;
		
		log.log(Level.FINE, "SoccerURI: " + uri);
		ClientResource cr= new ClientResource(uri);
		
		Temporada temporada = cr.get(Temporada.class);
		return temporada;
	
	}
	
}