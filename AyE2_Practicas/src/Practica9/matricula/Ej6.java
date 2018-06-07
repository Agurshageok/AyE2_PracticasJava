package Practica9.matricula;

public class Ej6 {
	boolean estado;

	void on() {
		estado = true;
	}

	void off() {
		estado = false;
	}
/**
 * Mejorar el Codigo
 * @param args
 */
/*	public static void main(String[] args) {
		 Ej6 s = new Ej6();
		 try {
		 s.on();
		 // algún código
		 s.off();
		 } catch (NullPointerException e) {
		 System.out.println("Ocurrió un error de puntero");
		 s.off();
		 } catch (IllegalArgumentException e) {
		 System.out.println("Ocurrió un error de I/O");
		 s.off();
		 }
		 }

}*/
	/*
	 * La mejora propuesta es:
	 */
	public static void main(String[] args) {
	 Ej6 s = new Ej6();
	 try {
	 s.on();
	 // algún código
	 } catch (NullPointerException e) {
	 System.out.println("Ocurrió un error de puntero");
	 } catch (IllegalArgumentException e) {
	 System.out.println("Ocurrió un error de I/O");
	 }finally {
		 s.off();
	 }
	 }

}