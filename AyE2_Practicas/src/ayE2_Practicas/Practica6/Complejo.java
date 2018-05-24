package ayE2_Practicas.Practica6;

public class Complejo {
	private int real;
	private int img;
	
	public Complejo () {real = 0; img = 0;}
	public Complejo (int r, int i) {real = r; img = i;}
	public int getReal() {
		return real;
	}
	public int getImg() {
		return img;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public void setImg(int img) {
		this.img = img;
	}
	
	public void producto(Complejo c) {
		//this.real = this.real * c.real;
		//this.img = this.img * c.img;
		
		int r1 = 0;
		int r2 = 0;
		int i1 = 0;
		int i2 = 0;
		r1 = this.real*c.real;
		r2 = -1*this.img*c.img;
		i1 = this.real*c.img;
		i2 = this.img*c.real;
		this.real = r1 + r2;
		this.img = i1 + i2;
	}
	
	
	public int sumaInt(int x, int y) {int z = x + y; return z;}
	public void sumaComp(Complejo c1) {this.real = this.real + c1.real ; this.img = this.img + c1.img;}
	public float sumaFloat(float x, float y) {float z = x + y; return z;}
	
	@Override
	
	public String toString() {return "("+real+";"+img+")";}
}
