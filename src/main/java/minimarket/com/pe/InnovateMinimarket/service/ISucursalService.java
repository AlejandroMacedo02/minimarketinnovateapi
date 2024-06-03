package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Sucursal;

public interface ISucursalService {

	List<Sucursal> buscarTodos ();
	//Metodo para listar las sucursales

	void guardar(Sucursal sucursal);
	//Metodo para guardar una sucursal
	
	void modificar(Sucursal sucursal);
	//Metodo para editar una sucursal
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Sucursal> buscarId(Integer id);
	//Metodo para listar solo una sucursal
}
