import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��4] -> ����
		 * �����ڿ��� �޴��� Ȱ��ȭ�ϴ� ���μ����Դϴ�.
		 * �ش� �޴� Ȱ��ȭ�� 2�� �迭�̸�, �޴���� Ȱ��ȭ�ϴ� (Y,N)���� �����մϴ�.
		 * �ش� Ȱ��ȭ ���� �����Ͽ� Y�� ����Ǵ� �ε��� ��ȣ�� �´� �޴����� 1�� �迭�� �籸�� �� ���ο��� ����ǵ��� �մϴ�.
		 * �ܷΰ� : ["���Ϲ��","����������","���ڽ�","�̺�Ʈ","�߼�"]
		 * �� private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��մϴ�.
		 * **�迭 �����ؾ���
		 */
		
		menus m1 = new menus();
		String ap[] = m1.aaa();
		System.out.println(Arrays.toString(ap));
		
		//System.out.println(Arrays.toString(m1.get()));

	}

}

class menus {
	private String[][] m;
	private String[] box;
	private int ct;

	public menus() {
		String ms[][] = { 
				{ "���Ϲ��", "����������", "���κ���", "���ڽ�", "�̺�Ʈ", "����", "�߼�" },
				{ "Y", "Y", "N", "Y", "Y", "N", "Y" } 
			};
		this.m = ms;
	}

	public String[] aaa() {
		int ea = this.m[0].length;
		this.box = new String[5];
		int w = 0;
		this.ct = 0;

		while (w < ea) {
			if (this.m[1][w].equals("Y")) {
				this.box[this.ct] = m[0][w];
				this.ct++;
			}
			w++;
		}
		return this.box;
	}
}

/*

class menus {
	private String[][] m;
	private String[] r = new String[5];

	public menus() {
		String ms[][] = { { "���Ϲ��", "����������", "���κ���", "���ڽ�", "�̺�Ʈ", "����", "�߼�" },
				{ "Y", "Y", "N", "Y", "Y", "N", "Y" } };
		this.m = ms;
		redata();

	}

	public void redata() {
		int ea = this.m[0].length;
		int w = 0;
		int ct = 0;
		String ww[] = new String[ea];
		do {
			if (this.m[1][w].equals("Y")) {
				ww[ct] = this.m[0][w];
				ct++;
			}
			w++;
		} while (w < ea);

		this.r = ww;

	}

	public String[] get() {
		return this.r;
	}

}

*/


/*
	class{
	int a;		-> field(�ʵ� ����)
	String b;
		public aaa(){		->constructor (���� ���� ����)
			
		}
		-> method (�޼ҵ�): Ŭ�������� ���� ���� ����
		public void
		public static void
		public String abc
	}
*/