package by.epam.les02.main;

public class Task12 {
	//Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
	public static void main(String[] args) {
		double x1, x2, y1, y2;
		double a, b, d;
		x1 = -2.3;
		x2 = 8.5;
		y1 = 4;
		y2 = 0.7;
		a = x2 - x1;
		b = y2 -y1;
		d = Math.sqrt(a * a + b * b);
		System.out.printf("d = %.2f", d);
		
		
	}

}
