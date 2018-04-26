package test001;
import java.util.ArrayList;
import java.util.Iterator;

import video_167_Programacion_Generica.Empleado;

class UsoEmpleado{
	public static void main(String[]args) {
		ArrayList<Empleado> listaEmpleados=new ArrayList<Empleado>();
		listaEmpleados.add(new Empleado("joe", 33, 323));
		listaEmpleados.add(new Empleado("ann", 33, 323));
		
		for(Empleado e:listaEmpleados) {
			System.out.println(e.toString());
		}
	}
}

class Empleado
{
	private String nombre;
	private int edad;
	private double sueldo;
	
	public Empleado(String nom, int ed, double sue) {
		nombre=nom;
		sueldo=sue;
		edad=ed;
	}
	public String toString() {
		return "Nombre: " + nombre + " Sueldo:" +sueldo;
	}
}