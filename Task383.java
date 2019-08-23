package by.epam.les02.main;

public class Task383 {
	//Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
			public static void main(String[] args) {
				int x, y;
				int r1, r2;
				x = 1;
				y = 1;
				r1 = 4;
				r2 = 5;
if (((x>=0) && (x<=4) && (y>=0) && (x * x + y * y <=r1 * r1)) || ((x>=0) && (x<=5) && (y<=0) && (x * x + y * y <=r2 * r2))) {

					System.out.println("true");
				} else {
					System.out.println("false");
					
				};

			}
			
}
