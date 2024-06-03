package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import minimarket.com.pe.InnovateMinimarket.entity.Productos;
import minimarket.com.pe.InnovateMinimarket.repository.ProductosRepository;
import minimarket.com.pe.InnovateMinimarket.service.IProductosService;

public class ProductosService implements IProductosService {
	
	@Autowired
	private ProductosRepository repoProductos;

	public List<Productos> buscarTodos() {
		return repoProductos.findAll();
	}

	public void guardar(Productos productos) {
		repoProductos.save(productos);
	}

	public void modificar(Productos productos) {
		repoProductos.save(productos);
	}

	public void eliminar(Integer id) {
		repoProductos.deleteById(id);
	}

	public Optional<Productos> buscarId(Integer id) {
		return repoProductos.findById(id);
	}

}
