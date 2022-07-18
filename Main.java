package com.diegoflores;
import com.diegoflores.interfaz.InterfazPrincipal;
import com.diegoflores.interfaz.InterfazLogin;
public class Main{

	
	public static void main(String args[]){
		int op1=0;
		char rol;
		InterfazLogin iL=new InterfazLogin();
		InterfazPrincipal iP=new InterfazPrincipal();
		
		
		rol=iL.iniciarSesion();
		if(rol=='A'){
			op1=iP.interfazPrincipalAdmins();
		}else{
			op1=iP.interfazPrincipalUsers();
		}
		
		
	}
}