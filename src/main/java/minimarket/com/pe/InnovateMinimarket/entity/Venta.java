package minimarket.com.pe.InnovateMinimarket.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="venta")
public class Venta {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idventa;
	private String estado;
	private LocalDate fechventa;
	private Integer idcaja;
	private Integer idcliente;
	
	public Integer getIdventa() {
		return idventa;
	}
	public void setIdventa(Integer idventa) {
		this.idventa = idventa;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public LocalDate getFechventa() {
		return fechventa;
	}
	public void setFechventa(LocalDate fechventa) {
		this.fechventa = fechventa;
	}
	public Integer getIdcaja() {
		return idcaja;
	}
	public void setIdcaja(Integer idcaja) {
		this.idcaja = idcaja;
	}
	public Integer getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}
	@Override
	public String toString() {
		return "Venta [idventa=" + idventa + ", estado=" + estado + ", fechventa=" + fechventa + ", idcaja=" + idcaja
				+ ", idcliente=" + idcliente + ", getIdventa()=" + getIdventa() + ", getEstado()=" + getEstado()
				+ ", getFechventa()=" + getFechventa() + ", getIdcaja()=" + getIdcaja() + ", getIdcliente()="
				+ getIdcliente() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
