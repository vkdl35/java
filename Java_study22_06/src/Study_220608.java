import Study_package.Study_220608_connect;	//�ܺ� Ŭ���� ȣ��

public class Study_220608 {

	public static void main(String[] args) {

		/* getter setter */
		
		met m = new met();
		m.setUser_name("ȫ�浿");
		m.setUser_pass("a123456");
		m.setUser_email("abc@md.df");
		System.out.println(m.getUser_name());
		System.out.println(m.getUser_pass());
		System.out.println(m.getUser_email());
		
		
		/* replace ���� - �ܾ �ٲٰų� ������ ������ �� ��� */
		
		String str = "ȫ�浿�� ȯ���մϴ�.";
		String str2 = str.replace("��", "����");		//�ܾ��
		System.out.println(str2);
		String nm = "ȫ �� ��";
		String nm2 = nm.replace(" ", "");	//��������
		System.out.println(nm2);
		
		/* �ܺ� Ŭ���� ȣ�� */
		
		Study_220608_connect a = new Study_220608_connect();	//main�޼ҵ带 �ε��ϰ� �˴ϴ�.
		//b.main(args);	//���� Ŭ���� ȣ��
		//�ٸ� ���Ͽ� �ִ� main class�� �ҷ��� �� sysout ���Ұ�(�ش� class main���� ����ؾ���)
		a.abox();
		
		/* extends */
		
		bix2 b = new bix2();
		b.bc("�̰��");
		
		/* extends ���� ���ǻ��� */
		
		mth1 m1 = new mth1();
		mth2 m2 = new mth2(0);
		
	}

}

class met {
	private String user_name;
	private String user_pass;
	private String user_email;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
}
class bix {
	private String user_pw;
	protected String user_id;
	public String user_rpw;
	public bix() {
		this.user_pw = "a1234";
		this.user_rpw = this.user_pw.replace("a1234", "feijf##*kg");
		
	}
}
class bix2 extends bix{
	public void bc(String lee) {
		this.user_id = lee;
		System.out.println(this.user_id);
		System.out.println(this.user_rpw);
	}
}
class mth1 {	
	public int no;
	public mth1() {	//constructor�� �μ����� ������ main���� ��� class�� �ε��� �� ����
		//constructor�� ����Ϸ��� �μ����� ������ �������
		this.no = 20;
		System.out.println("mth1");
	}
}
class mth2 extends mth1 {
	public mth2(int a) {
		this.no = 50;
		System.out.println(this.no);
		System.out.println("mth2");
	}
}