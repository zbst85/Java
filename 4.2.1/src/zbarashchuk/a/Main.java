package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h;
		System.out.println("¬ведите высоту фигуры");
		h=sc.nextInt();
		for (int i = 1;i<=h;i++) {
			if(i<i+1) {
				System.out.print("*");
		
			}
			System.out.println();
			}
	}

}
