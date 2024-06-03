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

import minimarket.com.pe.InnovateMinimarket.entity.Categorias;
import minimarket.com.pe.InnovateMinimarket.service.ICategoriasService;

@RestController
@RequestMapping("/apiminimarket")
public class CategoriasController {

	@Autowired
	private ICategoriasService serviceCategorias;
		
		@GetMapping("/categorias")
		public List<Categorias>buscarTodos(){
			return serviceCategorias.buscarTodos();
		}
		
		@PostMapping("/categorias")
		public Categorias guardar(@RequestBody Categorias categorias) { 
			serviceCategorias.guardar(categorias);
			return categorias;
		}
		
		@PutMapping("/categorias")
		public Categorias modificar(@RequestBody Categorias categorias) {
			serviceCategorias.modificar(categorias);
			return categorias;
		}
		
		@GetMapping("/categorias/{id}")
		public Optional<Categorias> buscarId(@PathVariable("id") Integer id){
			return serviceCategorias.buscarId(id);
		
		}
		
		@DeleteMapping("/categorias/{id}")
		public String eliminar(@PathVariable Integer id) {
			serviceCategorias.eliminar(id);
			return "Categoria eliminada";
	
		}
}
