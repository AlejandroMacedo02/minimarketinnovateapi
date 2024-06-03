package minimarket.com.pe.InnovateMinimarket.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idproducto;
	private String nombre;
	private String descripcion;
	private BigDecimal precio;
	private LocalDate fechingreso;
	private LocalDate fechcaducacion;
	private Integer idcategoria;
	private Integer idunidadmedida;
	private Integer idubicacion;
	
	public Integer getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public LocalDate getFechingreso() {
		return fechingreso;
	}
	public void setFechingreso(LocalDate fechingreso) {
		this.fechingreso = fechingreso;
	}
	public LocalDate getFechcaducacion() {
		return fechcaducacion;
	}
	public void setFechcaducacion(LocalDate fechcaducacion) {
		this.fechcaducacion = fechcaducacion;
	}
	public Integer getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}
	public Integer getIdunidadmedida() {
		return idunidadmedida;
	}
	public void setIdunidadmedida(Integer idunidadmedida) {
		this.idunidadmedida = idunidadmedida;
	}
	public Integer getIdubicacion() {
		return idubicacion;
	}
	public void setIdubicacion(Integer idubicacion) {
		this.idubicacion = idubicacion;
	}
	@Override
	public String toString() {
		return "Productos [idproducto=" + idproducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", fechingreso=" + fechingreso + ", fechcaducacion=" + fechcaducacion
				+ ", idcategoria=" + idcategoria + ", idunidadmedida=" + idunidadmedida + ", idubicacion=" + idubicacion
				+ ", getIdproducto()=" + getIdproducto() + ", getNombre()=" + getNombre() + ", getDescripcion()="
				+ getDescripcion() + ", getPrecio()=" + getPrecio() + ", getFechingreso()=" + getFechingreso()
				+ ", getFechcaducacion()=" + getFechcaducacion() + ", getIdcategoria()=" + getIdcategoria()
				+ ", getIdunidadmedida()=" + getIdunidadmedida() + ", getIdubicacion()=" + getIdubicacion()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
