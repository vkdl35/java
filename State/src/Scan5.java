import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		
		/*
		byte a = 10;
		if(a < 10) {
			System.out.println("�Է��� ���� 10�̻� ���ڸ� �Է��ϼ���.");
		}
		else if(a >= 10 || a <= 22 ) {	//���ǹ��� ������ �����Ͽ� ������
			System.out.println("��÷�Դϴ�.");
		}
		else {
			System.out.println("���� ���� �����Դϴ�.");
		}
		*/
		
		/*
		 [���빮��]
		 Q. 1~45���� ���� �ϳ��� �Է��ϼ���.
		 
		 error����
		 0�� �Է� : �����Է��� �߸� �Ǿ����ϴ�.
		 45���� ū ���ڸ� �Է� : ���ڴ� 1~45������ �Է� �����մϴ�.
		 
		 1~45���ڸ� �Է��Ͽ��� ���
		 7, 12, 14 ������ ���� �Է½� ��÷�Դϴ�. ��� ���
		 �� �ܿ� ���ڽ� ���� ��ȸ�� �����ϼ���. ��� ��� 
		 */
		
		Scanner a1 = new Scanner(System.in);
		
		System.out.println("Q. 1~45���� ���� �ϳ��� �Է��ϼ���.");
		
		int a2 = a1.nextInt(); //����� �Է� �κ� ��
		
		/* int z = 7, 12, 14; */
		if(a2 == 0) {
			System.out.println("���� �Է��� �߸� �Ǿ����ϴ�.");
		}
		else if(a2 > 45) {
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
		}
		else {
			if(a2==41) {
				System.out.println("��÷�Դϴ�.");
			}
			else if(a2==41) {
				System.out.println("50�� ��Ʈ ���� ��÷�Դϴ�.");
			}
			else {
				System.out.println("���� ��ȸ��...");
			}
		}
		
		a1.close();
		
		
		
		
		/*
		if(a2==7 || a2==12 || a2==14) {
			System.out.println("��÷�Դϴ�.");
		}
		else {
			System.out.println("���� ��ȸ�� �����ϼ���.");

			if(a2 == 0) {
				System.out.println("���� �Է��� �߸� �Ǿ����ϴ�.");
			}
			else if(a2 > 45) {
				System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
			}
		}
		*/
		
		
			
		
		
		
		
		
			
		
		


	}

}
