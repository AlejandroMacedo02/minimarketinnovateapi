package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Perfil;

public interface IPerfilService {

	List<Perfil> buscarTodos ();
	//Metodo para listar los perfiles

	void guardar(Perfil perfil);
	//Metodo para guardar un perfil
	
	void modificar(Perfil perfil);
	//Metodo para editar un perfil
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Perfil> buscarId(Integer id);
	//Metodo para listar solo un perfil
}
