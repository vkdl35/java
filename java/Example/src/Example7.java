import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		  [���빮��7] 
		  
		  ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� �����ϴ� ���μ����� �����մϴ�.
		  "ù��° �Է°� ��(1~10����) �Դϴ�."
		  "�ι�° �Է°� ��(1~10����) �Դϴ�."
		  "����° �Է°� ��(1~10����) �Դϴ�."
		  "������ �����Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�."
		  
		  �ش� �����ȣ�� �°� ������� �����Ͽ� �������� ��½�Ű�ÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �Է°� ��, (1~10����)�Դϴ�.");
		int no1 = sc.nextInt();
		System.out.println("�ι�° �Է°� ��, (1~10����)�Դϴ�.");
		int no2 = sc.nextInt();
		System.out.println("����° �Է°� ��, (1~10����)�Դϴ�.");
		int no3 = sc.nextInt();
		System.out.println("������ �����Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�.");
		String ms = sc.next();
		
		if(ms.equals("+")) {
			System.out.println(no1+no2+no3);
		}
		else if(ms.equals("-")) {
			System.out.println(no1-no2-no3);
		}
		else if(ms.equals("*")) {
			System.out.println(no1*no2*no3);
		}
		else {
			System.out.println(no1/no2/no3);	//�Ҽ������� �������� �޴� ������ �ϳ� ��������
		}
		
		sc.close();
		
		

		
		
	}

}
