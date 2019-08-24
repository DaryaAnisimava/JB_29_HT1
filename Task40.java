package by.epam.les02.main;

public class Task40 {
	//Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.
	
	public static void main(String[] args) {
	double x, y1, y2;
	x = 2.5;
	y1=((-4*x+3)*x-2)*x; 
	y2=((4*x+3)*x+2)*x+1; 
	System.out.println(y1);
	System.out.println(y2);
	}
	

}
