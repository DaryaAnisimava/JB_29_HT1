package by.epam.les02.main;

public class Task31 {
	
	//Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.
	public static void main(String[] args) {
		double v, v1, t1, t2, s;
		v = 36.7;
		v1 = 3.45;
		t1 = 3.2;
		t2 = 5.3;
		s = (v-v1) * t2 + v * t1;
		System.out.printf("s= %.2f км", s);
		}

}
