package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.GuiaRemision;
import minimarket.com.pe.InnovateMinimarket.repository.GuiaRemisionRepository;
import minimarket.com.pe.InnovateMinimarket.service.IGuiaRemisionService;

@Service
public class GuiaRemisionService implements IGuiaRemisionService{

	@Autowired
	private GuiaRemisionRepository repoGRemision;

	public List<GuiaRemision> buscarTodos() {
		return repoGRemision.findAll();
	}

	public void guardar(GuiaRemision gremision) {
		repoGRemision.save(gremision);
	}

	public void modificar(GuiaRemision gremision) {
		repoGRemision.save(gremision);
	}

	public void eliminar(Integer id) {
		repoGRemision.deleteById(id);
	}

	public Optional<GuiaRemision> buscarId(Integer id) {
		return repoGRemision.findById(id);
	}
}
