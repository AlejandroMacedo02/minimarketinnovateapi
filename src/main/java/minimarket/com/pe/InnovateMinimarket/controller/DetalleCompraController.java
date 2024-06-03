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

import minimarket.com.pe.InnovateMinimarket.entity.DetalleCompra;
import minimarket.com.pe.InnovateMinimarket.service.IDetalleCompraService;


@RestController
@RequestMapping("/apiminimarket")
public class DetalleCompraController {
	
			@Autowired
			private IDetalleCompraService serviceDetCompra;
				
				@GetMapping("/detcompra")
				public List<DetalleCompra>buscarTodos(){
					return serviceDetCompra.buscarTodos();
				}
				
				@PostMapping("/detcompra")
				public DetalleCompra guardar(@RequestBody DetalleCompra detcompra) { 
					serviceDetCompra.guardar(detcompra);
					return detcompra;
				}
				
				@PutMapping("detcompra")
				public DetalleCompra modificar(@RequestBody DetalleCompra detcompra) {
					serviceDetCompra.modificar(detcompra);
					return detcompra;
				}
				
				@GetMapping("/detcompra/{id}")
				public Optional<DetalleCompra> buscarId(@PathVariable("id") Integer id){
					return serviceDetCompra.buscarId(id);
				
				}
				
				@DeleteMapping("/detcompra/{id}")
				public String eliminar(@PathVariable Integer id) {
					serviceDetCompra.eliminar(id);
					return "DetalleCompra eliminada";
			
				}
}
