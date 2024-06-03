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

import minimarket.com.pe.InnovateMinimarket.entity.Venta;
import minimarket.com.pe.InnovateMinimarket.service.IVentaService;

@RestController
@RequestMapping("/apiminimarket")
public class VentaController {

	@Autowired
	private IVentaService serviceVenta;
		
		@GetMapping("/venta")
		public List<Venta>buscarTodos(){
			return serviceVenta.buscarTodos();
		}
		
		@PostMapping("/venta")
		public Venta guardar(@RequestBody Venta venta) { 
			serviceVenta.guardar(venta);
			return venta;
		}
		
		@PutMapping("/venta")
		public Venta modificar(@RequestBody Venta venta) {
			serviceVenta.modificar(venta);
			return venta;
		}
		
		@GetMapping("/venta/{id}")
		public Optional<Venta> buscarId(@PathVariable("id") Integer id){
			return serviceVenta.buscarId(id);
		
		}
		
		@DeleteMapping("/venta/{id}")
		public String eliminar(@PathVariable Integer id) {
			serviceVenta.eliminar(id);
			return "Venta eliminada";
	
		}
}
