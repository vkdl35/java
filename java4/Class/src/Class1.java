/* �θ� Ŭ���� �� �ڽ�(����)Ŭ���� ���� */
public class Class1 {

	public static void main(String[] args) {
		/* �θ� �ν��Ͻ��� ������ ���� ������ �ڽ� class�� ���� ȣ������ ���� */
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child(); //�θ�class.�ڽ�class �̸����� = �θ�class��.new �ڽ�class();
		//Ŭ������ ȣ������ ������ �ٷ� ������ �� ����(�θ� class�� ���� �����ؼ� ȣ���ؾ߸� �ڽ� class�� ȣ���� �� ����
		//�߸��� ����) parents.child pc = parents.new child(); 
		pc.c_box();

	}

}

class parents {	//�θ� Ŭ����
	String a = "ȫ�浿";	//�θ� �ʵ忡 �ִ� ��������
	String b;
	class child {	//�ڽ� Ŭ����
		int a = 20;
		public void c_box() {	//�ڽ� �޼ҵ�
			double c = 10.5;
			System.out.println(c);	//�ڽ� �޼ҵ� ���� ��������
			System.out.println(this.a);	//�ڽ� Ŭ���� ���� ��������
			System.out.println(parents.this.a);	//�θ� Ŭ���� ���� ��������
			/*�ڽ�class �ʵ峪 �޼ҵ忡 a������ ������ a�� ������� �� �θ�class�� �ִ� ȫ�浿�� ȣ�� �����ϱ��ϳ�,
			 *������ ���� �����Ǹ� �򰥸� �� �ֱ� ������ �θ�class ���������� ȣ���� �� ����� �����ִ°� ����.*/
			System.out.println(parents.this.b);	
			/*�θ�class�� �ִ� �޼ҵ� �ȿ� �ִ� ���������� �ҷ��� �� ����. �θ�class �ʵ忡 ���������� ������ �� ����� �� ����.*/
			
			/*class�ȿ� �ִ� class�� ��Ӱ����� ���� ������ �θ�class �ʵ忡 �ִ� ���������� �ҷ����� ���� ��
			  �θ�class��.this.������ �� ����߸� ����� ������*/
		}
		
	}
	
	public void p_box() {	//�θ� �޼ҵ�
		String a = "�̼���";	//�ش� �޼ҵ� �ȿ����� ��� ������ ��������
		this.b = a;
		System.out.println(a);	//this�� ������ ������ �ش� �޼ҵ� �ȿ� �ִ� ������ �ҷ���
		System.out.println(this.a);	//this�� �ʵ忡 �ִ� ���������� �ҷ��´ٴ� ��
	}
}
/* �ڽ� Ŭ���� �ȿ� �� �ڽ� Ŭ������ ���� ���� �ְ�, �޼ҵ� �ȿ� Ŭ������ ���� ���� ���� */