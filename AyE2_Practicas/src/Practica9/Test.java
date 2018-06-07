package Practica9;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test3");
		try {
			System.out.println("Primer try");
			try {
				throw new Ex();
			} finally {
				System.out.println("Finally del Segundo try");
			}
			// throw new Ex();
			// Este solo saltea el finally del segundo try
			// System.out.println("Primer try");
			// todo lo que esta aca se considera Unreachable code
		} catch (Ex e) {
			System.out.println("Se capturó la Excepción Ex del Primer try");
		} finally {
			System.out.println("Finally del Primer try");
		}
	}
}
