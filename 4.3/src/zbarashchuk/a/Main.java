package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("ВВедите на какую цифру нужна таблица умножения");
		n = sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}
