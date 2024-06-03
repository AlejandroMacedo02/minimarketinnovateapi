package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Caja;

public interface ICajaService {

	List<Caja> buscarTodos ();
	//Metodo para listar los modulos

	void guardar(Caja caja);
	//Metodo para guardar un modulo
	
	void modificar(Caja caja);
	//Metodo para editar un modulo
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Caja> buscarId(Integer id);
	//Metodo para listar solo un modulo
}
