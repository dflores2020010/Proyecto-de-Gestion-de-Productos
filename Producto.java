package com.diegoflores.modelo;

public class Producto extends Persona{
	
	String descripcion;
	int cantidad;
	double costo;
	
	public Producto(String nombre, String apellido, int codigo, double costo, int cantidad){
		super(nombre, apellido, codigo);
		this.costo=costo;
		this.cantidad=cantidad;
	}
	
	public void setCosto(double costo){
		this.costo=costo;
	}
	
	public double getCosto(){
		return costo;
	}
	
	public void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}
	
	public int getCantidad(){
		return cantidad;
	}
	
	


}