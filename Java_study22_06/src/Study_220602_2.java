import java.util.Scanner;
import java.util.Random;

public class Study_220602_2 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��1] ��86
		 * for_in�̶�� �Ϲ� �޼ҵ尡 �ֽ��ϴ�. (�޸𸮸� ����ϴ�) 
		 * ���α׷� ���� ������ ���� ������ �մϴ�.
		 * "����Ͻ� ������ ���ڸ� �ϳ� �Է����ּ���." 
		 * [���] - �ش� �޼ҵ忡�� ����� ����ؾ� �մϴ�. 
		 * ���� ����ڰ� 3���� �Է½� 3*1=3 ... 3*9=27 ����� �Ǿ�� �մϴ�.
		 */

		System.out.println("����Ͻ� ������ ���ڸ� �ϳ� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		Study_220602_2 st = new Study_220602_2();
		int user = sc.nextInt();
		int total = 1;
		int w;
		for (w = 1; w < 10; w++) {
			total = w * user;
			st.for_in(user, w, total);
		}
		sc.close();
		st = null;

		/*
		 * [���빮��2] ��91
		 * ��ü �ش� �ε��� class���� agrees��� �̸��� ������ �ֽ��ϴ�. 
		 * main �޼ҵ忡�� ����ڰ� "������ �Ǵ� ���Ǿ����� �������ּ���." 
		 * ���������� �Է� �Ǿ��� ��� "ȸ�������� ����˴ϴ�." ��� �޼����� ����ϰ�, 
		 * ���Ǿ����� �Է½� "���Ǹ� �ϼž� ����˴ϴ�." ��� ��µ˴ϴ�. 
		 * ��, agrees Ŭ���� �ȿ� void �޼ҵ� �Ѱ� �Ǵ� �ΰ��� �����Ͽ� �ڵ带 �����ϼ���.
		 */

		Scanner sc1 = new Scanner(System.in);
		System.out.println("������ �Ǵ� ���� ������ �Է����ּ���.");
		String user2 = sc1.nextLine();
		agrees ag = new agrees();
		ag.datas(user2);
		sc1.close();
		ag = null;
		
		/*
		 * [���빮��3] Ŭ����+�޼ҵ�+�迭 ��102
		 * ����ڰ� �ڽ��� �̸��� �Է��մϴ�. 
		 * ����� �̸��� �ش� Class�� ������ ��ϵ� ��������� �̰����� ��������� Ȯ���ϴ� �ڵ带 �ۼ��ϼ���. 
		 * ��ϵ� ������� ��� "������ �Ǿ��ֽ��ϴ�." ��� ����ϰ�, 
		 * Ȯ���� ���� ���� ��� "�̰����� �Դϴ�." ��� ����ϼ���.
		 */
		
		String names[] = { "�̰��", "������", "�̼���" };
		System.out.println("����� �̸��� �Է����ּ���.");
		Scanner sc2 = new Scanner(System.in);
		String user3 = sc2.next();
		Adata_1 ad_1 = new Adata_1();
		ad_1.user_name(names, user3);
		sc2.close();
		ad_1 = null;
		
		/*
		 * [���빮��4] ��131
		 * ���� ���� �迭 �����Ͱ��� �ֽ��ϴ�. 
		 * a1 : ȫ�浿 �̼��� ������ ������ ������ 
		 * a2 : 100 80 39 60 55
		 * "�˻��ϰ��� �ϴ� �̸��� �����ּ���." ����ϰ� �˴ϴ�. 
		 * �˻�� �̼����̶�� �˻��� �ϰ� �Ǹ� "�̼��Ŵ��� 80���Դϴ�." ��� ����� �Ǿ�� �մϴ�.
		 */
		
		String name1[][] = { 
				{ "ȫ�浿", "�̼���", "������", "������", "������" }, 
				{ "100", "80", "39", "60", "55" } 
			};
		Scanner sc3 = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���.");
		String user4 = sc3.next();
		Bdata_1 bd_1 = new Bdata_1();
		bd_1.jumsu(name1, user4);
		sc3.close();
		bd_1 = null;

	}
	public void for_in(int a, int b, int c) { //�����빮��1, ��9
		System.out.printf("%d*%d=%d\n ", a, b, c);
	}
}

class agrees {	//�����빮��2, ��31
	public void datas(String a) {
		if (a.equals("������")) {
			System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
		} else if (a.equals("���� ����")) {
			System.out.println("���Ǹ� �ϼž� ����˴ϴ�.");
		} else {
			System.out.println("������ �Ǵ� ���� ������ �Է��ϼž� �մϴ�.");
		}
	}
}
class Adata_1 {	//�����빮��3, ��48
	public void user_name(String names_2[], String user_2) {
		int names_num = names_2.length;
		int a = 0;
		String mag = null;
		boolean ck = false;
		while (a < names_num) {
			if (user_2.equals(names_2[a])) {
				mag = "������ �Ǿ��ֽ��ϴ�.";
				ck = true;
			}
			a++;
		}
		if (ck == false) {
			mag = "�̰����� �Դϴ�.";
		}
		System.out.println(mag);
	}
	public void rotto2() {
		Random r = new Random(); // random��ü ���� �� �ν��Ͻ� �����̶�µ� ���� �Ҹ��� �� �𸣰ڵ�
		int w = 0;
		while (w <= 6) {
			System.out.print((r.nextInt(45) + 1) + " ");
			// 0~9���� nextInt�� ����Ѵٴµ� �̰Ϳ��� ���� �Ҹ��� �𸣰ڼ���
			w++;
		}
		r = null;
	}
}
class Bdata_1 {	//�����빮��4, ��65
	public void jumsu(String name_3[][], String user_3) {
		int num2 = name_3[0].length;
		int w = 0;
		boolean ok = false;
		while (w < num2) {
			if (user_3.equals(name_3[0][w])) {
				System.out.println(user_3 + "���� " + name_3[1][w] + "���Դϴ�.");
				ok = true;
			}
			w++;
		}
		if (ok == false) {
			System.out.println("��ϵ� ����ڰ� �����ϴ�.");
		}
	}
}