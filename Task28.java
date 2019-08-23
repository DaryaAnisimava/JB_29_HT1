package by.epam.les02.main;

public class Task28 {
	//Составить программу перевода радианной меры угла в градусы, минуты и секунды.
	public static void main(String[] args) {
		double r, rg;
		r = 3.48;
		rg = Math.toDegrees(r);
		int g = (int) rg;
        double min = (rg * 60) % 60;
        int m = (int) min;
        int sec = (int) (min * 60) % 60;
        System.out.println(r + "(радиан)" + "=" + g + "(градусов)" + "=" + m + "(минут)" + "=" + sec + "(секунд)");
	}

}
