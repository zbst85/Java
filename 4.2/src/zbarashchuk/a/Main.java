package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int f=1;
		System.out.println("������� ����� �� 4 �� 16");
		num = sc.nextInt();
		while (num<=4||num>=16) {
			System.out.println("�� ����� ������������ �����. ��������� ����");
			num = sc.nextInt();
		}
		for (int i=num;i>0;i--) {
			f=f*i;
		}
		System.out.println(num+"! = "+f);
	}

}
