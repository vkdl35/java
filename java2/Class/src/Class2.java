public class Class2 {
	//package�� ������� ���� (default��)
	public static void main(String[] args) {
		//������ Ŭ���� ���� �� �Լ��� �̿��Ͽ� ���� ���� �ޱ�
		/*
		inject a = new inject();
		a.oksign("ȫ�浿");
		*/
		
		//inject.oksign("ȫ�浿");
		
//		inject.oksign();	//���� �⺻�� �Ǵ� �Լ� ��, static void�� ����
//		inject.test();
		
		//members.user("�̼���");	//��ȣ �ȿ� �ִ� ������(���ڰ�)
		
		members.cal(5, 10);	//members Ŭ���� �ȿ� cal��� �Ϲ��Լ��� 5�� 10 ���ڰ��� ����
		
		
	}

}

class inject {
	//public static void ���� �⺻�� �Ǵ� �Ϲ� �Լ��� ���մϴ�.
//	public static void oksign(String adata) {
//		System.out.println(adata);
//	}
	public static void oksign() {
		String user = "ȫ�浿";
		System.out.println(user);
	}
	public static void test() {
		int aa = 1;
		int bb = 3;
		int cc = aa + bb;
		System.out.println(cc);
	}
}


class members {
	public static void user(String names) {;

	String mag = names + "�� ȯ���մϴ�.";
	System.out.println(mag);
		
	}
	public static void cal(int a, int b) {	//(�ڷ��� �̸�, �ڷ��� �̸�) : ���ڰ� 2���� ����
		int c = a*b;
		System.out.println(c);
	}
}




