
import java.util.Scanner;

public class ClaseUnoProgramacion {

	static void imprimirSuma(int a, int b) {
		int resultado = a+b;
		System.out.println(resultado);
	}


	static void promedio(int a, int b) {
		int prom = (a+b)/2;
		System.out.println("El promedio de "+a+" y "+b+" es "+prom);
	}


	static void ponerNota(double x, double y) {
		double resultado = (x+y)/2;
		resultado = Math.round(resultado*1000.0)/1000.0;
		if(resultado>=7) {
			System.out.println("Su nota es "+resultado+" usted promociona la materia");
		}
		else if(resultado>=4 && resultado<7){
			System.out.println("Su nota es "+resultado+" está aprobado");
		}
		else {
			System.out.println("Su nota es "+resultado+" debe recuperar");
		}
	}

	static void imprimirFecha(int dia, int mes, int anio) {
		String mesString = "";
		switch(mes) {
		case 1: mesString = "Enero"; break;
		case 2: mesString = "Febrero"; break;
		case 3: mesString = "Marzo"; break;
		case 4: mesString = "Abril"; break;
		case 5: mesString = "Mayo"; break;
		case 6: mesString = "junio"; break;
		case 7: mesString = "julio"; break;
		case 8: mesString = "Agosto"; break;
		case 9: mesString = "Septiembre"; break;
		case 10: mesString = "Octubre"; break;
		case 11: mesString = "Noviembre"; break;
		case 12: mesString = "Diciembre"; break;
		default: System.out.println("Ese mes no existe"); break;
		}
		System.out.println(dia+" de "+mesString+" de "+anio);
	}


	static int sumatoria(int n) {
		int resultado = 0;
		for(int i=1; i<=n; i++) {
			resultado+= i;
		}
		return resultado;
	}


	static int sumatoriaPares(int n) {
		int suma = 0;
		for(int i=2; i<=n; i++) {
			if(i%2==0) {
				suma+=i;
			}
		}
		return suma;
	}


	static double potencia(double x, int a) {
		double resultado = Math.pow(x, a);
		return resultado;
	}

	static double factorial(int n) {
		int resultado = 1;
		if(!(n==0)) {
			for(int i=n; i>=1; i--) {
				resultado=resultado*i;
			}
		}
		else {
			resultado = 1;
		}
		return resultado;
	}

	static int cantCifras(int n) {
		int cont = 1;
		while(!(n<=1)) {
			n=n/10;
			cont++;
		}
		return cont;
	}

	static boolean esDivisible(int n, int m) {
		boolean resultado = true;
		if(n%m==0) {
			return resultado;
		}else {
			resultado = false;
			return resultado;
		}
	}

	static String reversa(String pal) {
		String palRev = "";
		for(int i=0; i<pal.length(); i++) {
			palRev = pal.charAt(i) + palRev;
		}
		return palRev;
	}

	static int cantidadApariciones(String pal, char letra) {
		int cant = 0;
		for(int i=0; i<pal.length(); i++) {
			if(pal.charAt(i)==letra) {
				cant++;
			}
		}
		return cant;
	}
	
	static int cantidadVocales(String pal, String vocales) {
		int vocal = 0;
		for(int i=0; i<pal.length(); i++) {
			for(int j=0; j<vocales.length(); j++) {
				if(pal.charAt(i)==vocales.charAt(j)) {
					vocal++;
				}
			}
		}
		return vocal;
	}
	
	static boolean esAbecedaria(String s) {
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i) >= s.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	
	static boolean esCapicua(String s) {
		String num = "";
		for(int i=0; i<s.length(); i++) {
			num = s.charAt(i)+num;
			if(s.equals(num)) {
				return true;
			}
		}
		return false;
	}
	
	public static String sinRepetidas(String s) {
		 String nueva = "";
			for (int i = 0; i < s.length(); i++) {
	            if(nueva.indexOf(s.charAt(i)) == -1) {	//E L E FANTE
					nueva+= s.charAt(i);				//0 1 2 
				}										//E
			}
			return nueva;
	}
	
	// ARRAYS
	
	public static boolean estaContenido(int[] a, int[] b) {
		boolean resultado = false;
		int cont = 0;
		for(int i=0; i < a.length; i++) {
			for(int j=0; j < b.length; j++ ) {
				if(a[i] == (b[j])) {
					cont++;
					if(cont == a.length) {
						resultado = true;
					}
				}
			}
		}
		return resultado;
	}
	
	static int maximo(int[] a) {
		int maximo = a[0];
		for(int i=0; i < a.length; i++) {
			if(a[i] > maximo) {
				maximo = a[i];
			}
		}
		return maximo;
	}
	
	
	static int maximoIndice(int[] a) {
		int cont = 0;
		while(a[cont] != maximo(a)) { 
			cont++;					
		}							
		return cont;
	}
	
	static int suma(int[] a) {
		int suma = 0;
		for(int i=0; i<a.length; i++) {
			suma+=a[i];
		}
		return suma;
	}
	
	
	static double suma2(double[] a) {
		double suma = 0;
		for(int i=0; i<a.length; i++) {
			suma+=a[i];
		}
		return suma;
	}
	
	static boolean estaOrdenado(int[] a) {
		boolean ordenado = false;
		int cont = 0;
		for(int i=0; i < a.length-1; i++) {
			if(a[i] < a[i+1]) {
				cont++;
				if(cont == a.length-1) {
					ordenado = true;
				}
			}
		}
		return ordenado;
	}
	
