package minimarket.com.pe.InnovateMinimarket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="perfil")
public class Perfil {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idperfil;
	private String tipoperfil;
	private Integer idpermiso;
	
	public Integer getIdperfil() {
		return idperfil;
	}
	public void setIdperfil(Integer idperfil) {
		this.idperfil = idperfil;
	}
	public String getTipoperfil() {
		return tipoperfil;
	}
	public void setTipoperfil(String tipoperfil) {
		this.tipoperfil = tipoperfil;
	}
	public Integer getIdpermiso() {
		return idpermiso;
	}
	public void setIdpermiso(Integer idpermiso) {
		this.idpermiso = idpermiso;
	}
	@Override
	public String toString() {
		return "Perfil [idperfil=" + idperfil + ", tipoperfil=" + tipoperfil + ", idpermiso=" + idpermiso
				+ ", getIdperfil()=" + getIdperfil() + ", getTipoperfil()=" + getTipoperfil() + ", getIdpermiso()="
				+ getIdpermiso() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
