package by.epam.les02.main;

public class Task19 {
	//Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
	public static void main(String[] args) {
		double a, h, s, r, R;
		a = 2.95;
		s = a * a * Math.sqrt(3) / 4;
		h = 2 * s / a;
		r = a * Math.sqrt(3) / 6;
		R = a * Math.sqrt(3) / 3;
		System.out.printf("s = %.2f; h = %.2f; r = %.2f; R = %.2f", s, h, r, R);
		
	}

}
