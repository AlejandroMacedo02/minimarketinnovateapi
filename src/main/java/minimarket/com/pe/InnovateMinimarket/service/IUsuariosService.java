package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Usuarios;

public interface IUsuariosService {

	List<Usuarios> buscarTodos ();
	//Metodo para listar los usuarios

	void guardar(Usuarios usuario);
	//Metodo para guardar un usuario
	
	void modificar(Usuarios usuario);
	//Metodo para editar un usuario
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Usuarios> buscarId(Integer id);
	//Metodo para listar solo un usuario
}
