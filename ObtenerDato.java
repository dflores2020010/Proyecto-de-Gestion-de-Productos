package com.diegoflores.entrada;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ObtenerDato{
	//metodo para ingresar textos
	public String textos(){
		String dato=null;
		BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
		try{
			dato=bR.readLine();
		}catch (IOException ioe){
			System.out.println("Error de IO");
			System.exit(1);
		}
		return dato;	 
	}
	//metodo para ingresar numeros
	public int numeros(){
		String dato=null;
		int numero=0;
		BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
		try{
			dato=bR.readLine();
			numero=Integer.parseInt(dato);
		}catch (IOException ioe){
			System.out.println("Error de IO");
			System.exit(1);
		}
		return numero;		
	}
	
	public char caracteres(){
		String dato=null;
		char caracter=0;
		BufferedReader bR=new BufferedReader(new InputStreamReader(System.in));
		try{
			dato=bR.readLine();
			caracter=dato.charAt(0);
		}catch(IOException ioe){
			System.out.println("Error de IO");
			System.exit(1);
		}
		return caracter;
	}
	
	public double decimales(){
		String dato=null;
		double decimal=0;
		BufferedReader bR=new BufferedReader(new InputStreamReader(System.in));
		try{
			dato=bR.readLine();
			decimal=Double.parseDouble(dato);
		}catch(IOException ioe){
			System.out.println("Error de IO");
			System.exit(1);
		}
		return decimal;
	}


}