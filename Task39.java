package by.epam.les02.main;

public class Task39 {
	//Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения, сложения и вычитания, вычислите за минимальное число операций:
	//2x4 - 3х3 + 4х2 - 5х + 6.
	public static void main(String[] args) {
		double x, a;
		x = 2;
		a = 6 + x *(-5 + x * (4 - x * (3 - 2 * x)));
		System.out.println(a);
	}
}
