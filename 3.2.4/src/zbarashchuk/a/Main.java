package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Введите 6ти значное число");
		num = sc.nextInt();
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		a = num/100000;
		b = num%100000/10000;
		c = num%10000/1000;
		d = num%1000/100;
		e = num%100/10;
		f = num%10;
		if(a==f&&b==e&&c==d) {
			System.out.println("Палиндром");
		}else {
			System.out.println("НЕ палиндром, пробуйте еще!");
		}
	}

}
