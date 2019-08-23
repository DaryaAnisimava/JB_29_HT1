package by.epam.les02.main;

public class Task06 {
	//Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
	public static void main(String[] args) {
	int n, m;
	double r;
	n = 8;
	m = 5;

	r = (80 / n + 12) * m;
	System.out.printf("в большом бидоне = %.2f л", r);
	
}
}
