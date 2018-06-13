package practica8;

import java.util.ArrayList;
import java.util.List;

public class Encuesta<A, B, C, D extends ArrayList<B>> implements ArbolBinUniH<A, B, C, D> {
	private A hoja;
	private B nodoUn;
	private C nodoBin;
	private D lista;
	private Encuesta<A, B, C, ArrayList<B>> si;
	private Encuesta<A, B, C, ArrayList<B>> sd;
	/**
	 * A String
	 * B Numero de Respuesta Afirmativa
	 * C Numero de Respuesta Afirmativa o Negativa
	 * D Lista de Respuestas Afirmativas
	 */
	@Override
	public void armarHoja(A dato) {
		// TODO Auto-generated method stub
		hoja = dato;
		si = null;
		sd = null;
		
	}

	@Override
	public void armarNodoUn(B dato, ArbolBinUniH<A, B, C, D> arb) {
		// TODO Auto-generated method stub
		nodoUn = dato;
		si =(Encuesta<A, B, C, ArrayList<B>>) arb;
	}

	@Override
	public void armarNodoBin(C dato, ArbolBinUniH<A, B, C, D> arb1, ArbolBinUniH<A, B, C, D> arb2) {
		// TODO Auto-generated method stub
		si =(Encuesta<A, B, C, ArrayList<B>>) arb1;
		sd =(Encuesta<A, B, C, ArrayList<B>>) arb2;
		nodoBin = dato;
		
	}

	
	
	

	@Override
	public D recorrido() {
		lista = (D) new ArrayList<B>();
		inOrder2();
		return lista;
	}
	
	public void inOrder2() {
		if (si != null) {
			si.inOrder2();
		}
		if (esUnitario()) {
			lista.add(getRaiz());
		}
		if (sd != null) {
			sd.inOrder2();
		}
	}
	
	private B getRaiz() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean esUnitario() {
		return sd == null;
	}
	public boolean esHoja() {
		return sd == null && si == null;
	}
	public void resultados() {
		
	}
	public Encuesta(D lista, A respuesta) {
		// TODO Auto-generated constructor stub
		
	}
}
