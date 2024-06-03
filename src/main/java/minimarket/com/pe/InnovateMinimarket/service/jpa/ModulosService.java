package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.Modulos;
import minimarket.com.pe.InnovateMinimarket.repository.ModulosRepository;
import minimarket.com.pe.InnovateMinimarket.service.IModulosService;

@Service
public class ModulosService implements IModulosService {
	
	@Autowired
	private ModulosRepository repoModulos;

	public List<Modulos> buscarTodos() {
		return repoModulos.findAll();
	}

	public void guardar(Modulos modulos) {
		repoModulos.save(modulos);
	}

	public void modificar(Modulos modulos) {
		repoModulos.save(modulos);
	}

	public void eliminar(Integer id) {
		repoModulos.deleteById(id);
	}

	public Optional<Modulos> buscarId(Integer id) {
		return repoModulos.findById(id);
	}

}
