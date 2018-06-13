package practicaParcial2;

public class BienInexistente extends Bien implements Asegurable {

	private float prima;
	public BienInexistente(Titular t) {
		super();
		setTitular(t);
	}
	public void setPrima(float p) throws PrimaInvalidaException {
		if (p >	vMercado) {
			throw new PrimaInvalidaException();
		}else {
			prima = p;
		}
	}
	public float getPrima() {
		// TODO Auto-generated method stub
		
		return prima;
	}
}
