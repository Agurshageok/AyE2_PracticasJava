package practica8;

public class Autos extends Vehiculos_Motorizados implements Capacidad_Limite {
	enum estilos {normales, vans}
	private estilos estilo;
	private int capacidad;
	@Override
	public void definirCapacidadMax() {
		// TODO Auto-generated method stub
		switch(estilo) {
		case normales: capacidad = pasajerosautos;
		break;
		case vans: capacidad = pasajerosvans;
		break;
		}
	}
	
	
}
