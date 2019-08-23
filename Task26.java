package by.epam.les02.main;

public class Task26 {
	//Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
	public static void main(String[] args) {
		double a, b, z, z1, s;
		a = 3.45;
		b = 9;
		z = 41.3;
		z1 = Math.toRadians(z);
		s = 0.5 * a * b * Math.sin(z1);
		System.out.printf("s = %.2f", s);
	}

}
