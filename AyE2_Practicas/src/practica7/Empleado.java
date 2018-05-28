package practica7;

public class Empleado extends persona {
	private int legajo;
	private int salario;
	
	public Empleado() {
		super();
		legajo = 0;
	}

	@Override
	public int getIngreso() {
		// TODO Auto-generated method stub
		return salario;
	}
	

}
