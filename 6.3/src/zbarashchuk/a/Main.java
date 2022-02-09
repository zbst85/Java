package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("¬ведите высоту пр€моугольника");
		a = sc.nextInt();
		System.out.println("¬ведите ширину пр€моугольника");
		b = sc.nextInt();
		drawRectangle(b, a);


	}
	
	public static void drawRectangle(int l, int h) {
		for (int i = 1;i<=h;i++) {
			for(int j=1;j<=l;j++) {
				if(i==1||i==h||j==1||j==l) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
