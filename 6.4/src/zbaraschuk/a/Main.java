package zbaraschuk.a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {1,2,3,4,56,3,11};
		int a = 3;
		System.out.println(findNumbInd(arr, a));
		
	}
	
	public static int findNumbInd (int [] arr, int num ) {
		int ind =-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==num) {
				ind=i;
				break;
			}
		}
		
		return ind;
	}

}
