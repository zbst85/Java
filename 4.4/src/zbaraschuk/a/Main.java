package zbaraschuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l;
		int h;
		System.out.println("¬ведите ширину пр€моугольника");
		l= sc.nextInt();
		System.out.println("¬ведите высоту пр€моугольника");
		h = sc.nextInt();
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
