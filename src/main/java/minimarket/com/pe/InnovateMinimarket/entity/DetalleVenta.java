package minimarket.com.pe.InnovateMinimarket.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="detalleventa")
public class DetalleVenta {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer iddetventa;
	private String cantidad;
	private BigDecimal preciounitario;
	private Integer idventa;
	private Integer idproducto;
	private Integer idcaja;
	
	
	public Integer getIddetventa() {
		return iddetventa;
	}
	public void setIddetventa(Integer iddetventa) {
		this.iddetventa = iddetventa;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPreciounitario() {
		return preciounitario;
	}
	public void setPreciounitario(BigDecimal preciounitario) {
		this.preciounitario = preciounitario;
	}
	public Integer getIdventa() {
		return idventa;
	}
	public void setIdventa(Integer idventa) {
		this.idventa = idventa;
	}
	public Integer getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	public Integer getIdcaja() {
		return idcaja;
	}
	public void setIdcaja(Integer idcaja) {
		this.idcaja = idcaja;
	}
	@Override
	public String toString() {
		return "DetalleVenta [iddetventa=" + iddetventa + ", cantidad=" + cantidad + ", preciounitario="
				+ preciounitario + ", idventa=" + idventa + ", idproducto=" + idproducto + ", idcaja=" + idcaja
				+ ", getIddetventa()=" + getIddetventa() + ", getCantidad()=" + getCantidad() + ", getPreciounitario()="
				+ getPreciounitario() + ", getIdventa()=" + getIdventa() + ", getIdproducto()=" + getIdproducto()
				+ ", getIdcaja()=" + getIdcaja() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
