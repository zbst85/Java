package zbarashchuk.a;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2;i<=100;i++) {
			if (i==2||i==3||i==5||i==7) {
				System.out.print(i+" ");
			}
			if(i%2==0||i%3==0||i%5==0||i%7==0) {
				
			}else {
				System.out.print(i+" ");
			}
		}
		
	}

}
