package zbatashchuk.a;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = new int [15];
		
		for (int i = 0; i < array1.length; i++) {
			array1[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(array1));
		int [] array2 = Arrays.copyOf(array1, (array1.length*2));
		for (int i = 15; i < array2.length; i++) {
			array2[i]=array2[i-15]*2;
			}
		System.out.println(Arrays.toString(array2));
	}

}
