import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * �ش� ����� ���� ������ �� �� ������ �����͵� �Բ� �����˴ϴ�.
		 * �� �� ���� ������ ���� 3�̸�(������)�� ���� Ȯ���Ͽ� 
		 * �迭 �����͸� �簡���մϴ�.
		 * 
		 * ȫ�浿, �̼���, ������, �������, ������, ������
		 * 4,3,1,1,2,2
		 * ["������" , "�������" , "������" , "������"]
		 */
		
		
		String member[] = {"ȫ�浿","�̼���","������","�������","������","������"};
		int lv[] = {4,3,1,1,2,2};	//���� ����
		String user[] = new String[4];	//int�迭�� string�迭�� �޾ƿ� �� ��� ���� �����������
		
		int ea_m = member.length;
		//System.out.println(ea_lv);
		int a = 0;
		int ct = 0;
		
		while(a < ea_m) {
			//System.out.println(memver[a]);
			if(lv[a] < 3) {
				//sysout.out.println(member[a]) //member�� lv�� [a]�� ����
				user[ct] = member[a];	
				//user[a] ���� �������� ī��Ʈ���� ������������ϱ� ������ ���ο� ������ �����������
				ct++;
			}
			a++;
		}
		System.out.println(Arrays.toString(user));
		//Arrays.toString() : ����, ����, �Ҽ� [] ���� �迭 �������� ����ϴ� �Լ�
		

	}

}
