package aiss.model.resource;
 
import java.util.logging.Logger;


import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.googleCalendar.CalendarEvent;
import aiss.model.googleCalendar.Event;
 
public class GoogleCalendarResource {
 
    private static final Logger log = Logger.getLogger(GoogleCalendarResource.class.getName());
	
    private static final String URL_BASE = "https://www.googleapis.com/calendar/v3/calendars/primary/events";
    private String access_token;
 
    public GoogleCalendarResource(String access_token) {
        this.access_token = access_token;
    }
 
    public CalendarEvent getEvents() {
    	ClientResource cr = null;
    	CalendarEvent eventsList = null;
    	
    	try {
    		cr = new ClientResource(URL_BASE + "?access_token=" + access_token);
    		eventsList = cr.get(CalendarEvent.class);
    	}catch(ResourceException e) {
    		log.warning("Hubo un error al obtener todos los eventos");
    		e.printStackTrace();
    	}
    	
    	return eventsList;
    }
   

	
    public String createEvent(Event event) {
        ClientResource cr = null;
        String eventId = "";
        
        try {
        	cr = new ClientResource(URL_BASE + "?access_token=" + access_token);
        	Event e = cr.post(event, Event.class);
        	eventId = e.getId();
        } catch(ResourceException e) {
        	log.warning("No se ha podio añadir el evento al calendario");
        	e.printStackTrace();
        }
        
        return eventId;
    }
}

 