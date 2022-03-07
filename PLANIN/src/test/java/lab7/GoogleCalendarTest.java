package lab7;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.googleCalendar.CalendarEvent;
import aiss.model.googleCalendar.Event;
import aiss.model.resource.GoogleCalendarResource;

public class GoogleCalendarTest {

/*	@Test
	public void getEventsTest() throws UnsupportedEncodingException {
		String access_token = null;
		GoogleCalendarResource map = new GoogleCalendarResource(access_token);
		CalendarEvent gcResults = map.getEvents();

		assertNotNull("El resultado devuelve null", gcResults);
		assertNotNull("El resultado devuelve null", gcResults);
		assertTrue("No hay eventos " , gcResults.equals(" "));

		System.out.println("Lista de eventos devueltos" + gcResults.getSummary());

	}
*/
	@Test
	public void createEventTest() throws UnsupportedEncodingException {
		Event event = null;
		String access_token = "";
		GoogleCalendarResource map = new GoogleCalendarResource(access_token);
		String res = map.createEvent(event);

		assertNotNull("El resultado devuelve null", res);

		System.out.println("El resultado devuelve " + res);
	}
	
	

}
