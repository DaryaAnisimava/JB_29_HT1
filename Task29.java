package by.epam.les02.main;

public class Task29 {
	//Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
	public static void main(String[] args) {
		double a, b, c;
		double x, y, z;
		a = 3.45;
		b = 7.43;
		c = 5;
		x = Math.acos((a * a + c * c - b * b) / (2 * a * c));
		y = Math.acos((a * a + b * b - c * c) / (2 * a * b));
		z = Math.acos((b * b + c * c - a * a)/ (2 * c * b));
		System.out.println("alpha="+x);
		System.out.println("beta="+y);
		System.out.println("gamma="+z);
		
	}
}
