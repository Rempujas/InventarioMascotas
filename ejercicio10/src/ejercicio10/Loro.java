package ejercicio10;



public class Loro extends Aves{//La clase loro extiende de Aves
	String origen;
	String vuela;
	
	Loro(String nombre, int edad, String estado, String fechaNacimiento,String pico,String origen,String vuela) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);//Para crear un objeto loro se necesitan los siguientes atributos
		// TODO Auto-generated constructor stub
		this.origen=origen;
		this.vuela=vuela;
	}
	
	
	public String muestra() {
		return "Loro [origen=" + origen + ", vuela=" + vuela + ", pico=" + pico + ", nombre=" + nombre + ", edad="
				+ edad + ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	public void saluda() {
		
	}
	public void volar() {
		
	}

}
