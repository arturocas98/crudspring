package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.model.GestionPersonal;
import com.crud.demo.model.IGestionPersonal;



@Service
public class GestionPersonalService implements IGestionPersonalService{

	@Autowired
	private IGestionPersonal data;
	@Override
	public List<GestionPersonal> listar() {
		// TODO Auto-generated method stub
		//
		return (List<GestionPersonal>) data.findAll();
	}

	@Override
	public Optional<GestionPersonal> listarid(int id) {
		return data.findById(id);
	}

	@Override
	public int Save(GestionPersonal a) {
		int res=0;
		GestionPersonal gestion_personal= data.save(a);
		if (!gestion_personal.equals(null)) {
			res=1;
		}
		return res;

	}

	@Override
	public void Delete(int id) {
		data.deleteById(id);
	}
	
	
	

}
