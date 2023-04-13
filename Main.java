import java.awt.Point;
import java.util.Scanner;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		/*
		Fraccion fraccion = new Fraccion(12,12);
		//fraccion.invertirSigno();
		fraccion.invertir();
		System.out.print("antes de reducir ");
		fraccion.imprimir();
		fraccion.reducir();
		System.out.print("después de reducir ");
		fraccion.imprimir();
		Fraccion f1 = new Fraccion(4,1);
		Fraccion f2 = new Fraccion(2,1);
		Fraccion.producto(f1, f2).imprimir();
		Fraccion.suma(f1, f2).imprimir();;
		
		Punto p = new Punto(1,2);
		Punto p2 = new Punto(4,8);
		p.imprimir();
		p.desplazar(10, 20);
		p.imprimir();
		
		System.out.println(Punto.distancia(p, p2));		
		Dibujador dibujar = new Dibujador();
		Circulo circulo1 = new Circulo(100, 200, 90);
		Circulo circulo2 = new Circulo(200, 100, 90);
		dibujar.dibujar(circulo1);
		dibujar.dibujar(circulo2);
		
		
		Persona persona1 = new Persona("Juan", "Bertuli", 23, "Acuario");
		Persona persona2 = new Persona("Carla", "Jagger", 41, "Libra");
		Persona persona3 = new Persona("Eli", "Zingger", 35,"Geminis");
		Persona persona4 = new Persona("Carla", "Mamani", 37, "Cancer");
		Persona persona5 = new Persona("Carla", "Alegre", 41, "Aries");
		persona1.imprimir();
		persona2.imprimir();
		persona3.imprimir();
		persona4.imprimir();
		persona5.imprimir();
		System.out.println("\n"+persona1.nombre+" tiene "+persona1.edad+" años y "+persona2.nombre+" tiene "+persona2.edad+" años \n");
		System.out.println(persona1.nombre+" es más joven que "+persona2.nombre+": "+persona1.masJovenQue(persona2)+"\n");
		System.out.println(persona1.nombre+" es de "+persona1.signoZodiacal+" y "+persona2.nombre+" es de "+persona2.signoZodiacal+"\n");
		System.out.println(persona1.nombre+" es del mismo signo que "+persona2.nombre+": "+persona1.mismoSigno(persona2)+"\n");
		if(persona2.tocayo(persona4)) {
			System.out.println(persona2.nombre+" "+persona2.apellido+" y "+persona4.nombre+" "+persona4.apellido+" tienen el mismo nombre"+"\n");
		}
		else {
			System.out.println(persona2.nombre+" "+persona2.apellido+" y "+persona4.nombre+" "+persona4.apellido+" no tienen el mismo nombre"+"\n");
		}
		if(persona2.mismaPersona(persona5)) {
			System.out.println(persona2.nombre+" edad "+persona2.edad+" y "+persona5.nombre+" edad "+persona5.edad+" son la misma persona"+"\n");
		}
		else {
			System.out.println(persona2.nombre+" edad "+persona2.edad+" y "+persona5.nombre+" edad "+persona5.edad+" no son la misma persona"+"\n");
		}	
		int[] arr1 = {1, 2, 2, 10, 10, 1, 0};
		int[] arr2 = {2, 4, 5, 10, 20, 3, 2};
		int num = 5;
		if(Arreglos.esSinRepetidos(arr1)) {
			System.out.println("El array tiene elementos repetidos");
		}else {
			System.out.println("El array no tiene elementos repetidos");
		}
		Arreglos.imprimirArray(Arreglos.pegar(arr1, arr2));
		Arreglos.imprimirArray(Arreglos.agregarAlFinal(arr2, num));
		Arreglos.imprimirArray(Arreglos.sinRepetidos(arr1));
		System.out.println("a");
		Arreglos.invertir(arr2);
		Arreglos.imprimirArray(arr2);
		
		//--------_MAIN DE MAZO-----------------
		Mazo mazo = new Mazo();
		//mazo.imprimirMazo();
		//mazo.imprimirMazoRandom();
		mazo.repartirCartas();
		System.out.println("\n\n\n-----------------------------------------------------");
		mazo.repartirCartas();
		System.out.println("\n\n\n-----------------------------------------------------");
		mazo.mazoNuevo();
		mazo.repartirCartas();
		System.out.println("\n\n\n-----------------------------------------------------");
		//--------FIN DE_MAIN DE MAZO-----------------
		*/
		
		Persona p1 = new Persona("Carla", "Zapata", 32, "Aries", 31000300);
		Persona p2 = new Persona("Juancho", "Mazo", 20, "Cancer", 123321222);
		Persona p3 = new Persona("Tiara", "Targarien", 22, "Tauro", 43212333);
		Persona p4 = new Persona("Rocio", "Bachu", 70, "Capricornio", 54323411);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su signo zodiacal: ");
		String signo = scan.nextLine();
		try {
			if(signo.equalsIgnoreCase("acuario") && signo.equalsIgnoreCase("piscis") && signo.equalsIgnoreCase("capricornio") && signo.equalsIgnoreCase("cancer") && signo.equalsIgnoreCase("libra") && signo.equalsIgnoreCase("sagitario") && signo.equalsIgnoreCase("geminis") && signo.equalsIgnoreCase("leo") && signo.equalsIgnoreCase("aries")) {
				throw new RuntimeException("el signo "+signo+" no corresponde a la lista de signos");
			}
		}catch(RuntimeException ex) {
			System.out.println("==============================================================\nERROR -> "+ex.getMessage()+"\n==============================================================");
		}	
		
		
		System.out.println("Ingrese su nombre: ");
		String nombre = scan.nextLine();
		
		System.out.println("Ingrese su apellido: ");
		String apellido = scan.nextLine();
		
		System.out.println("Ingrese su edad: ");
		int edad = scan.nextInt();
		
		System.out.println("Ingrese su DNI: ");
		int dni = scan.nextInt();
		try{
			if (dni < 2000000 || dni > 100000000) {
				throw new RuntimeException("ERROR - DNI invalido"); 
			}
		}catch(RuntimeException ex) {
			System.out.println("==============================================================\nERROR -> "+ex.getMessage()+"\n==============================================================");
		}
		
		Persona p5 = new Persona(nombre, apellido, edad, signo, dni);
		
		Persona[] grupo = new Persona[]{p1, p2, p3, p4, p5};
		Agenda agenda = new Agenda(5);
		agenda.guardar(p1, "112233445");
		agenda.guardar(p2, "09993445");
		agenda.guardar(p3, "1985-n3g4d0");
		agenda.guardar(p4, "0800-coso");
		agenda.guardar(p5, "3321-2313");
		agenda.imprimirAgenda();
		
		//System.out.println(Persona.saberSiEsta(grupo, "Juancho"));
		//System.out.println(Persona.BuscarA(grupo, "Juancho"));
	}

}
