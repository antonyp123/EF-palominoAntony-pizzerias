package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pizzeria;
import com.example.demo.repository.PizzeriaRepository;

@Service
public class PizzeriaServicelmpl  implements PizzeriaService{

	
	@Autowired
	private PizzeriaRepository repository;
	@Override
	public void guardarPizza(Pizzeria pizzazeria) {
		repository.save(pizzazeria);
		
	}

	@Override
	public void actulizarPizzeria(Pizzeria pizzazeria) {
		repository.saveAndFlush(pizzazeria);
	}

	@Override
	public void eliminarPizzeria(Integer id) {
		repository.deleteById(id);
		
		
	}

	@Override
	public List<Pizzeria> listarpizzeria() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Pizzeria obtenerpizzeriaId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
