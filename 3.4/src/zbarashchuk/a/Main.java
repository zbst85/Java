package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.println("������� ������ ������� �");
		a = sc.nextDouble();
		System.out.println("������� ������ ������� B");
		b = sc.nextDouble();
		System.out.println("������� ������ ������� C");
		c = sc.nextDouble();
		if(a+b>=c && a+c>=b && b+c>=a) {
			System.out.println("����������� ��� ����������");
		}else {
			System.out.println("����������� ��� �� ����������");
		}
		
	}

}
