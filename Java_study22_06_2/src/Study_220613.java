import java.util.Arrays;
import java.util.Scanner;

public class Study_220613 {

	public static void main(String[] args) {
		
		/* ��� �޼ҵ� �� 74 */
		
		op_mathod op = new op_mathod();	//���ο��� ȣ�⸸ 
		op = null;
		
		/* �迭 �ű� �������� ��Ȯ�ϰ� �����Ͽ� �ű� �迭�� �����ϱ� �� 96 */
		
		array1 ar = new array1();
		ar = null;
		
		/* ��Ƽ ������ : ����, �ܺ� Ŭ���� �޼ҵ� ���� ���������� ����(���������� ������� �ʴ´�) �� 126*/
		
		Thread my = new mythread();	//�θ� �޼ҵ忡 �ִ� �ڽ� �޼ҵ带 �ҷ����� ��
		my.start(); //Thread �޼ҵ忡 �⺻ run�� �۵���Ű�� ���� start ��ɾ�
		int f = 1;
		while(f < 11) {
			System.out.println("���� Ŭ����" + f);
			f++;
		}
		my = null;
		
		/* �߻� Ŭ���� �� �޼ҵ� abstract �� 137 */
		
		ab_2 ab = new ab_2();
		ab.ab_a();
		ab = null;
		
		/* abstract ���� �� 157 */
		
		load1 ld = new load1();
		ld.datain(20, 30);
		ld.call();	/* ! �ڽ� Ŭ������ ���������� �ڽ� Ŭ���� �ȿ� �ִ� �޼ҵ带 ȣ���ص� ���� �ʳ�? */
		ld = null;
		
		/* �迭 ������ ������ ��ü �߻�Ŭ���� ����� �� 174 */
		
		box[] b = {new abox(),new bbox(),new cbox()};
		int k = 0;
		while(k < b.length) {
			/* ���� ������ �ε��� 1���� �ش��ϴ� Ŭ���� ��� ������� */
			if(k != 1) {	
				b[k].dataload();
			}
			k++;
		}
		//foreach�� ������ Ư�� Ŭ������ ������ �� ����
		
		
		/*
		 * [���빮��1] - abstract	�� 195
		 * 1�� �迭���� �ֽ��ϴ�.
		 * �ش� �迭���� ��� ���� ���� ����մϴ�.
		 * ��, abstract �⺻ void �̸��� sender �Դϴ�.
		 * ������ ����� sender���� ��µǵ��� �ϸ�, �迭�� abstract���� ����մϴ�.
		 * ȣ���� ���ο����� �����մϴ�.
		 * �迭 ������ : 6,13,22,9,12,64,32,47,39
		 */
		
		od2 o = new od2();
		o.sender();
		o = null;
		
	}

}

