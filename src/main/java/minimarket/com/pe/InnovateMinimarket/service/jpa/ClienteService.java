package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.Cliente;
import minimarket.com.pe.InnovateMinimarket.repository.ClienteRepository;
import minimarket.com.pe.InnovateMinimarket.service.IClienteService;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private ClienteRepository repoCliente;

	public List<Cliente> buscarTodos() {
		return repoCliente.findAll();
	}

	public void guardar(Cliente cliente) {
		repoCliente.save(cliente);
	}

	public void modificar(Cliente cliente) {
		repoCliente.save(cliente);
	}

	public void eliminar(Integer id) {
		repoCliente.deleteById(id);
	}

	public Optional<Cliente> buscarId(Integer id) {
		return repoCliente.findById(id);
	}
}
