
public class oop5 {
	//abstract ���� �⺻���� �μ������� �߻� �޼ҵ�� ���� �ѱ�
	public static void main(String[] args) {
		
		load1 ld1 = new load1();
		ld1.datain(20,30);
		ld1.call();
		load2 ld2 = new load2();
		ld2.datain(20,30);
		ld2.call();
		
	}

}

abstract class abclass {
	int data1, data2;
	public void datain(int d1, int d2) {	
		/*�⺻ �߻� �޼ҵ��̸� ��� �����͸� �μ��� �޾Ƽ� this ó��
		 * ��, �ܺ� class���� �������� ����*/
		this.data1 = d1;
		this.data2 = d2;
	}
	public abstract void plus();	//�ڽ� Ŭ�������� ������ ����϶�� ��
	/*������ class�� �⺻���� plus �޼ҵ�� ������ ������*/
	public void call() {
		this.plus();	//������ ����϶�� ���������, �θ� Ŭ�������� �ڽ� �޼ҵ带 �ҷ���� �ڵ尡 �������
	}
}
class load2 extends abclass{

	
	@Override
	public void plus() {
		int sum = this.data1 * this.data2;
		System.out.println(sum);
		this.avg();
	}
	
	public void avg() {	//avg���� �ε��Ϸ��� plus �޼ҵ忡�� ȣ���ϸ� ��
		System.out.println("ȫ�浿");
	}
	
}
class load1 extends abclass{
	@Override
	public void plus() {
		int sum = this.data1 + this.data2;
		System.out.println(sum);
	}

}

