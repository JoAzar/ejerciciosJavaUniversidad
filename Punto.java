
public class Punto {
	
	double x;
	double y;
	
	
	//--------CONSTRUCTOR 1---
	Punto() {
		this.x = 0;
		this.y = 0;
	}
	//--------constructor 2
	Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//--------CONSTRUCTOR---
	
	void imprimir() {
		System.out.println("(x: "+this.x+", y: "+this.y+")");
	}
	
	void desplazar(double desp_x, double desp_y) {
		this.x = this.x + desp_x;
		this.y = this.y + desp_y;
	}
	
	static double distancia(Punto p1, Punto p2) {
		double distance = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
		return distance;
	}
	
	
	//----------SETTERS & GETTERS----------------
	public double getX() {
		return x;
	}
	public void setX(double x) {
		if(x<0) {
			System.out.println("X no puede ser menora cero");
		}
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		if(x<0) {
			System.out.println("X no puede ser menora cero");
		}
		this.y = y;
	}
	//----------SETTERS & GETTERS----------------
	
}
