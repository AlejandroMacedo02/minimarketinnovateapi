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

import minimarket.com.pe.InnovateMinimarket.entity.Documento;
import minimarket.com.pe.InnovateMinimarket.service.IDocumentoService;

@RestController
@RequestMapping("/apiminimarket")
public class DocumentoController {
	
	@Autowired
	private IDocumentoService serviceDocumento;
		
		@GetMapping("documento")
		public List<Documento>buscarTodos(){
			return serviceDocumento.buscarTodos();
		}
		
		@PostMapping("/documento")
		public Documento guardar(@RequestBody Documento documento) { 
			serviceDocumento.guardar(documento);
			return documento;
		}
		
		@PutMapping("/documento")
		public Documento modificar(@RequestBody Documento documento) {
			serviceDocumento.modificar(documento);
			return documento;
		}
		
		@GetMapping("/documento/{id}")
		public Optional<Documento> buscarId(@PathVariable("id") Integer id){
			return serviceDocumento.buscarId(id);
		
		}
		
		@DeleteMapping("/documento/{id}")
		public String eliminar(@PathVariable Integer id) {
			serviceDocumento.eliminar(id);
			return "Documento eliminado";
	
		}
}
