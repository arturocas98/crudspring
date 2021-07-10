package com.crud.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.demo.model.GestionVehicular;
import com.crud.demo.service.IGestionVehicularService;

@Controller
@RequestMapping
public class GestionVehicularcontroller {
	@Autowired
	private IGestionVehicularService service;
	
	@GetMapping("/listarVehiculo")
	public String listar(Model model,String keyword) {
		List<GestionVehicular> gestion_vehicular = service.listar();
		if(keyword != null) {
			model.addAttribute("vehiculos", service.findByKeyword(keyword));
		}else {
			model.addAttribute("vehiculos",gestion_vehicular);
		}
		
	
		return "listarVehiculos";
	}
	
	@GetMapping("/newVehiculo")
	public String agregar(Model model) {
		model.addAttribute("vehiculo",new GestionVehicular());
		return "addVehiculo";
	}
	
	@PostMapping("/saveVehiculo")
	public String save(@Valid GestionVehicular d, Model model) {
		service.Save(d);
		return "redirect:/listarVehiculo";
		
	}
	
	@GetMapping("/editarVehiculo/{idVehiculo}")
	public String editar(@PathVariable int idVehiculo, Model model) {
		Optional<GestionVehicular>vehiculo = service.listarId(idVehiculo);
		model.addAttribute("vehiculo",vehiculo);
		return "addVehiculo";
		
	}
	
	@GetMapping("/eliminarVehiculo/{idVehiculo}")
	public String eliminar(Model model, @PathVariable int idVehiculo) {
		service.Delete(idVehiculo);
		return "redirect:/listarVehiculos";
		
	}
}
