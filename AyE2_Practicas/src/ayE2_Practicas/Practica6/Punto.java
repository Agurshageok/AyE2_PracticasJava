package ayE2_Practicas.Practica6;

public class Punto {
	protected float x;
	protected float y;
	
	public Punto() {x=0;y=0;}
	public Punto(float x, float y) {this.x=x;this.y=y;}
	public Punto (float x) {this.x=x;this.y=x;}
	
	public void setPunto(float x, float y) {this.x=x;this.y=y;}
	public void setX(float x) {this.x=x;}
	public void setY(float y) {this.y=y;}
	
	public float getX() {return this.x;}
	public float getY() {return this.y;}
	
	public Punto sumarDosPuntos(Punto r1,Punto r2) {
		Punto r3 = new Punto();
		r3.x = r1.x + r2.x;
		r3.y = r1.y + r2.y;
		return r3;
	}
	
	public void sumarDosPuntosEnElPrimero (Punto r1) {
		this.x += r1.x;
		this.y += r1.y;
	}
	
	public boolean iguales (Punto r1) {
		boolean es = false;
		if (this.x==r1.x && this.y == r1.y){es=true;}
		return es;
	}
	
	@Override
	public String toString() {
		return "El punto es: ("+x+","+y+")";
	}
}
