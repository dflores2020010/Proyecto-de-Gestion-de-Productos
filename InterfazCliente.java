package com.diegoflores.interfaz;
import com.diegoflores.controlador.ControlCliente;
import com.diegoflores.entrada.ObtenerDato;
public class InterfazCliente{
	
	ControlCliente conC=new ControlCliente();
	ObtenerDato oD=new ObtenerDato();
	int op1, op2;
	
	public int menuClientesAdmin(){
		System.out.println("Por favor elija una de las siguientes opciones");
		System.out.println("1... Si necesitas agregar un cliente");
		System.out.println("2... Si necesitas buscar un cliente");
		System.out.println("3... Si necesitas modificar la informacion de un cliente");
		System.out.println("4... Si necesitas eliminar la informacion de un cliente");
		System.out.println("5... Si necesitas ver todo el listado de los clientes almacenados");
		System.out.println("6... Para regresar al menu principal");
		System.out.println("7... Para salir del Programa");
		op1=oD.numeros();
		return op1;
	}
	
	public int menuClientesUser(){
		System.out.println("Por favor elija una de las siguientes opciones");
		System.out.println("1... Si necesitas agregar un usuario");
		System.out.println("2... Si necesitas buscar un usuario");
		System.out.println("3... Si necesitas ver todo el listado de los usuarios almacenados");
		System.out.println("4... Para regresar al menu principal");
		System.out.println("5... Para salir del Programa");
		op1=oD.numeros();
		return op1;
	}
	
	public int interfazAdminDeClientes(){
		do{
			op2=menuClientesAdmin();
			switch(op2){
			
				case 1:
				conC.ingresoClientes();
				conC.mostrarClientes();
				System.out.println(" ");
				break;
				
				case 2:
				conC.mostrarClientes();
				conC.buscarClientes();
				System.out.println(" ");
				break;
		
				case 3: 
				conC.modificarClientes();
				conC.mostrarClientes();
				System.out.println(" ");
				break;
			
				case 4:
				conC.eliminarClientes();
				conC.mostrarClientes();
				System.out.println(" ");
				break;

				case 5:
				conC.mostrarTodo();
				System.out.println(" ");
				break;

				case 6:
				System.out.println(" "); 
				break;
			}
		}while((op2!=7)&&(op2!=6));
		return op2;
	}
	
	public int interfazUserDeClientes(){
		do{
			op2=menuClientesUser();
			switch(op2){
			
				case 1:
				conC.ingresoClientes();
				conC.mostrarClientes();
				System.out.println(" ");
				break;
				
				case 2:
				conC.mostrarClientes();
				conC.buscarClientes();
				System.out.println(" ");
				break;

				case 3:
				conC.mostrarTodo();
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