package zbarashchuk.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a;
		int p;
		int e;
		System.out.println("Введите номер квартиры (от 1 до 144)-");
		a = sc.nextInt();
		if (a<=0||a>144) {
			System.out.println("В данном доме нет такой квартиры");
		}
		if(a>=1&&a<=36) {
			p=1;
			if((a/4!=0)&&(a%4==0)) {
				e = a/4;
				System.out.println("Квартира находится в "+p+" подъезде на "+e+" этаже");
			}
			if((a%4!=0)) {
				e = a/4+1;
				System.out.println("Квартира находится в "+p+" подъезде на "+e+" этаже");
			}
		}
		if(a>=37&&a<=72) {
			p=2;
			if((a/4!=0)&&(a%4==0)) {
				e = (a-36)/4;
				System.out.println("Квартира находится в "+p+" подъезде на "+e+" этаже");
			}
			if((a%4!=0)) {
				e = (a-36)/4+1;
				System.out.println("Квартира находится в "+p+" подъезде на "+e+" этаже");
			}
		}
		if(a>=73&&a<=108) {
			p=3;
			if((a/4!=0)&&(a%4==0)) {
				e = (a-72)/4;
				System.out.println("Квартира находится в "+p+" подъезде на "+e+" этаже");
			}
			if((a%4!=0)) {
				e = (a-72)/4+1;
				System.out.println("Квартира находится в "+p+" подъезде на "+e+" этаже");
			}
		}
		if(a>=109&&a<=144) {
			p=4;
			if((a/4!=0)&&(a%4==0)) {
				e = (a-108)/4;
				System.out.println("Квартира находится в "+p+" подъезде на "+e+" этаже");
			}
			if((a%4!=0)) {
				e = (a-108)/4+1;
				System.out.println("Квартира находится в "+p+" подъезде на "+e+" этаже");
			}
		}
		
	}

}
