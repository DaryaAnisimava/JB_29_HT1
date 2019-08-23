package by.epam.les02.main;

public class Task378 {
	//Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4)
	public static void main(String[] args) {
		int a, b;
		int N = 2;
		a = 2;
		b = 1;
		if ((Math.pow(a, b) == N) && (b >=0) && (b<=4)){
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}
		
	    
		
	}
}
