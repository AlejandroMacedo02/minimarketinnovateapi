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
	private String nombrecompleto;
	private String email;
	private String contrasena;
	private LocalDate fechcreado;
	private String telefono;
	private Integer idperfil;
	
	//GETTERS AND SETTERS
	public Integer getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	public String getNombrecompleto() {
		return nombrecompleto;
	}
	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}
	public Integer getIdperfil() {
		return idperfil;
	}
	public void setIdperfil(Integer idperfil) {
		this.idperfil = idperfil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		//ENCRIPTACION CONTRASEÑA 20 DIGITOS
				String datos = nombrecompleto + email;
				MessageDigest md = null;
				try {
				md = MessageDigest.getInstance("SHA-256");
				}catch(NoSuchAlgorithmException e){
					e.printStackTrace();
				}
				md.update(datos.getBytes());
				byte[]digest = md.digest();
				String result = new BigInteger(1,digest).toString(20).toLowerCase();
				contrasena = result;
		this.contrasena = contrasena;
	}
	public LocalDate getFechcreado() {
		return fechcreado;
	}
	public void setFechcreado(LocalDate fechcreado) {
		this.fechcreado = fechcreado;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Usuarios [idusuario=" + idusuario + ", nombrecompleto=" + nombrecompleto + ", idperfil=" + idperfil
				+ ", email=" + email + ", contrasena=" + contrasena + ", fechcreado=" + fechcreado + ", telefono="
				+ telefono + ", getIdusuario()=" + getIdusuario() + ", getNombrecompleto()=" + getNombrecompleto()
				+ ", getIdperfil()=" + getIdperfil() + ", getEmail()=" + getEmail() + ", getContrasena()="
				+ getContrasena() + ", getFechcreado()=" + getFechcreado() + ", getTelefono()=" + getTelefono()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
