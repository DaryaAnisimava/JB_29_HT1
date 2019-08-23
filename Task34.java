package by.epam.les02.main;

public class Task34 {
	//Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации
	public static void main(String[] args) {
		long a; 
		double a1, a2;
		a = 580576808;
		a1 = a / 1024;
		a2 = a / 1024 /1024;
		System.out.printf("kB %.2f; MB %.2f", a1, a2);
		
		
		
		
	}
}
