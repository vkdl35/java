import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/*
		 * [UP & DOWN ����]
		 * 
		 * A��Ʈ : PC ���� , Scanner(5��)
		 * B��Ʈ : PC ���� ���ڿ� ����ڰ� ���� ���ڸ� �� �� ���ó��
		 * 
		 * ��ȸ�� �� �ټ���
		 * 1. PC�� ���ڸ� �ϳ� ���� (��Ʈ random) 1 ~ 10����
		 * 2. �� ��ȸ�� 5�� ���ҽ��ϴ�. 1 ~ 10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
		 * 3. ���࿡ PC�� ���� 7�� ������ ���ؿ��� ����� ���ڿ� ��
		 * -PC : 7 / ����� : 2 => ��� : UP�Դϴ�
		 * 4. �� ��ȸ�� 4�� ���ҽ��ϴ�. 1 ~ 10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
		 * 5. PC : 7 / ����� : 4 => ��� : UP�Դϴ�
		 * 6. �� ��ȸ�� 3�� ���ҽ��ϴ�. 1 ~ 10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
		 * PC : 7 / ����� : 7 => ��� : �����Դϴ�. (��� ���μ��� ����)
		 * 
		 */
		
		System.out.println("UP & DOWN ������ �����մϴ�.");

		int num = (int) (Math.random() * 10) + 1;
		// System.out.println(num);

		Scanner sc = new Scanner(System.in);
		int total = 5;
		int user;

		while (total > 0) {
			System.out.printf("�� ��ȸ�� %d�� ���ҽ��ϴ�.", total);
			user = sc.nextInt();
			if(user < 0 || user > 10) {
				System.out.println("�߸��� ����");
				total++;
			}
			else {				
				Example2 ex2 = new Example2();
				String msg = ex2.mt(num, user);
				System.out.println(msg);
				if (msg.equals("�����Դϴ�.")) {
					System.exit(0);
				}
			}
			total--;
		}
		if (total == 0) {
			System.out.println("���ӿ���");
		}

	}

}