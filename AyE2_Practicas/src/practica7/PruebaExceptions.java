package practica7;

import java.util.InputMismatchException;
import java.util.Scanner;
import practica7.MiAppException;

public class PruebaExceptions {

	private static final int SIZE_ARR=10;
	private static Integer[] arrInt; 
	private static Scanner teclaMain;
	
	public static void ingresarDatoArray(int indice) {
		try {
			arrInt[indice] = 15;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("El indice esta fuera de rango");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			for(StackTraceElement elem : e.getStackTrace()) {
				System.out.println("Archivo :"+elem.getFileName());
				System.out.println("Linea de Error: "+elem.getLineNumber());
				System.out.println("Clase: "+elem.getClassName());
			}
			
		}
	}
	public static int leerIndice() {
		Scanner teclado = new Scanner(System.in);
		int indice = 0;
		boolean estaOK = false;
		
		while(!estaOK) {
			try {
				System.out.println("Ingrese el indice: ");
				indice = teclado.nextInt();
				estaOK = true;
			}catch(InputMismatchException e1){
				System.out.println("Error en el ingreso numerico. Intente de nuevo.");
				teclado.nextInt();
			}
			
		}
		teclado.close();
		return indice;
	}
	public static void ingresarDatoArray2(int indice) throws MiAppException {
		// ACA SUCEDIERON COSAS QUE NO LLEGUE A COPIAR
		try {
			arrInt[indice] = 2;
		}catch(IndexOutOfBoundsException e){
			throw new MiAppException("Nueva excepcion por indice fuera de rango", e);
		}
	}
	public static int leerIndice2() {
		return teclaMain.nextInt();
	}
	
	public static void main(String[] args) {
		arrInt = new Integer[SIZE_ARR];
		//int indice;
		teclaMain = new Scanner(System.in);
		System.out.println("Bienvenido a la prueba de excepciones 1.");
		
		try {
			int indice = leerIndice2();
			ingresarDatoArray2(indice);
		}catch(MiAppException e) {
			System.out.println(e);
	}catch(InputMismatchException e) {
		System.out.println("Error en el ingreso Numerico!");
	}
}
	
}
