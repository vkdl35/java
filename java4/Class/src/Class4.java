import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * �迭 ������ : "ȫ�浿","�̼���","������" 
		 * ���� Ŭ�������� ���ڸ� �ϳ� �����մϴ�.
		 * ��, ���ڰ� null ���� ���� ������, �迭 �����Ϳ� ���� ���� "������"�̶�� ���� ���� �ֽ��ϴ�.
		 * �ܺ� Ŭ������ : data_list 
		 * �߻� Ŭ������ : v_constuct
		 * ���� Ŭ������ : check
		 * 
		 * [�������]
		 * ���� class���� �������� ������ ���
		 * ���� Ŭ�������� "�ش� ����ڴ� �����ڰ� �ƴմϴ�." ��� ���
		 * ���� class���� �̼����� ������ ���
		 * ���� Ŭ�������� "����ڰ� Ȯ�� �Ǿ����ϴ�." ��� ���
		 * ��, ArrayList�� �迭�� �ε��ϼ���.
		 */
		
		String user_name = null;
	
		data_list dl = new data_list();
		dl.vc(user_name);
		data_list.check dc = dl.new check();
		dc.ne();
		

	}

}

abstract class v_constuct {	//�߻�Ŭ����
	public ArrayList<String> ar;
	public String user_name;

	public void vc(String un) {
		String user[] = { "ȫ�浿", "�̼���", "������" };
		ArrayList<String> ar1 = new ArrayList<>(Arrays.asList(user));
		this.ar = ar1;
		this.user_name = un;
	}
}

class data_list extends v_constuct {	//�ܺθ޼ҵ�(���)
	class check {	//����Ŭ����
		ArrayList<String> ar1 = data_list.this.ar;
		String un1 = data_list.this.user_name;
		
		public void ne() {
			String msg = "";
			int w = 0;
			int ea = this.ar1.size();
			while (w < ea) {
				if (ar1.get(w).equals(this.un1)) {
					msg = "����ڰ� Ȯ�� �Ǿ����ϴ�.";
					break;
				} else {
					msg = "�ش� ����ڴ� �����ڰ� �ƴմϴ�.";
				}
				w++;
			}
			System.out.println(msg);
		}
	}
}