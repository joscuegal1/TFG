package aiss.api.model.repository;

import java.util.Collection;

import aiss.api.model.Ciudad;
import aiss.api.model.ListaCiudades;

public interface RepositorioListaCiudades {
	
	
	// Ciudades
	public void addCiudad(Ciudad c);
	public Collection<Ciudad> getTodasCiudades();
	public Ciudad getCiudad(String idCiudad);
	public void updateCiudad(Ciudad c);
	public void deleteCiudad(String idCiudad);
	
	// Listas de ciudades
	public void addListaCiudades(ListaCiudades l);
	public Collection<ListaCiudades> getAllListaCiudades();
	public ListaCiudades getListaCiudades(String idListaCiudades);
	public void updateListaCiudades(ListaCiudades l);
	public void deleteListaCiudades(String idListaCiudades);
	public Collection<Ciudad> getAllListaCiudades(String idListaCiudades);
	public void addCiudad(String idListaCiudades, String idCiudad);
	public void removeCiudad(String idListaCiudades, String idCiudad); 

	
	
	
	

}
