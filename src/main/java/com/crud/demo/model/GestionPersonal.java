package com.crud.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "gestion_personal")
public class GestionPersonal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String apellidos;
	private String dependencia;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fecha_nacimiento;
	private String grado_policial;
	private String identificacion;
	private String nombres;
	private String telefono;
	private String tipo_sangre;
	private String tipo_usuario;
	
	
	public GestionPersonal() {
		
	}


	public GestionPersonal(int id, String apellidos, String dependencia, Date fecha_nacimiento, String grado_policial,
			String identificacion, String nombres, String telefono, String tipo_sangre, String tipo_usuario) {
		super();
		this.id = id;
		this.apellidos = apellidos;
		this.dependencia = dependencia;
		this.fecha_nacimiento = fecha_nacimiento;
		this.grado_policial = grado_policial;
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.telefono = telefono;
		this.tipo_sangre = tipo_sangre;
		this.tipo_usuario = tipo_usuario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDependencia() {
		return dependencia;
	}


	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}


	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public String getGrado_policial() {
		return grado_policial;
	}


	public void setGrado_policial(String grado_policial) {
		this.grado_policial = grado_policial;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getTipo_sangre() {
		return tipo_sangre;
	}


	public void setTipo_sangre(String tipo_sangre) {
		this.tipo_sangre = tipo_sangre;
	}


	public String getTipo_usuario() {
		return tipo_usuario;
	}


	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	
	
}
