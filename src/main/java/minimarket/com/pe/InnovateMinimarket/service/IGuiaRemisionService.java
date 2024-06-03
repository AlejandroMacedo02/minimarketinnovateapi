package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.GuiaRemision;

public interface IGuiaRemisionService {

	List<GuiaRemision> buscarTodos ();
	//Metodo para listar los modulos

	void guardar(GuiaRemision gremision);
	//Metodo para guardar un modulo
	
	void modificar(GuiaRemision gremision);
	//Metodo para editar un modulo
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<GuiaRemision> buscarId(Integer id);
	//Metodo para listar solo un modulo
}
