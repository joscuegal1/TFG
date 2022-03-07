package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.google.maps.PlaceNearbySearch;
import aiss.model.google.maps.PlaceSearch;

public class GooglePlacesResource {

    private static final Logger log = Logger.getLogger(GooglePlacesResource.class.getName());
    private static final String GOOGLE_PLACES_API_KEY = "AIzaSyDcTparWojqYWHem3YGWN_7PumawCIUWLI";
  //  private final String access_token;
  //  private final String uri = "https://maps.googleapis.com/maps/api/place/findplacefromtext/output?parameters";
    

  //  public GooglePlacesResource(String access_token) {
  //      this.access_token = access_token;
  // }

    /**
     *
     * @return Files
     */
public PlaceSearch getPlaces(String query) throws UnsupportedEncodingException {
		
		// Aseguramos que la cadena de busqueda esta en el formato correcto
		String title = URLEncoder.encode(query,"UTF-8");

		// Escribir url de busqueda
		String uri ="https://maps.googleapis.com/maps/api/place/findplacefromtext/json?input=" + title  + 
				"&inputtype=textquery&fields=photos,formatted_address,name,rating,opening_hours,geometry&key="
				+ GOOGLE_PLACES_API_KEY;
		
		//Añadimos un log
		log.log(Level.FINE, "GooglePlacesURI: " + uri);
		
		//Pedir al servicio RESTful el recurso que queremos en formato json
		ClientResource cr= new ClientResource(uri);
		
		//Convertir dicho recurso a formato java
		PlaceSearch siteSearch = cr.get(PlaceSearch.class);
		
	    return siteSearch;
	}

public PlaceNearbySearch getNearbyPlaces(String query, String query2) throws UnsupportedEncodingException {
	
	// Aseguramos que la cadena de busqueda esta en el formato correcto
	String location = URLEncoder.encode(query,"UTF-8");
	String tipo = URLEncoder.encode(query2, "UTF-8");
	// Escribir url de busqueda
	String uri ="https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=" + location  + 
			"&radius=5000&type=" + tipo + "&keyword=cruise&key="
			+ GOOGLE_PLACES_API_KEY;
	
	//Añadimos un log
	log.log(Level.FINE, "GooglePlacesURI: " + uri);
	
	//Pedir al servicio RESTful el recurso que queremos en formato json
	ClientResource cr= new ClientResource(uri);
	
	//Convertir dicho recurso a formato java
	PlaceNearbySearch nearbySearch = cr.get(PlaceNearbySearch.class);
	
    return nearbySearch;
}

	
}
       

 

