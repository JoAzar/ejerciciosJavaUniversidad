import java.awt.*;

public class Objetos {

	
	static void avanzarHasta(Rectangle caja, int desde, int hasta) {
		for(; desde <= hasta; desde++) {
			caja.x = desde;
			System.out.println(caja);
		}
	}
	
	static void bajarHasta(Rectangle caja, int desde, int hasta) {
		for(; desde <= hasta; desde++) {
			caja.y = desde;
			System.out.println(caja);
		}
	}
	
	static void retrocederHasta(Rectangle caja, int desde, int hasta) {
		for(; desde >= hasta; desde--) {
			caja.x = desde;
			System.out.println(caja);
		}
	}
	
	static void subirHasta(Rectangle caja, int desde, int hasta) {
		for(;desde >= hasta; desde--) {
			caja.y = desde;
			System.out.println(caja);
		}
	}
	
	static void mover(Rectangle caja, int dx, int dy) {
		caja.x = caja.x + dx;
		caja.y = caja.y + dy;
	}
	
	public static double distancia2(Point p1, Point p2) {
		int dx = p1.x - p2.x;
		int dy = p1.y - p2.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	static double diagonal(Rectangle caja) {
		Point x = new Point(caja.x, caja.y);
		Point y = new Point(caja.height, caja.width);
		return distancia2(x, y);
	}
	
	
	public static void main(String[] args) {
		Point p1 = new Point(0,0);
		Point p2 = new Point(10,10);
		Rectangle caja1 = new Rectangle(0, 0, 10, 10);
		Rectangle caja2 = new Rectangle(100, 100, 100, 100);
		//mover(caja1, 10, 10);
		//System.out.println(caja1);
		//int hasta = 120;
		//avanzarHasta(caja1, caja1.x, hasta);
		//bajarHasta(caja1, caja1.y, hasta);
		System.out.println(diagonal(caja1));
		System.out.println(distancia2(p1, p2));

	}

}
