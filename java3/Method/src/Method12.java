
public class Method12 {

	public static void main(String[] args) {
		//extends�� ����� �ڽ� class�� �ε��ϰ� �Ǹ� �ڵ����� �θ� class�� �Բ� ����� ������
		bbox2 bx = new bbox2();
		bx.b2("�̼���");
		System.out.println(bx.abc());

	}

}

class bbox{	//�⺻ �ܺ� class1 main���� �ʿ��� ������ üũ
	protected String user_info;
	private String user_pw;	//private�� extends�� ��� �Ұ���
	public String user_rpw;
	public bbox() {
		this.user_pw = "abcd";
		this.user_rpw = this.user_pw.replace("abcd","542f3#$d451");	//�޼ҵ带 ���� ���� ��ȣȭ �� ��� ����
		
	}
	public String abc() {	//��°�� ��� �ޱ� ������ main���� bx.abc()�� ��°��� 
		String email = "hong@naver.com";
		return email;
	}
}

class bbox2 extends bbox {	//bbox�� ���� ��� ������ bbox2�� �����ϰ� ��
	//��, bbox �߿��� private���� ���õ� ���� �������� ����
	public void b2(String nm) {	//main class���� bbox2�� �ε� �� 
		//�ش� ���� �μ����� �����Ͽ� bbox class�� �ִ� �ʵ�� �� user_info�� �����ϰ� �Ǵ� ����
		this.user_info = nm;
		System.out.println(this.user_info);
		System.out.println(this.user_rpw);
		
	}
}