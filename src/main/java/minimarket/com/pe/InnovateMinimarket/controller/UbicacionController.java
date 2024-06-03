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

import minimarket.com.pe.InnovateMinimarket.entity.Ubicacion;
import minimarket.com.pe.InnovateMinimarket.service.IUbicacionService;

@RestController
@RequestMapping("/apiminimarket")
public class UbicacionController {
	
	@Autowired
	private IUbicacionService serviceUbicacion;
		
		@GetMapping("/ubicacion")
		public List<Ubicacion>buscarTodos(){
			return serviceUbicacion.buscarTodos();
		}
		
		@PostMapping("/ubicacion")
		public Ubicacion guardar(@RequestBody Ubicacion ubicacion) { 
			serviceUbicacion.guardar(ubicacion);
			return ubicacion;
		}
		
		@PutMapping("/ubicacion")
		public Ubicacion modificar(@RequestBody Ubicacion ubicacion) {
			serviceUbicacion.modificar(ubicacion);
			return ubicacion;
		}
		
		@GetMapping("/ubicacion/{id}")
		public Optional<Ubicacion> buscarId(@PathVariable("id") Integer id){
			return serviceUbicacion.buscarId(id);
		
		}
		
		@DeleteMapping("/ubicacion/{id}")
		public String eliminar(@PathVariable Integer id) {
			serviceUbicacion.eliminar(id);
			return "Ubicacion eliminada";
	
		}
}
