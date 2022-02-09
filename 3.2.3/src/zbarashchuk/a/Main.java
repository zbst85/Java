package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int a;
		int b;
		int c;
		int d;
		System.out.println("Введите номер билета (4х значное число)");
		num=sc.nextInt();
		a = num/1000;
		b = num%1000/100;
		c = num%100/10;
		d = num%10;
		if(a+b==c+d) {
			System.out.println("Счастливый билет!");
		}else {
			System.out.println("Повезет в следующий раз");
		}
	}

}
