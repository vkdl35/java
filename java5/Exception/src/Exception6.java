
public class Exception6 {

	public static void main(String[] args) {

		/*
		 * [���빮��] ����ڰ� 45 * 3 + 16 + 5 + 22 * 8 �ش� ���갪�� �������� �ܺ� Ŭ������ �����մϴ�. �ش� �ܺ� Ŭ����������
		 * �ش� ���� ¦���� ��� ���� ������ �߻��ϰ�, Ȧ���� ��� Ȧ�����Դϴ�. �� �ٽ� ȸ�� �ǵ��� �մϴ�. ¦���� ���
		 * "����ó�� �߻����� ��Ȯ���� �ʿ��մϴ�." ���
		 */
		
		/*
		 * [����]
		 * ������ ���� {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88} - ���� �� ������Ʈ�� ������ 1���迭 ���� �� ����
		 * �ش� �����Ͱ� �� ���ڰ��� ��µǵ��� ��迭�ϼ���.
		 * ��, ���ο����� �ش� �迭�� �ܺ� Ŭ���� (setter) �� �����մϴ�.
		 * �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�.
		 * getter���� �ش� �迭�� return���� �������� �մϴ�.
		 * ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 */

		ak a = new ak();
		int total = 45 * 3 + 16 + 5 + 22 * 8;
		// System.out.println(total);

		try {
			String result = a.a1(total);
			System.out.println(result);
		} catch (Exception g) {
			if (g.getMessage() != null) {
				System.out.println(g);
			}
		}

	}

}

class ak {
	public String a1(int a) throws Exception {
		String msg = "";
		if (a % 2 == 0) {
			throw new Exception("����ó�� �߻����� ��Ȯ���� �ʿ��մϴ�.");
		} else {
			msg = "Ȧ�����Դϴ�.";
		}
		return msg;
	}
}