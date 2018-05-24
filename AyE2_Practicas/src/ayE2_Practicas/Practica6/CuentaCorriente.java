package ayE2_Practicas.Practica6;

public class CuentaCorriente {
	private float saldo;
	private int opvalidas;
	private int opinvalidas;
	
	public CuentaCorriente() {saldo = 0; opvalidas = 0; opinvalidas = 0;}
	public CuentaCorriente (float s) {saldo = s;opvalidas = 0; opinvalidas = 0;}
	
	public void saldo() {
		System.out.println("Tu saldo acutal es "+saldo);
		}
	
	public void deposito(float imp) {
		saldo += imp;
		opvalidas ++;
		
	}
	public void extraccion(float imp) {
		if (saldo < imp) {
			opinvalidas ++;
			System.out.println("Saldo insuficiente");
		}else {
			saldo -= imp;
			opvalidas ++;
		}
	}
	
	public int cantidadExtraccionesInvalidas() {return opinvalidas;}
	public int cantidadOpvalidas() {return opvalidas;}
	
}
