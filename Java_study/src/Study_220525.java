import java.util.Scanner;

public class Study_220525 {

	public static void main(String[] args) {
		
		//��ĳ�� ���
		
		Scanner aa = new Scanner(System.in);
		
		System.out.println("���̵� �Է��ϼ���.");
		String mid = aa.next();
		System.out.println(mid);
		
		// ��ĳ�ʸ� �̿��� ����� �Է°� ���
		
		System.out.print("����� ���̴�?");
		int age = aa.nextInt();
		System.out.println("�ش� ������� ���̴� " +age+ "�� �Դϴ�.");
		
		//��ĳ�ʸ� ����� ���ǹ�
		
		System.out.println("�Է��Ͻ� �ݾ��� �����ּ���.");
		int money = aa.nextInt();
		
		if(money < 1000) {
			System.out.println("1000�� �̻��� �ݾ��� �Է��ϼž� �մϴ�.");
		}
		else {
			System.out.println("�Ա��� ����˴ϴ�.");
		}
		
		//���ڿ� ������ ��ĳ�� �̿�� equals��� �Լ��� ���
		
		System.out.println("���̵� �Է��ϼ���.");
		String mid2 = aa.next();
		
		if(mid2.equals("max21")) {
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("ȸ���� Ȯ�ε��� �ʽ��ϴ�.");
		}
		
		//��ĳ�� nextLine();
		
		System.out.println("�޸� �Է��ϼ���.");
		String memo = aa.nextLine();
		
		System.out.println(memo);
		
		//printf
		
		String name2 = "lee";
		int age2 = 29;
		
		System.out.printf("%s���� ���̴� %d�Դϴ�.",name2,age2);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = aa.nextInt();
		
		if(num < 10) {
			System.out.println("10�̻� ���ڸ� �Է��ϼ���.");
		}
		else if(num >= 10 && num <= 22) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("���� ���� �����Դϴ�.");
		}
		
		
		/*
		 * [���빮��1] ���� �ش� ������ Ȯ�� �� �ڵ带 �ۼ��Ͻÿ�.
		 * "Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���." ��� �޽��� ��� ��, 
		 * ¦������ Ȧ������ �˷��ִ� �ڵ带 �ۼ��ϼ���.
		 */
		
		System.out.println("Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���.");
		int user = aa.nextInt();
		
		if(user % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		/*
		 * [���빮��2] "Q. 1~45���� ���� �ϳ��� �Է��ϼ���."
		 * error����
		 * 0�� �Է� : ���� �Է��� �߸� �Ǿ����ϴ�.
		 * 45���� ū ���ڸ� �Է� : ���ڴ� 1~45������ �Է� �����մϴ�.
		 * 1~45���ڸ� �Է��Ͽ��� ���
		 * 7, 12, 14 ������ ���� �Է½� ��÷�Դϴ�. ��� ���
		 * �� �ܿ� ���ڽ� "���� ��ȸ�� �����ϼ���." ��� ���
		 */
		
		System.out.println("Q. 1~45���� ���� �ϳ��� �Է��ϼ���.");
		int num2 = aa.nextInt();
		
		
		if (num2 > 0 && num2 <46) {
			if(num2 == 7 || num2 == 12 || num2 == 14) {
				System.out.println("��÷�Դϴ�.");
			}
			else {
				System.out.println("���� ��ȸ�� �����ϼ���.");
			}
		}
		else if(num2 == 0) {
			System.out.println("���� �Է��� �߸� �Ǿ����ϴ�.");
		}

		/*
		 * [���빮��3] �α��� ���α׷�
		 * ȸ������ ���̵�� lee , mini
		 * �н������ min , love1550
		 * �ش� ���̵� �ܿ� ������ '���Ե��� ���� ������Դϴ�." ��� ����մϴ�.
		 * ����, �н����尡 Ʋ�� ��� "ȸ�������� �ٽ� Ȯ���ϼ���." ��� ����մϴ�.
		 * ���̵� �� �н����尡 ��� ���� ��� "�α��� �Ǽ̽��ϴ�." ��� ����ϼ���.
		 * */
		
		System.out.println("������ ���̵� �Է��ϼ���.");
		String userid = aa.next();		
		
		if(userid.equals("lee") || userid.equals("mini")) {
			System.out.println("�н����带 �Է��ϼ���.");
			String userpass = aa.next();
			if(userid.equals("lee") && userpass.equals("min")) {
				System.out.println("�α��� �Ǽ̽��ϴ�");
			}
			else if(userid.equals("mini") && userpass.equals("love1550")) {
				System.out.println("�α��� �Ǽ̽��ϴ�");
			}
			else {
				System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���.");
			}
		}
		else {
			System.out.println("���Ե��� ���� ����� �Դϴ�.");
		}
		
		/*
		 * [���빮��4] ������ȣ �߼ۿ� ���� ��ȣ �� �ڵ�
		 * Q. �������� ��ȣ�� �Է��ϼ���.
		 * ���� 220524
		 * ����ڰ� ���� 220524 �ܿ� �Է½� 
		 * "������ȣ�� Ʋ���ϴ�." ��� ����ϰ�,
		 * ������ ������ȣ ���ڸ� �Է½� 
		 * "���� Ȯ�� �Ǽ̽��ϴ�." ��� �Է��մϴ�.
		 * ��, 220524�� java ����� ���� ���� ����Ǵ� ������ ó���ϼ���.
		 */
		
		int num3 = 220524;
		System.out.println("�������� ��ȣ�� �Է��ϼ���.");
		int user2 = aa.nextInt();
		
		if(user2==num3) {
			System.out.println("���� Ȯ�� �Ǽ̽��ϴ�.");
		}
		else {
			System.out.println("������ȣ�� Ʋ���ϴ�.");
		}
		
		aa.close();
		
	}

}
