package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.Categorias;
import minimarket.com.pe.InnovateMinimarket.repository.CategoriasRepository;
import minimarket.com.pe.InnovateMinimarket.service.ICategoriasService;

@Service
public class CategoriasService implements ICategoriasService{
	
	@Autowired
	private CategoriasRepository repoCategorias;

	public List<Categorias> buscarTodos() {
		return repoCategorias.findAll();
	}

	public void guardar(Categorias categorias) {
		repoCategorias.save(categorias);
	}

	public void modificar(Categorias categorias) {
		repoCategorias.save(categorias);
	}

	public void eliminar(Integer id) {
		repoCategorias.deleteById(id);
	}

	public Optional<Categorias> buscarId(Integer id) {
		return repoCategorias.findById(id);
	}
}
