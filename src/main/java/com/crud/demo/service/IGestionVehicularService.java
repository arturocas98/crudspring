package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import com.crud.demo.model.GestionVehicular;

public interface IGestionVehicularService {
	public List<GestionVehicular> listar();
	public List<GestionVehicular> findByKeyword(String keyword);
	public Optional<GestionVehicular>listarId(int id);
	public int Save(GestionVehicular d);
	public void Delete(int id);
	
}
