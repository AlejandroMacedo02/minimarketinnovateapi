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

import minimarket.com.pe.InnovateMinimarket.entity.Permisos;
import minimarket.com.pe.InnovateMinimarket.service.IPermisosService;

@RestController
@RequestMapping("/apiminimarket")
public class PermisosController {

	@Autowired
	private IPermisosService servicePermisos;
		
		@GetMapping("/permisos")
		public List<Permisos>buscarTodos(){
			return servicePermisos.buscarTodos();
		}
		
		@PostMapping("/permisos")
		public Permisos guardar(@RequestBody Permisos permisos) { 
			servicePermisos.guardar(permisos);
			return permisos;
		}
		
		@PutMapping("/permisos")
		public Permisos modificar(@RequestBody Permisos permisos) {
			servicePermisos.modificar(permisos);
			return permisos;
		}
		
		@GetMapping("/permisos/{id}")
		public Optional<Permisos> buscarId(@PathVariable("id") Integer id){
			return servicePermisos.buscarId(id);
		
		}
		
		@DeleteMapping("/perfil/{id}")
		public String eliminar(@PathVariable Integer id) {
			servicePermisos.eliminar(id);
			return "Permiso eliminado";
	
		}
}
