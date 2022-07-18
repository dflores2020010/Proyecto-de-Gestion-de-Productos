package com.diegoflores.interfaz;
import com.diegoflores.entrada.ObtenerDato;
public class InterfazPrincipal{

	InterfazCliente iC=new InterfazCliente();
	InterfazProducto iP=new InterfazProducto();
	InterfazLogin iL=new InterfazLogin();
	ObtenerDato oD=new ObtenerDato();
	int op1,op2,op3;
	char rol;
	
	public int menuPrincipalAdmin(){
		System.out.println("Por favor elija una de las siguientes opciones");
		System.out.println("1... Para ingresar al menu clientes");
		System.out.println("2... Para ingresar al menu productos");
		System.out.println("3... Para ingresar al menu de inicio de sesion");
		System.out.println("4... Para regresar al inicio de sesion");
		op1=oD.numeros();
		return op1;
	}
	
	public int menuPrincipalUser(){
		System.out.println("Por favor elija una de las siguientes opciones");
		System.out.println("1... Para ingresar al menu clientes");
		System.out.println("2... Para ingresar al menu productos");
		System.out.println("3... Para regresar al inicio de sesion");
		op1=oD.numeros();
		return op1;
	}
	
	public int interfazPrincipalAdmins(){
		do{
			op2=menuPrincipalAdmin();
			switch(op2){
				case 1:
				op3=iC.interfazAdminDeClientes();
				break;
			
				case 2:
				op3=iP.interfazAdminDeProductos();
				break;
			
				case 3:
				op3=iL.interfazAdminDeLogin();
				break;
				
				case 4:
				rol=iL.iniciarSesion();
				if(rol=='A'){
					interfazPrincipalAdmins();
				}else{
					interfazPrincipalUsers();
				}
				break;
				
			}
		}while(op3==6);
		return op2;
	}
	
	public int interfazPrincipalUsers(){
		do{
			op2=menuPrincipalUser();
			switch(op2){
				case 1:
				op3=iC.interfazUserDeClientes();
				break;
			
				case 2:
				op3=iP.interfazUserDeProductos();
				break;
				
				case 3:
				rol=iL.iniciarSesion();
				if(rol=='A'){
					interfazPrincipalAdmins();
				}else{
					interfazPrincipalUsers();
				}
				break;
			}
		}while(op3==4);
		return op2;
	}
	
	

}