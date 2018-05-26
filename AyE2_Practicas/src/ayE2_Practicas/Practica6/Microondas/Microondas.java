package ayE2_Practicas.Practica6.Microondas;

import ayE2_Practicas.Practica6.Microondas.Puerta.EstadoPuerta;

public class Microondas {
	private Puerta puerta;
	private Comida comida;
	private double timer;
	enum EstadoMicro {off,on,cooking}
	private EstadoMicro estado;
	private int intensidad;
	private boolean estalleno;
	
	//Getters & Setters
	//	{		
	public Puerta getPuerta() {
		return puerta;
	}
	public void setPuerta(Puerta puerta) {
		this.puerta = puerta;
	}
	public Comida getComida() {
		return comida;
	}
	public void setComida(Comida comida) {
		this.comida = comida;
	}
	public double getTimer() {
		return timer;
	}
	public void setTimer(double timer) {
		this.timer = timer;
	}
	public EstadoMicro getEstado() {
		return estado;
	}
	public void setEstado(EstadoMicro estado) {
		this.estado = estado;
	}
	public int getIntensidad() {
		return intensidad;
	}
	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}
	//	}
	
	//Constructores
	public Microondas() {
		estalleno = false;
		estado = EstadoMicro.off;
		timer = 0;
		puerta.cerrar();
		
		
	}
	
	//Operadores
	public void iniciarCoccion(int intensidad, double time) {
		
	}
	public void detenerCoccion() {}
	public void ponerComida(Comida com) {
		if (puerta.getEstado()==EstadoPuerta.ABIERTA && not(estalleno)) {
			estalleno = true;			
		}
	}
	private boolean not(boolean es) {
		if (es) {return false;}else {return true;}
		
	}
	public void sacarComida() {
		if (puerta.getEstado()==EstadoPuerta.ABIERTA && estalleno) {
			estalleno = false;			
			
		}
	}
	
}
