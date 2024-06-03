package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Productos;

public interface IProductosService {

	List<Productos> buscarTodos ();
	//Metodo para listar los productos

	void guardar(Productos productos);
	//Metodo para guardar un producto
	
	void modificar(Productos productos);
	//Metodo para editar un producto
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Productos> buscarId(Integer id);
	//Metodo para listar solo un producto
}
