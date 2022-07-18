package com.diegoflores.modelo;

public class Cliente extends Persona{

	String telefono, direccion;
	int nit;
	
	public Cliente(String nombre, String apellido, int codigo, int nit, String telefono, String direccion){
		super(nombre, apellido, codigo);
		this.nit=nit;
		this.telefono=telefono;
		this.direccion=direccion;
	}
	
	public void setNit(int nit){
		this.nit=nit;
	}
	
	public int getNit(){
		return nit;
	}
	
	public void setTelefono(String telefono){
		this.telefono=telefono;
	}
	
	public String getTelefono(){
		return telefono;
	}
	
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	
	public String getDireccion(){
		return direccion;
	}

}