package com.practica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contacto")
public class Contacto{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="TELEFONO_OFICINA")
	private String telefono_oficina;
	
	@Column(name="TELEFONO_PERSONAL")
	private String telefono_personal;
	
	@Column(name="CORREO_PERSONAL")
	private String correo_personal;
	
	@Column(name="CORREO_OFICINA")
	private String correo_oficina;
	
	@Column(name="FECHA_NAC")
	private String fecha_nac;
	
	
	public Contacto() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono_oficina() {
		return telefono_oficina;
	}


	public void setTelefono_oficina(String telefono_oficina) {
		this.telefono_oficina = telefono_oficina;
	}


	public String getTelefono_personal() {
		return telefono_personal;
	}


	public void setTelefono_personal(String telefono_personal) {
		this.telefono_personal = telefono_personal;
	}


	public String getCorreo_personal() {
		return correo_personal;
	}


	public void setCorreo_personal(String correo_personal) {
		this.correo_personal = correo_personal;
	}


	public String getCorreo_oficina() {
		return correo_oficina;
	}


	public void setCorreo_oficina(String correo_oficina) {
		this.correo_oficina = correo_oficina;
	}


	public String getFecha_nac() {
		return fecha_nac;
	}


	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	
	
}