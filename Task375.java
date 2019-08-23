package by.epam.les02.main;

public class Task375 {
	//Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа
	public static void main(String[] args) {
		int n = 123;
		int a, b, c, d;
		a = n % 10;
		b = n/100;
		c = a/10 % 10;
		d = a + b + c; 
		if ((n * n) == (Math.pow(d,3))){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
				
	}
}
