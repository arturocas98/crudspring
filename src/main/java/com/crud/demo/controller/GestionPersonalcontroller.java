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

import com.crud.demo.model.GestionPersonal;
import com.crud.demo.service.IGestionPersonalService;


@Controller
@RequestMapping
public class GestionPersonalcontroller {

	@Autowired
	private IGestionPersonalService service;
	

	@GetMapping("/gestionPersonalList")
	public String listar(Model model) {
		List<GestionPersonal> gestion_personal = service.listar();
		model.addAttribute("personas",gestion_personal);
		return "listarGestionPersonal";
	}
	
	@GetMapping("/gestionPersonalAdd")
	public String agregar(Model model) {
		model.addAttribute("persona",new GestionPersonal());
		return "addPersonal";
	}
	

	@PostMapping("/save")
	public String save(@Valid GestionPersonal a, Model model) {
		service.Save(a);
		return "redirect:/gestionPersonalList";
		
	}
	
	@GetMapping("/edit/{id}")
	
	public String editar(@PathVariable int id, Model model) {
		Optional<GestionPersonal>persona = service.listarid(id);
		model.addAttribute("persona",persona);
		return "addPersonal";
		
	}
	
	@GetMapping("/eliminar/{id}")
	
	public String eliminar(Model model, @PathVariable int id) {
		service.Delete(id);
		return "redirect:/gestionPersonalList";
		
	}
}
