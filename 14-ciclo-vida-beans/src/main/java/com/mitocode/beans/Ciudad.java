package com.mitocode.beans;

public class Ciudad {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	private void initBean() {
		System.out.println("Antes de inicializar el bean ciudad");
	}
	
	private void destroyBean() {
		System.out.println("Bean a punto de ser destruido ciudad");
	}
	
}
