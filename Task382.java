package by.epam.les02.main;

public class Task382 {
	//Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
		public static void main(String[] args) {
			//int k, b;
			int x, y;
			x = -5;
			y = -3;
		
			if (((x <= 2) && (x>=-2) && (y >= 0)) && (y <= 3) || ((x >= -4) && (x <= 4) && (y <= 0) && (y >= -3))) {
				System.out.println("true");
			} else {
				System.out.println("false");
				
			};

		}
		
}

