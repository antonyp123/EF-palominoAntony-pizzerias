package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pizzeria;

public interface PizzeriaRepository extends JpaRepository<Pizzeria, Integer> {

}
