import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		/*
		 * Scanner�� �Բ� while������ ����ڰ� �Է��ϴ�
		 * ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�.
		 */
		
		Scanner a = new Scanner(System.in);
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���.");
		int b = a.nextInt();
		
		int c = 1; 
		int d;
		while(c < 10) {
			d = b * c;
			System.out.print(d + " ");
			c++;
		}
	
		a.close();
		
		
		
		
		

	}

}
