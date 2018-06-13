package practicaParcial2;

public class Bono extends Bien implements Transferible, Gravable {
	
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
	
	/**
	 * Gravables
	 */
	//Los bienes gravables tienen asignado una
	//alícuota que debe ser mayor a cero, ya que la misma multiplicada por el valor fiscal devuelve el
	//cálculo de impuesto gravado a ese bien
	private float alicuota;
	public void setAlicuota(float a)throws AlicuotaInvalidaException {
		if (a <= 0) {
			throw new AlicuotaInvalidaException();
		}else {
			alicuota = a;
		}
		
	}
	public float calcularImpuesto(){
		return alicuota * vFiscal; 
	}

}
