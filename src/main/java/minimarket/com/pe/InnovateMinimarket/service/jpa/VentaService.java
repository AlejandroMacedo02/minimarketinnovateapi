package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.Venta;
import minimarket.com.pe.InnovateMinimarket.repository.VentaRepository;
import minimarket.com.pe.InnovateMinimarket.service.IVentaService;

@Service
public class VentaService implements IVentaService{
	
	@Autowired
	private VentaRepository repoVenta;

	public List<Venta> buscarTodos() {
		return repoVenta.findAll();
	}

	public void guardar(Venta venta) {
		repoVenta.save(venta);
	}

	public void modificar(Venta venta) {
		repoVenta.save(venta);
	}

	public void eliminar(Integer id) {
		repoVenta.deleteById(id);
	}

	public Optional<Venta> buscarId(Integer id) {
		return repoVenta.findById(id);
	}

}
