
public class recursividad {


	public static int sumaDesdeUnoHasta(int n) {
		if(n == 1) {
			return n;
		}
		return n + sumaDesdeUnoHasta(n-1);
	}
	
	
	public static void imprimirHasta(int n) { //Imprime por pantalla los números entre 1 y n (en orden ascendente)
		if(n == 0) {
			System.out.println();
			return;
		}
		imprimirHasta(n-1);
		System.out.print(n + " ");
	}
	
	public static void imprimirDesde(int n) { //Imprime por pantalla los números entre 1 y n (en orden ascendente)
		if(n == 0) {
			System.out.println();
			return;
		}
		System.out.print(n + " ");
		imprimirDesde(n-1);
	}
	
	
	public static int sumaDeCuadradosHasta(int n) { //Devuelve la suma de todos los números elevados al cuadrado entre 1 y n
		if(n == 0) {
			return n; 
		}
		return n*n + sumaDeCuadradosHasta(n-1);	
	}
	
	
	public static int factorial(int n){
		if(n == 0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static String invertirString(String pal) {
		if(pal.isEmpty()) {
			return pal;
		}
		return invertirString(pal.substring(1)) + pal.charAt(0);	//substring recorre el string "palabra" hasta el caracter 1
	}																//lo que dice el return es = alabra + p, labrap + a, abrapa + l
	
	public static String quitarPrimera(String pal) {
		String salida = "";
		for(int i=1; i < pal.length(); i++) {
			salida = salida + pal.charAt(i);
		}
		return salida;
	}
	
	
	public static String quitarUltima(String pal) {
		String salida = "";
		for(int i=0; i<pal.length()-1; i++) {
			salida = salida + pal.charAt(i);		//retorna: a l a b r a
		}
		return salida;
	}
	
	
	public static String invertirStringReversa(String pal) {
		if(pal.isEmpty()) {
			return pal;
		}
		return pal.charAt(pal.length()-1) + invertirStringReversa(pal.substring(0, pal.length()-1)); //retorna: a r b a l a p
	}
	
	
	public static boolean esCapicua(String pal) {
		if(pal.length() <= 1) {
			return true;
		}
		if(pal.charAt(0) == pal.charAt(pal.length()-1)) {		//si el primer caracter es igual al último repito ciclo
			return esCapicua(pal.substring(1, pal.length()-1));			//esCapicua(quitarPrimera(quitarUltima(pal)));
		}
		return false;
	}
	
	public static boolean vocal(String coso) {
		String vocal = "aeiou";
		for(int i = 0; i < coso.length(); i++) {
			for(int j = 0; j < vocal.length(); j++) {
				if(coso.charAt(i) == vocal.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public static int potencia(int a, int b) {
		if(b == 1) {
			return a;
		}
		return potencia(a+a, b-1);
	}
	
	
	public static int sumatoria(int n) {
		if(n==0) {
			return n;
		}
		return n + sumatoria(n-1);
	}
	
	
	public static int sumatoriaResumida(int n) {
		return n==0?n:n+sumatoriaResumida(n-1);		// return casi base ? base : segundo caso;
	}
	
	
	public static int sumatoriaPares(int n) {
		if(n==2) {
			return 2;
		}
		if(n%2==0) {
			return n+sumatoriaPares(n-2);
		}
		return sumatoriaPares(n-1);
	}
	
	
	public static int sumatoriaParesResumida(int n) {
		return n==2?2:n%2==0?n+sumatoriaParesResumida(n-1):sumatoriaParesResumida(n-1);
	}
	
	static int potencia(int base, int exponente){
		if(exponente == 1) {
			return base;
		}
		return potencia(base+base, exponente-1);
	}
	
	static int potenciaResumida(int base, int exponente){
		return exponente==1?base:potenciaResumida(base+base, exponente-1);
	}
	
	public static long fibrec(int n) {
		if(n <= 1) {
			return n;
		}
		return fibrec(n-2) + fibrec(n-1);
	}
	
	public static long fibrecResum(int n) {
		return n<=1?n:fibrec(n-2) + fibrec(n-1);
	}
	
	public static void collatz(int n) {
		if(n == 1) {
			return;
		}
		if(n%2==0) {
			n=n/2;
		}
		else {
			n=3*n+1;
		}
		System.out.println(n);
	}
	
	public static int mcd(int a, int b) {	//a y b son dos divisores
		if(b == 0) {
			return a;
		}
		return mcd(b, a%b);
	}
	
	static String conAsterisco(String pal) {
		if(pal.length() == 0) {
			return pal;
		}
		if(pal.length() > 1) {
			return pal.charAt(0) + "*" + conAsterisco(pal.substring(1));
		}
		return pal.charAt(0) + conAsterisco(pal.substring(1));
	}
	
	static String sinRepetidos(String pal) {
		if(pal.length() <= 1) {
			return pal;
		}
		if(pal.charAt(0) == pal.charAt(1)) {
			return sinRepetidos(pal.substring(1));
		}
		return pal.charAt(0) + sinRepetidos(pal.substring(1));
	}
	
	
	
	//-------------MAIN---------------------
	public static void main(String[] args) {
		
		System.out.println(sumaDesdeUnoHasta(7));
		imprimirHasta(10);
		System.out.println("\n");
		imprimirDesde(10);
		System.out.println("\n");
		System.out.println(sumaDeCuadradosHasta(4));
		System.out.println(factorial(5));
		String pal = "palabra";
		invertirString(pal);
		String pala = "palabras";
		System.out.println(pala.length()-1);
		System.out.println(quitarUltima(pal));
		System.out.println(invertirStringReversa(pal));
		System.out.println(esCapicua(pala));
		int a = 2;
		int b = 5;
		System.out.println(potencia(a,b));
		int n = 5;
		System.out.println(sumatoria(n));
		System.out.println(sumatoriaResumida(n));
		System.out.println(sumatoriaPares(n));
		System.out.println(sumatoriaParesResumida(n));
		int base = 2;
		int exponente = 3;
		System.out.println(potencia(base, exponente));
		System.out.println(potenciaResumida(base, exponente));
		int num = 10;
		System.out.println(fibrec(num));
		System.out.println(fibrecResum(num));
		
		long res;
		int repeticiones = 100;
		for(int cont=1; cont<=30; ++cont) {
			long t1 = System.currentTimeMillis();
		    for(int i=0; i<repeticiones; ++i) {
		    	res = fibrec(cont);
		    }
		    long t2 = System.currentTimeMillis();
		    double tiempo = (t2-t1)/(float)repeticiones;
		    System.out.format("f(" + cont + ") = " + fibrec(cont) + "\t[%.2f ms] \n", tiempo);
		}
		int n1 = 5;
		collatz(n1);
		int a1 = 12;
		int b1 = 10;
		System.out.println(mcd(a1,b1));
		String pal1 = "casa";
		System.out.println(conAsterisco(pal1));
		String pal2 = "gggeeeeuddddduu";
		System.out.println(sinRepetidos(pal2));
	}
	

}
