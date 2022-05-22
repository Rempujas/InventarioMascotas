package ejercicio10;

public class Canario extends Aves {//Esta clase hereda de Aves
	String color;
	String canta;
	
	Canario(String nombre, int edad, String estado, String fechaNacimiento,String color,String canta,String pico,String vuela) {
		super(nombre, edad, estado, fechaNacimiento, pico,vuela);//Para crear una clase Canario se necesitan los siguientes datos.
		// TODO Auto-generated constructor stub
		this.color=color;
		this.canta=canta;
	}
	
	
	public String muestra() {//Metodo para mostrar los datos del canario 
		return "Canario [color=" + color + ", canta=" + canta + ", pico=" + pico + ", vuela=" + vuela + ", nombre="
				+ nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	public void habla() {
		
	}

		
	

}
