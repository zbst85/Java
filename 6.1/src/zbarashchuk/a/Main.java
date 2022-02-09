package zbarashchuk.a;

public class Main {

	public static void main(String[] args) {
		
		int [] arr = {2,3,6,9,91,1,12};
		System.out.println(maxNumber(arr));
		
	}
	
	public static int maxNumber(int []arr) {
		int max =0;
		for (int i : arr) {
			if (i>max) {
				max=i;
			}
		}
		return max;
	}

}
