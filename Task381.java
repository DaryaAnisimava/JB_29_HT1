package by.epam.les02.main;


public class Task381 {
	//Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
	public static void main(String[] args) {
		int k, b;
		int x, y;
		x = -4;
		k = 1;
		b = 4;
		y = k * x + b;
		if (((x <= 0) && (x>=-4) && (y >= x + 4)) || ((x >= 0) && (x <= 4) && (y <= x - 4))) {
			System.out.println("true");
		} else {
			System.out.println("false");
			
		};

	
		
		
	}

}
