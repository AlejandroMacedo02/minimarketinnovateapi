package minimarket.com.pe.InnovateMinimarket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="permisos")
public class Permisos {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idpermiso;
	private String descripcion;
	private String idmodulo;
	
	public Integer getIdpermiso() {
		return idpermiso;
	}
	public void setIdpermiso(Integer idpermiso) {
		this.idpermiso = idpermiso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getIdmodulo() {
		return idmodulo;
	}
	public void setIdmodulo(String idmodulo) {
		this.idmodulo = idmodulo;
	}
	@Override
	public String toString() {
		return "Permisos [idpermiso=" + idpermiso + ", descripcion=" + descripcion + ", idmodulo=" + idmodulo
				+ ", getIdpermiso()=" + getIdpermiso() + ", getDescripcion()=" + getDescripcion() + ", getIdmodulo()="
				+ getIdmodulo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
