import java.util.Arrays;

public class Study_220607 {

	public static void main(String[] args) {
		
		/* public �ڷ������� �޼ҵ� �Լ� ���� */
		
		t1 t = new t1();
		t.a1++;
		t.a2++;
		t.name1();
		t.b1 += "������";
		t.b2 += "������";
		t.name3();
		t1 tt = new t1();
		tt.a1++;
		tt.a2++;
		tt.name2();
		tt.b1 += "������";
		tt.b2 += "������";
		tt.name4();
		//static ���� �޸𸮿� �����Ǳ� ������ ���� �ʱ�ȭ���� ����
		t = null;
		tt = null;
		
		/* return ���� */
		
		t2 ta = new t2();
		//ta.data1(20);
		System.out.println(ta.data2(20));	
		//public �ڷ��������� sysout ��� �Ұ�, main���� ó������� ��
		String re = ta.data3("�̰��");
		System.out.println(re);
		//�޴� ������ ���� ���� ����ص� ��
		
		/* return ���ǻ��� */
		
		System.out.println(ta.mb("lee"));
		ta = null;
		
		/* return�� �� 2�� ����ϱ� - split ��� */
		
		per p = new per();
		String info = p.userinfo();	//�迭 �����͸� info�� �Ѱ���
		String info2[] = info.split(",");	//���ø����� ���� �迭���� �迭�ڽ��� �����
		System.out.println(Arrays.toString(info2));
		
		
		

	}

}

class t1 {
	int a1 = 1;	
	//(��������) : ���ο� ��ü ���� �� Ŭ���� ȣ��� 1�̶�� ���ڸ� �ٽ� ������ ��
	public static int a2 = 1;	
	/* (��������) : ���ο� ��ü ���� �� Ŭ������ ȣ���ص� 1�̶�� ���ڰ� �ƴ�, 
				  �޸𸮿� ��ϵ� �������� ���������� ������ �� */
	String b1 = "�̼���";
	public static String b2 = "ȫ�浿";
	public void name1() {
		System.out.println(a1);
		System.out.println(a2);
	}
	public void name2() {
		System.out.println(a1);
		System.out.println(a2);
	}
	public void name3() {
		System.out.println(b1);
		System.out.println(b2);
	}
	public void name4() {
		System.out.println(b1);
		System.out.println(b2);
	}
}
class t2 {
	public static void data1(int ii) {
		//static �Ǵ� void �޼ҵ忡�� return ��� �Ұ�
		int z = ii+20;
		System.out.println(z);
	}
	public int data2(int ii) {	//�ڷ��� �޼ҵ忡���� ���� ��� ����
		int z = ii+20;
		return z;
	}
	public String data3(String ii) {
		String z = ii+"�� ȯ���մϴ�.";
		return z;
	}
	public String mb(String id) {
		String msg = "";
		String msg2 = "�̰��";
		if(id.equals("lee")) {
			msg = "ok";
		}
		else {
			msg = "cancel";
		}
		return msg;
		//���Ͽ� ���� �ΰ� ���� �� ����, ������ �ι� ����� ���� ����
	}
}
class per {
	public String userinfo() {
		String user_name = "�̰��";
		String user_id = "lee";
		String user_info = user_name + "," + user_id;
		return user_info;
		
		
		//�޼ҵ�3
		
		
	}
	//return new String[] {user_name,user_id};	-> �ٷ� ������ ��
	//���� �ΰ� �������� ��� �迭�� ���� ���� �� �ִ�.
}
