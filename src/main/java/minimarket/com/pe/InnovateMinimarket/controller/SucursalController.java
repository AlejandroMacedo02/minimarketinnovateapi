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

import minimarket.com.pe.InnovateMinimarket.entity.Sucursal;
import minimarket.com.pe.InnovateMinimarket.service.ISucursalService;

@RestController
@RequestMapping("/apiminimarket")
public class SucursalController {

	@Autowired
	private ISucursalService serviceSucursal;
		
		@GetMapping("/sucursal")
		public List<Sucursal>buscarTodos(){
			return serviceSucursal.buscarTodos();
		}
		
		@PostMapping("/sucursal")
		public Sucursal guardar(@RequestBody Sucursal sucursal) { 
			serviceSucursal.guardar(sucursal);
			return sucursal;
		}
		
		@PutMapping("/sucursal")
		public Sucursal modificar(@RequestBody Sucursal sucursal) {
			serviceSucursal.modificar(sucursal);
			return sucursal;
		}
		
		@GetMapping("/sucursal/{id}")
		public Optional<Sucursal> buscarId(@PathVariable("id") Integer id){
			return serviceSucursal.buscarId(id);
		
		}
		
		@DeleteMapping("/sucursal/{id}")
		public String eliminar(@PathVariable Integer id) {
			serviceSucursal.eliminar(id);
			return "Sucursal eliminado";
	
		}
}
