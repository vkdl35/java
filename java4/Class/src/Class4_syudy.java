import java.util.ArrayList;
import java.util.Arrays;
/*�������� Ǭ ����*/
public class Class4_syudy {
	public static void main(String[] args) {
		data_list2 dl2 = new data_list2();
		dl2.user_input(null);
	}
}

abstract class v_constuct2 {
	String user_name;
	public abstract void user_input(String nm);
}
class data_list2 extends v_constuct2 {
	@Override
	public void user_input(String nm) {
		if (nm == null) {
			System.out.println("����� �̸��� �Է��ϼž� �մϴ�.");
		} else {
			this.user_name = nm; // try �̿��ؼ� ����ó�� �غ���
			check2 ck = new check2(); // ���ο��� ȣ���ϴ°� �ƴ�, �θ�Ŭ�������� �ڽ�Ŭ������ ȣ��
			ck.db();
		}
	}
	class check2 { // �ڽ� Ŭ�������� �迭�� �־�� ó������ �ε带 ���� �� ����
		String user_name = data_list2.this.user_name;	//�θ� Ŭ�������� ���� ���� �ڽ�Ŭ������ �̰�
		String data_list[];	//�ʵ忡 �迭�� �޴� ��ü ����
		ArrayList<String> ar = null;	//arraylist util�� �ʵ忡 ��ü ����
		public void db() {
			//�ش� �ʵ忡 �ִ� arraylist�� �ν��Ͻ��� ������
			this.data_list = new String[] { "ȫ�浿", "�̼���", "������" };
			this.ar = new ArrayList<>(Arrays.asList(data_list));	//this�� ó��
			this.compare(); //���� DB�� ����� ������ ���ϴ� �޼ҵ�
		}
		public void compare() {
			int ea = this.ar.size();
			int w;
			boolean bl = false;	//��� Ȯ�� �۾�
			for (w = 0; w < ea; w++) {
				if (this.user_name.equals(this.ar.get(w))) {
					bl = true;
				}
			}
			if (bl == true) {
				System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
			} else {
				System.out.println("�ش� ����ڴ� �����ڰ� �ƴմϴ�.");
			}
		}
	}
}