package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.Caja;
import minimarket.com.pe.InnovateMinimarket.repository.CajaRepository;
import minimarket.com.pe.InnovateMinimarket.service.ICajaService;

@Service
public class CajaService implements ICajaService{
	@Autowired
	private CajaRepository repoCaja;

	public List<Caja> buscarTodos() {
		return repoCaja.findAll();
	}

	public void guardar(Caja caja) {
		repoCaja.save(caja);
	}

	public void modificar(Caja caja) {
		repoCaja.save(caja);
	}

	public void eliminar(Integer id) {
		repoCaja.deleteById(id);
	}

	public Optional<Caja> buscarId(Integer id) {
		return repoCaja.findById(id);
	}

}
