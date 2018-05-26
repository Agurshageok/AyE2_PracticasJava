package ayE2_Practicas.Practica6.Microondas;

public class Puerta {
	enum EstadoPuerta {ABIERTA, CERRADA}
	private EstadoPuerta estado;
	
	public Puerta() {estado = EstadoPuerta.CERRADA;}

	public EstadoPuerta getEstado() {
		return estado;
	}

	public void setEstado(EstadoPuerta estado) {
		this.estado = estado;
	}
	
	public void abrir() {
		if (estado == EstadoPuerta.CERRADA) {estado = EstadoPuerta.ABIERTA;}
	}
	public void cerrar() {
		if (estado == EstadoPuerta.ABIERTA) {estado = EstadoPuerta.CERRADA;}
	}
}
