
public class Datatype {

	public static void main(String[] args) {
		//String : ���� "" ������ ���
		String a = "1234"; 
		System.out.println(a);
		/* ������ */
		byte b = 127; //byte : -128~127
		System.out.println(b);
		
		short c = 32767; //short : -32,768 ~ 32,767
		System.out.println(c);
		
		int d = 1000000; //int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long f = 999999999; //long ���� ���� L ����ؾ���
		//long : 9,000,... 18��  �⺻�޸� �Ҵ翡�� �߰������ ���ɹ����� �þ
		System.out.println(f);
		/* ������ �� */
		
		/* �Ǽ��� */
		float z = 3.5f; //3.4024800000... +38 (f�� ������ ����ؾ���)
		System.out.println(z);
		
		double k = 44.5178; //1.784... +308 (d�� ��� ��/�� ��ε�)
		System.out.println(k);
		/* �Ǽ��� �� */
		
		
		/*
		 String�� ���� �ڷ����̱� ������ ������ ""�� ����Ѵ�.
		 ���ڸ� ����ϰ� ������ �ٸ� �ڷ����� ����Ѵ�.
		 byte
		 short
		 int
		 long
		 �� �⺻���� ���̰�, �������� �������� ũ�� ���̴�.
		 ������ Ŀ������ �޸� ��뷮�� �þ�� ������ ��Ȳ�� �´� �ڷ����� ���� �� ������,
		 long���� ū ���� ������ �� �� ���� �ڿ� L�� �ٿ� �޸𸮸� �߰����ش�.
		 
		 ��)
		 long a = 9999999999999L;
		 System.out.println(a);
		 
		 
		 �Ǽ���(�Ҽ���)�� ���Ǵ� �ڷ����� �ٸ���.
		 float
		 double
		 �������� ���������� �������� �޸� �뷮 ���̴�.
		 ������ float �Լ��� �� ���� �Ҽ��� ���� �ڿ� �� f�� �ٿ�����Ѵ�.
		 (�ٿ����� ���� ��� ��µ��� �ʴ´�.)
		 doubel ���� d�� �ٿ��൵ ������,
		 ��Ŭ���� ������ ������Ʈ �Ǹ鼭 ������ ����������.
		 
		 ��)
		 float a = 1.55f;
		 System.out.println(a);
		 
		 double b = 1.54845684;
		 System.out.println(b);
		 */
	}

}
