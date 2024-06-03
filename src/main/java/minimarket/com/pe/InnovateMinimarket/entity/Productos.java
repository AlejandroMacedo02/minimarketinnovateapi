package minimarket.com.pe.InnovateMinimarket.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idproducto;
	private String nombre;
	private String descripcion;
	private String precio;
	private LocalDate fechingreso;
	private LocalDate fechcaducacion;
	private Integer categoria_id;
	private Integer unidadmedida_id;
}
