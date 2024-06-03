package minimarket.com.pe.InnovateMinimarket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "ubicacion")
public class Ubicacion {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idubicacion;
	private String nombre;
	private Integer idsucursal;
	
	public Integer getIdubicacion() {
		return idubicacion;
	}
	public void setIdubicacion(Integer idubicacion) {
		this.idubicacion = idubicacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getIdsucursal() {
		return idsucursal;
	}
	public void setIdsucursal(Integer idsucursal) {
		this.idsucursal = idsucursal;
	}
	@Override
	public String toString() {
		return "Ubicacion [idubicacion=" + idubicacion + ", nombre=" + nombre + ", idsucursal=" + idsucursal
				+ ", getIdubicacion()=" + getIdubicacion() + ", getNombre()=" + getNombre() + ", getIdsucursal()="
				+ getIdsucursal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
