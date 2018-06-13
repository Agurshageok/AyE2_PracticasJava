package practicaParcial2;

public class Titular {
	private String name;
	private String surname;
	
	public Titular(String s,String n) {
		// TODO Auto-generated constructor stub
		name = n;
		surname = s;
	}
	public Titular() {
		// TODO Auto-generated constructor stub
	}
	public void enviarEmail() {
		System.out.println("Se notifico al Titular: "+surname+" "+name+" De la transferencia de un bien.");
	}
}
