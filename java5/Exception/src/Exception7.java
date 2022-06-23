import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {

		/*
		 * [����] 
		 * ������ ���� {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88} - ���� �� ������Ʈ�� ������ 1���迭 ���� �� ���� 
		 * �ش� �����Ͱ� �� ���ڰ��� ��µǵ��� ��迭�ϼ���. 
		 * ��, ���ο����� �ش� �迭�� �ܺ� Ŭ���� (setter) �� �����մϴ�.
		 * �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�. 
		 * getter���� �ش� �迭�� return���� �������� �մϴ�. 
		 * ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 */

		Object data[] = { "ȫ�浿", 55, "������", "������", 48, "�̼���", "����", 34, 88 };
		redata r = new redata();

		try {
			r.setter(data);
			LinkedList<String> result = r.getter(); // ���� �޴� ���� �迭 Ŭ�����̱� ������ �ش� Ŭ���������� ���� �� �޾ƾ� �մϴ�.
			System.out.println(result);	

		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e);
			}
		}

	}

}

class redata {
	LinkedList<String> redata = new LinkedList<>();
	public void setter(Object data[]) throws Exception {
		int ea = data.length;
		int w = 0;

		while (w < ea) {
			try {
				//�ش� �迭�� �ε�� (�ڷ���)��ȯ�� �ϴ� ������ Object �迭�̸��� �����Ͽ���
				String check = String.valueOf((String) data[w]);
				this.redata.add(check);
			} catch (Exception ex) {	//�ڽ� Ŭ�������� ���� �߻��� ��µǴ� catch��
				//��, throw ����ϸ� �ٽ� �������� ���޵˴ϴ�.
				//�߿� ������ throw�� ���޽� �ش� �ݺ����� �����ϰ� �˴ϴ�.
				System.out.println(ex);
			}
			w++;
		}
	}

	public LinkedList<String> getter() { 
		//�迭 Ŭ���� �̸����� getter�� ���� �� �ֽ��ϴ�.
		return this.redata;
	}
}