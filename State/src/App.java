
public class App {

	public static void main(String[] args) {
		
		short a1=(25+31*4+12);
		short b1=(15*3+9+14);
		
		if(a1 > b1) {
			System.out.println("���� 2�� ���� �۽��ϴ�.");
		}
		else if (a1 < b1) {
			System.out.println("���� 1�� ���� �۽��ϴ�.");
		}
		else {
			System.out.println("�� ���� �����ϴ�.");
		}
		
		/* �ش簪�� 2������ ¦��, Ȧ���� Ȯ���ϱ� */
		
		int c1 = b1 % 2; // %��ȣ�� ���� 0 �Ǵ� 1�� ������ ���� ����� �˴ϴ�.
		System.out.println(c1);
		if(c1==0) {
			System.out.println("¦�� �Դϴ�.");
		}
		else {
			System.out.println("Ȧ�� �Դϴ�.");
		}
		
		
		
		
	}

}
