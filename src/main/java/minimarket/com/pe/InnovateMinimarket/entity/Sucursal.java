package minimarket.com.pe.InnovateMinimarket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sucursal")
public class Sucursal {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idsucursal;
	private String nombresucursal;
	private String direccion;
	private String telefono;
	private String representante;
	private Integer idusuario;
	
	public Integer getIdsucursal() {
		return idsucursal;
	}
	public void setIdsucursal(Integer idsucursal) {
		this.idsucursal = idsucursal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNombresucursal() {
		return nombresucursal;
	}
	public void setNombresucursal(String nombresucursal) {
		this.nombresucursal = nombresucursal;
	}
	public String getRepresentante() {
		return representante;
	}
	public void setRepresentante(String representante) {
		this.representante = representante;
	}
	public Integer getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	@Override
	public String toString() {
		return "Sucursal [idsucursal=" + idsucursal + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", nombresucursal=" + nombresucursal + ", representante=" + representante + ", idusuario=" + idusuario
				+ ", getIdsucursal()=" + getIdsucursal() + ", getDireccion()=" + getDireccion() + ", getTelefono()="
				+ getTelefono() + ", getNombresucursal()=" + getNombresucursal() + ", getRepresentante()="
				+ getRepresentante() + ", getIdusuario()=" + getIdusuario() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
