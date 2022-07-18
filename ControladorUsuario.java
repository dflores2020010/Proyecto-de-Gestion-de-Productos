package com.diegoflores.controlador;
import com.diegoflores.modelo.Usuario;
import com.diegoflores.entrada.ObtenerDato;
import java.util.ArrayList;
public class ControladorUsuario{

	ArrayList<Usuario> arregloUsuario=new ArrayList<Usuario>();
	Usuario user;
	ObtenerDato oD=new ObtenerDato();
	String usuario, password, op2;
	char rol;
	int codigo=9001, identificador=0;

	public void usuarioPorDefecto(){
		arregloUsuario.add(new Usuario("Admin", "1234", 9001, 'A'));
	}
	
	public char verificacionDeUsuario(String usuario, String password){//Metodo para verificar usuario y contraseña
		int cont=0;
		for(int i=0; i<arregloUsuario.size();i++){
			if((arregloUsuario.get(i).getNombre().equals(usuario))&&(arregloUsuario.get(i).getApellido().equals(password))){
				if(arregloUsuario.get(i).getRol()=='A'){
					System.out.println("Bienvenido Administrador: "+usuario);
					identificador=i;
				}else{
					System.out.println("Bienvenido "+usuario);
					identificador=i;
				}
			}else{
				cont++;
			}
		}
		if (cont==arregloUsuario.size()){
			System.out.println("Tu usuario y/o clave es incorrecta");
			System.exit(1);
		}
		return arregloUsuario.get(identificador).getRol();
	}

	public void ingresoUsuarios(){
		do{
			codigo++;
			System.out.println("Por favor ingresa la informacion que se te solicita");
			System.out.println("Ingresa el nombre del usuario");
			usuario=oD.textos();
			System.out.println("Ingresa la clave de este usuario");
			password=oD.textos();
			System.out.println("Ingrese el Rol de este usuario (A, administador; U, usuario");
			rol=oD.caracteres();
			arregloUsuario.add(new Usuario(usuario,password,codigo,rol));
			System.out.println("Desea agregar otro usuario?");
			op2=oD.textos();
		}while(op2.equalsIgnoreCase("si"));
	}
	
	public void mostrarUsuarios(){
		for(int i=0;i<arregloUsuario.size();i++){
			System.out.println("Codigo de Usuario: "+arregloUsuario.get(i).getCodigo()+", Usuario: "+arregloUsuario.get(i).getNombre()+
			", Clave: "+arregloUsuario.get(i).getApellido());/*el metodo getApellido hara la funcion del metodo que retorne la contraseña 
			ya que es heredado de una clase anterior(Persona)*/
		}
	}
	
	public void buscarUsuarios(){
		do{
			System.out.println("Por favor ingresa el codigo del usuario que deseas buscar");
			identificador=oD.numeros();
			int contador=0;
			for (int i=0;i<arregloUsuario.size();i++){
				if(identificador==arregloUsuario.get(i).getCodigo()){
					System.out.println(arregloUsuario.get(i).getCodigo()+", Usuario: "+arregloUsuario.get(i).getNombre()+
					", Clave: "+arregloUsuario.get(i).getApellido()+", Privilegio: "+arregloUsuario.get(i).getRol());
				}else{
					contador++;
				}
			}		
			if(contador==arregloUsuario.size()){
				System.out.println("Este usuario es inexistente");
			}
			System.out.println("Desea buscar otro usuario?");
			op2=oD.textos();
		}while(op2.equalsIgnoreCase("si"));
	}
	
	public void modificarUsuarios(){
		int opcion;
		do{	
			System.out.println("Por favor ingresa el codigo del usuario que deseas modificar");
			identificador=oD.numeros();
			int contador=0;
			for (int i=0;i<arregloUsuario.size();i++){
				if(identificador==arregloUsuario.get(i).getCodigo()){
					System.out.println(arregloUsuario.get(i).getCodigo()+", Usuario: "+arregloUsuario.get(i).getNombre()+
					", Clave: "+arregloUsuario.get(i).getApellido()+", Privilegio: "+arregloUsuario.get(i).getRol());
					System.out.println("Por elija que informacion desea modificar");
					System.out.println("1... Para modificar nombre");
					System.out.println("2... Para modificar la clave");
					System.out.println("3... Para modificar toda la informacion");
					opcion=oD.numeros();
					switch(opcion){
						case 1:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingresa el nombre del usuario");
						usuario=oD.textos();
						arregloUsuario.set((i), new Usuario(usuario, password=arregloUsuario.get(i).getApellido(),
						codigo=arregloUsuario.get(i).getCodigo(),rol=arregloUsuario.get(i).getRol()));
						break;
						
						case 2:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingresa la clave de este usuario");
						password=oD.textos();
						arregloUsuario.set((i), new Usuario(usuario=arregloUsuario.get(i).getNombre(),password,
						codigo=arregloUsuario.get(i).getCodigo(),rol=arregloUsuario.get(i).getRol()));
						break;
						
						case 3:
						System.out.println("Por favor ingresa la nueva informacion que se te solicita");
						System.out.println("Ingresa el nombre del usuario");
						usuario=oD.textos();
						System.out.println("Ingresa la clave de este usuario");
						password=oD.textos();
						arregloUsuario.set((i), new Usuario(usuario,password,codigo=arregloUsuario.get(i).getCodigo(),
						rol=arregloUsuario.get(i).getRol()));
						break;
					}
				}else{
					contador++;
				}
			}
			if(contador==arregloUsuario.size()){
				System.out.println("Este usuario es inexistente");
			}
			System.out.println("Desea modificar otro usuario?");
			op2=oD.textos();
		}while(op2.equalsIgnoreCase("si"));
	}
	
	public void eliminarUsuarios(){
		do{
			System.out.println("Por favor ingresa el codigo del usuario que deseas eliminar");
			identificador=oD.numeros();
			int contador=0;
			for (int i=0;i<arregloUsuario.size();i++){
				if(identificador==arregloUsuario.get(i).getCodigo()){
					System.out.println(arregloUsuario.get(i).getCodigo()+", Usuario: "+arregloUsuario.get(i).getNombre()+
					", Clave: "+arregloUsuario.get(i).getApellido()+", Privilegio: "+arregloUsuario.get(i).getRol());
					System.out.println("Esta seguro de querer eliminar este usuario?");
					op2=oD.textos();
					if(op2.equalsIgnoreCase("si")){
						arregloUsuario.remove(i);
						System.out.println("Usuario eliminado existosamente");
					}else{
						System.out.println("Cancelando eliminacion...");
					}
				}else{
					contador++;
				}
			}
			if(contador==arregloUsuario.size()){
				System.out.println("Este usuario ya no existe");
			}
			System.out.println("Desea eliminar otro usuario?");
			op2=oD.textos();
		}while(op2.equalsIgnoreCase("si"));
	}
	
	
}