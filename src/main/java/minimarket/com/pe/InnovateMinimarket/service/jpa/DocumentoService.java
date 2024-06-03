package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.Documento;
import minimarket.com.pe.InnovateMinimarket.repository.DocumentoRepository;
import minimarket.com.pe.InnovateMinimarket.service.IDocumentoService;

@Service
public class DocumentoService implements IDocumentoService{
	
	@Autowired
	private DocumentoRepository repoDocumento;

	public List<Documento> buscarTodos() {
		return repoDocumento.findAll();
	}

	public void guardar(Documento documento) {
		repoDocumento.save(documento);
	}

	public void modificar(Documento documento) {
		repoDocumento.save(documento);
	}

	public void eliminar(Integer id) {
		repoDocumento.deleteById(id);
	}

	public Optional<Documento> buscarId(Integer id) {
		return repoDocumento.findById(id);
	}

}
