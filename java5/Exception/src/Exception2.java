
public class Exception2 {

	public static void main(String[] args) {
		
		try {
			//test();	//�޼ҵ� ȣ�� ��ü ������ ������ Exception�� ���谡 ����
			Exception2 ex = new Exception2();
			String a = "ȫ�浿2";
			ex.test(a);
		}
		catch (Exception i) {
			System.out.println(i);
		}
		
	}
	public void test(String b) throws Exception,NumberFormatException {	//throws�� main �޼ҵ忡�� ����ó�� ���� �ش� �޼ҵ带 ȣ���� ��츦 ���� ���� ���
		//throws Exception ���� ������ �ʿ��� ������ try~catch���� ����ؾ���
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c;	//�ڵ� �� �ؿ� ����� �ϸ� throw = return ����� ������ ����
		//����ó�� ����� ���� ���� ���� �޼ҵ�� �ٽ� return
	}

}
