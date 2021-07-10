package com.crud.demo.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IGestionVehicular extends CrudRepository<GestionVehicular, Integer>{
	@Query(value="select *from gestion_vehicular g where  g.placa like %:keyword% or g.chasis like %:keyword%" ,nativeQuery=true)
	List<GestionVehicular> findByKeyword(@Param("keyword") String keyword);
}
