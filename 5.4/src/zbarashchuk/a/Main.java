package zbarashchuk.a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String s;
		System.out.println("Введите строку");
		s = sc.nextLine();
		char [] array = s.toCharArray();
		System.out.println(Arrays.toString(array));
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]=='b') {
				count++;
			}
		}
		System.out.println("В тексте " +count+" символов 'b' " );
	}

}
