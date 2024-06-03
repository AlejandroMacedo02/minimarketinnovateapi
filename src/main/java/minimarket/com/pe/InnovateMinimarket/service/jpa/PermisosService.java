package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.Permisos;
import minimarket.com.pe.InnovateMinimarket.repository.PermisosRepository;
import minimarket.com.pe.InnovateMinimarket.service.IPermisosService;

@Service
public class PermisosService implements IPermisosService {

	@Autowired
	private PermisosRepository repoPermisos;

	public List<Permisos> buscarTodos() {
		return repoPermisos.findAll();
	}

	public void guardar(Permisos permisos) {
		repoPermisos.save(permisos);
	}

	public void modificar(Permisos permisos) {
		repoPermisos.save(permisos);
	}

	public void eliminar(Integer id) {
		repoPermisos.deleteById(id);
	}

	public Optional<Permisos> buscarId(Integer id) {
		return repoPermisos.findById(id);
	}
}
