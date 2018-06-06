package practica8;

public class Medidor_De_Presion implements Medible {
	private float unidades;
	private int q;
	public Medidor_De_Presion() {
		// TODO Auto-generated constructor stub
		unidades = 0;
		q = 0;
	}
	@Override
	public float obtenerMedida() {
		// TODO Auto-generated method stub
		return unidades;
	}

	@Override
	public void incremento(float f) {
		// TODO Auto-generated method stub
		unidades = unidades + f;
		q ++;
	}

	@Override
	public boolean decremento(float f) {
		// TODO Auto-generated method stub
		if (q > 0) {
			unidades = unidades - (f/q);
			q = 0;
			return true;
		}else{
			return false;
		}
	}
}
