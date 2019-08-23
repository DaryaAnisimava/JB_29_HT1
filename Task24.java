package by.epam.les02.main;

public class Task24 {
	//Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
	public static void main(String[] args) {
		double a, b, z, z1, s;
		a = 12.75;
		b = 6.89;
		z = 35.78;
		z1 = Math.toRadians(z);
		s = 0.5 * (a  *  a - b * b) * Math.tan(z1);
		System.out.printf("s = %.2f", s);
		
	}

}
