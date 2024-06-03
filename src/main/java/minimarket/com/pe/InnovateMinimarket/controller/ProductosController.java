package minimarket.com.pe.InnovateMinimarket.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import minimarket.com.pe.InnovateMinimarket.entity.Productos;
import minimarket.com.pe.InnovateMinimarket.service.IProductosService;

@RestController
@RequestMapping("/apiminimarket")
public class ProductosController {

	@Autowired
	private IProductosService serviceProductos;
		
		@GetMapping("/productos")
		public List<Productos>buscarTodos(){
			return serviceProductos.buscarTodos();
		}
		
		@PostMapping("/productos")
		public Productos guardar(@RequestBody Productos productos) { 
			serviceProductos.guardar(productos);
			return productos;
		}
		
		@PutMapping("/productos")
		public Productos modificar(@RequestBody Productos productos) {
			serviceProductos.modificar(productos);
			return productos;
		}
		
		@GetMapping("/productos/{id}")
		public Optional<Productos> buscarId(@PathVariable("id") Integer id){
			return serviceProductos.buscarId(id);
		
		}
		
		@DeleteMapping("/productos/{id}")
		public String eliminar(@PathVariable Integer id) {
			serviceProductos.eliminar(id);
			return "Producto eliminado";
	
		}
}
