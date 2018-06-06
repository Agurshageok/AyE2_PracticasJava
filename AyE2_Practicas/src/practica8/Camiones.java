package practica8;

public class Camiones extends Vehiculos_Motorizados implements Capacidad_Limite {
	private int num_remolques;
	private boolean niv_seg;
	private int capacidad;
	@Override
	public void definirCapacidadMax() {
		// TODO Auto-generated method stub
		capacidad = pasajeroscamiones;
	}

}
