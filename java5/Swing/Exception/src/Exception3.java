import java.util.ArrayList;
import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		/*
		 * ���빮�� data = {"hong45","lee90","kang100","park70","kim72"}; �ش� �迭 ������ ����
		 * main2��� �޼ҵ�� ���� �����ϴ�. �ش� ���� ���� �� ����ó���� ������ �߻����Ѿ��ϸ�, ���� ���� ���� ���� �������� ������ �˴ϴ�.
		 * main2������ �ش� �迭���� ���� �� �ش� ������ ��� �ջ��� ����� ���;� �մϴ�. ��, ���� ��ȯ�� ������ �߻��� ���
		 * finally�� üũ ��, main2 �޼ҵ�� �ٽ� ȣ���Ͽ� ���������� �����Ͱ� �������� �ϼ���.
		 */

		/*
		 * String data[] = { "hong45", "lee90", "kang100", "park70", "kim72" }; try {
		 * Exception3 ex = new Exception3(); ex.main2(data); } catch (Exception e) {
		 * System.out.println(e); } finally { int w = 0; while (w < data.length) {
		 * data[w] = data[w].replaceAll("[a-zA-Z]", ""); w++; } }
		 */

		String data[] = { "hong45", "lee90", "kang100", "park70", "kim72" };
		try {
			main2(data);
		} catch (Exception z) {
			System.out.println(z);
		} finally {
			ArrayList<String> rdata = new ArrayList<String>();	//���⼭ �ٽ� ���� try�� ���ư� �� �ִ� ����� ����?
																//�ƴϸ� ������ data �������� �����ϴ� �����?
			int j = 0;
			String modify;
			while (j < data.length) {
				modify = data[j].replaceAll("[a-zA-Z]", "");
				rdata.add(modify);
				j++;
			}
			String cdata[] = new String[rdata.size()];
			int q = 0;
			do {
				cdata[q] = rdata.get(q);
				q++;
			} while (q < rdata.size());

			try {
				main2(cdata);
			} catch (Exception h) {
				if (h.getMessage() == null) {
					System.exit(0);
				}
				else {
					System.out.println(h);					
				}
			}

		}

	}

	static public void main2(String db[]) throws Exception {
		/*
		 * int w = 0; int r = 0; int d[] = new int[5]; while (w < data1.length) { d[w]
		 * += Integer.valueOf(data1[w]); w++; } System.out.println(d); Exception c = new
		 * Exception(); throw c;
		 */

		int w = 0;
		int ea = db.length;
		int values;
		int jumsu = 0;
		while (w < ea) {
			values = Integer.valueOf(db[w]);
			jumsu += values;
			w++;
		}
		System.out.println(jumsu);

		Exception e = new Exception();
		throw e;
	}

}