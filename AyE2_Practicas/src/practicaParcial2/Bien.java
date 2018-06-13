package practicaParcial2;

public class Bien {
	protected Titular titular;
	protected float vMercado;
	protected float vFiscal;
	protected int id;
	protected static int proxid = 0; 
	
	/**
	 * Asegurables
	 
	//Los bienes asegurables tienen asignada una prima que representa el valor asegurado, la cual
	//debe ser menor al valor del mercado de dicho bien
	private float prima;
	public void setPrima(float p) throws PrimaInvalidaException {
		if (p <	vMercado) {
			throw new PrimaInvalidaException();
		}else {
			prima = p;
		}
	}
	/**
	 * Gravables
	 
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
	
	/**
	 * Transferibles
	 
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
	*/
	/**
	 * Todos Bienes
	 */
	public Bien() {
		// TODO Auto-generated constructor stub
		id = proxid;
		proxid ++;
	}
	public Bien(Titular t,float vM, float vF) {
		// TODO Auto-generated constructor stub
		this();
		titular = t;
		vMercado = vM;
		vFiscal = vF;
	}
	public void setTitular(Titular t1) {
		titular = t1;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setValorMercado(float vm) throws ValorMercadoInvalidoException{
		if(vm<0) {
			throw new ValorMercadoInvalidoException();
		}else {
			this.vMercado = vm;
		}
	}
		
		public void setValorFiscal(float vm) throws ValorFiscalInvalidoException{
			if(vm<0) {
				throw new ValorFiscalInvalidoException();
			}else {
				this.vFiscal = vm;
			}
	}
	

}
