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
		 // alg�n c�digo
		 s.off();
		 } catch (NullPointerException e) {
		 System.out.println("Ocurri� un error de puntero");
		 s.off();
		 } catch (IllegalArgumentException e) {
		 System.out.println("Ocurri� un error de I/O");
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
	 // alg�n c�digo
	 } catch (NullPointerException e) {
	 System.out.println("Ocurri� un error de puntero");
	 } catch (IllegalArgumentException e) {
	 System.out.println("Ocurri� un error de I/O");
	 }finally {
		 s.off();
	 }
	 }

}