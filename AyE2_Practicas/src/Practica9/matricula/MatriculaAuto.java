package Practica9.matricula;

/**
 * 
 * @author Agurshageok
 *
 *         Implemente una clase MatriculaAuto (matr�cula de autom�vil) que va a
 *         estar formada por dos atributos letra y n�mero. En el m�todo main se
 *         deber�n crear objetos matr�culas, a partir de sus componentes. La
 *         matr�cula se considerar� valida si la letra introducida es igual a la
 *         letra �A� o �B�, y si el n�mero tiene ocho d�gitos. Si la matr�cula
 *         fuera correcta se crear� un objeto matr�cula y se mostrar�n por
 *         pantalla los valores de sus atributos. En caso de que la letra sea
 *         incorrecta o el n�mero de matr�cula no tuviera ocho d�gitos, se
 *         lanzar� una excepci�n. El m�todo llamador deber� mostrar un mensaje
 *         ante la excepci�n recibida indicando que la letra es err�nea o el
 *         formato es err�neo, dependiendo de la situaci�n ocurrida
 *
 *
 */
public class MatriculaAuto {
	private char letra;
	private int numero;
	private boolean esValido;

	public MatriculaAuto(char letra, String digitos) throws MatriculaAutoException {
		if (letra != 'A' && letra != 'B') {
			throw new LetraInvalidaException("La letra (" + letra + ") es invalida.");
		}
		if (digitos.length() != 8) {
			throw new CantidadDigitosInvalidaException("La cantidad de Digitos ingresada es invalida");
		}
		// parseInt devuelve una RuntimeException, controlarla luego
		numero = Integer.parseInt(digitos);
		this.letra = letra;
	}

	public MatriculaAuto() {
		// TODO Auto-generated constructor stub
		esValido = true;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		try {
			if (letra != 'A' && letra != 'B') {
				throw new LetraInvalidaException("La letra (" + letra + ") es invalida.");
			}
			this.letra = letra;
		} catch (LetraInvalidaException e) {
			esValido = false;
			System.out.println("letra invalida");
			this.letra = '_';
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(String digitos) {
		try {
			if (digitos.length() != 8) {
				throw new CantidadDigitosInvalidaException("La cantidad de Digitos ingresada es invalida");
			}
			// parseInt devuelve una RuntimeException, controlarla luego
			numero = Integer.parseInt(digitos);
		} catch (CantidadDigitosInvalidaException e) {
			esValido = false;
			System.out.println("Cantidad de Digitos Invalida");
		} catch (NumberFormatException e) {
			esValido = false;
			System.out.println("Formato de Numero Invalido");
		}

	}

	public boolean esValido() {
		return esValido;
	}

	public void setesValido(boolean esValido) {
		this.esValido = esValido;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Matricula Auto: " + letra + "-" + numero;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatriculaAuto mat;
		// No es muy flexible ya que todo lo referido a la instancia mat debe realizarse
		// dentro del bloque try
		try {
			mat = new MatriculaAuto('C', "streiuoi");
			System.out.println(mat);
		} catch (MatriculaAutoException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de Instanzacion: " + e);
			// e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Error en el formato del numero ingresado");
			System.out.println(e);
		}
		System.out.println("Exito!");

		/*
		 * 
		 * Version por Validacion en metodos
		 * 
		 */

		System.out.println("Version por metodos");
		MatriculaAuto mat2 = new MatriculaAuto();

		mat2.setLetra('A');
		mat2.setNumero("12345678");
		if (mat2.esValido()) {
			System.out.println(mat2);
		}
		System.out.println("Exito v2!");

	}

}
