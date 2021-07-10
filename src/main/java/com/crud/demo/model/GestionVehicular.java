package com.crud.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gestion_vehicular")

public class GestionVehicular {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int capacidad_carga;
	private int capacidad_pasajeros;
	private String chasis;
	private int cilindraje;
	private int kilometraje;
	private String marca;
	private String modelo;
	private String motor;
	private String observacion;
	private String placa;
	private String tipo_vehiculo;
	private String encargado;
	
	
	
	
	


	public GestionVehicular(int id, int capacidad_carga, int capacidad_pasajeros, String chasis, int cilindraje,
			int kilometraje, String marca, String modelo, String motor, String observacion, String placa,
			String tipo_vehiculo, String encargado) {
		super();
		this.id = id;
		this.capacidad_carga = capacidad_carga;
		this.capacidad_pasajeros = capacidad_pasajeros;
		this.chasis = chasis;
		this.cilindraje = cilindraje;
		this.kilometraje = kilometraje;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.observacion = observacion;
		this.placa = placa;
		this.tipo_vehiculo = tipo_vehiculo;
		this.encargado = encargado;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public GestionVehicular() {
		// TODO Auto-generated constructor stub
	}

	public int getCapacidad_carga() {
		return capacidad_carga;
	}

	public void setCapacidad_carga(int capacidad_carga) {
		this.capacidad_carga = capacidad_carga;
	}

	public int getCapacidad_pasajeros() {
		return capacidad_pasajeros;
	}

	public void setCapacidad_pasajeros(int capacidad_pasajeros) {
		this.capacidad_pasajeros = capacidad_pasajeros;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo_vehiculo() {
		return tipo_vehiculo;
	}

	public void setTipo_vehiculo(String tipo_vehiculo) {
		this.tipo_vehiculo = tipo_vehiculo;
	}



	public String getEncargado() {
		return encargado;
	}



	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	
	
	
	

}
