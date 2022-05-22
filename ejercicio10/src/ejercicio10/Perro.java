package ejercicio10;
public class Perro extends Mascotas {//herencia de Mascotas.
	String raza;
	boolean pulgas;
	Perro(String nombre, int edad, String estado, String fechaNacimiento,String raza,boolean pulgas) {//Se necesitan los siguientes atributos para crear un objeto llamado perro
		super(nombre, edad, estado, fechaNacimiento);
		// TODO Auto-generated constructor stub
		this.pulgas=pulgas;
		this.raza=raza;
	}
	
	
	public String muestra() { //El metodo que mostrará los datos!
		return "El perro tiene los siguientes datos; Nombre"+ nombre + " edad " + edad + " estado " +estado +" fecha de nacimiento " + fechaNacimiento +" raza " + raza + " pulgas " + pulgas ;
	}
	public void habla() {
		System.out.println("Guau guauuu!");
	}
}
