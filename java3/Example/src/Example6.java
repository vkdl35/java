import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * ��ǰ ������ 42000���Դϴ�.
		 * ����ڰ� �ش� ��ǰ�� ������ �Է��ϰ� �˴ϴ�.
		 * �ش� ��ǰ ���ݿ� �´� ������ŭ ���Ͽ� ���� ���� �ݾ��� ��½�Ű��
		 * extends�� �����Ͻø� �˴ϴ�.
		 * ��, 42000�� ���� ���ڰ� �ٲ�� �ȵ˴ϴ�.
		 * ����ڰ� �ִ� ������ �� �ִ� ������ 5������ �Դϴ�.
		 * ���� ������� main �޼ҵ忡�� ����մϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǰ ������ 42000�� �Դϴ�. �����Ͻ� ������ �Է����ּ���. (5�������� ���� ����)");
		int u = sc.nextInt();
		Bdata_1 bd1 = new Bdata_1();
		bd1.name1(u);
		int r = bd1.name2();
		String k = bd1.name3();
		if(u < 6) {
			System.out.printf("�� �ݾ��� %d�� �Դϴ�.",r);
		}
		else {
			System.out.println(k);
		}
		sc.close();
		
	}
	

}

class Adata_1 {
	private int money = 42000;	
	protected int total;
	protected String msg;
	
	public void name1(int user) {
		if(user < 6) {
			this.total = this.money * user;
		}
		else if(user >= 6) {
			msg = "�ټ��� ������ ���� �����մϴ�.";
		}
		else {
			msg = "�Է� ����";
		}
	}
	
}
class Bdata_1 extends Adata_1 {
	public int name2() {
		return this.total;
	}
	public String name3() {
		return this.msg;
	}
}
