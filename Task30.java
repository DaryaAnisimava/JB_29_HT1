package by.epam.les02.main;

public class Task30 {
	//Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.
 public static void main(String[] args) {
	 double r1, r2, r3, r;
	 r1 = 3;
	 r2 = 4.5;
	 r3 = 5.65;
	 r = 1 / (1 / r1 + 1 / r2 + 1 / r3);
	 System.out.printf("сопротивление соединения = %.2f", r);
			 
 }

}
