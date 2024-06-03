package minimarket.com.pe.InnovateMinimarket.entity;

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
	
}
