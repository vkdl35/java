import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
//		Example2 ex2 = new Example2();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		/* �Ϲ� random ��� (random double �ڷ���) */
//		//int pc = (int)(Math.random()*10+1);
//		//System.out.println(pc);
//		/*
//			������ �⺻������ double�� ��� ���� 
//			�տ� (int)�� �־ ����� �ٲ���� �ϴµ�, ������ �����߱� ������ 0�� ����
//			�Լ� �ڿ� *�� ����� ������ ��������� ��
//			0�� �����ϰ� ����Ϸ��� �� �ڿ� +1�� �ٿ��ָ� ��
//		*/
//		
//		/* util�� �̿��� random ��� */
//		Random r = new Random();	//�����̶�� ��ü�� ����
//		int pc = r.nextInt(10)+1;	//������ ���� ����
//	//	System.out.println(pc);
//
//		int w = 5;
//		do {
//			System.out.printf("�� ��ȸ %d�� ���ҽ��ϴ�.\n",w);
//			int user = sc.nextInt();
//			ex2.randomck(pc,user);
//			String out = ex2.result();
//			System.out.println(out);
//			int check = out.indexOf("����");	
//			//indexOf : �ܾ�˻� (-1 : ����, 1 : ����)
//		//	System.out.println(check);
//			if(check==0) {
//				break;
//			}
//			w--;
//		}while(w > 0);
//		
//		sc.close();
		
		
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
				ex2 = null;
				if (msg.equals("�����Դϴ�.")) {
					System.exit(0);
				}
			}
			total--;
		}
		if (total == 0) {
			System.out.println("���ӿ���");
		}
		sc.close();
		

	}

}