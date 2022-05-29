import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Study_220527 {

	public static void main(String[] args) {
		
		//date ��ƿ
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YY�� MM�� dd��");
		SimpleDateFormat time = new SimpleDateFormat("h:m:s");
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		
		//������ȣ�� ����
		
		int f;
		for(f=1;f<=50;f=f+2) {
			System.out.print(f+" ");
		}
		
		
		/* 
		 * [���빮��1] 
		 * ����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ����Ͻÿ�.
		 * ù��° ���ڰ��� �Է��ϼ���.
		 * �ι�° ���ڰ��� �Է��ϼ���.
		 * ù��° ���ڰ� * �ι�° ���ڰ� �� ���� ����� ����ϼ���.
		 * ��, �ش� ������� 100 ������ ��� 
		 * ��� �޼��� "100������ ������Դϴ�." ��� �����Ͻð�
		 * 100 �̻��� ��� "100�̻� ������Դϴ�." ��� ����մϴ�.
		 */
		
		Scanner as = new Scanner(System.in);
		
		System.out.println("ù��° ���ڰ��� �Է��ϼ���.");
		int user1 = as.nextInt();	//ù��° ���ڰ�
		System.out.println("�ι�° ���ڰ��� �Է��ϼ���.");
		int user2 = as.nextInt();	//�ι�° ���ڰ�
		
		int total;
		total = user1 * user2;
		
		if(total < 100) {
			System.out.println("100������ ����Դϴ�.");
		}
		else if(total >= 100) {
			System.out.println("100�̻� ������Դϴ�.");
		}
		
		/*
		 * [���빮��2] ���ǹ� �ڵ带 �ۼ� �Ͻÿ�.
		 * ���� �ڽ��� ���忡�� ��,����� �ϴ� ���μ����� �����ؾ� �մϴ�.
		 * ���� �⺻ �ڻ� �ݾ��� : 100,000��
		 * "1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�." ��� �޼����� ���� ���� ���� �Ǿ�� �մϴ�.
		 * 1���� �Է½� "�ش� �ݾ��� �Է��ϼ���.
		 * ����ڰ� �Է��� �ݾ� + �⺻ �ڻ� �ݾ��� ���� �� �ڻ� �ݾ��� ����Ͻø� �˴ϴ�.
		 * 2���� �Է½� "����� �ݾ��� �Է��ϼ���." 
		 * ����ڰ� �Է��� �ݾ� - �⺻ �ڻ� �ݾ��� ����Ͽ� �� �ڻ� �ݾ��� ����Ͻø� �˴ϴ�.
		 */
		
		int money = 100000;
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�.");
		int user3 = as.nextInt();
		int userm;
		int total2;
		
		if(user3==1) {
			System.out.println("�ش� �ݾ��� �Է��ϼ���.");
			userm = as.nextInt();
			total2=userm+money;
			System.out.printf("�Ա� �Ǿ����ϴ�. �� �ڻ� : %d��",total2);
		}
		else if(user3==2) {
			System.out.println("����� �ݾ��� �Է��ϼ���.");
			userm = as.nextInt();
			total2=money-userm;
			System.out.printf("��� �Ǿ����ϴ�. �� �ڻ� : %d��",total2);
		}
		else {
			System.out.println("�������� �ڵ尡 �ƴմϴ�.");
		}
		
		/*
		 * [���빮��3] while������ �ڵ带 �ۼ��ؾ� �ϸ�, ���μ����� ������ �����ϴ�. 
		 * ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�. 
		 * ������ "7,000�� �����Ͻðڽ��ϱ�? ��� ��µǸ�, 
		 * ���� 1�̶�� �Է��ϸ� �������� �ݾ׿� �߰��˴ϴ�. 
		 * ��, 2��� �Է½� �������� �ݾ׿� �߰��Ǹ� �ȵ˴ϴ�.
		 * �� ���� Ƚ���� 4���Դϴ�.
		 * �������� ���� ���� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ�.
		 */
		
		int user4;	//����� �Է°�
		int a = 1;
		int total3=0;
		final int money2 = 7000;
		
		while(a < 5) {
			System.out.println("7000�� �����Ͻðڽ��ϱ�?");
			user4 = as.nextInt();
			if(user4==1) {
				total3+=money2;
			}
			a++;
		}
		System.out.println("���� �ݾ��� "+total3+"���Դϴ�.");

		/*
		 * [���빮��4] ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�,������ ����� ����Ͽ� ¦������ Ȧ�������� ����Ͻÿ�.
		 * "�����ܿ� ���� ���ڸ� �Է��ϼ���." ��� �޼����� ��µǸ�
		 * �ش� ���ڿ� ���缭 ��� ����� ���ϸ�,
		 * ���� ���� ���� ¦������ Ȧ�������� ����Ͻø� �˴ϴ�.
		 * ��, �ش� �ݺ����� for ~ dowhile�������Ѱ����� �����ؼ� �ۼ��Ͻÿ�.
		 * *���ǹ��� �ݺ��� �ȿ� ������ �ȵ˴ϴ�.*
		 */
		
		int gugu = 1;
		int total4=0;
		System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���.");
		int user5 = as.nextInt();
		
		while(gugu < 10) {
			total4+=gugu*user5;
			gugu++;
		}
		if(total4 % 2 == 1) {
			System.out.printf("%d�� Ȧ���Դϴ�.",total4);
		}
		else {
			System.out.printf("%d�� ¦���Դϴ�.",total4);
		}
		
		/*
		 * [���빮��5] ����ڰ� �ش� ���� �Է��մϴ�. 
		 * ����ڰ� �ΰ��� ���ڸ� �Է��ϵ� ù��° ���ڿ� �ι�° ���� ���� �ȿ� �ִ�
		 * ��� ���ڸ� ���ؼ� ������� �������� �����Ͻÿ�.
		 * ��, �ش� �ڵ�� do~while������ �ۼ��մϴ�.
		 * ����) 
		 * ù��° ���� ���ڴ�? 5
		 * �ι�° ���� ���ڴ�? 10
		 * ���� ���� ��� �հ�� 45�Դϴ�.
		 */
		
		System.out.println("ù��° ���� ���ڴ�?");
		int user6 = as.nextInt();
		System.out.println("�ι�° ���� ���ڴ�?");
		int user7 = as.nextInt();
		int total5 = 0;
		
		do {
			total5+=user6;
			user6++;
		}while(user6 <= user7);
		System.out.println(total5);
		
		/*
		 * [���빮��6] ���� ������� ���缭 �ڵ尡 ��� �ǵ��� �Ͻÿ�.
		 * �ش� �ڵ�� for������ �ۼ��մϴ�.
		 * 45 35 25 15 10
		 * ���ǹ� ������*
		 */

		int a2;
		int total6 = 1;
		
		for(a2=9;a2>=2;a2--) {
			total6 = a2 * 5;
			if(total6 % 2 == 1 || total6 == 10) {
				System.out.print(total6+" ");
			}
		
		/*
		 * [���빮��7]  1~10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�.
		 * ��, 1~5������ ��簪�� ���ϰ�, 6~10������ ��簪�� ���մϴ�.
		 * �ش� �ΰ��� ���� ���Ͽ� ���Ѱ��� ū��, ���Ѱ��� ū���� ����� ����ϼ���.
		 */
		
		int a3 = 1;
		int total7 = 1;
		int total8 = 0;
		
		while(a3 < 11) {
			if(a3 <= 5) {
				total7*=a3;
			}
			else {
				total8+=a3;
			}
			a3++;
		}
		if(total7 > total8) {
			System.out.printf("1~5���� ���� ���� �� Ů�ϴ�. : %d",total7);
		}
		else if(total8 > total7) {
			System.out.printf("6~10���� ���� ���� �� Ů�ϴ�. : %d",total8);
		}
		
		/*
		 * [���빮��8] ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� ��, �ش� ����� �����ϴ� ���μ����� �����մϴ�.
		 * "ù��° �Է°� ��(1~10����) �Դϴ�."
		 * "�ι�° �Է°� ��(1~10����) �Դϴ�."
		 * "����° �Է°� ��(1~10����) �Դϴ�."
		 * "������ �����Դϴ�. �ش� ������ ���� ���� �����ȣ�� ��������."
		 * �ش� �����ȣ�� �°� ������� �����Ͽ� �������� ����ϼ���.
		 */
		
		System.out.println("ù��° �Է°��� �Է��ϼ���. ��,(1~10����)�Դϴ�.");
		double first = as.nextInt();
		System.out.println("�ι�° �Է°��� �Է��ϼ���. ��,(1~10����)�Դϴ�.");
		double second = as.nextInt();
		System.out.println("����° �Է°��� �Է��ϼ���. ��,(1~10����)�Դϴ�.");
		double third = as.nextInt();
		System.out.println("������ �����Դϴ�. �ش� ������ ���� ���� �����ȣ�� ��������.");
		String sign = as.next();
		double total9;
		
		if(sign.equals("+")) {
			total9=first+second+third;
			System.out.println(total9);
		}
		else if(sign.equals("-")) {
			total9=first-second-third;
			System.out.println(total9);
		}
		else if(sign.equals("*")) {
			total9=first*second*third;
			System.out.println(total9);
		}
		else if(sign.equals("/")) {
			total9=first/second/third;
			System.out.println(total9);
		}
		else {
			System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���.");
		}
		
		/*
		 *[���빮��9]
		 *����� �н������ a1234�Դϴ�.
		 *����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ �̻� ���н� ������ ���� ��µǵ��� �մϴ�.
		 *"�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�."
		 *��, �н����尡 ���� ��� "�α��� �Ǿ����ϴ�." ��� ��µǾ�� �մϴ�.
		 */
		
		final String pw = "a1234";
		int c = 3;
		int w = 0;
		String msg = "�н����带 �Է��ϼ���.";
		
		System.out.println(msg);
		String userpw = as.next();
		while(w < 3) {
			if(pw.equals(userpw)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;
			}
			else {
				msg = "�ùٸ� �н����带 �־��ּ���.";
				c--;
				if(c==0) {
					System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
				}
			}
			w++;
		}
		
		/*
		 * [���빮��10]
		 * A�л��� ���� ������ �Է� �ް� ��������� ������ ���α׷��� �����մϴ�.
		 * "������ �Է��ϼ���." ��� ������ �� 5���� ������ �Ǹ� ��� ������ �ջ��Ͽ� ����մϴ�.
		 * ��� ������ �ջ� �� �� 5���� ������ ���� ��հ��� ����ϼž� �մϴ�.
		 * ��� �޼����� " �ش� ������ ������ " " ���
		 * ��, ���� ������ 40�� ���� �� ���, "������Դϴ�." ��� �޽����� ��� �� ���μ����� �����մϴ�.
		 * 40�� �̻��ϰ�� " �հ� " �̶�� ����Ͻʽÿ�.
		 * [�߰���ȹ]
		 * "�Է��Ͻ� ���� ���� �־��ּ��� : " ��� ���� ���� ��� �� �ش� ���� �� ��ŭ �ݺ����� ������ �Ǹ�, ���� �� ��ŭ ��հ��� ����Ǿ�� �մϴ�.
		 **do~while���� �ۼ��ϼ���.*
		 */
		
		double a10 = 1;
		double total10 = 0;
		System.out.println("�Է��Ͻ� ���� ���� �־��ּ���.");
		int num = as.nextInt();
		
		do {
			System.out.println("������ �Է��ϼ���.");
			int user10 = as.nextInt();
			total10+=(user10/num);
			a10++;
		}while(a10 <= num);
		if(total10 >= 40) {
			System.out.println("�հ��Դϴ�.");
		}
		else {
			System.out.println("������Դϴ�.");
		}
		
		/*
		 * [���빮��11]
		 * ���� �̿����� ���� ���� ���α׷��� �����ϰ� �˴ϴ�.
		 * ���� �׸��� ��ü 3�����̸�, ��� true�� ���� �Ǿ�߸� ���� ���μ����� ������ �˴ϴ�.
		 * ����ڿ��� �����Ǵ� ������ ������ �����ϴ�.
		 * "�����׸� �����Ͻðڽ��ϱ�?" ��� �޼��� ��� ������(1), ���� ����(2)
		 * ���� �׸� �� �Ѱ����� �������� ���� ��� "��� �����ϼž߸� ����˴ϴ�." ��� ����մϴ�.
		 * ��� �������� ��� "ȸ�������� �Ϸ�Ǿ����ϴ�." ��� ����մϴ�.
		 */
		
		boolean mag = false;
		int a11 = 1;
		
		while(a11 <= 3) {
			System.out.println("�����׸� �����Ͻðڽ��ϱ�? ������(1), ���� ����(2)");
			int user = as.nextInt();
			if(user==1) {
				mag = true;
			}
			else {
				mag = false;
				break;
			}
			a11++;
		}
		if(mag == false) {
			System.out.println("��� �����ϼž߸� ����˴ϴ�.");
		}
		else {
			System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
		}
		
		/*
		 * [���빮��12]
		 * 3���� ��ǰ�� �ֽ��ϴ�.
		 * "���ڵ�� ��ǰ�� �Է½����ּ���." �ݾ��� �Է��ϰ���
		 * "����%�� �Է����ּ���." ��� ������ �Բ� �ش� ���� ���ڸ� �Է��ϸ�
		 * ���� �ݾ��� ����Ǿ� ����մϴ�.
		 */
		
		int money3 = 10000;
		int coupon = 20;
		
		double a12 = coupon * 0.01;
		System.out.println(a12);
		double b12 = money3 * a12;
		System.out.println(b12);
		double c12 = money3 - b12;
		System.out.println(c12);
		
		as.close();
		
		}

	}
}
