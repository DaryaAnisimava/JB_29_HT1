package by.epam.les02.main;

public class Task377 {
	//Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре
	public static void main(String[] args) {
		int n = 224;
		int a, b, c;
		a = n % 10;
		b = n/100;
		c = n % 100/10;
		if (((a + b) == c) || ((a + c) == b) || ((b + c) == a)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
		
		
	}	
}
