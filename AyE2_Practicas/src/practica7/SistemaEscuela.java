package practica7;

import java.util.ArrayList;

public class SistemaEscuela {
	
	
	private final static int LONGITUD_ARREGLO = 5;
	
	public static void main(String[] args) {
		//Arreglos // 
		persona[] aPersona = new persona[LONGITUD_ARREGLO]; // arreglo estatico de 5 elementos

		aPersona[0] = new Empleado();
		aPersona[1] = new Alumno();
		
		for(int i = 0; i < aPersona.length; i++) {
			System.out.println(i+":"+aPersona[i]);
		}
		
		// Arreglo Dinamico //
		ArrayList<persona> aPersona2 = new ArrayList<>();
		aPersona2.add(new Empleado());
		aPersona2.add(new Empleado());
		aPersona2.add(new Alumno());
		
		for (int i = 0; i < aPersona2.size();i++) {
			System.out.println(i+":"+aPersona2.get(i));
		}
		
		for(persona p : aPersona2) {
			System.out.println(p);
		}
		
		//Covarianza de tipo parametrico -> NO
			/*
				ArrayList<Empleado> emp1 = new ArrayList<>();
				ArrayList<persona> per1;
				
				per1 = emp1;
		*/
		
		//Covarianza de tipo parametrico -> SI
		
		ArrayList<Empleado> emp1 = new ArrayList<>();
		ArrayList<? extends persona> per1;
		
		per1 = emp1; // se puede decir que ArrayList<Empleado> es un SUBTIPO de Arraylist<persona>
		//Scanner
		
		Empleado emp2 = new Empleado();
		
		emp2.leer();
		emp2.mostrarNombre();
		
		//RAW types
		/*
		ArrayList listaRAW = new ArrayList();
		listaRAW.add(new Integer(10));
		listaRAW.add(new String("new"));
		listaRAW.add(new Integer(1));
		
		for (Object x : listaRAW) {
			System.out.println(x);
		}
		for (Integer x : (ArrayList<Integer>) listaRAW) {
			System.out.println(x);
			
		}
		*/
	}
	
	

}