class op_mathod {	//  �� 8
	Scanner sc = new Scanner(System.in); 
	//�޼ҵ峪 ���ο� �����ϸ� ��� new�� �����Ǹ鼭 �޸𸮸� ��Ƹ���. �ʵ�� ���༭ �ѹ��� ����ϱ�
	private String nm;
	public op_mathod() {	//(1) ���� ���� ����Ǵ� �޼ҵ�,  m1�� ȣ��
		this.m1();
	}
	public void m1() {	//(2) �޽��� ��°� ����� �Է� ��ĳ�� ����
		System.out.println("ã�� �̸��� �Է��ϼ���.");
		this.nm  = sc.next();
	}
	public void m2() {	 
		if(this.nm.equals("�̰��")) {	//(3) ���ǹ����� ����� �Է°� �߿� �̰���� �ִٸ�
			sc.close();	
			System.exit(0);	//(4) ��� �ý��� ���� (��ĳ�ʵ� ����)
		}
		else {	
			System.out.println("�ش� �̸��� �����ϴ�.");	//(5) ���� �� ������ �ƴҽ� ��°� �Բ�
			this.m1();	//(6) �ٽ� m1���� ���ư��� �����
		}
	}
}
class array1 {	//  �� 13
	private int ar1[];	//(1) �ʵ尪���� ����
	private int ea;
	public array1() {
		this.ar1 = new int[] {1,2,6,11,45,19,0,4,8};
		this.ea = this.ar1.length;
		int w = 0;
		String newdata = "";
		while(w < ea) {	
			/*���� ������ 5�̻��� �迭���� ����������*/
			if(this.ar1[w] >= 5) {
				newdata += this.ar1[w] + ",";
				//(2) �ݺ����� ���ǹ����� �迭�� �� 5�̻� string ������ ���(���ڿ��� ��ȯ)
			}
			w++;
		}
		String ar2[] = newdata.split(",");
		//(3) ����� ���ڿ��� ���ø����� �����Ͽ� �迭�� �ӽ���ȯ (���ø��� ���� �ڷ����� ��� ����)
		int ar2_ea = ar2.length;
		int oridata[] = new int[ar2_ea];	
		//(3) �� �迭�ڽ��� �Ʊ� �̾Ƴ� �ε������� ������ŭ ���ٰ� ���� (�迭 �ű� ������)
		int ww = 0;
		while(ww < ar2_ea) {
			oridata[ww] = Integer.parseInt(ar2[ww]);
			//(4) �ݺ����� ������ ���� ���� ������ oridata �迭 �����Ͱ��� ���ڷ� ��ȯ
			ww++;
		}
		System.out.println(Arrays.toString(oridata));
	}
}
class mythread extends Thread {	//  �� 18
	//Thread�� �ڹٿ��� �⺻���� ������ �޼ҵ��
	@Override
	public void run() {	//���������� �⺻���� ������ �޼ҵ� �̸�, ��ɾ��� �����ϸ� ����
		int w = 1;
		while(w < 11) {
			System.out.println("�ܺ� Ŭ����" + w);
			w++;
		}
	}
}
abstract class ab_1 {	//  �� 29
	//�߻� Ŭ������ �ܺο��� ���� �ε���� ���� - ��ü ���� �Ұ�
	public void ab_a() {
		/* �θ� Ŭ���� �ȿ� ���� ������ �ڽ� Ŭ�������� ���� �޼ҵ� ��� �Ұ�
			��, ���ڰ��� ������ ���� ����� ������ ���� ���� */
	}
	public abstract int c();	
		/* �߻� �޼ҵ� - ��ü ���� �Ұ� �� ������ �ڽ� Ŭ�������� ����ؾ� ��
			�θ� Ŭ������ abstract�� ���������� �ڽ� �޼ҵ忡�� �ݵ�� ����ؾ� �� 
			abstract�� ���� �޼ҵ�� ������ �߰�ȣ�� �־�� ��� ���� */
}
class ab_2 extends ab_1{	
	public void ab_a() {
		System.out.println(this.c());
	}
	@Override
	public int c() {
		return 99;
	}
}
abstract class abc{	//  �� 35
	int data1, data2;
	public void datain(int d1, int d2) {	//(1) main���� �����͸� ����
		this.data1 = d1;	//(2) �ʵ尪�� �ִ� ������ �־���
		this.data2 = d2;
	}
	public abstract void plus();	//(3)�ڽ� Ŭ������ plus �޼ҵ带 ������ ����ض�
	public void call() {
		this.plus();	/* ! �θ� �޼ҵ忡�� ȣ���ؾ� �ڵ尡 ��������ٴµ� �� �𸣰ڴ� */
	}
}
class load1 extends abc {
	public void plus() {	//(4) �θ� Ŭ������ ������ plus �޼ҵ带 ���
		int sum = this.data1 + this.data2;
		System.out.println(sum);	//(5) ����� ���, main���� ȣ�����ָ� ��� ����
	}
}
abstract class box {	//  �� 42
	public abstract void dataload();
}
class abox extends box {
	@Override
	public void dataload() {
		System.out.println("test");
	}
}
class bbox extends box {
	@Override
	public void dataload() {
		System.out.println("test2");
	}
}
class cbox extends box {
	@Override
	public void dataload() {
		System.out.println("test3");
	}
}
abstract class fii {	//  ��57
	protected int i[] = {6,13,22,9,12,64,32,47,39};
	public abstract void sender();
}
class od2 extends fii {
	public void sender() {
		int w = 0;
		int total = 0;
		while(w < i.length) {
			total += i[w];
			w++;
		}
		System.out.println(total);
	}
}