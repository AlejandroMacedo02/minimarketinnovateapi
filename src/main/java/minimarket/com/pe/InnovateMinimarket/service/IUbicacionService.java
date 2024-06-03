package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Ubicacion;

public interface IUbicacionService {

	List<Ubicacion> buscarTodos ();
	//Metodo para listar las ubicaciones

	void guardar(Ubicacion ubicacion);
	//Metodo para guardar una ubicacion
	
	void modificar(Ubicacion ubicacion);
	//Metodo para editar una ubicacion
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Ubicacion> buscarId(Integer id);
	//Metodo para listar solo una ubicacion
}
