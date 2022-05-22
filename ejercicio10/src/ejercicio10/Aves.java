package ejercicio10;

public abstract class Aves extends Mascotas { //Creamos la clase abstracta que a su vez hereda de Mascotas.
	String pico; 
	String vuela;

	
	Aves(String nombre, int edad, String estado, String fechaNacimiento,String pico, String vuela) { //Para crear una ave se necesitarian los siguientes atributos 
		super(nombre, edad, estado, fechaNacimiento);
		// TODO Auto-generated constructor stub
		this.pico=pico;
		this.vuela=vuela;
	}

	
	public void volar() {
		System.out.println("El ave vuela? " + vuela );
	}
}

