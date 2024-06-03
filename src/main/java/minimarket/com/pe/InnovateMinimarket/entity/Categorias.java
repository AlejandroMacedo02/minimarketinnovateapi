package minimarket.com.pe.InnovateMinimarket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categorias")
public class Categorias {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idcategoria;
	private String descripcion;
	
	public Integer getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Categorias [idcategoria=" + idcategoria + ", descripcion=" + descripcion + ", getIdcategoria()="
				+ getIdcategoria() + ", getDescripcion()=" + getDescripcion() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
