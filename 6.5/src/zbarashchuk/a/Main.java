package zbarashchuk.a;

public class Main {

	public static void main(String[] args) {
		
		String str = "London is a capital of GB";
		System.out.println("� ��������� ������ "+countWord(str)+" ����");

	}
	
	public static int countWord(String str) {
		String[] tmp = str.split("[\s]");
		int count = tmp.length;
		return count;
		
		
	}

}
