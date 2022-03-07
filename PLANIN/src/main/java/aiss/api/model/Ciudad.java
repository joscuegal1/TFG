package aiss.api.model;

public class Ciudad {

	private String idCiudad;
	private String nombreCiudad;

	public Ciudad() {
	}
	
	public Ciudad(String idCiudad, String nombreCiudad) {
		this.idCiudad=idCiudad;
		this.nombreCiudad = nombreCiudad;
	}

	public String getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(String idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

}
