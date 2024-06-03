package minimarket.com.pe.InnovateMinimarket.service;

import java.util.List;
import java.util.Optional;

import minimarket.com.pe.InnovateMinimarket.entity.Documento;

public interface IDocumentoService {

	List<Documento> buscarTodos ();
	//Metodo para listar los documentos

	void guardar(Documento documento);
	//Metodo para guardar un documento
	
	void modificar(Documento documento);
	//Metodo para editar un documento
	
	void eliminar(Integer id);
	//Metodo para eliminar por id
	
	Optional<Documento> buscarId(Integer id);
	//Metodo para listar solo un documento
}
