import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {

		/*
		  [���빮��]
		  �� 2���� ������ �ϰ� �˴ϴ�.
		  ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� scanner�� �����Ͻÿ�.
		 */
		Scanner ca = new Scanner(System.in);
		
		int a=1;
		int c=0;
		while(a<3) {
			System.out.println(a+"��° ���ڸ� �Է����ּ���.");
			int b=ca.nextInt();
			c+=b;
			a++;
		}
		System.out.println("�հ� "+c);
		ca.close();

	}

}
