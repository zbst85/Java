package zbarashchuk.a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("¬ведите размер массива");
		n = sc.nextInt();
		int []array = new int[n];		
		for (int i = 0; i < array.length; i++) {
			System.out.println("¬ведите "+(i+1)+" элемент массива");
			array[i]=sc.nextInt();
		}		
		System.out.println(Arrays.toString(array));
		
	}

}
