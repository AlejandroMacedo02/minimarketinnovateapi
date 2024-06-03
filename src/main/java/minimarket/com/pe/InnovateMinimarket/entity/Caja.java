package minimarket.com.pe.InnovateMinimarket.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="caja")
public class Caja {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idcaja;
	private String estado;
	private LocalDate fechapertura;
	private LocalDate fechcierre;
	
	public Integer getIdcaja() {
		return idcaja;
	}
	public void setIdcaja(Integer idcaja) {
		this.idcaja = idcaja;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public LocalDate getFechapertura() {
		return fechapertura;
	}
	public void setFechapertura(LocalDate fechapertura) {
		this.fechapertura = fechapertura;
	}
	public LocalDate getFechcierre() {
		return fechcierre;
	}
	public void setFechcierre(LocalDate fechcierre) {
		this.fechcierre = fechcierre;
	}
	@Override
	public String toString() {
		return "Caja [idcaja=" + idcaja + ", estado=" + estado + ", fechapertura=" + fechapertura + ", fechcierre="
				+ fechcierre + ", getIdcaja()=" + getIdcaja() + ", getEstado()=" + getEstado() + ", getFechapertura()="
				+ getFechapertura() + ", getFechcierre()=" + getFechcierre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
