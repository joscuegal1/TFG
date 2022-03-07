package aiss.api.resources;

import java.net.URI;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import aiss.api.model.Ciudad;
import aiss.api.model.ListaCiudades;
import aiss.api.model.repository.MapRepositorioListaCiudades;
import aiss.api.model.repository.RepositorioListaCiudades;


@Path("/lists")
public class RecursoListaCiudades {
	
	/* Singleton */
	private static RecursoListaCiudades _instance=null;
	RepositorioListaCiudades repository;
	
	private RecursoListaCiudades() {
		repository=MapRepositorioListaCiudades.getInstance();

	}
	
	public static RecursoListaCiudades getInstance()
	{
		if(_instance==null)
				_instance=new RecursoListaCiudades();
		return _instance;
	}
	

	@GET
	@Produces("application/json")
	public Collection<ListaCiudades> getAllListaCiudades()
	{
		return repository.getAllListaCiudades();
	}
	
	
	@GET
	@Path("/{idListaCiudades}")
	@Produces("application/json")
	public ListaCiudades get(@PathParam("idListaCiudades") String idListaCiudades)
	{
		ListaCiudades list = repository.getListaCiudades(idListaCiudades);
		
		if (list == null) {
			throw new NotFoundException("La lista de ciudades con id="+ idListaCiudades +" no se ha podido encontrar");			
		}
		
		return list;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addPlaylist(@Context UriInfo uriInfo, ListaCiudades listaCiudades) {
		if (listaCiudades.getNombreLista() == null || "".equals(listaCiudades.getNombreLista()))
			throw new BadRequestException("El nombre de la lista de ciudades no puede ser nulo");
		
		if (listaCiudades.getCiudades()!=null)
			throw new BadRequestException("La propiedad canciones no es editable");

		repository.addListaCiudades(listaCiudades);

		// Construye la respuesta. Devuelve la lista que acaba de ser añadida
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(listaCiudades.getIdListaCiudades());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(listaCiudades);			
		return resp.build();
	}

	
	@PUT
	@Consumes("application/json")
	public Response updatePlaylist(ListaCiudades listaCiudades) {
		ListaCiudades oldlist = repository.getListaCiudades(listaCiudades.getIdListaCiudades());
		if (oldlist == null) {
			throw new NotFoundException("La lista de ciudades con id="+ listaCiudades.getIdListaCiudades() +" no se encuentra.");			
		}
		
		if (listaCiudades.getCiudades()!=null)
			throw new BadRequestException("La propiedad ciudades no es editable");
		
		// Actualizar el nombre de la lista
		if (listaCiudades.getNombreLista()!=null)
			oldlist.setNombreLista(listaCiudades.getNombreLista());
		
		// Actualizar la descripción
		if (listaCiudades.getDescripcion()!=null)
			oldlist.setDescripcion(listaCiudades.getDescripcion());
		
		return Response.noContent().build();
	}
	
	@DELETE
	@Path("/{idListaCiudades}")
	public Response removeListaCiudades(@PathParam("idListaCiudades") String idListaCiudades) {
		ListaCiudades toberemoved=repository.getListaCiudades(idListaCiudades);
		if (toberemoved == null)
			throw new NotFoundException("La lista de ciudades con id="+ idListaCiudades +" no se encuentra.");
		else
			repository.deleteListaCiudades(idListaCiudades);
		
		return Response.noContent().build();
	}
	
	
	@POST	
	@Path("/{idListaCiudades}/{idCiudad}")
	@Consumes("text/plain")
	@Produces("application/json")
	public Response addSong(@Context UriInfo uriInfo,@PathParam("idListaCiudades") String idListaCiudades, @PathParam("idCiudad") String idCiudad)
	{				
		
		ListaCiudades listaCiudades = repository.getListaCiudades(idListaCiudades);
		Ciudad ciudad = repository.getCiudad(idCiudad);
		
		if (listaCiudades==null)
			throw new NotFoundException("La lista de ciudades con id=" + idListaCiudades + " no se encontró");
		
		if (ciudad == null)
			throw new NotFoundException("La ciudad con id=" + idCiudad + " no se encontró");
		
		if (listaCiudades.getCiudad(idCiudad)!=null)
			throw new BadRequestException("La ciudad está ya incluida en la lista de ciudades.");
			
		repository.addCiudad(idListaCiudades, idCiudad);		

		// Construye la respuesta 
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(idListaCiudades);
		ResponseBuilder resp = Response.created(uri);
		resp.entity(listaCiudades);			
		return resp.build();
	}
	
	
	@DELETE
	@Path("/{idListaCiudades}/{idCiudad}")
	public Response removeCiudad(@PathParam("idListaCiudad") String idListaCiudad, @PathParam("idCiudad") String idCiudad) {
		ListaCiudades listaCiudades = repository.getListaCiudades(idListaCiudad);
		Ciudad ciudad = repository.getCiudad(idCiudad);
		
		if (listaCiudades==null)
			throw new NotFoundException("La lista de ciudades con id=" + idListaCiudad + " no se encontró");
		
		if (ciudad == null)
			throw new NotFoundException("La ciudad con id=" + idCiudad + " no se encontró");
		
		
		repository.removeCiudad(idListaCiudad, idCiudad);		
		
		return Response.noContent().build();
	}
}
