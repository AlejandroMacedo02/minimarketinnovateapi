package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Venta;

public interface IVentaService {

	List<Venta> buscarTodos ();
	//Metodo para listar los modulos

	void guardar(Venta venta);
	//Metodo para guardar un modulo
	
	void modificar(Venta venta);
	//Metodo para editar un modulo
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Venta> buscarId(Integer id);
	//Metodo para listar solo un modulo
}
