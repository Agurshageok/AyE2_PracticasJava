package practica8;

public class Cuenta_Bancaria implements Medible {
	public float saldo;

	public Cuenta_Bancaria() {
		// TODO Auto-generated constructor stub
		saldo = 0;
	}

	@Override
	public float obtenerMedida() {
		// TODO Auto-generated method stub
		return saldo;
	}

	@Override
	public void incremento(float f) {
		// TODO Auto-generated method stub
		saldo = +f;
	}

	@Override
	public boolean decremento(float f) {
		saldo = saldo - f;
		if (saldo < 0) {
			return false;
		} else {
			return true;
		}

	}

}
