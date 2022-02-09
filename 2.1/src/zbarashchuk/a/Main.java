package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int number;
		
		System.out.println("¬ведите 5ти значное число и нажмите Enter");
		number = sc.nextInt();
		int a = number/10000;
		int b = number%10000/1000;
		int c = number%1000/100;
		int d = number%100/10;
		int e = number%10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
