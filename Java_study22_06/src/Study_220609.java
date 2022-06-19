import java.util.Random;
import java.util.Scanner;

public class Study_220609 extends main2{	//extends�δ� �ΰ� �ε� �Ұ���

	public static void main(String[] args) {
		
		/* �����ε��� �������̵� */
		
		cd c = new cd();
		c.display("���� ���밪 ���"); // �����ε�
		c.display(); // �������̵�
		
		/* extends �� �� ��� */
		
		Study_220609 ov = new Study_220609();
		ov.abc();
		ov.abc2();
		
		
		/*
		 * [���빮��1]
		 * A��Ʈ : PC ���� , Scanner(5��)
		 * B��Ʈ : PC ���� ���ڿ� ����ڰ� ���� ���ڸ� �� �� ���ó��
		 * ��ȸ�� �� �ټ���
		 * 1. PC�� ���ڸ� �ϳ� ���� (��Ʈ random) 1 ~ 10����
		 * 2. �� ��ȸ�� 5�� ���ҽ��ϴ�. 1 ~ 10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
		 * 3. ���࿡ PC�� ���� 7�� ������ ���ؿ��� ����� ���ڿ� ��
		 * -PC : 7 / ����� : 2 => ��� : UP�Դϴ�
		 * 4. �� ��ȸ�� 4�� ���ҽ��ϴ�. 1 ~ 10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
		 * 5. PC : 7 / ����� : 4 => ��� : UP�Դϴ�
		 * 6. �� ��ȸ�� 3�� ���ҽ��ϴ�. 1 ~ 10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
		 * PC : 7 / ����� : 7 => ��� : �����Դϴ�. (��� ���μ��� ����)
		 */
		
		Bpart ex2 = new Bpart();
		Scanner sc = new Scanner(System.in);
		
		/* �Ϲ� random ��� (random double �ڷ���) */
		//int pc = (int)(Math.random()*10+1); 
		
		/* util�� �̿��� random ��� */
		Random r = new Random();	//�����̶�� ��ü�� ����
		int pc = r.nextInt(10)+1;	//������ ���� ����
		int w = 5;
		do {
			System.out.printf("�� ��ȸ %d�� ���ҽ��ϴ�.\n",w);
			int user = sc.nextInt();
			ex2.randomck(pc,user);
			String out = ex2.result();
			System.out.println(out);
			int check = out.indexOf("����");	
			//indexOf : �ܾ�˻� (-1 : ����, 1 : ����)
			if(check==0) {
				break;
			}
			w--;
		}while(w > 0);
		sc.close();

	}

}

class pt {
	public void display() {
		System.out.println("�θ� �ܺ� ���밪");
	}
}
class cd extends pt {
	/*
	 	!- aaaa() �޼ҵ�� �������̼��� ������� ����. �θ� class���� �������� �ʾ��� -!
	 
	 	@Override -> �θ� Ŭ������ ���� �޼ҵ� ���� ����, �ذ��Ϸ��� �θ� Ŭ������ ���� �޼ҵ带 ������ָ� �� public void
	 	aaaa() { System.out.println("�ڽĿ� ������� �޼ҵ�"); }
	 */
	@Override // �������̼�(ǥ��) ���� �߻��� Ȯ�� (�������̵忡�� ����)
	public void display() { // �������̵�
		System.out.println("�ڽ� Ŭ���� ������ ����");
		super.display(); // super : �θ� �ִ� ���� �Ӽ� �޼ҵ尪�� ������ �� ����մϴ�. (�ʵ忡 ������� ���� ���� ������ ��)
	}
	public void display(String msg) { // �����ε�
		System.out.println(msg);
	}
}
class main2 extends main3 {
	public void abc() {
		System.out.println("�ܺ� �޼ҵ� Ŭ����");
	}
}

class main3 {
	public void abc2() {
		System.out.println("�ܺ� �޼ҵ� Ŭ����2");
	}
}
class Inter implements Study_220609_connect { // interface > implements ���ÿ��� ���Ǵ� ���� �޼ҵ���Դϴ�.
	@Override
	public void c1() {
		System.out.println(names);
		System.out.println("interface_1");
	}
	public static void main5() {
		Inter it = new Inter();
		it.c1();
	}
}
class Bpart {
	private int val1; // pc
	private int val2; // user
	private String msg; // ��� �޽���
	public void randomck(int pc, int user) { // setter (�μ��� ����)
		this.val1 = pc;
		this.val2 = user;
		if (this.val1 < this.val2) {
			this.msg = "DOWN�Դϴ�.";
		} else if (this.val1 > this.val2) {
			this.msg = "UP�Դϴ�.";
		} else {
			this.msg = "�����Դϴ�.";
		}
	}
	public String result() { // getter(�μ���x) return
		return this.msg;
	}
}