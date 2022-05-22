package ejercicio10;

public abstract class Mascotas { //Creamos la clase abstracta Mascotas
	String nombre;
	int edad;
	String estado;
	String fechaNacimiento;
	
	Mascotas(String nombre,int edad,String estado,String fechaNacimiento){ 
		this.nombre=nombre;
		this.edad=edad;
		this.estado=estado;
		this.fechaNacimiento=fechaNacimiento;
	}
	
	public String muestra() {
		return "Mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	public void cumpleaños() {
		System.out.println("El cumpleaños de la macota es el " + fechaNacimiento);
	}
	public void morir() {
		//System.out.println("No entiendo.");
	}
	public void habla() {

	}

}
