package com.example.demo.servicio;

import java.util.List;

import com.example.demo.model.Pizzeria;


public interface PizzeriaService {
	void guardarPizza(Pizzeria pizzazeria);
	void actulizarPizzeria(Pizzeria pizzazeria);
	void eliminarPizzeria(Integer id);
	List<Pizzeria> listarpizzeria();
	Pizzeria obtenerpizzeriaId(Integer id);

}
