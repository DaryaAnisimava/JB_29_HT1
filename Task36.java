package by.epam.les02.main;

public class Task36 {
	//Найти частное произведений четных и нечетных цифр четырехзначного числа
	public static void main(String[] args) {
		int x1;
		int pch, pnc;
		double p;
		pch = 1;
		pnc = 1;
		int x = 1234;
		while (x != 0) {
				
		x1 = x%10;
		
		if (x1%2 == 0) {
			pch = pch * x1;
		}
		
		if (x1%2 != 0) {
			pnc = pnc * x1;
		}
		x = (int)x/10;
		}
		
		p =(double)pch / pnc;

		System.out.println(p);
		}
	}


