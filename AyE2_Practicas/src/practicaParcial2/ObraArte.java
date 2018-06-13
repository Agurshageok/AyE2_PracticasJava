package practicaParcial2;

public class ObraArte extends Bien implements Asegurable {
	
	/**
	 * Asegurables
	 */
	//Los bienes asegurables tienen asignada una prima que representa el valor asegurado, la cual
	//debe ser menor al valor del mercado de dicho bien
	private float prima;
	public ObraArte(Titular t) {
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
