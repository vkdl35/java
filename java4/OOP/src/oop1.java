import java.util.Scanner;

public class oop1 {

	public static void main(String[] args) {
		//��͸޼ҵ� ����
		op_method om = new op_method();
		om = null;

	}

}

/*��͸޼ҵ� : �޼ҵ带 ���� �Ǵ� �������� ȣ���ϴ� ���μ����� ���մϴ�.
 * �ݺ���, �ܺ� Ŭ������ ����� �� ������ ������ ���� �ذ��ϱ� ���ؼ� 
 * �����ϴ� �޼ҵ� ���¸� ���մϴ�.*/

class op_method{
	Scanner sc = new Scanner(System.in);	//�޼ҵ忡 ���� ��� new�� ����, �ʵ�� ���ֱ�
	private String nm;
	public op_method() {	/*���� ���� �޼ҵ�*/
		this.m1();		//�������ڸ��� m1 �޼ҵ� ȣ��
	}
	public void m1() {	/*�޼ҵ� m1 �۵�*/
		System.out.println("ã�� �̸��� �Է��ϼ���.");
		this.nm = sc.next();
		this.m2();	//m2�� �ε�
	}
	public void m2() {	/*m1�� ���� ������� m2�� Ȯ��*/
		if(this.nm.equals("ȫ�浿")) {
			sc.close();
			System.exit(0);	//ȫ�浿�� �����ÿ� ����
		}
		else {
			System.out.println("�ش� �̸��� �����ϴ�.");
			this.m1();	/*m1�� �ٽ� ��ȣ��(��͸޼ҵ�)*/
			//ȫ�浿�� �ƴҽ� m1�� �ٽ� ����
		}
	}
}