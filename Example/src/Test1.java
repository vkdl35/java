import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 [���빮��]

			����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ����Ͻÿ�.
			ù��° ���ڰ��� �Է��ϼ���.
			�ι�° ���ڰ��� �Է��ϼ���.
			
			ù��° ���ڰ� * �ι�° ���ڰ� �� ���� ����� ����ϼ���.
			��, �ش� ������� 100 ������ ��� 
			��� �޼��� "100������ ������Դϴ�." ��� �����Ͻð�
			100 �̻��� ��� "�ش簪�� 100�̻� ����� �Դϴ�." ��� ����մϴ�.
		 */
		
		
		Scanner h = new Scanner(System.in);
		System.out.println("ù��° ���ڰ��� �Է��ϼ���.");
		short num1 = h.nextShort();
		
		Scanner i = new Scanner(System.in);
		System.out.println("�ι�° ���ڰ��� �Է��ϼ���.");
		short num2 = i.nextShort();
		
		// short num3 = (num1*num2);
		
		if((num1*num2) <= 100) {
			System.out.println("100������ ������Դϴ�.");
		}
		else if((num1*num2) > 100) {
			System.out.println("�ش簪�� 100�̻� ����� �Դϴ�.");
		}
			
		h.close();
		i.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
