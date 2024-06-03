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

import minimarket.com.pe.InnovateMinimarket.entity.Compra;
import minimarket.com.pe.InnovateMinimarket.service.ICompraService;

@RestController
@RequestMapping("/apiminimarket")
public class CompraController {

		@Autowired
		private ICompraService serviceCompra;
			
			@GetMapping("/compra")
			public List<Compra>buscarTodos(){
				return serviceCompra.buscarTodos();
			}
			
			@PostMapping("/compra")
			public Compra guardar(@RequestBody Compra compra) { 
				serviceCompra.guardar(compra);
				return compra;
			}
			
			@PutMapping("/compra")
			public Compra modificar(@RequestBody Compra compra) {
				serviceCompra.modificar(compra);
				return compra;
			}
			
			@GetMapping("/compra/{id}")
			public Optional<Compra> buscarId(@PathVariable("id") Integer id){
				return serviceCompra.buscarId(id);
			
			}
			
			@DeleteMapping("/compra/{id}")
			public String eliminar(@PathVariable Integer id) {
				serviceCompra.eliminar(id);
				return "Compra eliminada";
		
			}
}
