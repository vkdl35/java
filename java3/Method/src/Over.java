
public class Over {

	public static void main(String[] args) {
		
		//pt p = new pt();
		//p.display();
		cd c = new cd();
		c.display("���� ���밪 ���");	//�����ε�
		c.display();	//�������̵�
		
		

	}

}
/*  
 	�����ε�(overloading) : ���ο� �޼ҵ带 �����ϴ� ���� ���մϴ�.
 	�������̵�(override) : �θ� Ŭ�������� ��� ���� ���� �޼ҵ带 ����ϴ� ���� ���մϴ�.
 */
class pt {
	public void display() {
		System.out.println("�θ� �ܺ� ���밪");
	}
	
}

class cd extends pt{
	//aaaa() �޼ҵ�� �������̼��� ������� ����. �θ� class���� �������� �ʾ���
	/*
	@Override	-> �θ� Ŭ������ ���� �޼ҵ� ���� ����, �ذ��Ϸ��� �θ� Ŭ������ ���� �޼ҵ带 ������ָ� ��
	public void aaaa() {
		System.out.println("�ڽĿ� ������� �޼ҵ�");
	}
	*/
	
	@Override	//�������̼�(ǥ��) ���� �߻��� Ȯ�� (�������̵忡�� ����)
	public void display() {	//�������̵�
		System.out.println("�ڽ� Ŭ���� ������ ����");
		super.display();	//super : �θ� �ִ� ���� �Ӽ� �޼ҵ尪�� ������ �� ����մϴ�.
	}
	
	public void display(String msg) {	//�����ε�
		System.out.println(msg);
	}
	
}
/*
�����ε� : ���� Ŭ���� �ȿ� �޼ҵ� �̸��� ���Ƶ� �޼ҵ� ���°� �ٸ��� (�μ��� �ڷ��� ��) ���� ���� �۵��ȴ�. (���� �ߺ����� ������ ��)
public void name() 
public void name() -> x
public void name(String a) -> o
public void name(String b) -> x
public void name(int a) -> o
public void name(double a) -> o
���
���� �޼ҵ��� ���¸� �ߺ����� ����� ������ �ڽ� �޼ҵ�� �������̵� �ϸ� ��
*/