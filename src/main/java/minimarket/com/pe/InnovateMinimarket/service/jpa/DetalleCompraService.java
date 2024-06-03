package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.DetalleCompra;
import minimarket.com.pe.InnovateMinimarket.repository.DetalleCompraRepository;
import minimarket.com.pe.InnovateMinimarket.service.IDetalleCompraService;

@Service
public class DetalleCompraService implements IDetalleCompraService{
	
	@Autowired
	private DetalleCompraRepository repodetcompra;

	public List<DetalleCompra> buscarTodos() {
		return repodetcompra.findAll();
	}

	public void guardar(DetalleCompra detcompra) {
		repodetcompra.save(detcompra);
	}

	public void modificar(DetalleCompra detcompra) {
		repodetcompra.save(detcompra);
	}

	public void eliminar(Integer id) {
		repodetcompra.deleteById(id);
	}

	public Optional<DetalleCompra> buscarId(Integer id) {
		return repodetcompra.findById(id);
	}

}
