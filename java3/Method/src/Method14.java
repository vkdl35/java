
public class Method14 {

	public static void main(String[] args) {
		
		Mbc m = new Mbc();	//����� ù��° Mbc + test �޼ҵ� ��� �ȵ� 
		Mbc m2 = new Mbc("�̼���");
		

	}

}

class Mbc{
	/* �޼ҵ� ���³� �̸��� ���Ƶ� �μ����� ���� �ٸ��� ���е�, ��, ���������� ����Ǿ� ����� */
	public Mbc() {	//�Ϲ� construct
		System.out.println("����1");
		test();
	}
	public Mbc(String user) {	//�μ����� �ִ� construct
		System.out.println(user);	
		test(user);
	}
	public Mbc(int user2) {	//construct���� �μ����� �ڷ������� ���� �˴ϴ�.
		System.out.println(user2);	
		//test(user);
	}
	public void test() {	//�Ϲ� �޼ҵ�
		System.out.println("�޼ҵ�");
		total();
	}
	public void test(String user) {	//�μ����� �ִ� �޼ҵ�
		System.out.println(user);
		total();
	}
	public static void total() {
		System.out.println("�ý��� ����");
	}
}
