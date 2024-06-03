package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.Usuarios;
import minimarket.com.pe.InnovateMinimarket.repository.UsuariosRepository;
import minimarket.com.pe.InnovateMinimarket.service.IUsuariosService;

@Service
public class UsuariosService implements IUsuariosService {

	@Autowired
	private UsuariosRepository repoUsuario;
	
	public List<Usuarios> buscarTodos(){
		return repoUsuario.findAll();
	}
	public void guardar (Usuarios usuario) {
		repoUsuario.save(usuario);
	}
	
	public void modificar (Usuarios usuario) {
		repoUsuario.save(usuario);
	}
	
	public void eliminar(Integer id) {
		repoUsuario.deleteById(id);
	}
	
	public Optional<Usuarios> buscarId(Integer id){
		return repoUsuario.findById(id);
	}
}
