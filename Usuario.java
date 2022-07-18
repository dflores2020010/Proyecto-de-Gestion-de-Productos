package com.diegoflores.modelo;

public class Usuario extends Persona{

	String password;
	char rol;
	
	public Usuario(String nombre, String apellido, int codigo, char rol){
		super(nombre, apellido, codigo);
		this.rol=rol;
	}
	
	public void setRol(char rol){
		this.rol=rol;
	}
	
	public char getRol(){
		return rol;
	}


}