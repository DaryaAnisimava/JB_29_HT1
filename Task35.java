package by.epam.les02.main;

public class Task35 {
	//Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N
	public static void main(String[] args) {
	 int m, n;
	 m = 100;
	 n = 8;
	 int c = (int)(m / n)%10;
	 float d = (10 * (m -n * (int)(m / n)))/n;
	System.out.println("младшая цифра целой части =" + c);
	System.out.println("старшая цифра дробной части =" + d);
	 
 }
}
