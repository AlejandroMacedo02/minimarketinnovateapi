package minimarket.com.pe.InnovateMinimarket.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="detallecompra")
public class DetalleCompra {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer iddetcompra;
	private String cantidad;
	private BigDecimal preciounitario;
	private Integer idcompra;
	private Integer idproducto;
	
	public Integer getIddetcompra() {
		return iddetcompra;
	}
	public void setIddetcompra(Integer iddetcompra) {
		this.iddetcompra = iddetcompra;
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
	public Integer getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}
	public Integer getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	@Override
	public String toString() {
		return "DetalleCompra [iddetcompra=" + iddetcompra + ", cantidad=" + cantidad + ", preciounitario="
				+ preciounitario + ", idcompra=" + idcompra + ", idproducto=" + idproducto + ", getIddetcompra()="
				+ getIddetcompra() + ", getCantidad()=" + getCantidad() + ", getPreciounitario()=" + getPreciounitario()
				+ ", getIdcompra()=" + getIdcompra() + ", getIdproducto()=" + getIdproducto() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
