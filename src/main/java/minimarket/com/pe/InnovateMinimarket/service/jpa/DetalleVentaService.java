package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.DetalleVenta;
import minimarket.com.pe.InnovateMinimarket.repository.DetalleVentaRepository;
import minimarket.com.pe.InnovateMinimarket.service.IDetalleVentaService;

@Service
public class DetalleVentaService implements IDetalleVentaService {
	
	@Autowired
	private DetalleVentaRepository repodetventa;

	public List<DetalleVenta> buscarTodos() {
		return repodetventa.findAll();
	}

	public void guardar(DetalleVenta detventa) {
		repodetventa.save(detventa);
	}

	public void modificar(DetalleVenta detventa) {
		repodetventa.save(detventa);
	}

	public void eliminar(Integer id) {
		repodetventa.deleteById(id);
	}

	public Optional<DetalleVenta> buscarId(Integer id) {
		return repodetventa.findById(id);
	}

}
