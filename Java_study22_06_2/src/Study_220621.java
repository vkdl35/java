
public class Study_220621 {

	public static void main(String[] args) {

		int a;
		String b = "a1";
		try { // try : �ش簪�� int�� ������ (1)
			a = Integer.valueOf(b); // error �߻� : a1�̶�� �����ε�, ������ ���ڷ� ��ȯ�� a��� ���ڷ� ���Ͽ� ���� �߻� (2)
		} catch (NumberFormatException z) {
			System.out.println(z); // � �κп��� ������ �߻��ߴ��� ��� (3)
		} finally { // ����ó�� �߻��� ��ü
			b = b.replaceAll("[a-z][A-Z]", ""); // ������ ��ó�� (4)
			// a~z���� ���ڰ� ������ ����� �Լ�
			a = Integer.valueOf(b); // �ٽ� ������ ���ۼ��ؼ� ��� (5)
		}
		System.out.println(a); // ���� ����� ��� (6)

		try {
			// test(); //�޼ҵ� ȣ�� ��ü ������ ������ Exception�� ���谡 ����
			Study_220621 ex = new Study_220621();
			String a1 = "ȫ�浿2";
			ex.test(a1);
		} catch (Exception i) {
			System.out.println(i);
		}

		String data[] = { "hong45", "lee90", "kang100", "park70", "kim72" };
		Study_220621 st = new Study_220621();

		try {
			st.main2(data); // ���� �� �迭���� main2 �޼ҵ�� ����
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e); // ������ �������� ���
			}
		} finally { // ���� ó�� ��Ȳ�� �߻����� �� ��ü �Լ�
			String data2[] = new String[data.length];
			int r = 0;
			int w = 0;

			try { // ���� �����Ͱ� �޶������� try�� �ٽ� �ѹ� ���
				while (w < data.length) { // �ݺ����� ������ ���ڸ� �������� �� ���ο� �迭���� �����
					data2[r] = data[w].replaceAll("[a-z]", "");
					r++;
					w++;
				}
				st.main2(data2); // main2 �޼ҵ�� �ٽ� ����
			} catch (Exception e2) {
				if (e2.getMessage() != null) {
					System.out.println(e2);
				} else {
					System.exit(0); // �̹����� ���� �߻��� �۵� ����
				}
			}
		}

		try {
			Exception aaa = new Exception();
			throw aaa;
		} catch (Exception u) {
			if (u.getMessage() != null) {
				System.out.println(u);
			}
		}

		words wd = new words();

		try {
			String result = wd.files("");
			System.out.println(result);

		} catch (Exception q) {

			// System.out.println("�� ���� ������ �Ǿ� �ùٸ� ���� ���� ���� ����");

			if (q.getMessage() != null) {
				System.out.println(q);
			}

		} finally {
			try {
				String result = wd.files("ȫ�浿");
				System.out.println(result);
			} catch (Exception f) {
				System.exit(0);
			}

		}
		
		int total = 45 * 3 + 16 + 5 + 22 * 8;
		ki a5 = new ki();
		try {
			System.out.println(a5.name(total));
			
		} catch (Exception e6) {
			if(e6.getMessage() != null) {
				System.out.println(e6);
			}
		}

	}

	public void test(String b) throws Exception, NumberFormatException { // throws�� main �޼ҵ忡�� ����ó�� ���� �ش� �޼ҵ带 ȣ���� ��츦
																			// ���� ���� ���
		// throws Exception ���� ������ �ʿ��� ������ try~catch���� ����ؾ���
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c; // �ڵ� �� �ؿ� ����� �ϸ� throw = return ����� ������ ����
		// ����ó�� ����� ���� ���� ���� �޼ҵ�� �ٽ� return
	}

	public void main2(String data[]) throws Exception { // �ڷ����� throw�� ������ �ִ���?

		int total = 0;
		int w = 0;

		while (w < data.length) { // �ݺ����� ������ �迭���� ���ڷ� �ٲ� �� �ջ�����
			total += Integer.valueOf(data[w]);
			w++;
		}
		System.out.println(total);

		Exception ex1 = new Exception();
		throw ex1; // �� �ڷ����� ���� ���� �����

	}

}

class words {
	// ���� : ���� �ް�, ���� �� return
	public String files(String aa) throws Exception {
		// �ش� �޼ҵ忡�� ��� ������ �־����� try-catch�� ����ϰ�����, �׳� return�� ������ ���̱� ������ ������� �ʾƵ� ��
		String msg = "";
		if (aa == null || aa.equals("")) {
			// Exception ex = new Exception(); //�̷��� ����ص� ��
			throw new Exception("���� �������"); // -> ���⿡ ���� �¿� �� ����. ��� ������ ������ Ȯ�� ����
		} else {
			msg = aa + "�� ȯ���մϴ�.";
		}
		return msg;
	}
}
class ki {
	
	public String name(int total) throws Exception {
		
		String msg = "";
		if(total % 2 == 1) {
			msg = "Ȧ���Դϴ�.";
		}
		else {
			throw new Exception("����ó�� �߻����� ��Ȯ���� �ʿ��մϴ�.");
		}
		
		return msg;
	}
	
}