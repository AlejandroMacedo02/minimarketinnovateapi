package minimarket.com.pe.InnovateMinimarket.entity;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")

public class Usuarios {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idusuario;
	private String nombres;
	private String apellidos;
	private String contrasena;
	private String telefono;
	private String email;
	private LocalDate fechcreacion;
	private Integer codrol;
	
	//GETTES AND SETTERS 
	public Integer getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
	//ENCRIPTACION CONTRASEÑA 16 DIGITOS
		String datos = nombres + apellidos + email;
		MessageDigest md = null;
		try {
		md = MessageDigest.getInstance("SHA-256");
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}
		md.update(datos.getBytes());
		byte[]digest = md.digest();
		String result = new BigInteger(1,digest).toString(16).toLowerCase();
		contrasena = result;
		this.contrasena = contrasena;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getFechcreacion() {
		return fechcreacion;
	}
	public void setFechcreacion(LocalDate fechcreacion) {
		this.fechcreacion = fechcreacion;
	}
	public Integer getCodrol() {
		return codrol;
	}
	public void setCodrol(Integer codrol) {
		this.codrol = codrol;
	}
	@Override
	public String toString() {
		return "Usuarios [idusuario=" + idusuario + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", contrasena=" + contrasena + ", telefono=" + telefono + ", email=" + email + ", fechcreacion="
				+ fechcreacion + ", codrol=" + codrol + ", getIdusuario()=" + getIdusuario() + ", getNombres()="
				+ getNombres() + ", getApellidos()=" + getApellidos() + ", getContrasena()=" + getContrasena()
				+ ", getTelefono()=" + getTelefono() + ", getEmail()=" + getEmail() + ", getFechcreacion()="
				+ getFechcreacion() + ", getCodrol()=" + getCodrol() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
