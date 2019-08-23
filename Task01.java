package by.epam.les02.main;

public class Task01 {
	//Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
	public static void main(String[] args) {
		double x, y, sum, raz, pr, ch ;
	
		x = 1.3;
		y = 0.7;
		
		sum = x + y;
		raz = x - y;
		pr = (x * y);
		ch = (x / y); 

		System.out.printf("сумма = %.2f разность = %.2f  произведение = %.2f частное = %.2f", sum, raz, pr, ch);

	}
}
