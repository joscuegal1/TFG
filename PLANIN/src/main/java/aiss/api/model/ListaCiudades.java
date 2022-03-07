package aiss.api.model;

import java.util.ArrayList;
import java.util.List;

public class ListaCiudades {

	private String idListaCiudades;
	private String nombreLista;
	private String descripcion;
	private List<Ciudad> ciudades;
	
	public ListaCiudades() {}
	
	public ListaCiudades(String nombreLista) {
		this.nombreLista = nombreLista;
	}
	
	protected void setCiudades(List<Ciudad> c) {
		ciudades = c;
	}
	
	public String getIdListaCiudades() {
		return idListaCiudades;
	}

	public void setIdListaCiudades(String idCiudad) {
		this.idListaCiudades = idCiudad;
	}

	public String getNombreLista() {
		return nombreLista;
	}

	public void setNombreLista(String nombreLista) {
		this.nombreLista = nombreLista;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public List<Ciudad> getCiudades() {
		return ciudades;
	}
	
	public Ciudad getCiudad(String idCiudad) {
		if (ciudades==null)
			return null;
		
		Ciudad ciudad =null;
		for(Ciudad c: ciudades)
			if (c.getIdCiudad().equals(idCiudad))
			{
				ciudad=c;
				break;
			}
		
		return ciudad;
	}
	
	public void addCiudad(Ciudad c) {
		if (ciudades==null)
			ciudades = new ArrayList<Ciudad>();
		ciudades.add(c);
	}
	
	public void deleteCiudad(Ciudad c) {
		ciudades.remove(c);
	}
	
	public void deleteCiudad(String idCiudad) {
		Ciudad c = getCiudad(idCiudad);
		if (c!=null)
			ciudades.remove(c);
	}

}
