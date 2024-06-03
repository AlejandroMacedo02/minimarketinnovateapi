package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.DetalleVenta;

public interface IDetalleVentaService {

	List<DetalleVenta> buscarTodos ();
	//Metodo para listar los clientes

	void guardar(DetalleVenta deventa);
	//Metodo para guardar un cliente
	
	void modificar(DetalleVenta deventa);
	//Metodo para editar un cliente
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<DetalleVenta> buscarId(Integer id);
	//Metodo para listar solo un cliente
}
