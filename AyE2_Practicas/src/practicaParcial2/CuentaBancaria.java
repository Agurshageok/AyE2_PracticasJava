package practicaParcial2;

public class CuentaBancaria extends Bien implements Transferible {
	
	public CuentaBancaria(Titular t) {
		// TODO Auto-generated constructor stub
		super();
		setTitular(t);
	}

	/**
	 * Transferibles
	 */
	public void transferir(Titular t2, Empresa emp)throws TitularInvalidoException {
		if(emp.getTitulares().contains(t2)) {
			if(!titular.equals(t2)) {
				titular.enviarEmail();
				t2.enviarEmail();
				titular = t2;
			}else {
				throw new TitularInvalidoException();
			}
		}else {
			throw new TitularInvalidoException();
		}
		
	}
	

}
