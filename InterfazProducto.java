package com.diegoflores.interfaz;
import com.diegoflores.controlador.ControlProducto;
import com.diegoflores.entrada.ObtenerDato;
public class InterfazProducto{

	ControlProducto conP=new ControlProducto();
	ObtenerDato oD=new ObtenerDato();
	int op1, op2;

	public int menuProductosAdmin(){
		System.out.println("Por favor elija una de las siguientes opciones");
		System.out.println("1... Si necesitas agregar un producto");
		System.out.println("2... Si necesitas buscar un producto");
		System.out.println("3... Si necesitas modificar la informacion de un producto");
		System.out.println("4... Si necesitas eliminar la informacion de un producto");
		System.out.println("5... Si necesitas ver todo el listado de los productos almacenados");
		System.out.println("6... Para regresar al menu principal");
		System.out.println("7... Para salir del Programa");
		op1=oD.numeros();
		return op1;
	}
	
	public int menuProductosUser(){
		System.out.println("Por favor elija una de las siguientes opciones");
		System.out.println("1... Si necesitas agregar un usuario");
		System.out.println("2... Si necesitas buscar un usuario");
		System.out.println("3... Si necesitas ver todo el listado de los usuarios almacenados");
		System.out.println("4... Para regresar al menu principal");
		System.out.println("5... Para salir del Programa");
		op1=oD.numeros();
		return op1;
	}
	
	public int interfazAdminDeProductos(){
		do{
			op2=menuProductosAdmin();
			switch(op2){
			
				case 1:
				conP.ingresoProductos();
				conP.mostrarProductos();
				System.out.println(" ");
				break;
				
				case 2:
				conP.mostrarProductos();
				conP.buscarProductos();
				System.out.println(" ");
				break;
			
				case 3: 
				conP.modificarProductos();
				conP.mostrarProductos();
				System.out.println(" ");
				break;
			
				case 4:
				conP.eliminarProductos();
				conP.mostrarProductos();
				System.out.println(" ");
				break;

				case 5:
				conP.mostrarTodo();
				System.out.println(" ");
				break;

				case 6:
				System.out.println(" ");
				break;
			}
		}while((op2!=7)&&(op2!=6));
		return op2;
	}
	
	public int interfazUserDeProductos(){
		do{
			op2=menuProductosUser();
			switch(op2){
			
				case 1:
				conP.ingresoProductos();
				conP.mostrarProductos();
				System.out.println(" ");
				break;
				
				case 2:
				conP.mostrarProductos();
				conP.buscarProductos();
				System.out.println(" ");
				break;

				case 3:
				conP.mostrarTodo();
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