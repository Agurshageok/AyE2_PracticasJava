package ayE2_Practicas.Practica6;

public class Fecha {
	private int a;
	private int m;
	private int d;
	private boolean es;
	
	public Fecha() {a=1900;m=1;d=1;es=true;}
	public Fecha(int año, int mes, int dia) {a=año;m=mes;d=dia;this.validar();}
	public int getA() {
		return a;
	}
	public int getM() {
		return m;
	}
	public int getD() {
		return d;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setM(int m) {
		this.m = m;
	}
	public void setD(int d) {
		this.d = d;
	}
	
	public void validar() {
		if (a < 1900) {
			es = false;
		}else {
			if (m < 1 || m > 12) {
				es = false;
			}else {
				if (d < 1 || d > this.cantDias()) {
					es = false;
				}else {
					es = true;
				}
			}
		}
	}
	
	private int cantDias() {
		int dias = 0;
		
		switch (m) {
		case 1: dias = 31;
		case 3: dias = 31;
		case 5: dias = 31;
		case 7: dias = 31;
		case 8: dias = 31;
		case 10: dias = 31;
		case 12: dias = 31;
		case 4: dias = 30;
		case 6: dias = 30;
		case 9: dias = 30;
		case 11: dias = 30;
		case 2: dias = 28;
		
		}
		
		return dias;
	}
	
	public boolean esMayor(Fecha f1) {
		boolean esM = false;
		if (this.es) {
		if (a > f1.a) {
			esM = true;
		}else {
			if (a==f1.a && m > f1.m) {
				esM = true;
			}else {
				if (a==f1.a && m==f1.m && d > f1.d) {
					esM = true;
				}
			}
		}
		}
		return esM;
	}
	
	@Override 
	public String toString() {
		return d+"/"+m+"/"+a;
	}
}
