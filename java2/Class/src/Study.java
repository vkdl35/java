import java.util.Arrays;

public class Study {

	public static void main(String[] args) {
		
		//������� �迭�� ���
		
		String[] names = new String[3];	//3���� �� �� �ִ� �� ������ ����
		String m[] = {"ȫ�浿","������","�̼���"};
		//System.out.println(names[0]); 	//null ���� ����ٴ� ��
		int ct = 0;
		for(String a : m) {	//a��� ������ m �迭���� �����´�
			names[ct] = a;	//������� a�� ��� �� �ֱ�
			ct++;			//�ε�����ȣ 0���� ����
		}
		//System.out.println(names[0]);	//�ε��� ��ȣ�� �ִ� �迭�� ȣ��

		//�� ������ �迭�� ��� �ֱ�
		
		String[] names2 = new String[3];
		String m2[] = {"ȫ�浿","������","�̼���"};
		int ct2 = 0;
		for(String a2 : m2) {
			if(a2.equals("ȫ�浿")||a2.equals("�̼���")) {	//ȫ�浿 �Ǵ� �̼��Ÿ��̶�� ����
				names2[ct2] = a2;
				ct2++;
			}
		}
		int name_ea = names2.length;	//�� ������ ���� � �� �� �ִ��� Ȯ��
		//System.out.println(name_ea);
		//System.out.println(Arrays.toString(names2));
		
		//��迭 ������ �����Ͱ� �ִ� �迭�� Ŀ����
		
		int a3[] = new int[3];
		int b[] = {1,2,3,4,5,6,7};
		int ea_a3 = a3.length;
		int ea_b = b.length;
		int w = 0;
		int ct3 = 0;
		while(w < ea_b) {
			if(b[w] % 2 == 0) {
				a3[ct3] = b[w];
				ct3++;
			}
			w++;
		}
		//System.out.println(Arrays.toString(a3));
		
		//2�� �迭
		
		
		
		
		/*
		 * [���빮��]
		 * ������ ��ٱ��Ͽ� �������� ��ǰ�� ����� �ֽ��ϴ�.
		 * �� �� �ù�� ������ �����Ǵ� �ݾ׸� �����ϼ���.
		 * �ù��� 30000�� �̻�(����)�Դϴ�.
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 * ��� [48000, 67000, 118200, 49800]
		 */
		
		int money[] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int box[] = new int[4];
		int ea_m = money.length;
		int w2 = 0;
		int ct4 = 0;
		while(w2 < ea_m) {
			if(money[w2] >= 30000) {
				box[ct4] = money[w2];
				ct4++;
			}
			w2++;
		}
		//System.out.println(Arrays.toString(box));
		
		/*
		 * [���빮��]
		 * �ش� ����� ���� ������ �� �� ������ �����͵� �Բ� �����˴ϴ�.
		 * �� �� ���� ������ ���� 3�̸�(������)�� ���� Ȯ���Ͽ� 
		 * �迭 �����͸� �簡���մϴ�.
		 * ȫ�浿, �̼���, ������, �������, ������, ������
		 * 4,3,1,1,2,2
		 * ["������" , "�������" , "������" , "������"]
		 */
		
		String member[] = {"ȫ�浿","�̼���","������","�������","������","������"};
		int num[] = {4,3,1,1,2,2};
		String box2[] = new String[4];
		int ea_m2 = member.length;
		int w3 = 0;
		int ct5 = 0;
		while(w3 < ea_m2) {
			if(num[w3] < 3) {
				box2[ct5] = member[w3];
				ct5++;
			}
			w3++;
		}
		//System.out.println(Arrays.toString(box2));
		
		
		
		
	}

}
