package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.UnidadMedida;

public interface IUnidadMedidaService {

	List<UnidadMedida> buscarTodos ();
	//Metodo para listar las ubicaciones

	void guardar(UnidadMedida unidadm);
	//Metodo para guardar una ubicacion
	
	void modificar(UnidadMedida unidadm);
	//Metodo para editar una ubicacion
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<UnidadMedida> buscarId(Integer id);
	//Metodo para listar solo una ubicacion
}
