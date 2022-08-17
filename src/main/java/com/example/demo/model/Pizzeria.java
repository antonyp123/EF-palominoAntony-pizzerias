package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name="Pizzerias")
public class Pizzeria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpizzeria;
	private String direccion;
	private String sede;

}
