package zbarashchuk.a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0.5;
		double b = 0.6;
		double c = 0.7;
		double p= (a+b+c)/2;
		double s;
		s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Площадь треугольника  = "+s);
		
	}

}
