package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("¬ведите нечетное число");
		n = sc.nextInt();
		for(int i=1;i<n;i+=2) {
			if (i==1||i==n) {
				for(int j=1;j<n;j++) {
				System.out.print("*");}
			}
			if (i>1||i<n) {
				for(int j=i;j<n-i;j+=2) {
					System.out.print("*");
				}
					
			}
						
			System.out.println();
		}
	}

}
