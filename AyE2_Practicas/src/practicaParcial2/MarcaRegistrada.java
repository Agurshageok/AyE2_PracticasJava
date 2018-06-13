package practicaParcial2;

public class MarcaRegistrada extends Bien implements Transferible {
	
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
