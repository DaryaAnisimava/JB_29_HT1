package by.epam.les02.main;

public class Task18 {
	//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
	public static void main(String[] args) {
		double a, sg, spp, v;
		a = 5.85;
		sg = a * a;
		spp = 6 * sg;
		v = Math.pow(a, 3);
		System.out.printf("площадь грани = %.2f; площадь полной поверхности = %.2f; объем куба = %.2f", sg, spp, v);
	}

}
