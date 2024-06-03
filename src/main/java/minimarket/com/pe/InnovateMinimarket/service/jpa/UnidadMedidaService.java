package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.UnidadMedida;
import minimarket.com.pe.InnovateMinimarket.repository.UnidadMedidaRepository;
import minimarket.com.pe.InnovateMinimarket.service.IUnidadMedidaService;

@Service
public class UnidadMedidaService implements IUnidadMedidaService {
	
	@Autowired
	private UnidadMedidaRepository repoUnidadM;

	public List<UnidadMedida> buscarTodos() {
		return repoUnidadM.findAll();
	}

	public void guardar(UnidadMedida unidadm) {
		repoUnidadM.save(unidadm);
	}

	public void modificar(UnidadMedida unidadm) {
		repoUnidadM.save(unidadm);
	}

	public void eliminar(Integer id) {
		repoUnidadM.deleteById(id);
	}

	public Optional<UnidadMedida> buscarId(Integer id) {
		return repoUnidadM.findById(id);
	}

}
