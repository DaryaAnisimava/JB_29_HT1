package by.epam.les02.main;

public class Task372 {
	//Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр
	public static void main(String[] args){
	
		int n = 5436;
		int a,b,c,d;
		a = n / 1000;
		b = n / 100 % 10;
		c = n % 100 / 10;
		d = n % 1000 % 10;
		if((a + b) == (c + d)){
			System.out.println("true");
		}else
			System.out.println("false");
	}

}
