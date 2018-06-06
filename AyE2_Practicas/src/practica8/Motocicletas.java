package practica8;

import java.util.Date;

public class Motocicletas extends Vehiculos_Motorizados {
	enum usos {paseo, viaje, cadete}
	private usos uso;
	public Motocicletas() {
		// TODO Auto-generated constructor stub
	}
	
	public Motocicletas(String f,String m,Date d,Integer k,int i) {
		// TODO Auto-generated constructor stub
		super(f,m,d,k);
		switch(i) {
		case 1: uso = usos.paseo;
		break;
		case 2: uso = usos.viaje;
		break;
		case 3: uso = usos.cadete;
		break;
		}
		
		
	}
}
