package by.epam.les02.main;

public class Task32 {
	//Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?
	public static void main(String[] args) {
		int k, k1, k2, n, n1, n2, m, m1, m2, p, q, r, d, n0, k0;
		k = 56;
		n = 23;
		m = 6;
		p = 50;
		q = 100;
		r = 10;
		m1 = m + p;
		n1 = n + q;
		k1 = k + r;
		if (k1 > 59){
			k0 = (int)Math.floorDiv(k1, 60);
			n1 = n + q +k0;
			k2 = (int)k1%60;
			System.out.println(k2 + " c");
		} else {
			System.out.println(k1 + " мин");
		}
		if (n1> 59){
			n0 = (int)Math.floorDiv(n1, 60);
			m1 = m + p + n0;
			n2 = (int)n1%60;
			System.out.println(n2 + " мин");
			
		} else {
			System.out.println(n1 + " мин");
		}
	
        if (m1 > 23) {
			m2 = (int)m1%24;
			d = (int)Math.floorDiv(m1, 24);
			
			System.out.println(m2 + " ч");
			System.out.println(d + " д");
			
			} 
		else {
			System.out.println(m1 + " ч");
		}
	
	
		
		}
		
	
	}

