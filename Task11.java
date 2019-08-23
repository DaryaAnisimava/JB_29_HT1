package by.epam.les02.main;

public class Task11 {
	//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
	public static void main(String[] args){
		double a, b, c, p, s;
		a = 10.97;
		b = 12.04;
		c = Math.sqrt(a * a + b * b);
		p = a + b + c;
		s = 0.5 * a  * b;
		System.out.printf("p = %.2f; s = %.2f", p, s);		
		
		
	}

}
