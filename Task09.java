package by.epam.les02.main;

public class Task09 {
	// Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑎𝑐∗𝑏𝑑−𝑎𝑏−𝑐𝑐𝑑
	public static void main(String[] args) {
		double a, b, c, d;
		double rez;
		a = 3.6565;
		b = 6.98;
		c = -565;
		d = -46.906;
		rez = (a / c) * (b / d) - ((a * b - c) /(c * d));
		System.out.printf( "rez = %.4f", rez);
	}

}
