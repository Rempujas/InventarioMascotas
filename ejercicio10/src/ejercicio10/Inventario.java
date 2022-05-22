package ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
	//Los animales deben almacenarse en un array
	private static ArrayList <Mascotas> mascotas = new ArrayList<Mascotas>();//Se crea un Array list que guardara los animales.
	private Scanner scanner = new Scanner(System.in); //CRTL F busqueda propio fichero

	public void menu() {
		System.out.println("Hola bienvenid@ a la seccion animales, que desea hacer?");
		System.out.println("1- Mostrar la lista de animales");
		System.out.println("2- Mostrar todos los datos de un animal concreto");
		System.out.println("3- Mostrar todos los datos de todos los animales");
		System.out.println("4- Insertar mascota en el inventario");
		System.out.println("5- Eliminar mascota del inventario");
		System.out.println("6- Vaciar inventario");
		try {
			String opt = scanner.nextLine();
			int opcionMenu= Integer.parseInt(opt);
			
			switch (opcionMenu) {
				case 1://Mostrar la lista de animales(solo tipo y nombre)		
					if(mascotas.size() == 0) {
						System.out.println("Debes introducir una mascota antes de mostrar la lista de animales."); //Si el array está vacío se mostrará este mensaje
					}else {
						for (int i = 0; i < mascotas.size(); i++) { //le damos a i el valor de mascota.size, para que recorra todas las posiciones del valor de i
							System.out.println("El tipo de mascota es: " + mascotas.get(i).getClass()+ " y su nombre: " +mascotas.get(i).nombre);//Imprimimos los datos
						} 
					}
					menu();
					break;
				case 2://Mostrar todos los datos de un animal concreto
					
					if(mascotas.size() == 0) {
						System.out.println("Debes introducir una mascota antes de mostrar la lista de animales.");
					}else{//Si el array no dispone de datos en esa posición mostrará el else,si lo tiene mostrará los datos de los animales
						System.out.println("Que posición tiene el animal?");//Pedimos posición
						String pos = scanner.nextLine();
						int posAnimal = Integer.parseInt(pos);
						
						System.out.println(mascotas.get(posAnimal -1).muestra()); //Se busca la posicion del array, y lo mostramos.
					}
					
					menu();
					break;
				case 3://Mostrar todos los datos de todos los animales
					if(mascotas.size() == 0) {
						System.out.println("Debes introducir una mascota antes de mostrar los datos de los de animales.");
					}else {
						for (int j = 0; j < mascotas.size(); j++) {//Variable J del tamaño del Arraylist lo recorremos a la vez que se imprime
							System.out.println(mascotas.get(j).muestra());
						}
					}
					
					menu();
					break;
				case 4://Insertar animales en el inventario
					insertarMascota(); //Nos vamos al metodo insertarMascota
					
					menu();
					break;
				case 5://Eliminar animales del inventario
					mascotas.remove(mascotas.size()-1);//Hacemos -1 ya que el Array empieza en 0 y daría un error. Cada vez se eliminará un anumal. 
					
					menu();
					break;
				case 6://Vaciar el inventario
					mascotas.removeAll(mascotas);//Se borra todo!
					
					menu();
					break;
				default:
					System.out.println("Seleccione un numero correcto");
					
					menu();
					break;
			}	

		}catch(NumberFormatException e) {//Si introducimos un valor incorrecto saltará esta excepcion
			System.out.println("Valor introducido incorrecto intentelo de nuevo, gracias.");
			menu();
		}
	}

	public void insertarMascota() {
		System.out.println("Que clase desea intertar?");
		System.out.println("1- Perro");
		System.out.println("2- Gato");
		System.out.println("3- Loro");
		System.out.println("4- Canario");
		System.out.println("5- Atras");
		//Cada if es identico al siguiente, por falta de tiempo solo explicaré uno.
		try {
			String opt = scanner.nextLine();
			int opcionMenu= Integer.parseInt(opt);
			
			String nombre;
			int edad;
			String estado=null;
			String fechaNacimiento;
			 
			switch(opcionMenu) {
				case 1://Crear un perro por pantalla 
					String raza;
					String pulgas;
					boolean tienePulgas=false;
				
					System.out.println("Introduce el nombre del perro ");//Pedimos datos
					nombre=scanner.nextLine();//Le damos el dato a la variable
					System.out.println("Introduce la edad del perro ");
					edad=Integer.parseInt(scanner.nextLine());
					System.out.println("Introduce el estado en el que se encuentra el perro ");
					estado=scanner.nextLine();
					System.out.println("Introduce la fecha de nacimiento ");
					fechaNacimiento=scanner.nextLine();
					System.out.println("Introduce la raza del perro ");
					raza=scanner.nextLine();
					System.out.println("¿El perro tiene pulgas? Si  o no  ");
					pulgas=scanner.nextLine();
				
					if (pulgas.toUpperCase().equals("SI")){//Hacemos que el valor introducido lo cambiemos a mayusculas y comprobamos el si o el no
						tienePulgas=true;
					}else if(pulgas.toUpperCase().equals("NO")) {
						tienePulgas=false;
					}else {
						System.out.println("Tas bobo o que?Si o no ");//Una broma, si el valor no coincide en si o no, se le asignará el valor falso.
						tienePulgas=false;
					}
					mascotas.add(new Perro(nombre, edad, estado, fechaNacimiento, raza, tienePulgas));//Añadimos todas las vriables
					System.out.println("Numero posicion " + mascotas.size()+" no la olvides. Pulsa INTRO para continuar.");
					scanner.nextLine();
					menu();
					break;
				case 2://crear un gato
					String color;
					String peloLargo;
				
					System.out.println("Introduce el nombre del gato"); //Pedimos datos
					nombre=scanner.nextLine();//Leemos dato y lo añadimos a la variable
					System.out.println("Introduce la edad del gato");
					edad=Integer.parseInt(scanner.nextLine());
					System.out.println("Introduce el estado en el que se encuentra el gato");
					estado=scanner.nextLine();
					System.out.println("Introduce la fecha de Nacimiento");
					fechaNacimiento=scanner.nextLine();
					System.out.println("Introduce el color del gato");
					color=scanner.nextLine();
					System.out.println("Introduce la longitud del pelo del gato");
					peloLargo=scanner.nextLine();
				
					mascotas.add(new Gato(nombre, edad, estado, fechaNacimiento, color, peloLargo));//con esto añadimos el gato al arrayList
					System.out.println("Numero posicion " + mascotas.size()+" no la olvides. Pulsa INTRO para continuar.");
					scanner.nextLine();
					menu();
					break;
				case 3://crear un loro
					String pico=null;
					String origen=null;
					String vuela=null;
				
					System.out.println("Introduce el nombre del loro");
					nombre=scanner.nextLine();
					System.out.println("Introduce la edad del loro");
					edad=Integer.parseInt(scanner.nextLine());
					System.out.println("Introduce la fecha de nacimiento del loro");
					fechaNacimiento=scanner.nextLine();
					System.out.println("Introduce si tiene o no pico el loro");
					pico=scanner.nextLine();
				
					pico = extracted(pico);
				
					System.out.println("Introduce si vuela o no el loro");
					vuela=scanner.next();
				
					vuela=extracted(vuela);
				
					mascotas.add(new Loro(nombre, edad, estado, fechaNacimiento, pico, origen, vuela));
					System.out.println("Numero posicion " + mascotas.size()+" no la olvides. ");
					scanner.nextLine();
					menu();
					break;
				case 4://crear un Canario
					String colorCanario;
					String canta=null;
					String picoCanario=null;
					String vuelaCanario=null;
				

					System.out.println("Introduce el nombre del Canario");
					nombre=scanner.nextLine();
					System.out.println("Introduce el estado del canario");
					estado=scanner.nextLine();
					System.out.println("Introduce la edad del Canario");
					edad=Integer.parseInt(scanner.nextLine());
					System.out.println("Introduce la fecha de nacimiento del Canario");
					fechaNacimiento=scanner.nextLine();
					System.out.println("Introduce el color del Canario");
					colorCanario=scanner.nextLine();
					System.out.println("Introduce si canta el loro");
					canta=scanner.next();
				
					canta = extracted(canta);
				
					System.out.println("Introduce si tiene pico el canario");
					picoCanario=scanner.next();
					
					picoCanario = extracted(picoCanario);
				
					System.out.println("Introduce si vuela el canario");
					vuelaCanario=scanner.next();
				
					vuelaCanario = extracted(vuelaCanario);
				
					mascotas.add(new Canario(nombre, edad, estado, fechaNacimiento, colorCanario, canta, picoCanario, vuelaCanario));
					System.out.println("Numero posicion " + mascotas.size()+" no la olvides. ");
					scanner.nextLine();
					menu();
					break;
				case 5://Salir
					menu();
				default:
				System.out.println("Seleccione un numero correcto");
			}
		}
			catch(NumberFormatException e) {//Si introducimos un valor incorrecto saltará esta excepcion
				System.out.println("Valor introducido incorrecto intentelo de nuevo, gracias.");
				insertarMascota();
	}
					
}

	private String extracted(String comprobar) {
		if (comprobar.toUpperCase().equals("SI")){
			comprobar="si";
		}else if(comprobar.toUpperCase().equals("NO")) {
			comprobar="no";
		}else {
			System.out.println("Tas bobo o que?Si o no ");
			comprobar="Indefinido";
		}
		return comprobar;
	}
	
}