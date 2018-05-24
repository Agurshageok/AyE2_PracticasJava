package ayE2_Practicas.Practica6;

public class Fecha {
	private int a;
	private int m;
	private int d;
	
	public Fecha() {a=1900;m=1;d=1;}
	public Fecha(int año, int mes, int dia) {a=año;m=mes;d=dia;}
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
	
	public boolean esMayor(Fecha f1) {
		boolean es = false;
		
		if (a > f1.a) {
			es = true;
		}else {
			if (a==f1.a && m > f1.m) {
				es = true;
			}else {
				if (a==f1.a && m==f1.m && d > f1.d) {
					es = true;
				}
			}
		}
		return es;
	}
	
	@Override 
	public String toString() {
		return d+"/"+m+"/"+a;
	}
}
