
public class Mazo {
	Carta[] cartas;
	
	//CONSTRUCTOR
	public Mazo() {
		this.cartas = new Carta[40];
		int cont = 0;
		for(int palo = 0; palo <= 3; palo++) {				//4 palos de cartas 
			for(int numero = 0; numero < 10; numero++) {	//10 numeros de cartas = cartas x 40
				cartas[cont] = new Carta(palo, numero);
				cont++;
			}
		}
	}
	
	public void imprimirMazo() {
		for(int i = 0; i < cartas.length; i++) {
			Carta.imprimirCarta(cartas[i]);
		}
	}
	
	//NUEVO MAZO
	public Mazo mazoNuevoAliasing() {
		Mazo mazo = new Mazo();
		for(int i = 0; i < this.cartas.length; i++) {
			mazo.cartas[i] = this.cartas[i];
		}
		return mazo;
	}
	
	public Mazo mazoNuevo() {
		Mazo mazo2 = new Mazo();
		for(int i=0; i < this.cartas.length; i++) {
			if(this.cartas[i] == null) {
				mazo2.cartas[i] = null;
			}else{
				mazo2.cartas[i] = new Carta(this.cartas[i].numero, this.cartas[i].palo);
			}
		}
		return mazo2;
	}
	
	
	public void imprimirMazoRandom() {
		int cont = 0;
		while(cont != 40) {
			int numRandom = (int) (Math.random()*40);
			if(cartas[numRandom] != null) {
				Carta.imprimirCarta(cartas[numRandom]);
				cartas[numRandom] = null;
				cont++;
			}		
		}
	}
	
	public void repartirCartas() {
		int cont = 0;
		while(cont != 5) {							//cambiarte la cantidad de cartas
			int numRandom = (int) (Math.random()*40);	//cambiar el random de la cant de cartas
			if(cartas[numRandom] != null) {
				Carta.imprimirCarta(cartas[numRandom]);
				cartas[numRandom] = null;
				cont++;
			}
		}
	}

}
