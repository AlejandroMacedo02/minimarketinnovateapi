package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.Ubicacion;
import minimarket.com.pe.InnovateMinimarket.repository.UbicacionRepository;
import minimarket.com.pe.InnovateMinimarket.service.IUbicacionService;

@Service
public class UbicacionService implements IUbicacionService {
	
	@Autowired
	private UbicacionRepository repoUbicacion;

	public List<Ubicacion> buscarTodos() {
		return repoUbicacion.findAll();
	}

	public void guardar(Ubicacion ubicacion) {
		repoUbicacion.save(ubicacion);
	}

	public void modificar(Ubicacion ubicacion) {
		repoUbicacion.save(ubicacion);
	}

	public void eliminar(Integer id) {
		repoUbicacion.deleteById(id);
	}

	public Optional<Ubicacion> buscarId(Integer id) {
		return repoUbicacion.findById(id);
	}

}
