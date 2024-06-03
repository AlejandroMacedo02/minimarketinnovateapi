package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Categorias;

public interface ICategoriasService {

	List<Categorias> buscarTodos ();
	//Metodo para listar los modulos

	void guardar(Categorias categorias);
	//Metodo para guardar un modulo
	
	void modificar(Categorias categorias);
	//Metodo para editar un modulo
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Categorias> buscarId(Integer id);
	//Metodo para listar solo un modulo
}
