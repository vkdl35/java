import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		
//		String[] names = new String[3];	//���� ����ִ� ����, ������ ��Ƴ��� �迭, ������ �������� ����
//		String m[] = {"ȫ�浿","�̼���","������"};	//���� ���ִ� �迭, �迭���� �����Ͱ� �ִ� ����
//		// System.out.println(names[0]);	//null : ���� ����ٴ� ��
//		int ct = 0;
//		
//		for(String a : m) {
//			//System.out.println(ct);
//			names[ct] = a;
//			ct++;
//		}
//		System.out.println(names[0]);
		
		String[] names = new String[3];	
		String m[] = {"ȫ�浿","�̼���","������"};
		int ct = 0;	//foreach���� �ε��� ��ȣ�� �����Ƿ� ���Ӱ� �ε��� ��ȣ�� �������ֱ� ���� ����
		
		for(String a : m) {
			if(a.equals("ȫ�浿") || a.equals("������")) { 
				//�ش� (����m)�迭�� �� ���ǿ� �´� ���� �߷��� ���ο� �迭���� �߰���
				names[ct] = a;
				ct++;	//�ε��� ��ȣ�� ���������� �����ϱ� ���� ������
				//ct�� ���ǹ� �ۿ� ������ ����, ī���õ��� �ʾƼ� names�� 1������ ������� ��		
			}
		}
		int name_ea = names.length;
		//System.out.println(names[1]); //�ռҸ���...��
		System.out.println(Arrays.toString(names));
		//Arrays.toString() : �ε��� �ȿ� �ִ� ������ ��� ���� ���� ��
		
		
		
		
		
	}

}
