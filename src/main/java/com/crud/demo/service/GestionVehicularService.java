package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.model.GestionVehicular;
import com.crud.demo.model.IGestionVehicular;

@Service
public class GestionVehicularService implements IGestionVehicularService{
	@Autowired
	private IGestionVehicular data;
	
	
	@Override
	public List<GestionVehicular> listar() {
		// TODO Auto-generated method stub
		return (List<GestionVehicular>)data.findAll();
	}

	@Override
	public Optional<GestionVehicular> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int Save(GestionVehicular d) {
		int res = 0;
		final GestionVehicular gestion_vehicular = data.save(d);
		if (gestion_vehicular.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void Delete(int id) {
		data.deleteById(id);
	}
	@Override
	public List<GestionVehicular> findByKeyword(String keyword){
		return data.findByKeyword(keyword);
	}

}
