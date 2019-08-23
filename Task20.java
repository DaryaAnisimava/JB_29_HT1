package by.epam.les02.main;
import static java.lang.Math.PI;
public class Task20 {
	//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
	public static void main(String[] args) {
		double l, s, r;
		l = 3.91;
		r = l / 2 /PI;
		s = PI * r * r;
		System.out.printf("s = %.2f", s);
		
	}

}
