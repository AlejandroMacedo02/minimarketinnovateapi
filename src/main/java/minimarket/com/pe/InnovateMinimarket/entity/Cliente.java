package minimarket.com.pe.InnovateMinimarket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idcliente;
	private String nombre;
	private String apellido;
	private Integer iddocumento;
	private String numerodedocumento;
	private String direecion;
	private String telefono;
	
	public Integer getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getIddocumento() {
		return iddocumento;
	}
	public void setIddocumento(Integer iddocumento) {
		this.iddocumento = iddocumento;
	}
	public String getNumerodedocumento() {
		return numerodedocumento;
	}
	public void setNumerodedocumento(String numerodedocumento) {
		this.numerodedocumento = numerodedocumento;
	}
	public String getDireecion() {
		return direecion;
	}
	public void setDireecion(String direecion) {
		this.direecion = direecion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nombre=" + nombre + ", apellido=" + apellido + ", iddocumento="
				+ iddocumento + ", numerodedocumento=" + numerodedocumento + ", direecion=" + direecion + ", telefono="
				+ telefono + ", getIdcliente()=" + getIdcliente() + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + ", getIddocumento()=" + getIddocumento() + ", getNumerodedocumento()="
				+ getNumerodedocumento() + ", getDireecion()=" + getDireecion() + ", getTelefono()=" + getTelefono()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
