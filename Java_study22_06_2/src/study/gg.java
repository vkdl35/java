package study;

import java.util.*;

public class gg {
	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>(); // �ؽ��� ����
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		String result = "";

		while (true) {
			System.out.println("1.�Է� 2.�˻� 3.���� �� �ܾ� ã��");
			int n = scanner.nextInt(); // ���ڹޱ�

			if (n == 1) { // �߰����
				String eng = scanner.next(); // ����
				String kor = scanner.next(); // �ѱ��Է�
				h.put(eng, kor); // �ؽ��ʿ� �ֱ�
			} else if (n == 2) { // �˻����
				Set<String> keys = h.keySet();
				Iterator<String> it = keys.iterator();// Ű����
				String x = scanner.next();

				while (it.hasNext()) {
					String value = h.get(x);
					if (value == null) {
						System.out.println("���� �ܾ��Դϴ�.");
					} else {
						System.out.println(value);
						break;
					}
				}
			} else if (n == 3) { // �����ܾ�ã��
				Set<String> keys = h.keySet();
				Iterator<String> it = keys.iterator();// Ű����

				while (it.hasNext()) {
					String key = it.next(); // key�� �ޱ�
					String value = h.get(key);
					int count = key.length(); // ���̹ޱ�
					if (max < count) {
						result = key;
					}
				}
				System.out.println(result);
				return; // ������
			} else { // �ٸ� ���ڸ� �Է��Ѱ��
				System.out.println("�ٽ��Է��ϼ���");
			}
		}
	}
}