package Ab;

import java.util.Arrays;
//method_1a.java
public class method_1 {
	
	public void recall() {	//Ab2 ��Ű���� �������� �޼ҵ�
		//package Ab2���� import �� �� �ֵ����ϸ�, �ܺ� Ŭ������ �����ϰ� ��� ����������
		System.out.println("test");
	}
	protected static void name() {	//protected static�� �����ؾ߸� Ab2 ��Ű���� ���� ����
		System.out.println("lee");
	}

	public static void main(String[] args) {
		/* Arrays.sort : �迭 �������� ���� (����,�ѱ�,����) 
		   ��, ������ ��� �빮�ڰ� ���� ���� ������������ ���ĵ˴ϴ�. */
		
		/*
		int number_data[] = {5,7,1,4,9,2};
		Arrays.sort(number_data);	//������������ ������ ����
		System.out.println(Arrays.toString(number_data));	//��� ���� �߿�
		
		String user_data[] = {"ȫ�浿","�̼���","�庸��","������"};
		Arrays.sort(user_data);	//�����ٶ������ ������ ����
		System.out.println(Arrays.toString(user_data));
		*/
		
		/*
		 ������ 2�� �����ؼ� �ϳ��� ����, �ϳ��� ����
		 ���� ���Ե� ����� ���̵� Ȯ�� �� �ش� ����Ʈ�� �����ǵ��� �մϴ�.
		 ��, ���� ����Ʈ + ������ ����Ʈ�� ���� ����� ����ϼ���.
		 ����� ���� Ŭ�������� �մϴ�.
		 �迭������ : 
		 */
		
		/*
		
		ide_mth1 im = new ide_mth1();
		im.setter(user,point);
		*/
		
		String user = "lee";
		int point = 2500;
		
		ide_mth1 m1 = new ide_mth1();
		m1.setter(user,point);
		System.out.println(m1.getter());
		
		
		
		
	}

}

class ide_mth1 extends mth1 {
	private String member_ship[][];
	private String data1;
	private int data2;
	private int ea;
	private int total;
	public ide_mth1() {
		this.member_ship = new String[][] { 
			{ "kim", "park", "seo", "oh", "lee", "jang", "jeong", "cho", "ha", "wang" },
			{ "1500", "800", "2000", "1000", "4200", "2200", "3000", "500", "1000", "1800" } 
		};
		this.ea = this.member_ship[0].length;
		
	}
	

	@Override
	public void setter(String data1, int data2) {	//���ʹ� ���� �޾Ƽ� �����ϰ� �ٸ� �޼ҵ�� �����ϴ� ����
		this.data1 = data1;
		this.data2 = data2;
		this.loops(this.data1, this.data2, this.ea);
		
		
		/*
		if(data3.equals("����")) {			
			this.loops();
		}
		else {
			this.loops2();
		}
		*/
	};
	/*this�� �����ϰ� �ڵ带 �޸𸮿� �÷����� �� ��*/
	public void loops(String a, int b, int c) {	
		int w = 0;
		while(w < c) {
			if(this.member_ship[0][w].equals(a)) {
				this.total = Integer.parseInt(this.member_ship[1][w])+b;
			}
			w++;
		}
		
	
	}

	@Override
	public void setter(int data3[]) {
	};

	@Override
	public String getter() {
		String print = this.data1 + "�� ����Ʈ��" + this.total + "���� �Ǿ����ϴ�.";
		return print;
	};
}

/*
class ide_mth1 extends mth1 {
	private String member_ship[][];
	private String user2;
	private int point2;
	private int total;
	@Override
	public void setter(String data1, int data2) {
		this.member_ship = new String [][] { 
				{ "kim", "park", "seo", "oh", "lee", "jang", "jeong", "cho", "ha", "wang" },
				{ "1500", "800", "2000", "1000", "4200", "2200", "3000", "500", "1000", "1800" } 
		};
		this.user2 = data1;
		this.point2 = data2;
		int w = 0;
		while(w < member_ship[1].length) {
			if(this.(member_ship[0][w]).equals(this.user2)) {
				this.total = Integer.parseInt(member_ship[1][w]);
			}
			w++;
		}
		this.total+=this.point2;
		System.out.println(user2+"�� �� ����Ʈ�� "+getter()+"���Դϴ�.");
	};
	@Override
	public void setter(int data3[]) {};
	@Override
	public int getter() {
		return this.total;
	};
}
*/