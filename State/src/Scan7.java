import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		//���ڿ� ���� ���� �� ��ĳ�� ����
		/*
		[������ȣ �߼ۿ� ���� ��ȣ �� �ڵ�]
		Q. �������� ��ȣ�� �Է��ϼ���.
		
		���� 220524
		
		����ڰ� ���� 220524 �ܿ� �Է½� 
		"������ȣ�� Ʋ���ϴ�." ��� ����ϰ�,
		������ ������ȣ ���ڸ� �Է½� 
		"���� Ȯ�� �Ǽ̽��ϴ�." ��� �Է��մϴ�.
		
		��, 220524�� java ����� ���� ���� ����Ǵ� ������ ó���ϼ���.
		*/
		
		int sc = 220524;
		
		Scanner a = new Scanner(System.in);
		System.out.println("Q. �������� ��ȣ�� �Է��ϼ���.");
		
		int b = a.nextInt();
		
		if(b==sc) {
			System.out.println("����Ȯ�� �Ǽ̽��ϴ�.");
		}
		else {
			System.out.println("������ȣ�� Ʋ���ϴ�.");
		}
		
		a.close();
		
		
		// == : =
		// != : not

	}

}
