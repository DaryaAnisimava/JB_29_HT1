package by.epam.les02.main;


public class Task33 {
	//Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы
	public static void main(String[] args) {
	     
	      char c = '0';
	      int u = (int)c;
	      int v = (int)(u - 1);
		  int w = (int)(u + 1);
	      char r1 = (char)v;
	      char r2 = (char)w;

	     
	     System.out.println("Symbol number = " + u);
	     System.out.println("Previous symbol: " + r1);
	     System.out.println("Next symbol: " + r2);
	   }
}
