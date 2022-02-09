package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double xa = 0;
		double ya = 0;
		double xb = 4;
		double yb = 4;
		double xc = 6;
		double yc = 1;
		double xd;
		double yd;
		System.out.println("Введите координату Х");
		xd = sc.nextDouble();
		System.out.println("Введите координату Y");
		yd = sc.nextDouble();
		if((((xd - xa)*(yb-ya)-(yd-ya)*(xb-xa))*((xc - xa)*(yb-ya)-(yc-ya)*(xb-xa)))>=0&&
		   (((xd - xb)*(yc-yb)-(yd-yb)*(xc-xb))*((xa - xb)*(yc-yb)-(ya-yb)*(xc-xb)))>=0&&
		   (((xd - xc)*(ya-yc)-(yd-yc)*(xa-xc))*((xb - xc)*(ya-yc)-(yb-yc)*(xa-xc)))>=0	) {
			System.out.println("Точка с координатами ("+xd+";"+yd+") находится в треугольнике");
		}else {
			System.out.println("Точка с координатами ("+xd+";"+yd+")НЕ находится в треугольнике");
		}
	}

}
