package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r=4;
		double x;
		double y;
		System.out.println("������� ���������� �");
		x = sc.nextDouble();
		System.out.println("������� ���������� Y");
		y = sc.nextDouble();
		if ((x*x+y*y)<=(r*r)) {
			System.out.println("����� � ������������ ("+x+";"+y+") ��������� � ����������");
		}else {
			System.out.println("����� � ������������ ("+x+";"+y+") ��������� �� ��������� ����������");
		}
	}

}
