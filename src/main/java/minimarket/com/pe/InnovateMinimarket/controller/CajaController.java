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

import minimarket.com.pe.InnovateMinimarket.entity.Caja;
import minimarket.com.pe.InnovateMinimarket.service.ICajaService;


@RestController
@RequestMapping("/apiminimarket")
public class CajaController {

	@Autowired
	private ICajaService serviceCaja;
		
		@GetMapping("/caja")
		public List<Caja>buscarTodos(){
			return serviceCaja.buscarTodos();
		}
		
		@PostMapping("/caja")
		public Caja guardar(@RequestBody Caja caja) { 
			serviceCaja.guardar(caja);
			return caja;
		}
		
		@PutMapping("/caja")
		public Caja modificar(@RequestBody Caja caja) {
			serviceCaja.modificar(caja);
			return caja;
		}
		
		@GetMapping("/categorias/{id}")
		public Optional<Caja> buscarId(@PathVariable("id") Integer id){
			return serviceCaja.buscarId(id);
		
		}
		
		@DeleteMapping("/categorias/{id}")
		public String eliminar(@PathVariable Integer id) {
			serviceCaja.eliminar(id);
			return "Caja eliminada";
	
		}
}
