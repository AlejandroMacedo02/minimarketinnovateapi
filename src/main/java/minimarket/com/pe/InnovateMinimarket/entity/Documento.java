package minimarket.com.pe.InnovateMinimarket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="documento")
public class Documento {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer iddocumento;
	private String descripcion;
	
	public Integer getIddocumento() {
		return iddocumento;
	}
	public void setIddocumento(Integer iddocumento) {
		this.iddocumento = iddocumento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Documento [iddocumento=" + iddocumento + ", descripcion=" + descripcion + ", getIddocumento()="
				+ getIddocumento() + ", getDescripcion()=" + getDescripcion() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
