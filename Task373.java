package by.epam.les02.main;

public class Task373 {
	//Сумма цифр данного трехзначного числа N является четным числом
	public static void main(String[] args){
		int n = 123;
		int a, b,c;
		a = n / 100;
		b = n / 10 % 10;
		c = n % 10;
		
		if((a + b + c) % 2 == 0){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}