
public class Test2 {

	public static void main(String[] args) {

		int a = 44;
		String msg;
		if (a >= 90) {
			msg = "��� A�Դϴ�.";
		} 
		else if (a >= 70 && a <= 89) {
			msg = "��� B�Դϴ�.";
		} 
		else if (a >= 50 && a <= 69) {
			msg = "��� C�Դϴ�.";
		} 
		else {
			msg = "�Ϲ� ��� �Դϴ�.";
		}
		System.out.println(msg);
	}

}

