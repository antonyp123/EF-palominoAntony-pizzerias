package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Pizzeria;
import com.example.demo.servicio.PizzeriaService;


@Controller
@RequestMapping("api/pizzeria/v1")
public class PizzeriaController {
	@Autowired
	private PizzeriaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizzeria> listar(){
		return service.listarpizzeria();
	}
	@GetMapping("/listar/{id}")
	public Pizzeria obtener(@PathVariable Integer id) {
		return service.obtenerpizzeriaId(id);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Pizzeria pizzeria) {
		service.guardarPizza(pizzeria);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(Pizzeria pizzeria) {
		service.actulizarPizzeria(pizzeria);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminarPizzeria(id);
	}

}
