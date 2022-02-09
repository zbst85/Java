package zbarashchuk.a;

public class Main {

	public static void main(String[] args) {
		
		String str = "Hello";
		int a= 3;
		double x = 5.4;
		System.out.println(concatString(str, a, x));
		

	}
	
	public static String concatString(String s, int a, double b) {
		String sumstr;
		sumstr = s+(a+b);
		return sumstr;
	}

}
