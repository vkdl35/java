import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 [���빮��9]
		 
		  A�л��� ���� ������ �Է� �ް� ��������� ������ ���α׷��� �����մϴ�.
		  "������ �Է��ϼ���." ��� ������ �� 5���� ������ �Ǹ�,
		  ��� ������ �ջ��Ͽ� ����մϴ�.
		  
		  ��� ������ �ջ� �� �� 5���� ������ ���� ��հ��� ����ϼž� �մϴ�.
		  ��� �޼����� " �ش� ������ ������ " " ���
		  ��, ���� ������ 40�� ���� �� ���, "������Դϴ�." ��� �޽����� ��� �� ���μ����� �����մϴ�.
		  40�� �̻��ϰ�� " �հ� " �̶�� ����Ͻʽÿ�.
		  
		  [�߰���ȹ]
		  "�Է��Ͻ� ���� ���� �־��ּ��� : " ��� ���� ���� ��� �� �ش� ���� �� ��ŭ �ݺ����� ������ �Ǹ�, ���� �� ��ŭ ��հ��� ����Ǿ�� �մϴ�.
		  
		  **do~while���� �ۼ��ϼ���.
		 */
		
//		Scanner aa = new Scanner(System.in);
//		System.out.println("���� ���� �����ּ��� : ");
//		int usersub = aa.nextInt();//����� �Է� ���� ����
//		String bb = "������ �Է��ϼ���."; 
//		
//		int cc=1;//�ݺ���
//		int dd=0;//�ջ� ���
////		int sub = 5; // ���񰹼�
//		
//		
//		do {
//			System.out.println(bb);// �����Է��ϼ��� ���
//			int ee = aa.nextInt(); // ����� �Է�
//			dd+=ee; //�ջ����
//			cc++;
//		} while(cc<=usersub);
////		System.out.printf("�� ������ %d���Դϴ�.", dd); //�ջ� ��
//		System.out.printf("�� ������ %d���Դϴ�.\n%d���� ���� ���� ��������� %d�� �Դϴ�.",dd, usersub, dd/usersub); //���񰹼�/�ջ�/���
//		
//		if (dd/5<40) {
//			System.out.println("\n������Դϴ�.");
//		}
//		else {
//			System.out.println("\n�հ�");
//		}
//		
//
//		aa.close();
		
		/*
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int user;
		int total=0;
		while(w<=5) {
			System.out.println("������ �Է����ּ���.");
			user = sc.nextInt();
			total += user;
			w++;
		}
		
		System.out.println("���� �հ� ������ "+total);
		*/
		
		
		/*
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int user;
		int total=0;
		while(w<=5) {
			System.out.println("������ �Է����ּ���.");
			user = sc.nextInt();
			total += user;
			w++;
		}
		double avg = total / 5;
		String msg;
		if(avg < 40) {
			msg = "������Դϴ�.";
		}
		else {
			msg = "�հ��Դϴ�.";
		}
		
		System.out.println("���� ��� ������ "+avg+"���̸�, "+msg);
		*/
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ���.");
		int subject = sc.nextInt();
		int w = 1;
		int user;
		int total=0;
		while(w<=subject) {
			System.out.println("������ �Է����ּ���.");
			user = sc.nextInt();
			total += user;
			w++;
		}
		double avg = (double)(total) / subject;
		//�Ҽ������� ǥ���Ϸ��� total �� �տ� double�� �ٿ��ָ� ��.
		String msg;
		if(avg < 40) {
			msg = "������Դϴ�.";
		}
		else {
			msg = "�հ��Դϴ�.";
		}
		System.out.println("���� ��� ������ "+avg+"���̸�, "+msg);
		sc.close();
		
		
		
		
	}

}
