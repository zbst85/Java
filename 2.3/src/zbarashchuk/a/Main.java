package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double r;
		double p;
		System.out.println("ВВедите радиус окружности - ");
		r=sc.nextDouble();
		p=2*Math.PI*r;
		System.out.println("Длина окружности = "+p);
	}

}
