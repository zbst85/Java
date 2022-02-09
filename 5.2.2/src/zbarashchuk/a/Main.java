package zbarashchuk.a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("input array length");
		n = sc.nextInt();
		int [] array = new int[n] ;
		for (int i = 0; i < n; i++) {
			array[i]=(int)(Math.random()*10);
			}
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i <array.length/2; i++) {
			int tm = 0;
			tm = array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=tm;
		}
		System.out.println(Arrays.toString(array));
		
	}

}
