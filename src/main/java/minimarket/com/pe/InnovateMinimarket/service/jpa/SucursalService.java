package minimarket.com.pe.InnovateMinimarket.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minimarket.com.pe.InnovateMinimarket.entity.Sucursal;
import minimarket.com.pe.InnovateMinimarket.repository.SucursalRepository;
import minimarket.com.pe.InnovateMinimarket.service.ISucursalService;

@Service
public class SucursalService implements ISucursalService{
	
	@Autowired
	private SucursalRepository repoSucursal;
	
	public List<Sucursal> buscarTodos(){
		return repoSucursal.findAll();
	}
	public void guardar (Sucursal sucursal) {
		repoSucursal.save(sucursal);
	}
	
	public void modificar (Sucursal sucursal) {
		repoSucursal.save(sucursal);
	}
	
	public void eliminar(Integer id) {
		repoSucursal.deleteById(id);
	}
	
	public Optional<Sucursal> buscarId(Integer id){
		return repoSucursal.findById(id);
	}

}
