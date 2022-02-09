package zbarashchuk.a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {0,5,2,4,7,1,3,19};
		int count=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2!=0) {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
