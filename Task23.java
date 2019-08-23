package by.epam.les02.main;
import static java.lang.Math.PI;
public class Task23 {
	//Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
	public static void main(String[] args) {
		double r, R, s;
		r = 3.86;
		R = 5.90;
		s = PI * (R * R - r * r);
		System.out.printf("S = %.2f", s);
	}

}
