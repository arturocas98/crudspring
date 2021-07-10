package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import com.crud.demo.model.GestionPersonal;

public interface IGestionPersonalService {
	public List<GestionPersonal> listar();
	public Optional<GestionPersonal> listarid(int id);
	public int Save(GestionPersonal a);
	public void Delete (int id);
}
