package com.mitocode.beans;

public class Persona {
	private int id;
	private String nombre;
	private String apodo;
	
	Persona (int id, String nombre, String apodo){
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
	}
	
	Persona (int id){
		this.id = id;
	}
	
	Persona (String apodo){
		this.apodo = apodo;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApodo() {
		return apodo;
	}
	
	
}
