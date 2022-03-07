package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.apixu.ElTiempo;



public class ApixuResource {

	private static final String APIXU_API_KEY = "350b4fb8fc4f4b1a814102530192404 ";  // TODO: Change this API KEY for your personal Key
	private static final Logger log = Logger.getLogger(ApixuResource.class.getName());
	
	public ElTiempo getTiempo(String query) throws UnsupportedEncodingException {
		
		// Aseguramos que la cadena de busqueda esta en el formato correcto
		String ciudad = URLEncoder.encode(query,"UTF-8");

		// Escribir url de busqueda
		String uri ="http://api.apixu.com/v1/forecast.json?key=" + APIXU_API_KEY + "&q=" + ciudad + "&days=5";
		
		//Añadimos un log
		log.log(Level.FINE, "ApixuURI: " + uri);
		
		//Pedir al servicio RESTful el recurso que queremos en formato json
		ClientResource cr= new ClientResource(uri);
		
		//Convertir dicho recurso a formato java
		ElTiempo tiempo = cr.get(ElTiempo.class);

		return tiempo;
	    
	}
	
}