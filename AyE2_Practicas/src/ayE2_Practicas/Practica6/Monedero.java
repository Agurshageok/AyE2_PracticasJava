package ayE2_Practicas.Practica6;

public class Monedero {
	int dinero;
	
	public Monedero() {dinero = 0;}
	public Monedero(int d) {dinero = d;}
	
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
	public void poner(int d) {
		dinero += d;
	}
	
	public void sacar(int d) {
		if (dinero > d) {
			dinero -= d;
			System.out.println(d+"Retirado con exito");
		}else {
			System.out.println("Fondos Insuficientes");
		}
	}
	
	public void consulta() {
		System.out.println("Su saldo actual es: "+dinero);
	}

}
