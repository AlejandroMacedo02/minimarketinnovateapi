package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.Perfil;
import minimarket.com.pe.InnovateMinimarket.repository.PerfilRepository;
import minimarket.com.pe.InnovateMinimarket.service.IPerfilService;

@Service
public class PerfilService implements IPerfilService {

	@Autowired
	private PerfilRepository repoRoles;

	public List<Perfil> buscarTodos() {
		return repoRoles.findAll();
	}

	public void guardar(Perfil perfil) {
		repoRoles.save(perfil);
	}

	public void modificar(Perfil perfil) {
		repoRoles.save(perfil);
	}

	public void eliminar(Integer id) {
		repoRoles.deleteById(id);
	}

	public Optional<Perfil> buscarId(Integer id) {
		return repoRoles.findById(id);
	}
}
