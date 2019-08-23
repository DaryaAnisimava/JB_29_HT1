package by.epam.les02.main;

public class Task16 {
	//Найти произведение цифр заданного четырехзначного числа
	public static void main(String[] args) {
		int a, b, c, d, m, n, l, p;
		a = 1234;
		m = (int)Math.IEEEremainder(a, 10);
		b = (int)a / 1000;
		c = (int)a /10;
		n = (int)Math.IEEEremainder(c, 10);
		l = (int)c/10;
		d = (int)Math.IEEEremainder(l, 10);
		p = (int)m * n * b * d;
		System.out.println("произведение цифр =" + p);
	}

}
