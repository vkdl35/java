import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		//abstract ���빮��
		/*
		 * 1�� �迭���� �ֽ��ϴ�.
		 * �ش� �迭���� ��� ���� ���� ����մϴ�.
		 * ��, abstract �⺻ void �̸��� sender �Դϴ�.
		 * ������ ����� sender���� ��µǵ��� �մϴ�. 
		 * �迭�� abstract���� ����մϴ�. *���ο��� ȣ�⸸
		 * �迭 ������ : 6,13,22,9,12,64,32,47,39
		 */
		
		/*	//���� Ǭ ����
		od1 o = new od1();
		o.sender();
		*/
		
		arr1 ar = new arr1();
		
	}

}
/*	//���� Ǭ ����
abstract class ak3 {
	protected int e[] = {6,13,22,9,12,64,32,47,39};
	public abstract void sender();
}

class od1 extends ak3{
	@Override
	public void sender() {
		int w = 0;
		int total = 0;
		while(w < this.e.length) {
			total+=e[w];
			w++;
		}
		System.out.println(total);
	}
}
*/
abstract class vdata {
	public abstract void sender();
}
class arr1 extends vdata {
	private int alldata[];
	public arr1() {
		this.alldata = new int[] { 6, 13, 22, 9, 12, 64, 32, 47, 39 };
		this.sender();
	}
	@Override
	public void sender() {
		int w = 0;
		int total = 0;
		while (w < this.alldata.length) {
			total += this.alldata[w];
			w++;
		}
		System.out.println("�� �հ� : "+total);
	}
}