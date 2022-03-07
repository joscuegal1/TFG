package lab7;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.google.maps.PlaceNearbySearch;
import aiss.model.google.maps.PlaceSearch;
import aiss.model.resource.GooglePlacesResource;

public class GooglePlacesTest {

	@Test
	public void getPlacesTest() throws UnsupportedEncodingException {
		String title = "Sevilla";
		GooglePlacesResource map = new GooglePlacesResource();
		PlaceSearch gpResults = map.getPlaces(title);

		assertNotNull("El resultado devuelve null", gpResults);
		assertNotNull("El resultado devuelve nulll", gpResults.getCandidates());
		assertFalse("El numero de lugares llamados " + title + " es cero", gpResults.getCandidates().size() == 0);

		System.out.println(
				"La busqueda para " + title + " devuelve " + gpResults.getCandidates().size() + " lugares.");
	}

	
	@Test
	public void getNearByPlacesTest() throws UnsupportedEncodingException {
		String tipo = "Bar";
		String location = "Madrid";
		GooglePlacesResource map = new GooglePlacesResource();
		PlaceNearbySearch gpResults = map.getNearbyPlaces(location, tipo);

		assertNotNull("El resultado devuelve null", gpResults);
		assertNotNull("El resultado devuelve null", gpResults.getResults());
		assertTrue("El numero de lugares devueltos del tipo " + tipo + " en " + location + " es cero", gpResults.getResults().size() == 0);
		
		System.out.println(
				"La busqueda para lugares del tipo " + tipo + " en " + location + " devuelve " + gpResults.getResults().size() + " lugares.");

	}

}
