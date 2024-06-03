package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.Compra;
import minimarket.com.pe.InnovateMinimarket.repository.CompraRepository;
import minimarket.com.pe.InnovateMinimarket.service.ICompraService;

@Service
public class CompraService implements ICompraService {
	
	@Autowired
	private CompraRepository repoCompra;

	public List<Compra> buscarTodos() {
		return repoCompra.findAll();
	}

	public void guardar(Compra compra) {
		repoCompra.save(compra);
	}

	public void modificar(Compra compra) {
		repoCompra.save(compra);
	}

	public void eliminar(Integer id) {
		repoCompra.deleteById(id);
	}

	public Optional<Compra> buscarId(Integer id) {
		return repoCompra.findById(id);
	}

}