	//UTILIZA LA FUNCION DE ARRIBA LLAMADA SUMA2, QUE SUMA TODOS LOS ELEMENTOS DEL ARRAY
	static double promedio(double[] a) {
		double promedio = 0.0;
		promedio = suma2(a)/a.length;
		return promedio;
	}
	*/
	public static void imprimir(int[] a) {
		System.out.print("[ ");
		for(int i=0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
	}
	
	public static int[] sacarElementos(int[] a) {
		int[] b = new int[a.length-2];
		for(int i=1; i < a.length-1; i++) {
			b[i-1] = a[i];
		}
		return b;
	}
	

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Ingrese su name: ");
		char dato = scan.next().charAt(0);
		System.out.println("la primera letra de su nombre es: "+dato+"\n");
		
		System.out.println("Ingrese su name: ");
		String dato2 = scan2.nextLine();
		System.out.println("su nombre es: "+dato2+"\n");
		
		System.out.println("Ingrese su numero entero: ");
		int dato3 = scan.nextInt();
		System.out.println("su numero es: "+dato3+"\n");
		
		System.out.println("Ingrese un numero con decimales: ");
		float dato4 = scan2.nextFloat();
		System.out.println("su numero es: "+dato4+"\n");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ingrese el 1er numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("ingrese el 2do numero: ");
		int num2 = scan.nextInt();
		
		int resultado=num1+num2;
		
		System.out.println("La suma de "+num1+" más "+num2+" es: "+resultado);
		
		//EJERCICIO 4
		
		System.out.println(1/2); //interpreta como enteros
		System.out.println(1.0/2.0); //interpreta como decimales
		System.out.println(1.0/2);
		System.out.println(1/2.0);
		System.out.println(1+2);
		System.out.println("1"+"2");
		System.out.println(16/2*4);
		System.out.println(16/(2*4));
		
		//EJERCICIO 5
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1er numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("2do numero: ");
		int num2 = scan.nextInt();
		
		int prom=(num1+num2)/2;
		
		System.out.println("El promedio de "+num1+" y "+num2+" es "+prom);
				
		//EJERCICIO 6
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1er numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("2do numero: ");
		int num2 = scan.nextInt();
		
		imprimirSuma(num1, num2);
		
		//EJERCICIO 7
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1er numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("2do numero: ");
		int num2 = scan.nextInt();
		
		promedio(num1, num2);
		
		//EJERCICIO 8
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su primer nota ");
		double ingreso = scan.nextFloat();
		
		System.out.println("Ingrese su 2da nota ");
		double ingreso2 = scan.nextFloat();
		ponerNota(ingreso, ingreso2);
		
		//EJERCICIO 9
		int dia=13;
		int mes=8;
		int anio=2023;
		imprimirFecha(dia,mes,anio);
		
		//EJERCICIO 10
		System.out.println(sumatoria(10));
		
		//EJERCICIO 11
		System.out.println(sumatoriaPares(10));
		
		//EJERCICIO 12
		System.out.println(potencia(2.0, 4));
		
		//EJERCICIO 13
		System.out.println(factorial(6));
		
		//EJERCICIO 14
		System.out.println(cantCifras(100));
		
		//EJERCICIO 15
		if(esDivisible(3, 2)) {
			System.out.println("Es más verdadero que mi amor por una programadora");
		}else {
			System.out.println("Es más falso que mi amor por la moda");
		}
		
		//EJERCICIO 16
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		String pal = scan.nextLine();
		
		System.out.println(reversa(pal));
		
		//EJERCICIO 17
		String pal = "1Carlitos2Come3Ca4caEnSu5Casota";
		char letra = 'c';
		System.out.println(cantidadApariciones(pal.toLowerCase(), letra));
		
		//EJERCICIO 18
		String pal = "TuPerritaMeMueveLaColaPorQueQuiereQueLeArrojeElTronco";
		String vocales = "aeiou";
		System.out.println(cantidadVocales(pal.toLowerCase(), vocales));
		
		//EJERCICIO 19
		String palabra = "agil";
		System.out.println(esAbecedaria(palabra));
		
		//EJERCICIO 20
		String pal = "Anana";
		pal = pal.toLowerCase();
		System.out.println(esCapicua(pal));
		
		//EJERCICIO 21
		String pal = "elefante";
		System.out.println(sinRepetidas(pal));
		
		//EJERCICIO ALTERNATIVO ARRAY
		int[] a1 = {1,5};
		int[] a2 = {1,3,5};
		int[] a3 = {2,7};
		int[] a4 = {2,7};
		int[] b1 = {5,3,1};
		int[] b2 = {5,3,1};
		int[] b3 = {5,2,1};
		int[] b4 = {7};
		System.out.println(estaContenido(a1,b1));
		System.out.println(estaContenido(a2,b2));
		System.out.println(estaContenido(a3,b3));
		System.out.println(estaContenido(a4,b4));
		
		//EJERCICIO 25
		int[] array = {10, 55, 11};
		System.out.println("El más alto es: "+maximo(array));
		
		//EJERCICIO 26
		int[] array = {10, 55, 81, 90, 91};
		System.out.println("El indice más alto es: "+maximoIndice(array));
		
		//EJERCICIO 27
		int[] array = {1, 2, 3, 4, 5, 10};
		System.out.println(suma(array));
		
		//EJERCICIO 28
		int[] array = {1, 2, 3, 4, 10};
		System.out.println(estaOrdenado(array));
		
		//EJERCICIO 29
		double[] array = {6.5, 8.3, 7.1, 8.3, 3.2};
		System.out.println(promedio(array));
		*/
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 1};
		imprimir(sacarElementos(array));
		
		
	}

}
