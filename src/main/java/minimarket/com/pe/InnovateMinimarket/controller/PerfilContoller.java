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

import minimarket.com.pe.InnovateMinimarket.entity.Perfil;
import minimarket.com.pe.InnovateMinimarket.service.IPerfilService;

@RestController
@RequestMapping("/apiminimarket")
public class PerfilContoller {

	@Autowired
	private IPerfilService servicePerfil;
		
		@GetMapping("/perfil")
		public List<Perfil>buscarTodos(){
			return servicePerfil.buscarTodos();
		}
		
		@PostMapping("/perfil")
		public Perfil guardar(@RequestBody Perfil perfil) { 
			servicePerfil.guardar(perfil);
			return perfil;
		}
		
		@PutMapping("/perfil")
		public Perfil modificar(@RequestBody Perfil perfil) {
			servicePerfil.modificar(perfil);
			return perfil;
		}
		
		@GetMapping("/perfil/{id}")
		public Optional<Perfil> buscarId(@PathVariable("id") Integer id){
			return servicePerfil.buscarId(id);
		
		}
		
		@DeleteMapping("/perfil/{id}")
		public String eliminar(@PathVariable Integer id) {
			servicePerfil.eliminar(id);
			return "Perfil eliminado";
	
		}
}
