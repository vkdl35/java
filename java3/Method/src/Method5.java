
public class Method5 {

	public static void main(String[] args) {
		
		cdb c = new cdb();
		/*
		c.d1 = "ȫ�浿";
		c.data2();
		c.d3 = "�̼���";
		c.data1();
		c.d3= "������";
		System.out.println(c.data3());
		*/
		
		//c.d2 = "������"; /* private���� ������ ��ü�̹Ƿ� main class���� �ε� ���� */
		c.data2("������");
		String result = c.data3();
		System.out.println(result);
		c.data1(); //static�� �����ϸ� �� �ȵȴٰ�
	}

}

class cdb{ 
	String d1 = null;	/* void, �ڷ��� �޼ҵ� �ε� ���� */
	private String d2;	//�ܺ� class���� private�� ���������� �����͸� ���� �� ����
	public static String d3;	/* ���� ��� ���� */
	public static void data1() {	/* static �ڷ��� �ܿ��� �ε尡 �Ұ����� */
		//System.out.println(d3);
		//**System.out.println(this.d2);	//static�� this ��� �Ұ���(void�� public�� ��� ����)
		String d1 = "ȫ�浿";	//string�� ������ �޾���߸� ��� ����
		System.out.println(d1);
		
	}
	public void data2(String user) {
		//System.out.println(d1);		
		this.d2 = user;	//�޾Ƽ� ó���ؾ���
		System.out.println(this.d2);	//this�� �Ƚᵵ ����� ��		
	}
	public String data3() {
		//String a = "";
		String a = this.d2;
		return a;
	}
}