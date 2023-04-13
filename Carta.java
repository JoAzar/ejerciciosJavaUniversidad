
public class Carta {
	int palo;
	String palo2;
	int numero;
	
	Carta(int palo, int numero){
		this.palo = palo;
		this.numero = numero;
	}
	
	public static void imprimirCarta(Carta c) {
		String palo="";
		String numero="";
		//SWITCH PARA PALOS
		switch(c.palo) {
		case 0: 
			palo = Character.toString(0x1f338); break;
		case 1: 
			palo = Character.toString(0x1f49c); break;
		case 2: 
			palo = Character.toString(0x1f499); break;
		case 3: 
			palo = Character.toString(0x2728); break;
		}
		//SWITCH PARA NUMEROS
		switch(c.numero) {
		case 0: 
			numero = "1"; break;
		case 1: 
			numero = "2"; break;
		case 2: 
			numero = "3"; break;
		case 3: 
			numero = "4"; break;
		case 4: 
			numero = "5"; break;
		case 5: 
			numero = "6"; break;
		case 6: 
			numero = "7"; break;
		case 7: 
			numero = "8"; break;
		case 8: 
			numero = "9"; break;
		case 9: 
			numero = "10"; break;
		}
		System.out.print(
				 "\n ___________"
				+"\n|| "+numero+" // "+palo+" ||"
				+"\n"
				+"||_________"+"||");
	}

	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
