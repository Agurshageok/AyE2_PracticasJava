package ayE2_Practicas.Practica6;

public class Lamparita {
	private boolean es;
	public Lamparita() {
		es = false;
	}
	public Lamparita(boolean x) {
		es = x;
	}
	public void encender() {this.es=true;}
	public void apagar() {this.es=false;}
	public boolean estado() {
		return this.es;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
