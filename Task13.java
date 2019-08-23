package by.epam.les02.main;

public class Task13 {
	// Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
	public static void main(String[] args) {
		double x1, x2, x3;
		double y1, y2, y3;
		double d1, d2, d3;
		double p, p1, s;
		x1 = 2.5;
		x2 = 4;
		x3 = 8.21;
		y1 = 3.45;
		y2 = 6.77;
		y3 = 3.45;
		
		d1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		d2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		d3 = Math.sqrt((x1 - x3) * (x1 - x3) + (y3 - y1) * (y3 - y1));
		p = d1 + d2 + d3;
		p1 = p / 2;
		s = Math.sqrt(p1 * (p1 - d1) * (p1 - d2) * (p1 - d3));
		System.out.printf("p = %.2f; s = %.2f", p, s);
		
	}

}
