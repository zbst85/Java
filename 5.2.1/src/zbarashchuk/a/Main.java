package zbarashchuk.a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int [][] array = new int [6][6];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]=j+1;
			}
			}
		for (int[] row:array) {
			System.out.println(Arrays.toString(row));
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("input angle 90 or 180 or 270");
		int r = sc.nextInt();
		switch (r) {
		case 90:
			System.out.println("reverse in 90");
			
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < i; j++) {
					if (i!=j) {
						int tm=0;
						tm = array[i][j];
						array[i][j]=array[j][i];
						array[j][i]=tm;
					}
				}
			}
			break;
		case 180:
			System.out.println("reverse in 180");
			
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length/2; j++) {
					
						int tm=0;
						tm = array[i][j];
						array[i][j]=array[i][array[i].length-1-j];
						array[i][array[i].length-1-j]=tm;
				}
				
			}
			break;
		case 270:
			System.out.println("reverse in 270");
			
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j <array[i].length-j; j++) {
					
						int tm=0;
						tm = array[i][j];
						array[i][j]=array[i][array[i].length-1-j];
						array[i][array[i].length-1-j]=tm;
					
				}
				
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < i; j++) {
					if (i!=j) {
						int tm=0;
						tm = array[i][j];
						array[i][j]=array[j][i];
						array[j][i]=tm;
					}
				}
			}
			break;
		default:
			System.out.println("Enter right angle!");
		}
		
		
				for (int[] row:array) {
					System.out.println(Arrays.toString(row));
				}
				
	}
}
