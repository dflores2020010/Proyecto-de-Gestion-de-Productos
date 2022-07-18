package com.diegoflores.controlador;
import com.diegoflores.modelo.Cliente;
import com.diegoflores.entrada.ObtenerDato;
import java.util.ArrayList;
public class ControlCliente{
	
	ArrayList<Cliente> arregloCliente=new ArrayList<Cliente>();
	Cliente client;
	ObtenerDato oD=new ObtenerDato();
	String op2, nombre, apellido, telefono, direccion;
	int nit, carnet, codigo=2111;
	
	
	public void ingresoClientes(){
		do{
			codigo++;
			System.out.println("Por favor ingresa la informacion que se te solicita");
			System.out.println("Ingresa el nombre");
			nombre=oD.textos();
			System.out.println("Ingresa el apellido");
			apellido=oD.textos();
			System.out.println("Ingrese el NIT (sin guiones)");
			nit=oD.numeros();
			System.out.println("Ingresa el numero de telefono");
			telefono=oD.textos();
			System.out.println("Ingresa la direccion");
			direccion=oD.textos();
			arregloCliente.add(new Cliente(nombre, apellido,codigo,nit,telefono,direccion));
			System.out.println("Desea agregar otro cliente?");
			op2=oD.textos();
		}while(op2.equalsIgnoreCase("si"));
	}
	
	public void mostrarClientes(){
		for(int i=0;i<arregloCliente.size();i++){
			System.out.println("Codigo de cliente: "+arregloCliente.get(i).getCodigo()+", "+arregloCliente.get(i).getNombre()+
			" "+arregloCliente.get(i).getApellido());
		}
	}
	
	public void buscarClientes(){
		do{
			System.out.println("Por favor ingresa el codigo del cliente que deseas buscar");
			carnet=oD.numeros();
			int contador=0;
			for (int i=0;i<arregloCliente.size();i++){
				if(carnet==arregloCliente.get(i).getCodigo()){
					System.out.println(arregloCliente.get(i).getCodigo()+", "+arregloCliente.get(i).getNombre()+
					" "+arregloCliente.get(i).getApellido()+", Telefono: "+arregloCliente.get(i).getTelefono()+", NIT: "+arregloCliente.get(i).getNit()+
					", Direccion: "+arregloCliente.get(i).getDireccion());
				}else{
					contador++;
				}
			}		
			if(contador==arregloCliente.size()){
				System.out.println("Este cliente es inexistente");
			}
			System.out.println("Desea buscar otro cliente?");
			op2=oD.textos();
		}while(op2.equalsIgnoreCase("si"));
	}
	
