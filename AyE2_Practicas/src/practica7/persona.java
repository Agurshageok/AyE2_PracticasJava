package practica7;

import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public abstract class persona {
	protected String nombre; // init en NULL
	protected int dni; // init en 0
	protected Date fechaDeNacimiento;
	protected persona pareja;
	protected Optional<persona> pareja2; 			// maybe(persona)
	
	public persona() {
		nombre = new String ("");
		fechaDeNacimiento = new Date();
		pareja2 = Optional.empty();		//nothing
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public boolean tienePareja() {
		//return pareja != null;
		return pareja2.isPresent(); 		//isJust() del maybe
	}
	/*
	public persona getPareja() {
		return pareja;
	}
	*/
	public boolean getPareja(persona p) {
		if (tienePareja()) {
			//p.clone(pareja);
			p = pareja2.get();
			return true;
		}else {
			return false;
		}
	}
	
	/*
	public persona clone(persona p) {
		persona p2 = new persona();
		p2.dni = p.dni;
		p2.nombre = p.nombre;
		p2.fechaDeNacimiento = p.fechaDeNacimiento;
		p2.pareja = p.pareja;
	}
	*/
	
	public abstract int getIngreso();
	
	public void leer() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la persona: ");
		nombre = s.nextLine();
	}
	
	public void mostrarNombre() {
		System.out.println(nombre);
	}
	
	
}
