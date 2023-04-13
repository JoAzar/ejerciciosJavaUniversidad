
public class Fraccion {
	
	int numerador;
	int denominador;
	
	//CONSTRUCTOR
	public Fraccion(int numerador, int denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	void imprimir() {
		System.out.print(this.numerador);
		if(this.denominador!=1) {
			System.out.println("/"+this.denominador);
		}
		else {
			System.out.println();
		}
	}
	
	public void invertirSigno() {		//cambia signo
		this.numerador = -this.numerador;
	}
	
	void invertir() {
		int aux = this.numerador;
		this.numerador = this.denominador;
		this.denominador = aux;
		if(this.denominador < 0) {
			this.denominador = -this.denominador;
			this.numerador = -this.numerador;
		}
	}
	
	double aDouble() {
		return 1.0*this.numerador/this.denominador;
	}
	
	int mcd(int a, int b) {
		return b==0 ? a : mcd(b, a%b); 
	}
	
	void reducir() {
		int aux = mcd(this.numerador, this.denominador);
		this.numerador = this.numerador / aux;
		this.denominador = this.denominador / aux;
	}
	//-------------FUNCIONES DE CLASE----------------------------------------------------------------
	public static Fraccion producto(Fraccion q1, Fraccion q2) {
		Fraccion fraccion = new Fraccion(q1.numerador * q2.numerador, q1.denominador * q2.denominador);
		fraccion.reducir();
		return fraccion;
	}
	
	static Fraccion suma(Fraccion f1, Fraccion f2) {
		Fraccion fraccion = new Fraccion(f2.denominador * f1.numerador + f1.denominador * f2.numerador, f1.denominador * f2.denominador);
		return fraccion;
	}
	
	//-------------FUNCIONES DE CLASE----------------------------------------------------------------

	
	//-----------------------SETTERS & GETTERS--------------------------
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		if(denominador == 0) {
			System.out.println("El denominador no puede ser cero");
		}
		this.denominador = denominador;
	}
	//-----------------------SETTERS & GETTERS--------------------------
	
	
	
}





