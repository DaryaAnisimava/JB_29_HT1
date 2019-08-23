package by.epam.les02.main;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;



public class Task17 {
	//Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
	public static void main(String[] args) {
		double a, b, g, c;
		a = 4.55;
		b = 7.89;
		c = (pow(a,3) + pow(b,3))/2;
		g = sqrt(abs(a) * abs(b));
		System.out.printf("среднее арифметическое кубов = %.2f; среднее геометрическое модулей = %.2f", c, g);
		
	}

}
