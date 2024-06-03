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

import minimarket.com.pe.InnovateMinimarket.entity.Modulos;
import minimarket.com.pe.InnovateMinimarket.service.IModulosService;

@RestController
@RequestMapping("/apiminimarket")
public class ModulosControlles {
	
	@Autowired
	private IModulosService serviceModulos;
		
		@GetMapping("/modulos")
		public List<Modulos>buscarTodos(){
			return serviceModulos.buscarTodos();
		}
		
		@PostMapping("/modulos")
		public Modulos guardar(@RequestBody Modulos modulos) { 
			serviceModulos.guardar(modulos);
			return modulos;
		}
		
		@PutMapping("/modulos")
		public Modulos modificar(@RequestBody Modulos modulos) {
			serviceModulos.modificar(modulos);
			return modulos;
		}
		
		@GetMapping("/modulos/{id}")
		public Optional<Modulos> buscarId(@PathVariable("id") Integer id){
			return serviceModulos.buscarId(id);
		
		}
		
		@DeleteMapping("/modulos/{id}")
		public String eliminar(@PathVariable Integer id) {
			serviceModulos.eliminar(id);
			return "Perfil eliminado";
	
		}
}
