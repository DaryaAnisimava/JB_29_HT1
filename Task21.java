package by.epam.les02.main;

public class Task21 {
	public static void main(String[] args) {
		//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.
		double n, y, z;
		double x;
		n = 123.456;
		x = (int)n;
		y = (Math.IEEEremainder(n, 1));
		
		z = y * 1000 + x / 1000;
		
		System.out.printf("z = %.3f", z);
		
	}

}
