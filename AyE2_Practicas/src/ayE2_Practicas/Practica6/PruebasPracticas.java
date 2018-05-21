package ayE2_Practicas.Practica6;

public class PruebasPracticas {

	public static void main(String[] args) {
		Lamparita lamp1 = new Lamparita();
		System.out.println("la Lamparita esta: "+lamp1.getEstado());
		lamp1.encender();
		System.out.println("Ahora la lamparita esta: "+lamp1.getEstado());
	}

}
