package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Permisos;

public interface IPermisosService {

	List<Permisos> buscarTodos ();
	//Metodo para listar los permisos

	void guardar(Permisos permisos);
	//Metodo para guardar un permiso
	
	void modificar(Permisos permisos);
	//Metodo para editar un permiso
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Permisos> buscarId(Integer id);
	//Metodo para listar solo un permiso
}
