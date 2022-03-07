package lab7;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.apixu.ElTiempo;
import aiss.model.resource.ApixuResource;

public class ApixuTest {

	@Test
	public void getTiempoTest() throws UnsupportedEncodingException {
		String ciudad = "Sevilla";
		ApixuResource map = new ApixuResource();
		ElTiempo apResults = map.getTiempo(ciudad);

		assertNotNull("El resultado devuelve null", apResults);
		assertNotNull("El resultado devuelve null", apResults.getForecast());
		assertNotNull("El resultado devuelve null", apResults.getForecast().getForecastday());
		assertFalse("No hay prediccion meteorologica para " + ciudad , apResults.getForecast().getForecastday().size() == 0);
		
		System.out.println("La prediccion para " + ciudad + " devuelve " + apResults.getForecast().getForecastday());

		
	}

}
