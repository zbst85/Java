package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("¬ведие количество полос");
		num = sc.nextInt();
		for (int i =1; i<=5;i++) {
			for (int j=1;j<=num;j++) {
				if(j%2==0) {
					System.out.print("+++");
				}else{
					System.out.print("***");
				}
			}
			System.out.println();
		}
	}

}
