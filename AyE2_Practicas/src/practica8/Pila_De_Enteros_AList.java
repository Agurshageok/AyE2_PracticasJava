package practica8;

import java.util.ArrayList;

public class Pila_De_Enteros_AList implements PilaDeEnteros {
	private ArrayList<Integer> pila;

	public Pila_De_Enteros_AList() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public void apilar(Integer i) {

		pila.add(i);
	}

	@Override
	public Integer desapilar() {
		if (!pila.isEmpty()) {
			Integer i = pila.get(0);
			pila.remove(0);
			return i;
		} else {
			// throw
			return null;
		}
	}

	@Override
	public boolean esVacia() {
		return pila.isEmpty();
	}

}
