import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		//{3.4, 1.6, 4.2, 5.3, 4.7} �Ҽ����� ó������ double�� ������ ������ �ȳ�
		
//		//���ο� �ݺ���
//		int data[] = {5, 10, 15, 20, 25, 30, 35};
//		for(int f : data) {	//int f�� ���������� data �迭���� �޾Ƽ� �����Ŵ
//			//�迭���� �ҷ��ͼ� f���� �Ѱ���. ���⼭ int f�� ���� �ۿ� �����ϸ� �ȵ�. ��ȣ��� :�� ����ؾ���.
//			/* foreach���� ����� ���� �ε��� ��ȣ�� �ʿ���� ����� ���
//			 * for~do~whils�� ����� ���� �ε��� ��ȣ�� �ʿ��� ��
//			 * 
//			 * �ε��� ��ȣ : [0][1][2]*/
//			if(f % 2 == 0) {				
//				//System.out.println(f);
//			}
//		}

		
//		String pay[] = {"������ �Ա�","�ſ�ī��","�޴��� ����","��ǰ��","����"};
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("�����ϰ��� �ϴ� ���¸� �������ּ���.");
//		String pm = sc.nextLine();
//		
//		for(String z : pay) {	//�迭 �����Ͱ� ���ڸ� �޴� ���� ���� ���� �������� ����ؾ���
//			//�迭�� ���ڸ� �޴� �Լ��� int�� �ƴ� string�� ����ؾ� �ν��� (�߿�!)
//			if(pm.equals(z)) {				
//				System.out.println(pm+"�� ���� ����˴ϴ�.");
//			}
//		}
		
		//foreach�� ������� ��, ���ǹ� �ȿ� �� ���ǹ��� �� ���
		
		
		String pay[] = {"������ �Ա�","�ſ�ī��","�޴�������","��ǰ��","����"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ϰ��� �ϴ� ���¸� �������ּ���.");
		String pm = sc.next();
		
		for(String z : pay) {	//�迭 �����Ͱ� ���ڸ� �޴� ���� ���� ���� �������� ����ؾ���
			//�迭�� ���ڸ� �޴� �Լ��� int�� �ƴ� string�� ����ؾ� �ν��� (�߿�!)
			if(pm.equals(z)) {	
				if(z.equals("�޴�������")) {
					System.out.println("���� �ý��� �������� �ش� ������ ����Ͻ� �� �����ϴ�.");
				}
				else {
					System.out.println(pm+"�� ���� ����˴ϴ�.");
				}
				//System.out.println(pm+"�� ���� ����˴ϴ�.");
			}
		}
		
		
		sc.close();
		
		/*
		 * [���빮��]
		 * {"�ܹ���" , "����" , "ġŲ" , "Ŀ��"}
		 * "�ֹ��ϰ��� �ϴ� ������ �������ּ���." <<�� �ֹ��� foreach�� �ȿ� ������
		 * �ش� ������ �� 4���� ����� �˴ϴ�.
		 * ��, "�ֹ�����" ��� ����ڰ� �Է��ϴ� ��� �ֹ��� ���� �Ǹ�, �ֹ� ������ ����Ͻø� �˴ϴ�.
		 */
		
		String food[] = {"�ܹ���","����","ġŲ","Ŀ��"};
		Scanner aa = new Scanner(System.in);
		
		String total;
		//String data_food = food.length;
		
		for(String p : food) {
			System.out.println("�ֹ��ϰ��� �ϴ� ������ �������ּ���.");
			String user = aa.next();
//			if(user.equals(food)) {
//				
//			}
//			
		}
		aa.close();
//		System.out.println("�ֹ� ���� : ");
		
		
		
		
		
		
	}

}
