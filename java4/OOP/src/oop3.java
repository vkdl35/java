
public class oop3 {
/*��Ƽ ������(Multi Thread) : start , run , sleep , setStop */
/*��Ƽ ������ : CPU�� �ھ�� ���谡 �ֽ��ϴ�.*/
	public static void main(String[] args) {
		/*������(Thread) : ���μ��� ���ο��� ���������� ����Ǵ� �۾�*/
		/*��Ƽ ������(Multi Thread) : ���μ��� ���ο��� �ΰ��� �̻��� �۾��� ���� ���*/
		Thread my = new mythread();	/*�θ� �޼ҵ� = �ڽ� �޼ҵ�*/
		my.start();
		//my.pulib();
		Thread my2 = new test2();
		my2.start();	/*Thread �޼ҵ忡 �⺻ run�� �۵��ϱ� ���� start ��ɾ��Դϴ�.*/
		int f = 1;
		while(f < 11) {
			System.out.println("���� Ŭ���� : "+f);
			f++;
		}
		
	}

}
class test2 extends Thread{
	@Override
	public void run() {
		int f = 1;
		while(f < 11) {
			System.out.println("�ܺ� Ŭ����2 : "+f);
			f++;
		}
	}
}

class mythread extends Thread{	/*Thread : JVM�� �⺻���� ž�� �Ǿ� �ִ� �޼ҵ�(Thread�� �ܵ����� ������� ����)*/
	@Override
	public void run() {	/*run�̶� : ��Ƽ�޼ҵ� �⺻ ���� �޼ҵ�*/
		int w = 1;
		while(w < 11) {
			System.out.println("�ܺ� Ŭ���� : "+w);
			w++;
		}
	}
}