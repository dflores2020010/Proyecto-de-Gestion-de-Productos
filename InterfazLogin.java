package com.diegoflores.interfaz;
import com.diegoflores.controlador.ControladorUsuario;
import com.diegoflores.entrada.ObtenerDato;
public class InterfazLogin{

	ControladorUsuario cU=new ControladorUsuario();
	ObtenerDato oD=new ObtenerDato();
	int op1, op2;
	String username;
	String password;
	char rol;
	
	public char iniciarSesion(){
		cU.usuarioPorDefecto();
		System.out.println("Por favor introduce tu usuario");
		username=oD.textos();
		System.out.println("Por favor introduce tu clave");
		password=oD.textos();
		rol=cU.verificacionDeUsuario(username, password);
		return rol ;
	}
	
	public int menuLoginAdmin(){
		System.out.println("Por favor elija una de las siguientes opciones");
		System.out.println("1... Si necesitas agregar un usuario");
		System.out.println("2... Si necesitas buscar un usuario");
		System.out.println("3... Si necesitas modificar la informacion de un usuario");
		System.out.println("4... Si necesitas eliminar la informacion de un usuario");
		System.out.println("5... Si necesitas ver todo el listado de los usuarios almacenados");
		System.out.println("6... Para regresar al menu principal");
		System.out.println("7... Para salir del Programa");
		op1=oD.numeros();
		return op1;
	}
	
	public int menuLoginUser(){
		System.out.println("Por favor elija una de las siguientes opciones");
		System.out.println("1... Si necesitas agregar un usuario");
		System.out.println("2... Si necesitas buscar un usuario");
		System.out.println("3... Si necesitas ver todo el listado de los usuarios almacenados");
		System.out.println("4... Para regresar al menu principal");
		System.out.println("5... Para salir del Programa");
		op1=oD.numeros();
		return op1;
	}
	
	public int interfazAdminDeLogin(){
		cU.usuarioPorDefecto();
		do{
			op2=menuLoginAdmin();
			switch(op2){
			
				case 1:
				cU.ingresoUsuarios();
				cU.mostrarUsuarios();
				System.out.println(" ");
				break;
				
				case 2:
				cU.usuarioPorDefecto();
				cU.mostrarUsuarios();
				cU.buscarUsuarios();
				System.out.println(" ");
				break;
			
				case 3: 
				cU.modificarUsuarios();
				cU.mostrarUsuarios();
				System.out.println(" ");
				break;
			
				case 4:
				cU.eliminarUsuarios();
				cU.mostrarUsuarios();
				System.out.println(" ");
				break;

				case 5:
				cU.mostrarUsuarios();
				System.out.println(" ");
				break;
				
				case 6:
				System.out.println(" ");
				break;
			}
		}while((op2!=7)&&(op2!=6));
		return op2;
	}
	
	public int interfazUserDeLogin(){
		do{
			op2=menuLoginUser();
			switch(op2){
			
				case 1:
				cU.usuarioPorDefecto();
				cU.ingresoUsuarios();
				cU.mostrarUsuarios();
				System.out.println(" ");
				break;
				
				case 2:
				cU.usuarioPorDefecto();
				cU.mostrarUsuarios();
				cU.buscarUsuarios();
				System.out.println(" ");
				break;

				case 3:
				cU.usuarioPorDefecto();
				cU.mostrarUsuarios();
				System.out.println(" ");
				break;
				
				case 4:
				System.out.println(" ");
				break;
			}
		}while((op2!=5)&&(op2!=4));
		return op2;
	}
}
