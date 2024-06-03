package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.DetalleCompra;

public interface IDetalleCompraService {

	List<DetalleCompra> buscarTodos ();
	//Metodo para listar los clientes

	void guardar(DetalleCompra decompra);
	//Metodo para guardar un cliente
	
	void modificar(DetalleCompra decompra);
	//Metodo para editar un cliente
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<DetalleCompra> buscarId(Integer id);
	//Metodo para listar solo un cliente
}
