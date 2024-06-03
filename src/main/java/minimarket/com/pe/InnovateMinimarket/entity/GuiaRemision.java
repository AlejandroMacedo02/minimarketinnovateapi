package minimarket.com.pe.InnovateMinimarket.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="guiaremision")
public class GuiaRemision {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idguiaremision;
	private String codigo;
	private LocalDate fechentrega;
	
	public Integer getIdguiaremision() {
		return idguiaremision;
	}
	public void setIdguiaremision(Integer idguiaremision) {
		this.idguiaremision = idguiaremision;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public LocalDate getFechentrega() {
		return fechentrega;
	}
	public void setFechentrega(LocalDate fechentrega) {
		this.fechentrega = fechentrega;
	}
	@Override
	public String toString() {
		return "GuiaRemision [idguiaremision=" + idguiaremision + ", codigo=" + codigo + ", fechentrega=" + fechentrega
				+ ", getIdguiaremision()=" + getIdguiaremision() + ", getCodigo()=" + getCodigo()
				+ ", getFechentrega()=" + getFechentrega() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
