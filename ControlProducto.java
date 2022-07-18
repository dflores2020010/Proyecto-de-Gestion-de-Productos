package com.diegoflores.controlador;
import com.diegoflores.modelo.Producto;
import com.diegoflores.entrada.ObtenerDato;
import java.util.ArrayList;
public class ControlProducto{

	ArrayList<Producto> arregloProducto=new ArrayList<Producto>();
	Producto product;
	ObtenerDato oD=new ObtenerDato();
	String op2, nombre, descripcion;
	int codigo=1001, cantidad, identificador;
	double costo;
	
	public void ingresoProductos(){
		do{
			codigo++;
			System.out.println("Por favor ingresa la informacion que se te solicita");
			System.out.println("Ingresa el nombre del producto");
			nombre=oD.textos();
			System.out.println("Ingresa una breve descripcion");
			descripcion=oD.textos();
			System.out.println("Ingrese la cantidad existente de producto");
			cantidad=oD.numeros();
			System.out.println("Ingresa el costo por unidad");
			costo=oD.decimales();
			arregloProducto.add(new Producto(nombre, descripcion, codigo, costo, cantidad));
			System.out.println("Desea agregar otro producto?");
			op2=oD.textos();
		}while(op2.equalsIgnoreCase("si"));
	}
	
	public void mostrarProductos(){
		for(int i=0;i<arregloProducto.size();i++){
			System.out.println("Codigo de Producto: "+arregloProducto.get(i).getCodigo()+", "+arregloProducto.get(i).getNombre()+
			" "+arregloProducto.get(i).getApellido());/*el metodo getApellido hara la funcion del metodo que retorne descripcion 
			ya que es heredado de una clase anterior(Persona)*/
		}
	}
	
	public void buscarProductos(){
		do{
			System.out.println("Por favor ingresa el codigo del producto que deseas buscar");
			identificador=oD.numeros();
			int contador=0;
			for (int i=0;i<arregloProducto.size();i++){
				if(identificador==arregloProducto.get(i).getCodigo()){
					System.out.println(arregloProducto.get(i).getCodigo()+", "+arregloProducto.get(i).getNombre()+
					", Descripcion: "+arregloProducto.get(i).getApellido()+", Costo: Q."+arregloProducto.get(i).getCosto()+", Cantidad en bodega: "
					+arregloProducto.get(i).getCantidad());
				}else{
					contador++;
				}
			}		
			if(contador==arregloProducto.size()){
				System.out.println("Este producto es inexistente");
			}
			System.out.println("Desea buscar otro producto?");
			op2=oD.textos();
		}while(op2.equalsIgnoreCase("si"));
	}
	
	public void modificarProductos(){
		do{	
			System.out.println("Por favor ingresa el codigo del producto que deseas modificar");
			identificador=oD.numeros();
			int contador=0;
			int opcion;
			for (int i=0;i<arregloProducto.size();i++){
				if(identificador==arregloProducto.get(i).getCodigo()){
					System.out.println(arregloProducto.get(i).getCodigo()+", "+arregloProducto.get(i).getNombre()+
					", Descripcion: "+arregloProducto.get(i).getApellido()+", Costo: Q."+arregloProducto.get(i).getCosto()+", Cantidad en bodega: "
					+arregloProducto.get(i).getCantidad());
					System.out.println("Por elija que informacion desea modificar");
					System.out.println("1... Para modificar el nombre");
					System.out.println("2... Para modificar la descripcion");
					System.out.println("3... Para modificar la cantidad");
					System.out.println("4... Para modificar el costo");
					System.out.println("5... Para modificar toda la informacion");
					opcion=oD.numeros();
					switch(opcion){
						case 1:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingresa el nombre del producto");
						nombre=oD.textos();
						arregloProducto.set((i), new Producto(nombre,descripcion= arregloProducto.get(i).getApellido(),
						codigo=arregloProducto.get(i).getCodigo(),costo=arregloProducto.get(i).getCosto(),cantidad=arregloProducto.get(i).getCantidad()));
						break;
						
						case 2:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingresa una breve descripcion");
						descripcion=oD.textos();
						arregloProducto.set((i), new Producto(nombre=arregloProducto.get(i).getNombre(),descripcion,
						codigo=arregloProducto.get(i).getCodigo(),costo=arregloProducto.get(i).getCosto(),cantidad=arregloProducto.get(i).getCantidad()));
						break;
						
						case 3:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingrese la cantidad existente de producto");
						cantidad=oD.numeros();
						arregloProducto.set((i), new Producto(nombre=arregloProducto.get(i).getNombre(),descripcion=arregloProducto.get(i).getApellido(),
						codigo=arregloProducto.get(i).getCodigo(),costo=arregloProducto.get(i).getCosto(),cantidad));
						break;
						
						case 4:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingresa el costo por unidad");
						costo=oD.decimales();
						arregloProducto.set((i), new Producto(nombre=arregloProducto.get(i).getNombre(),descripcion=arregloProducto.get(i).getApellido(),
						codigo=arregloProducto.get(i).getCodigo(),costo,cantidad=arregloProducto.get(i).getCantidad()));
						break;
						
						case 5:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingresa el nombre del producto");
						nombre=oD.textos();
						System.out.println("Ingresa una breve descripcion");
						descripcion=oD.textos();
						System.out.println("Ingrese la cantidad existente de producto");
						cantidad=oD.numeros();
						System.out.println("Ingresa el costo por unidad");
						costo=oD.decimales();
						arregloProducto.set((i), new Producto(nombre, descripcion,codigo=arregloProducto.get(i).getCodigo(),costo,cantidad));
					}
				}else{
					contador++;
				}
			}
			if(contador==arregloProducto.size()){
				System.out.println("Este producto es inexistente");
			}
			System.out.println("Desea modificar otro producto?");
			op2=oD.textos();
		}while(op2.equalsIgnoreCase("si"));
	}
	
	public void eliminarProductos(){
		do{
			System.out.println("Por favor ingresa el codigo del producto que deseas eliminar");
			identificador=oD.numeros();
			int contador=0;
			for (int i=0;i<arregloProducto.size();i++){
				if(identificador==arregloProducto.get(i).getCodigo()){
					System.out.println(arregloProducto.get(i).getCodigo()+", "+arregloProducto.get(i).getNombre()+
					", Descripcion: "+arregloProducto.get(i).getApellido()+", Costo: "+arregloProducto.get(i).getCosto()+", Cantidad en bodega: "
					+arregloProducto.get(i).getCantidad());
					System.out.println("Esta seguro de querer eliminar este producto?");
					op2=oD.textos();
					if(op2.equalsIgnoreCase("si")){
						arregloProducto.remove(i);
						System.out.println("Producto eliminado existosamente");
					}else{
						System.out.println("Cancelando eliminacion...");
					}
				}else{
					contador++;
				}
			}
			if(contador==arregloProducto.size()){
				System.out.println("Este producto ya no existe");
			}
			System.out.println("Desea eliminar otro producto?");
			op2=oD.textos();
		}while(op2.equalsIgnoreCase("si"));
	}
	
	public void mostrarTodo(){
		for(int i=0;i<arregloProducto.size();i++){
			System.out.println(arregloProducto.get(i).getCodigo()+", "+arregloProducto.get(i).getNombre()+
			", Descripcion: "+arregloProducto.get(i).getApellido()+", Costo: Q."+arregloProducto.get(i).getCosto()+", Cantidad en bodega: "
			+arregloProducto.get(i).getCantidad());
		}
	}



}