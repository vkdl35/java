
public class Example4 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * �� ���� ���� �ܺ� Ŭ������ �����ϴ�.
		 * �ش� Ŭ�������� �� ���� ���� ����ϰ� �˴ϴ�.
		 * ��������� ������ �����ϴ�.
		 * 3, 10�� ������ �Ǹ� �� ���� ���� ���� ���մϴ�.
		 * ������ �ܺ� Ŭ�������� �ش� ������� ����ϴµ�,
		 * �ΰ��� �� ���� ¦��, Ȧ�������� ����ϴ� extends�� �����ϼ���.
		 */
		
		Bdata bd = new Bdata();
		bd.name(3,10);
		bd.name2();

	}

}

class Adata {
	protected int total;	//�հ�
	protected String msg;
	
	public void name(int a, int b) {
		this.total=a + b;
	}
}
class Bdata extends Adata{	//extends �ϰ� �Ǹ� �ڽ� Ŭ������ �޼ҵ� �ϳ��� �ʼ��� ������ �־�� �Ѵ�
	public void name2() {
		if(this.total % 2 == 1) {
			this.msg = "Ȧ���Դ�da.";
		}
		else {
			this.msg = "¦���Դϴ�.";
		}
		System.out.println(this.msg);
	}
}