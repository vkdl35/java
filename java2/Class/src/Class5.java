import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		
		Member2.lists2();	//�޸𸮿��� �ٷ� �ε�
		
		Member2 mb2 = new Member2();	//static�� ���� �Լ��̹Ƿ� ��ü �� �ν��Ͻ��� ����
		mb2.lists();	//�ν��Ͻ�(�޸�)�� �ִ� �޼ҵ带 �ε�
		
		Member2.lists3("������",123456);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ͻ� ������ ���ڸ� �ϳ� �Է����ּ���.");
		int num = sc.nextInt();
		Member2.for_in(num);
		sc.close();
		
		/*
		 * [���빮��]
		 * for_1n�̶�� �Ϲ� �޼ҵ�(�޸𸮸� ����ϴ�)�� �ֽ��ϴ�. 
		 * ���α׷� ���� ������ ���� ������ �մϴ�.
		 * "����Ͻ� ������ ���ڸ� �ϳ� �Է����ּ���."
		 * [���] - �ش� �޼ҵ忡�� ����� ����ؾ� ��.
		 * ���� ����ڰ� 3���� �Է½� 3*1=3 ... 3*9=27 ��� �Ǿ�� ��.
		 * �ݺ����� for������ ����
		 */
	
	}

}

class Member2 {
	public void lists() {	//�޸𸮿� ������ �Ҵ� ���� �޼ҵ� �Լ��� ����
		String a = "ȫ�浿";
		System.out.println(a);
	}
	public static void lists2 () {
		String a = "�̼���";
		System.out.println(a);		
	}
	public static void lists3 (String nm, int pw) {
//		String user_name = nm;
		//nm�� �޼ҵ忡�� ���� �޴� ���� �ٷ� ����� ��� (nm.equals("������"))
		int user_pw = pw;	
		//�޼ҵ忡 ��ü���� ÷���Ͽ� �ε� �� �޼ҵ� �ȿ� ������ �ʵ���� �̿��Ͽ� ���� �޴� ����

//		System.out.println(user_name);
		if(nm.equals("������") && user_pw == 123456) {
			//System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		}
		else {
			//ystem.out.println("��ȸ���Դϴ�.");
		}
	}
	public static void for_in (int num2) {
		int a;
		//int total;
		for(a=1;a<10;a++) {
			System.out.printf("%d*%d=%d ",num2,a,(num2*a));
		}
	}
}
