package minimarket.com.pe.InnovateMinimarket.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="compra")
public class Compra {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idcompra;
	private LocalDate fechcompra;
	private Integer idcliente;
	private Integer idcaja;
	private Integer idguiaremision;
	
	public Integer getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}
	public LocalDate getFechcompra() {
		return fechcompra;
	}
	public void setFechcompra(LocalDate fechcompra) {
		this.fechcompra = fechcompra;
	}
	public Integer getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}
	public Integer getIdcaja() {
		return idcaja;
	}
	public void setIdcaja(Integer idcaja) {
		this.idcaja = idcaja;
	}
	public Integer getIdguiaremision() {
		return idguiaremision;
	}
	public void setIdguiaremision(Integer idguiaremision) {
		this.idguiaremision = idguiaremision;
	}
	@Override
	public String toString() {
		return "Compra [idcompra=" + idcompra + ", fechcompra=" + fechcompra + ", idcliente=" + idcliente + ", idcaja="
				+ idcaja + ", idguiaremision=" + idguiaremision + ", getIdcompra()=" + getIdcompra()
				+ ", getFechcompra()=" + getFechcompra() + ", getIdcliente()=" + getIdcliente() + ", getIdcaja()="
				+ getIdcaja() + ", getIdguiaremision()=" + getIdguiaremision() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
