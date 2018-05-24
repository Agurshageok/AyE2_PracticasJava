package ayE2_Practicas.Practica6;

public class Vector3D extends Punto {
	
	private float x;
	private float y;
	private float z;
	
	public Vector3D() {
		x=0;
		y=0;
		z=0;
	}
	public Vector3D(float x, float y, float z) {this.x=x;this.y=y;this.z=z;}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public float getZ() {
		return z;
	}
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void setZ(float z) {
		this.z = z;
	}
	
	public Vector3D sumarDosVectores(Vector3D v1, Vector3D v2) {
		Vector3D v3 = new Vector3D();
		
		v3.x = v1.x + v2.x;
		v3.y = v1.y + v2.y;
		v3.z = v1.z + v2.z;
		
		return v3;
	}
	
	public boolean iguales(Vector3D v1) {
		boolean es = false;
		
		if(this.x==v1.x && this.y==v1.y && this.z==v1.z) {es = true;}
		
		return es;
		
	}
}



