
public class Study_220524 {

	public static void main(String[] args) {
		//��Ģ���� ��ȣ�� ���
		int a = 10;
		int b = 20;
		int c;
		c = a + b;
		System.out.println(c);
				
		//�Լ��� �������� �� +�� �ٸ� ���
		String a1 = "�ȳ��ϼ���.";
		String b1 = "�������.";
		System.out.println(a1 + b1);
		
		//if ���ǹ�
		int a2 = 100;
		byte b2 = 10;
		if (a2 < b2) {
			System.out.println("a�� ���� �� Ů�ϴ�.");
		}
		else if (a2 > b2) {
			System.out.println("b�� ���� �� Ů�ϴ�");
		}
		else {
			System.out.println("�� ���� �����ϴ�.");
		}
		
		//���������� ���ǹ�
		String a3 = "�������Դϴ�.";
		if (a3 == "�������Դϴ�.") {
			System.out.println(a3);
		}
		
		//���� ���ǹ� (���� ���ǹ�)
		String mid = "max21";
		String mpass = "lkm";
		if (mid == "max21") {
			if (mpass == "lkm") {
				System.out.println("�α��� �Ǽ̽��ϴ�.");
			} 
			else {
				System.out.println("�н����尡 Ʋ���ϴ�.");
			}
		} 
		else {
			System.out.println("���Ե��� ���� ������Դϴ�.");
		}
		
		//boolean �Լ�
		boolean a4 = true;
		if(a4 == true) { 
			System.out.println("ȸ�������� ����˴ϴ�."); 
		}
		else { 
			System.out.println("�̿����� �����ϼž߸� ����˴ϴ�."); 
		}
		
		//boolean ����
		
		int a7 = 30;
		int b7 = 60;
		boolean c7 = a7 > b7;
		if (c7) {
			System.out.println("�� Ů�ϴ�");
		}
		
		//boolean ����2
		
		int a8 = 4;
		boolean b8 = a8 % 2 == 0;
		System.out.println(b8);
		
		//&& �� || �� ������
		
		String mid2 = "mini";
		String mid3 = "manda";
		String mpass2 = "lee123";
		
		if (mid2=="mini" && mpass2=="lee123") {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("���̴ٿ� �н����带 �ٽ� �ѹ� Ȯ�����ּ���.");
		}
		
		if (mid2=="midi" || mid3=="manda") {
			System.out.println("ȸ���� Ȯ�εǾ����ϴ�.");
		}
		else {
			System.out.println("ȸ���� �ƴմϴ�.");
		}
		
		//�������� ���ǹ�
		
		int a9 = (25+31*4+12);
		int b9 = (15*3+9+14);
		
		if (a9 < b9) {
			System.out.println("���� 2�� ���� �� Ů�ϴ�");
		}
		else if (a9 > b9) {
			System.out.println("���� 1�� ���� �� Ů�ϴ�.");
		}
		else {
			System.out.println("�� ������ ���� �����ϴ�.");
		}
		
		//% ��ȣ�� Ȧ��, ¦�� ���ϱ�
		
		int c9 = b9 % 2;
		if (c9 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		

		/* [���빮��1] ������ ���� ��µǴ� �ڵ带 �ϼ��Ͻÿ�. 
		 * ȫ�浿�� �������� 5000 �Դϴ�. 
		 * ��, ȫ�浿 �� 5000�� ���� ���������� ��ȭ�� �� �ֽ��ϴ�.
		 */
		
		String a5 = "ȫ�浿";
		int b5 = 5000;
		System.out.println(a5 + "�� �������� " + b5 + "�Դϴ�.");

		/* [���빮��2] �Ƹ��� ����Ʈ���� ��ǰ�� ���� �߽��ϴ�. 
		 * ��ٱ��Ͽ� ���� ��ǰ ������ ��� ���ؼ� �� ���� �ݾ��� ��µǵ��� �Ͻÿ�. 
		 * ��, $ȯ���� ��� �Ǿ���մϴ�.
		 * 8.25 4.02 3.71 
		 * ��� ���� ������ ���� ����ϼ���. 
		 * ���� �����ݾ� $ �Դϴ�.��
		 */
		
		float a6 = 8.25f;
		float b6 = 4.02f;
		float c6 = 3.71f;
		System.out.println("�� ���� �ݾ� "+(a6+b6+c6)+"$�Դϴ�.");
		
		


	}

}
