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

import minimarket.com.pe.InnovateMinimarket.entity.UnidadMedida;
import minimarket.com.pe.InnovateMinimarket.service.IUnidadMedidaService;

@RestController
@RequestMapping("/apiminimarket")
public class UnidadMedidaController {

	@Autowired
	private IUnidadMedidaService serviceUnidadM;
		
		@GetMapping("/unidadm")
		public List<UnidadMedida>buscarTodos(){
			return serviceUnidadM.buscarTodos();
		}
		
		@PostMapping("/unidadm")
		public UnidadMedida guardar(@RequestBody UnidadMedida unidadm) { 
			serviceUnidadM.guardar(unidadm);
			return unidadm;
		}
		
		@PutMapping("/unidadm")
		public UnidadMedida modificar(@RequestBody UnidadMedida unidadm) {
			serviceUnidadM.modificar(unidadm);
			return unidadm;
		}
		
		@GetMapping("/unidadm/{id}")
		public Optional<UnidadMedida> buscarId(@PathVariable("id") Integer id){
			return serviceUnidadM.buscarId(id);
		}
		
		@DeleteMapping("/unidadm/{id}")
		public String eliminar(@PathVariable Integer id) {
			serviceUnidadM.eliminar(id);
			return "Unidad de Medida eliminado";
	
		}
}
