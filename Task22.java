package by.epam.les02.main;

public class Task22 {
	//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
	
	public static void main(String[] args) {
		double t, ts, th, tm, t1;
		t = 8586.00;
		th = (int) t / 60/ 60;
		t1 = Math.IEEEremainder(t, 3600);
		tm = (int) t1 / 60;
		ts =  Math.IEEEremainder(t1, 60);
		System.out.print(th + "ч " + tm + "мин " + ts + "с");
	
		
	
		
	
	}
}