package practica8;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejemplo de implementacion de ArbBin(a)
 * @author maprea
 *
 * @param <T>
 */

public class ArbolBin<T extends Comparable<T>> implements Comparable<ArbolBin<T>> {
	
	private T raiz;
	private ArbolBin<T> si;
	private ArbolBin<T> sd;
	int alturaArbol;
	private static List<Object> lista;
	
	public ArbolBin(T dato) {
		raiz = dato;
	}

	public T getRaiz() {
		return raiz;
	}

	public void setRaiz(T raiz) {
		this.raiz = raiz;
	}

	public ArbolBin<T> getSi() {
		return si;
	}

	public void setSi(ArbolBin<T> si) {
		this.si = si;
	}

	public ArbolBin<T> getSd() {
		return sd;
	}

	public void setSd(ArbolBin<T> sd) {
		this.sd = sd;
	}
	
	public void insertar(T dato) {
		int comparacion = raiz.compareTo(dato);
		if (comparacion > 0) {
			// Caso base
			if (si == null) {
				si = new ArbolBin<T>(dato);
			} else {
				// Caso recursivo
				si.insertar(dato);
			}
		} else {
			if (comparacion < 0) {
				// Caso base
				if (sd == null) {
					sd = new ArbolBin<T>(dato);
				} else {
					// Caso recursivo
					sd.insertar(dato);
				}
			}
		}		
	}
	
	public boolean esHoja() {
		return si == null && sd == null;
	}
	
	public int altura() {
		
		if (esHoja()) {
			// Caso base
			return 1;
		} else {
			// Caso recursivo
			int alturaI = 0;
			int alturaD = 0;
			if (si != null) {
				alturaI = si.altura();
			}
			if (sd != null) {
				alturaD = sd.altura();
			}
			return 1 + Math.max(alturaI, alturaD);
		}
	}
	
	/*
	 * Recorrer un arbol DFS y devolver una lista.
	 */
	public List<Object> inOrder() {
		lista = new ArrayList<>();
		inOrder2();
		return lista;
	}
	
	public void inOrder2() {
		if (si != null) {
			si.inOrder2();
		}
		
		lista.add(getRaiz());
		
		if (sd != null) {
			sd.inOrder2();
		}
	}
	
	/*
	 * Se muestra en pantalla los nodos en profundidad InOrden
	 */
	public void mostrarInOrder() {
		if (si != null) {
			si.mostrarInOrder();
		}
		
		System.out.println(getRaiz());
		
		if (sd != null) {
			sd.mostrarInOrder();
		}
	}

	/*
	 * Como se implementa la interfaz Comparable, se sobreescribe el metodo compareTo que permitira obtener
	 * el comportamiento entre objetos de esta clase similar a operaciones <, >, =
	 * En este ejemplo, asumimos que dos arboles son menores, mayores o iguales dependiendo del valor del nodo
	 * raiz de cada uno. Es solo un ejemplo para verificar como se implementa Comparable.
	 */
	@Override
	public int compareTo(ArbolBin<T> o) {
		return raiz.compareTo(o.getRaiz());
	}
	
	
	
	public static void main(String args[]) {
		
		ArbolBin<Integer> arbol = new ArbolBin<>(10);
		arbol.insertar(4);
		arbol.insertar(8);
		arbol.insertar(15);
		arbol.insertar(11);
		arbol.insertar(1);
		arbol.insertar(3);
		arbol.insertar(9);
		arbol.insertar(10);
		
		List<Object> lista = arbol.inOrder();
		
		System.out.println("Listado InOrder: ");
		for(Object x : lista) {
			if (x instanceof Integer) {
				// Downcasting Object -> Integer
				x = (Integer) x + 100;			
			}
			// Llama al x.toString()
			// Mediante binding dinamico se llama a toString de Integer
			// porque dentro de x hay una instancia de objeto de tipo Integer
			System.out.println(x);
		}
		
		System.out.println("Altura: " + arbol.altura());
	}
}
