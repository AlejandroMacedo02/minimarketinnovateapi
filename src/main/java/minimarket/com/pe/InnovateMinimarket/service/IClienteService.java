package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Cliente;

public interface IClienteService {

	List<Cliente> buscarTodos ();
	//Metodo para listar los clientes

	void guardar(Cliente cliente);
	//Metodo para guardar un cliente
	
	void modificar(Cliente cliente);
	//Metodo para editar un cliente
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Cliente> buscarId(Integer id);
	//Metodo para listar solo un cliente
}
