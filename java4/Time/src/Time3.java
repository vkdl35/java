
public class Time3 {

	public static void main(String[] args) {
		/*
		try {	//TimerTask�� ���� ���� ����, try-catch�� ���� ����
			System.out.println("��������");
			Thread.sleep(5000);
			System.out.println("��������");
		}
		catch (Exception e) {
		}
		*/
		
		/*
		 * [���빮��]
		 * �ܺ� Ŭ������ �ֽ��ϴ�.
		 * ��, ���� Ŭ�������� �ش� �ܺ� Ŭ������ �ε��ϸ� �ش� �޼ҵ忡�� �ﰢ������ 8�ʵ��� �ε��� �߻��մϴ�.
		 * 8�ʵ��� "ó�����Դϴ�. ��ø� ��ٷ��ּ���."
		 * 8�� ���Ŀ� retrun���� "�Ա��� ��� ó���Ǿ����ϴ�." ��� ���ڸ� �޵��� �ϼ���.
		 */
		
		ake a = new ake();
		a.dk();
		
	}
			
}

class ake {
public void dk() {
		try {
			System.out.println("ó������ ����");
			Thread.sleep(8000);
			System.out.println(ge());
		} catch (Exception e) {}
	}
	public String ge() {
		return "�Ա��� ��� ó���Ǿ�����";
	}
}