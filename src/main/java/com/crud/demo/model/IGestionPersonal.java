package com.crud.demo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGestionPersonal extends CrudRepository<GestionPersonal, Integer>{

}
