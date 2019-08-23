package by.epam.les02.main;

public class Task25 {
	//Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
	public static void main(String[] args) {
		double a, b, c, d, x1, x2;
		a = 5;
		b = 9.54;
		c = 1.4;
		d = b * b - 4 * a * c;
		x1 = (- b + Math.sqrt(d))/ (2 * a);
		x2 = (- b - Math.sqrt(d))/ (2 * a);
		System.out.print("x1 =" + x1 + " x2=" + x2);
	}

}
