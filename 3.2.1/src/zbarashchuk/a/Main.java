package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r=4;
		double x;
		double y;
		System.out.println("Введите координату Х");
		x = sc.nextDouble();
		System.out.println("Введите координату Y");
		y = sc.nextDouble();
		if ((x*x+y*y)<=(r*r)) {
			System.out.println("Точка с координатами ("+x+";"+y+") находится в окружности");
		}else {
			System.out.println("Точка с координатами ("+x+";"+y+") находится за пределами окружности");
		}
	}

}
