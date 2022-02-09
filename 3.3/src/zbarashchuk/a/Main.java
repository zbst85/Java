package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int year;
		System.out.println("Введите год");
		year = sc.nextInt();
			
		
		if (year%4!=0) {System.out.println(year+" обычный год");}
		else if(year%100==0&&year%400!=0) {System.out.println(year+" обычный год");}
		else {System.out.println(year+" Высокосный год");}
		
	}

}
