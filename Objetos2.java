import java.awt.*;

public class Objetos2 {

	public static void imprimirPoint(Point p1) {
		System.out.println("x: "+p1.x+" y: "+p1.y);
	}
	
	public static int perimetroRect(Rectangle caja) {
		int perimetro = 0;
		perimetro = caja.width * caja.height;
		return perimetro;
	}
	
	public static boolean calcularColision(Rectangle caja1, Rectangle caja2) {
		if(caja2.x <= perimetroRect(caja1)  && caja2.y <= perimetroRect(caja1)) {
			return true;
		}
		return false;
	}
	
	public static Point calcularCentro(Rectangle caja) {
		Point p = new Point();
		p.x = caja.x + caja.width/2;
		p.y = caja.y + caja.height/2;
		return p;
	}
	
	public static double distancia(Point p1, Point p2) {
		Rectangle caja = new Rectangle(p1.x, p1.y, p2.x, p2.y);
		double distancia = Math.sqrt((caja.height*caja.height) + (caja.width*caja.width));
		return distancia;
	}
	
	static double distancia2(Point p1, Point p2) {
		double distance = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
		return distance;
	}
	
	public static void main(String[] args) {
		
		Point p1 = new Point(0,0);
		Point p2 = new Point(10,10);
		//p1 = null;
		Rectangle caja1 = new Rectangle(0, 0, 10, 20);		//x e y es el origen del rectangulo
		Rectangle caja2 = new Rectangle(5, 5, 10, 10);
		Rectangle caja3 = new Rectangle(0, 0, 100, 200);
		Rectangle caja4 = caja3; //ALIASING
		System.out.println(perimetroRect(caja1));
		System.out.println(calcularColision(caja1, caja2));
		System.out.println("X "+caja3.x+" Y: "+caja3.y+" Ancho caja 3: "+caja3.width+" Alto caja 3: "+ caja3.height);
		caja3.grow(100, 100);
		System.out.println("X "+caja4.x+" Y: "+caja4.y+" Ancho caja 4: "+caja4.width+" Alto caja 4: "+ caja3.height);
		System.out.println(caja3.equals(caja4));
		System.out.println(calcularCentro(caja1));
		System.out.println(distancia(p1, p2));
		System.out.println(distancia2(p1, p2));
	}

}
