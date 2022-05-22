package ejercicio10;


public class Gato extends Mascotas { //Gato hereda de Mascotas.
	String color;
	String peloLargo;

	Gato(String nombre, int edad, String estado, String fechaNacimiento,String color,String peloLargo) {//Para crear un gato se necesitan los siguientes datos.
		super(nombre, edad, estado, fechaNacimiento);
		this.color=color;
		this.peloLargo=peloLargo;
	}

	public String muestra() {//Metodo que mostrará todos los datos del Gato.
		return "Gato [color=" + color + ", peloLargo=" + peloLargo + ", nombre=" + nombre + ", edad=" + edad
				+ ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	public void habla() {
		System.out.println(" Miau miau");
	}
}
