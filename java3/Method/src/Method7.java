import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {

		apink ap = new apink("ȫ�浿", 25, "test@gmail.com", 1000);
		// ap.names();
		System.out.println(ap.data());
		System.out.println(ap.data2());

	}

}

class apink {
	// private������ class �ʵ忡�� �����ؾ� �մϴ�.
	private String nm;
	private int age;
	private String email;
	private int point;
	private String email_cp;
	
	public void names() {
		if (this.nm == "ȫ�浿") {
			this.nm = "hong";
			String e[] = this.email.split("@");	//�̸��� �߿� �̸��� ȸ�� ������ �������� ���� �迭�� ������ �۾�
			this.email_cp = e[1];
//			System.out.println(Arrays.toString(e));
			
		}
	}

	public apink(String nm1, int age1, String email1, int point1) { // private�� �ȿ��� ������� ����
		// setter ���� : ���ڰ��� �޾Ƽ� private�� �ѱ�� ����
		this.nm = nm1;
		this.email = email1;
		if (point1 < 0) {
			this.point = 0;
		} else {
			this.point = point1;
		}
	}

	public String data() {
		names();
		return this.email_cp; // return �Ʒ����� �� � �Լ��� �� �� ����(���� ���� �߻�). �׻� �� �������� ��ġ�ؾ���
	}

	public int data2() {
		// getter ���� : main�� private���� �����ִ� ����
		return this.point;
	}

}