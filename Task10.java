package by.epam.les02.main;
public class Task10 {
	//Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦∗𝑡𝑔 𝑥𝑦
	public static void main(String[] args) {
		double x, y, rez;
		double a, b, c, d , f;
		x = 37.5;
		y = 35.8;
		a = Math.toRadians(x);
		b = Math.toRadians(y);
		c = Math.toRadians(x * y);
		d = Math.sin(a) + Math.cos(b);
		f = Math.cos(a) + Math.sin(b);
		
		rez =d / f * Math.tan(c);
		System.out.printf("rez = %.2f", rez);
	}	
}