	public void modificarClientes(){
		int opcion;
		do{	
			System.out.println("Por favor ingresa el codigo del cliente que deseas modificar");
			carnet=oD.numeros();
			int contador=0;
			for (int i=0;i<arregloCliente.size();i++){
				if(carnet==arregloCliente.get(i).getCodigo()){
					System.out.println(arregloCliente.get(i).getCodigo()+", "+arregloCliente.get(i).getNombre()+
					" "+arregloCliente.get(i).getApellido()+", Telefono: "+arregloCliente.get(i).getTelefono()+", NIT: "+arregloCliente.get(i).getNit()+
					", Direccion: "+arregloCliente.get(i).getDireccion());
					System.out.println("Por elija que informacion desea modificar");
					System.out.println("1... Para modificar el nombre del cliente");
					System.out.println("2... Para modificar el apellido del cliente");
					System.out.println("3... Para modificar el NIT del cliente");
					System.out.println("4... Para modificar el numero de telefono del cliente");
					System.out.println("5... Para modificar la direccion del cliente");
					System.out.println("6... Para modificar toda la informacion");
					opcion=oD.numeros();
					switch(opcion){
						case 1:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingresa el nombre");
						nombre=oD.textos();
						arregloCliente.set((i), new Cliente(nombre, apellido=arregloCliente.get(i).getApellido(),
						codigo=arregloCliente.get(i).getCodigo(),nit=arregloCliente.get(i).getNit(),telefono=arregloCliente.get(i).getTelefono(),
						direccion=arregloCliente.get(i).getDireccion()));
						break;
						
						case 2:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingresa el apellido");
						apellido=oD.textos();
						arregloCliente.set((i), new Cliente(nombre=arregloCliente.get(i).getNombre(), apellido,
						codigo=arregloCliente.get(i).getCodigo(),nit=arregloCliente.get(i).getNit(),telefono=arregloCliente.get(i).getTelefono(),
						direccion=arregloCliente.get(i).getDireccion()));
						break;
						
						case 3:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingrese el NIT (sin guiones)");
						nit=oD.numeros();
						arregloCliente.set((i), new Cliente(nombre=arregloCliente.get(i).getNombre(), apellido=arregloCliente.get(i).getApellido(),
						codigo=arregloCliente.get(i).getCodigo(),nit,telefono=arregloCliente.get(i).getTelefono(),
						direccion=arregloCliente.get(i).getDireccion()));
						break;
						
						case 4:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingresa el numero de telefono");
						telefono=oD.textos();
						arregloCliente.set((i), new Cliente(nombre=arregloCliente.get(i).getNombre(), apellido=arregloCliente.get(i).getApellido(),
						codigo=arregloCliente.get(i).getCodigo(),nit=arregloCliente.get(i).getNit(),telefono,
						direccion=arregloCliente.get(i).getDireccion()));
						break;
						
						case 5:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingresa la direccion");
						direccion=oD.textos();
						arregloCliente.set((i), new Cliente(nombre=arregloCliente.get(i).getNombre(), apellido=arregloCliente.get(i).getApellido(),
						codigo=arregloCliente.get(i).getCodigo(),nit=arregloCliente.get(i).getNit(),telefono=arregloCliente.get(i).getTelefono(),
						direccion));
						break;
						
						case 6:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingresa el nombre");
						nombre=oD.textos();
						System.out.println("Ingresa el apellido");
						apellido=oD.textos();
						System.out.println("Ingrese el NIT (sin guiones)");
						nit=oD.numeros();
						System.out.println("Ingresa el numero de telefono");
						telefono=oD.textos();
						System.out.println("Ingresa la direccion");
						direccion=oD.textos();
						arregloCliente.set((i), new Cliente(nombre, apellido,codigo=arregloCliente.get(i).getCodigo(),nit,telefono,direccion));
						break;
					}
				}else{
					contador++;
				}
			}
			if(contador==arregloCliente.size()){
				System.out.println("Este cliente es inexistente");
			}
			System.out.println("Desea modificar otro cliente?");
			op2=oD.textos();
		}while(op2.equalsIgnoreCase("si"));
	}
	
	public void eliminarClientes(){
		do{
			System.out.println("Por favor ingresa el codigo del cliente que deseas eliminar");
			carnet=oD.numeros();
			int contador=0;
			for (int i=0;i<arregloCliente.size();i++){
				if(carnet==arregloCliente.get(i).getCodigo()){
					System.out.println(arregloCliente.get(i).getCodigo()+", "+arregloCliente.get(i).getNombre()+
					" "+arregloCliente.get(i).getApellido()+", Telefono: "+arregloCliente.get(i).getTelefono()+", NIT: "+arregloCliente.get(i).getNit()+
					", Direccion: "+arregloCliente.get(i).getDireccion());
					System.out.println("Esta seguro de querer eliminar este cliente?");
					op2=oD.textos();
					if(op2.equalsIgnoreCase("si")){
						arregloCliente.remove(i);
						System.out.println("Cliente eliminado existosamente");
					}else{
						System.out.println("Cancelando eliminacion...");
					}
				}else{
					contador++;
				}
			}
			
			if(contador==arregloCliente.size()){
				System.out.println("Este cliente ya no existe");
			}
			System.out.println("Desea eliminar otro cliente?");
			op2=oD.textos();
		}while(op2.equalsIgnoreCase("si"));
	}
	
	public void mostrarTodo(){
		for(int i=0;i<arregloCliente.size();i++){
			System.out.println(arregloCliente.get(i).getCodigo()+", "+arregloCliente.get(i).getNombre()+
			" "+arregloCliente.get(i).getApellido()+", Telefono: "+arregloCliente.get(i).getTelefono()+", NIT: "+arregloCliente.get(i).getNit()+
			", Direccion: "+arregloCliente.get(i).getDireccion());
		}
		
	}
	
	
	
 
}