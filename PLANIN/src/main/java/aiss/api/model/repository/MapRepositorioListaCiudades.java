package aiss.api.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import aiss.api.model.Ciudad;
import aiss.api.model.ListaCiudades;


public class MapRepositorioListaCiudades implements RepositorioListaCiudades{

	Map<String, ListaCiudades> MapListaCiudades;
	Map<String, Ciudad> MapCiudades;
	private static MapRepositorioListaCiudades instance=null;
	private int index=0;	// Índice para crear listas de ciudades e identificadores de ciudades
	
	
	public static MapRepositorioListaCiudades getInstance() {
		
		if (instance==null) {
			instance = new MapRepositorioListaCiudades();
			instance.init();
		}
		
		return instance;
	}
	
	public void init() {
		
		MapListaCiudades = new HashMap<String,ListaCiudades>();
		MapCiudades = new HashMap<String,Ciudad>();
		
		// Crear ciudades 
		Ciudad Sevilla=new Ciudad();
		Sevilla.setNombreCiudad("Sevilla");
		addCiudad(Sevilla);
		
		Ciudad NewYork=new Ciudad();
		NewYork.setNombreCiudad("NewYork");
		addCiudad(NewYork);
		
		Ciudad Tokio=new Ciudad();
		Tokio.setNombreCiudad("Tokio");
		addCiudad(Tokio);
		
		Ciudad Paris=new Ciudad();
		Paris.setNombreCiudad("París");
		addCiudad(Paris);
		
		
		// Crear Listas de Ciudades 
		ListaCiudades lista1=new ListaCiudades();
		lista1.setNombreLista("Lista1");
		lista1.setDescripcion("Lista de ciudades 1");
		addListaCiudades(lista1);
		
		ListaCiudades listaFavoritas = new ListaCiudades();
		listaFavoritas.setNombreLista("ListaFavoritas");
		listaFavoritas.setDescripcion("Lista de ciudades favoritas");
		addListaCiudades(listaFavoritas);
		
		// Añadir ciudades a las listas de ciudades
		addCiudad(lista1.getIdListaCiudades(), Sevilla.getIdCiudad());
		addCiudad(lista1.getIdListaCiudades(), NewYork.getIdCiudad());
		addCiudad(lista1.getIdListaCiudades(), Paris.getIdCiudad());
		addCiudad(lista1.getIdListaCiudades(), Tokio.getIdCiudad());
		
		addCiudad(listaFavoritas.getIdListaCiudades(), Tokio.getIdCiudad());
		
	}
	
	// Operaciones relacionadas con las listas de ciudades
	@Override
	public void addListaCiudades(ListaCiudades l) {
		String idListaCiudades = "l" + index++;	
		l.setIdListaCiudades(idListaCiudades);
		MapListaCiudades.put(idListaCiudades, l);
	}
	
	@Override
	public Collection<ListaCiudades> getAllListaCiudades() {
			return MapListaCiudades.values();
	}

	@Override
	public ListaCiudades getListaCiudades(String idListaCiudades) {
		return MapListaCiudades.get(idListaCiudades);
	}
	
	@Override
	public void updateListaCiudades(ListaCiudades l) {
		MapListaCiudades.put(l.getIdListaCiudades(),l);
	}

	@Override
	public void deleteListaCiudades(String idListaCiudades) {	
		MapListaCiudades.remove(idListaCiudades);
	}
	

	@Override
	public void addCiudad(String idListaCiudades, String idCiudad) {
		ListaCiudades listaCiudades = getListaCiudades(idListaCiudades);
		listaCiudades.addCiudad(MapCiudades.get(idCiudad));
	}

	@Override
	public Collection<Ciudad> getAllListaCiudades(String idListaCiudades) {
		return getListaCiudades(idListaCiudades).getCiudades();
	}

	@Override
	public void removeCiudad(String idListaCiudades, String idCiudad) {
		getListaCiudades(idListaCiudades).deleteCiudad(idCiudad);
	}

	
	// Song related operations
	
	@Override
	public void addCiudad(Ciudad c) {
		String idCiudad = "c" + index++;
		c.setIdCiudad(idCiudad);
		MapCiudades.put(idCiudad, c);
	}
	
	@Override
	public Collection<Ciudad> getTodasCiudades() {
			return MapCiudades.values();
	}

	@Override
	public Ciudad getCiudad(String idCiudad) {
		return MapCiudades.get(idCiudad);
	}

	@Override
	public void updateCiudad(Ciudad c) {
		Ciudad ciudad = MapCiudades.get(c.getIdCiudad());
		ciudad.setNombreCiudad(c.getNombreCiudad());
	}

	@Override
	public void deleteCiudad(String idCiudad) {
		MapCiudades.remove(idCiudad);
	}
	
}
