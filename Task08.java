package by.epam.les02.main;

public class Task08 {
	// Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2
	public static void main(String[] args) {
	double a = 8;
	double b = 4.4;
	double c = 1;
	double rez;
	
	rez = (b + Math.sqrt(b * b + 4 * a * c) ) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
	System.out.printf("rez = %.2f", rez);
	
	}

}
