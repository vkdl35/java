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
		
		/* return�� �� 2�� ����ϱ� - �迭 ��� */
		
		String myinfo[] = p.userinfo2();
		System.out.println(Arrays.toString(myinfo));
		//System.out.println(myinfo[0]);	//�ϳ��� Ȯ��
		
		/* private */
		
		t3 t3_in = new t3();
		t3_in.dtr1("�ȳ�");
		System.out.println(t3_in.dtr2());
		t3_in = null;
		
		/* private�� ���� ��ü ���� ���� */
		
		String skey = "a1234567";
		t4 t4_in = new t4();
		t4_in.user_id ="lee";
		System.out.println(t4_in.checks(skey));
		t4_in = null;
		
		/* �ʵ尪 �̿��� */
		
		t5 t5_in = new t5("�̰��",29,"vkdl35@naver.com",6500);
		System.out.println(t5_in.data());
		System.out.println(t5_in.data2());
		t5_in = null;
		
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
	}
	public String[] userinfo2() {
		String user_name = "�̰��";
		String user_id = "lee";
		String user_array[] = {user_name,user_id}; //�ش� 1�� �̻��� ���� return���� ���� ���
		//���� �ΰ� �������� ��� �迭�� ���� ���� �� �ִ�.
		//return new String[] {user_name,user_id};	-> �ٷ� ������ ��
		return user_array;
	}
}
class t3 {	//Ŭ������ �ٷ� ���°� �ʵ尪�̶�� �Ѵ�.
	//�ʵ尪�� �÷������� Ŭ���� �ȿ� �ִ� ���� �޼ҵ忡�� ������ �� �� ����
	String ak1 = null;	//void, �ڷ��� �޼ҵ� �ε� ����
	private String ak2;	//�ش� Ŭ���������� ��� ����
	//public static String ak3;	//���� ��� ����
	
	public void dtr1 (String us) {
		this.ak2 = us;	//main���� ���� ���� �ʵ忡 �ִ� private �Լ��� ����
		System.out.println(ak2);
	}
	public String dtr2() {	//�ڷ����� return���� ������ & �ڷ������� ��� ����
		ak1 = "����Ǫ��";
		return ak1;
	}

}
class t4 {
	String user_id = null;
	private String key = "a1234567";
	public String checks(String key2) {
		String msg = null;
		if(key.equals(key2)) {
			if(user_id.equals("lee")) {
				msg = "������ Ȯ�� ��";
			}
			else {
				msg = "������ Ȯ�� �Ұ�";
			}
		}
		else {
			msg = "error";
		}
		return msg;
	}
}
class t5 {
	private String name;
	private int age;
	private String email;
	private int point;
	private String email_cp;
	public t5(String name2, int age2, String email2, int point2) {
		//setter ���� : ���ڰ��� �޾Ƽ� private�� �ѱ�� ����
		this.name = name2;
		this.age = age2;
		this.email = email2;
		if(point2 < 0) {	//����Ʈ�� ���������� �������� �ȵǴϱ�
			this.point = 0;
		}
		else {
			this.point = point2;
		}
	}
	public void ak9() {
		if(this.name == "�̰��") {
			this.name = "lee";
			String em[] = this.email.split("@");	//@�������� ������ �迭�� �����
			this.email_cp = em[1];	//�̸��� ȸ�� ������ ����
		}
	}
	public String data() {
		ak9();	//�Ⱥθ��� email_cp�� �ٷ� �����ϸ� main���� ����� �� null ��
		return email_cp;
	}
	public int data2() {
		//getter ���� : main�� private���� �����ִ� ����
		return this.point;
	}
}