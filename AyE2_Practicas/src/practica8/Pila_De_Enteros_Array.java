package practica8;

public class Pila_De_Enteros_Array implements PilaDeEnteros {
	private Integer[] pila;
	private int indice;
	private static final int MAX = 10;
	private Integer[] pilasup;

	public Pila_De_Enteros_Array() {
		// TODO Auto-generated constructor stub
		pila = new Integer[MAX];
		indice = 0;
		pila[indice] = 0;
		pilasup = new Integer[MAX];
	}

	public Pila_De_Enteros_Array(int EMAX) {
		// TODO Auto-generated constructor stub
		pila = new Integer[EMAX];
		indice = 0;
		pila[indice] = 0;
		pilasup = new Integer[MAX];
	}

	@Override
	public void apilar(Integer i) {
		// TODO Auto-generated method stub
		if (indice < pila.length) {
			pila[indice] = i;
			indice++;
		} else {
			int aux = indice - pila.length;
			pilasup[aux] = i;
			indice++;
		}
	}

	@Override
	public Integer desapilar() {
		// TODO Auto-generated method stub
		Integer i = new Integer(0);
		if (indice <= pila.length) {
			i = pila[indice];
			indice--;

		} else {
			int aux = indice - pila.length;
			i = pilasup[aux];
			indice--;
		}
		return i;
	}

	@Override
	public boolean esVacia() {
		// TODO Auto-generated method stub
		if (indice == 0) {
			return true;
		} else {
			return false;
		}
	}

}
