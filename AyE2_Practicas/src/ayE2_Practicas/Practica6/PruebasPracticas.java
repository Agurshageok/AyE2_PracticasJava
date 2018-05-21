package ayE2_Practicas.Practica6;

public class PruebasPracticas {

	public static void main(String[] args) {
		/*
		 * Ej1 - Lamparita
		 * 
		 * Lamparita lamp1 = new Lamparita();
		System.out.println("la Lamparita esta: "+lamp1.getEstado());
		lamp1.encender();
		System.out.println("Ahora la lamparita esta: "+lamp1.getEstado());
	*/
		
		
		/*
		 * Ej 6 - Reloj
		 * 
		Hora h1 = new Hora(1,140,160);
		Hora h2 = new Hora(2, 400, 12);
		System.out.println("La hora de tu nacimiento fue: " +h2.toString());
		System.out.println("La hora de tu muerte sera: "+h1.toString());
		System.out.println("La suma de tus horas astrales es: " +Hora.sumarHoras(h1, h2).toString());
		
	}
	
  		*/
		/*
		 * Ej 7 - Empleado
		 *  
		 */
		Empleado emp1 = new Empleado ();
		Empleado emp2 = new Empleado (1, "Pepe");
		emp1.verDatos();
		emp2.verDatos();
}
}
