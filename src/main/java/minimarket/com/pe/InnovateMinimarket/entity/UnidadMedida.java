package minimarket.com.pe.InnovateMinimarket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="unidadmedida")
public class UnidadMedida {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idunidadmedida;
	private String descripcion;
	
	public Integer getIdunidadmedida() {
		return idunidadmedida;
	}
	public void setIdunidadmedida(Integer idunidadmedida) {
		this.idunidadmedida = idunidadmedida;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "UnidadMedida [idunidadmedida=" + idunidadmedida + ", descripcion=" + descripcion
				+ ", getIdunidadmedida()=" + getIdunidadmedida() + ", getDescripcion()=" + getDescripcion()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
