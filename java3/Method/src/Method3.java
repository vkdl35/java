
public class Method3 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��1]
		 * �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� �մϴ�.
		 * ���� ����� �޾Ƽ� ����� ����ϼ���.
		 * 157, 45
		 * 157*45
		 * ���� ����� ��� : 
		 */
		
		d1 d2 = new d1();
		int a1 = d2.dd(157, 45);
		System.out.println(a1);
		d2.dd2();
		d2.dd();
		
		/*
		 * [���빮��2]
		 * ���� ���� �ϳ��� �ش� �޼ҵ�� �����ϰ� �˴ϴ�.
		 * �ش� �޼ҵ忡���� ������ ���� ó���մϴ�.
		 * ���� 3�� �����ϸ� 3*1 ~ 3*9������ ��� ������� ���Ͽ�
		 * sysout���� ��µǵ��� �ϼ���.
		 */
		
		int ak = d2.aa(3);
		System.out.println(ak);
		
		String ck = d2.mb("hong");
		System.out.println(ck);
		
	}

}

class d1 {
	public int dd(int i, int ii) {
		int z = i * ii;
		return z;
	}
	public void dd() {
		//public, public void, public static void ������ �� �ٸ��� ������ ���� �̸��� ����ص� ������,
		// �򰥸� �� �ֱ� ������ �ǰ����� �ʴ´�.
		//�� �μ����� ������ ���� ������
		System.out.println("�����Դϴ�.");
	}
	public void dd2() {
		int z = dd(100,200);
		System.out.println(z);
	}
	public int aa(int a) {
		int w = 1;
		int total = 0;
		while(w < 10) {
			total += w*a;
			if(total > 100) {
				break;
			}
			w++;
		}
		return total;	/* return ���� ���� �ݺ��� �ȿ� �����ϸ� �ȵ˴ϴ�. ���� ���ǹ��̿��� ����� return ����� �� �����ϴ�. */
		//�ݺ���, ���ǹ� �ȿ��� return ��� �Ұ���, ������ �Ʒ��� ��ġ�ؾ���
	}
	public String mb(String mid) {
		String msg = "";
		String msg2 = "ȫ�浿";
		if(mid.equals("hong")) {	
			msg = "ok";
			//return = "ok"; �� ��� �����ϳ� ���ڵ� ��
		}
		else {
			msg = "cancel";
		}
		return msg;	/* �ش� �޼ҵ忡 ������ ���� �� ���ǿ� �´� ���� �����Ͽ� �������� ���� return��Ŵ */
		//return�� �ѹ���, �� �Ʒ����� �����°� ����
		//return msg, msg2; <- ������, return�� �ι� �� ���� ����
	}
	
	
}
