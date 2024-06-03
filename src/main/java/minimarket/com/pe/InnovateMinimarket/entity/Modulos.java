package minimarket.com.pe.InnovateMinimarket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="modulos")
public class Modulos {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idmodulo;
	private String descripcion;
	
	public Integer getIdmodulo() {
		return idmodulo;
	}
	public void setIdmodulo(Integer idmodulo) {
		this.idmodulo = idmodulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Modulos [idmodulo=" + idmodulo + ", descripcion=" + descripcion + ", getIdmodulo()=" + getIdmodulo()
				+ ", getDescripcion()=" + getDescripcion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
