package ayE2_Practicas.Practica6;

public class Hora {
	private int h;
	private int m;
	private int s;
	
	public Hora() {this.h=0;this.m=0;this.s=0;}
	public Hora(int h, int m, int s) {this.h=h;this.m=m;this.s=s;correjirHora();}
	
	private void correjirHora() {
		if (this.s<0) {
			this.s = 0;
		}else{ 
				if(this.s > 59) {
					
					this.m = this.m + this.s / 60;
					this.s = this.s % 60;
				}	
		}
		if (this.m<0) {
			this.m = 0;
		}else{ 
				if(this.m > 59) {
					this.h = this.h + this.m / 60;
					this.m = this.m % 60;
				}	
		}
	if (this.h < 0) {this.h = 0;}
	}
	
	@Override
	public String toString() {
		return String.format("%02d", this.h) + ":"+ String.format("%02d", this.m) +":"+String.format("%02d", this.s);
	}
	
	public void clone(Hora h) {
		this.h= h.h;
		this.m = h.m;
		this.s = h.s;
	}
	
	public void sumar(Hora h1) {
		this.h = this.h + h1.h;
		this.m = this.m + h1.m;
		this.s = this.s + h1.s;
		correjirHora();
		
	}
	
	public static Hora sumarHoras(Hora h1, Hora h2) {
		Hora h3 = new Hora();
		/*
		h3.h= h1.h + h2.h;
		h3.m= h1.m + h2.m;
		h3.s= h1.s + h2.s;
	*/
		h3.clone(h1);
		h3.sumar(h2);
		return h3;
	}
	
	
	
	
	
	
	
}
