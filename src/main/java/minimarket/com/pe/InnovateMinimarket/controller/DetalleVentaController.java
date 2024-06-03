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

import minimarket.com.pe.InnovateMinimarket.entity.DetalleVenta;
import minimarket.com.pe.InnovateMinimarket.service.IDetalleVentaService;

@RestController
@RequestMapping("/apiminimarket")
public class DetalleVentaController {

	@Autowired
	private IDetalleVentaService serviceDetVenta;
		
		@GetMapping("/detventa")
		public List<DetalleVenta>buscarTodos(){
			return serviceDetVenta.buscarTodos();
		}
		
		@PostMapping("/detventa")
		public DetalleVenta guardar(@RequestBody DetalleVenta detventa) { 
			serviceDetVenta.guardar(detventa);
			return detventa;
		}
		
		@PutMapping("detventa")
		public DetalleVenta modificar(@RequestBody DetalleVenta detventa) {
			serviceDetVenta.modificar(detventa);
			return detventa;
		}
		
		@GetMapping("/detventa/{id}")
		public Optional<DetalleVenta> buscarId(@PathVariable("id") Integer id){
			return serviceDetVenta.buscarId(id);
		
		}
		
		@DeleteMapping("/detventa/{id}")
		public String eliminar(@PathVariable Integer id) {
			serviceDetVenta.eliminar(id);
			return "DetalleVenta eliminada";
	
		}
}
