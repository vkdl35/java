import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		
		/*
		 * ���� �ش� ������ Ȯ�� �� �ڵ带 �ۼ��Ͻÿ�.
		 * Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���?
		 * 
		 * ������� : ¦��, Ȧ�� ���Դϴ�. ��� ���*/
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���?");
		int b = a.nextInt();
		//int b = a.nextInt() % 2;
		int c = b % 2;
		// %�� ���� �����鼭 ���������� Ȯ���ϴ� ���ı�
		if(c==0) {
			System.out.println("¦���Դϴ�.");
		}
		//if(c % 2 == 0) { System.out.println("¦���Դϴ�."); }
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		a.close();
		
		

	}

}
