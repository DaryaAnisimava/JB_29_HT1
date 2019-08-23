package by.epam.les02.main;

public class Task374 {
	//Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п)
	public static void main(String[] args){
		int x, m, n;
		x = 3;
		m = -1;
		n = 6;
		if ((x >= m) && (x <= n)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}	

}
