package practica7;

import java.util.ArrayList;

public class Pila<T>{
	private ArrayList<T> elementos;
	private boolean error;
	
	public Pila(){
		elementos = new ArrayList<T>();
		error = false;
	}
	
	public int size() {
		return elementos.size();
	}
	
	public boolean esVacia() {
		return elementos.isEmpty();
	}
	
	
	public void push(T p) {
		elementos.add(p);
	}
	
	/*public T pop() throws Exception { 
		if(esVacia()) {
			Exception;
		}else {
			return elementos.get(0);
		}
	}*/

}
