package practica8;

public class Termometro implements Medible {
	private float temp;

	public Termometro(float k) {
		temp = k;
	}

	@Override
	public float obtenerMedida() {
		// TODO Auto-generated method stub
		return temp;
	}

	@Override
	public void incremento(float f) {
		// TODO Auto-generated method stub
		temp = temp + f;
	}

	@Override
	public boolean decremento(float f) {
		temp = temp - f;
		if (temp < -273) {
			return false;
		} else {
			return true;
		}

	}

}
