package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Compra;

public interface ICompraService {

	List<Compra> buscarTodos ();
	//Metodo para listar los clientes

	void guardar(Compra compra);
	//Metodo para guardar un cliente
	
	void modificar(Compra compra);
	//Metodo para editar un cliente
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Compra> buscarId(Integer id);
	//Metodo para listar solo un cliente
}
