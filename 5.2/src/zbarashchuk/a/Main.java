package zbarashchuk.a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("������� ������ �������");
		n = sc.nextInt();
		int []array = new int[n];		
		for (int i = 0; i < array.length; i++) {
			System.out.println("������� "+(i+1)+" ������� �������");
			array[i]=sc.nextInt();
		}		
		System.out.println(Arrays.toString(array));
		
	}

}
