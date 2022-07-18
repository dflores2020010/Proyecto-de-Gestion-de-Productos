package com.diegoflores.modelo;

public class Persona{

	String nombre, apellido;
	int codigo;
	
	public Persona(String nombre, String apellido, int codigo){
		this.nombre=nombre;
		this.apellido=apellido;
		this.codigo=codigo;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	
	public void setCodigo(int codigo){
		this.codigo=codigo;
		
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public int getCodigo(){
		return codigo;
	}
}