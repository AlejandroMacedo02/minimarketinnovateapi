package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Modulos;

public interface IModulosService {

	List<Modulos> buscarTodos ();
	//Metodo para listar los modulos

	void guardar(Modulos modulos);
	//Metodo para guardar un modulo
	
	void modificar(Modulos modulos);
	//Metodo para editar un modulo
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Modulos> buscarId(Integer id);
	//Metodo para listar solo un modulo
}
