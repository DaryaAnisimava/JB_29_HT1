package by.epam.les02.main;

public class Task27 {
	//Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три операции и а10 за четыре операции.
	public static void main(String[] args) {
		double a, a1, a2, a3, a4;
		a = 2;
		a1 = a * a;
		a2 = a1 * a1;
		a3 = a2 * a2;
		a4 = a3 * a3;
		System.out.println("a в 8 степени =" +a3);
		System.out.println("а в 10 степени =" +a4);
		
	}

}
