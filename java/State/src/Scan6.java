import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		//��ĳ�� �ҷ��� ���� ���, �׸��� ����� �Է»���(������)
		Scanner mid = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���.");		//alt + ����Ű ��, �Ʒ� 
		String m = mid.next();		//�����  ���̵� �Է�
		
		Scanner mpass = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���.");
		String p = mpass.next();
		
		if(m.equals("jung") || m.equals("su")) {
			if(m.equals("jung") && p.equals("j1234")) {
				System.out.println("�α��� �Ǽ̽��ϴ�.");
			}
			else if(m.equals("su") && p.equals("ssh")) {
				System.out.println("�α��� �Ǽ̽��ϴ�.");
			}
			else {
				System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���.");
			}			
		}
		else {
			System.out.println("���Ե��� ���� ����� �Դϴ�.");
		}
		//�������� == ��� �Ұ�, .equals("") �� ����ؾ���.
		
		
		mid.close();
		mpass.close();
		
		/*
		Scanner mpass = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���.");
		String p = mpass.next();		//����� �н����� �Է�
		*/
		
		//System.out.printf("���̵�%s,�н�����%s",m,p);
		

		
		/*
		 [�α��� ���α׷�]
		 
		 ȸ������ ���̵�� jung, su
		 �н�����
		 jung : j1234
		 su : ssh
		 �ش� ���̵� �ܿ� ������ '���Ե��� ���� ������Դϴ�." ��� ����մϴ�.
		 ����, �н����尡 Ʋ�� ��� "ȸ�������� �ٽ� Ȯ���ϼ���." ��� ����մϴ�.
		 ���̵� �� �н����尡 ��� ���� ��� "�α��� �Ǽ̽��ϴ�." ��� ����ϼ���.
		 */
		
		
		
		
		
		
	}

}
