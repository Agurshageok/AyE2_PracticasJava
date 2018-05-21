package ayE2_Practicas.Practica6;

public class Empleado {
	private int num;
	private String nom;
	
	public Empleado() {
		num = 0;
		nom = "";
	}
	public Empleado(int n, String nom) {
		this.num = n;
		this.nom = nom;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void verDatos () {
		System.out.println("NOMBRE: "+this.nom + " NUMERO: "+this.num);
	}
	
}
