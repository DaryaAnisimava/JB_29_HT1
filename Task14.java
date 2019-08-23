package by.epam.les02.main;
import static java.lang.Math.PI;

public class Task14 {
	//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
	public static void main(String[] args) {
		double r, l, s;
		r = 3.09;
		l = 2 * PI * r;
		s = PI * r * r;
		System.out.printf("l = %.2f; s = %.2f", l, s);
	}

}
