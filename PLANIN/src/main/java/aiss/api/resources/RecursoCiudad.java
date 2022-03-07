package aiss.api.resources;

import java.net.URI;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import aiss.api.model.Ciudad;
import aiss.api.model.repository.MapRepositorioListaCiudades;
import aiss.api.model.repository.RepositorioListaCiudades;


@Path("/ciudades")
public class RecursoCiudad {

	public static RecursoCiudad _instance=null;
	RepositorioListaCiudades repository;
	
	private RecursoCiudad(){
		repository=MapRepositorioListaCiudades.getInstance();
	}
	
	public static RecursoCiudad getInstance()
	{
		if(_instance==null)
			_instance=new RecursoCiudad();
		return _instance; 
	}
	
	@GET
	@Produces("application/json")
	public Collection<Ciudad> getAll()
	{
		
		return repository.getTodasCiudades();
	}
	
	
	@GET
	@Path("/{idCiudad}")
	@Produces("application/json")
	public Ciudad get(@PathParam("idCiudad") String idCiudad)
	{
		Ciudad ciudad = repository.getCiudad(idCiudad);
		
		if (ciudad == null) {
			throw new NotFoundException("La ciudad con id="+ idCiudad +" no se encontró");			
		}
		
		
		return ciudad;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addCiudad(@Context UriInfo uriInfo, Ciudad ciudad) {
		if (ciudad.getNombreCiudad() == null || "".equals(ciudad.getNombreCiudad()))
			throw new BadRequestException("El nombre de la ciudad no puede ser nulo.");
		

		repository.addCiudad(ciudad);

		// Builds the response. Returns the song the has just been added.
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(ciudad.getIdCiudad());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(ciudad);			
		return resp.build();
	}
	
	
	@PUT
	@Consumes("application/json")
	public Response updateSong(@Context UriInfo uriInfo,Ciudad ciudad) {
		Ciudad oldcity = repository.getCiudad(ciudad.getIdCiudad());
		if (oldcity == null) {
			throw new NotFoundException("La ciudad con id="+ ciudad.getIdCiudad() +" no se encontró");			
		}
		repository.updateCiudad(ciudad);
	
		return Response.noContent().build();
	}
	
	@DELETE
	@Path("/{idCiudad}")
	public Response removeSong(@PathParam("idCiudad") String idCiudad) {
		Ciudad ciudad=repository.getCiudad(idCiudad);
		if (ciudad == null)
			throw new NotFoundException("La ciudad con id="+ idCiudad +" no se encontró");
		else
			repository.deleteCiudad(idCiudad);
		
		return Response.noContent().build();
	}
	
}
