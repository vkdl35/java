import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��] �迭 + �⺻(Ŭ����) �޼ҵ� ����
		 * product : ����,����,���,��,����,Ű��,�ٳ���,����
		 * moneys : 35000,8000,4000,5500,3800,4400,11000,18900
		 * ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�.
		 * ��, �� �� ����� �ٳ����� �����ϰ� �� ���� �ݾ��� ����ϼ���.
		 */
		
		String product[] = {"����","����","���","��","����","Ű��","�ٳ���","����"};	//�ε��� ������ ����
		int moneys[] = {35000,8000,4000,5500,3800,4400,11000,18900};
		Example3 ex = new Example3();
		ex.data(moneys,product);
		
	}
	
	public void data(int m[], String p[]) {
		int ea = m.length;
		int w = 0;
		int total = 0;
		
		while(w < ea) {
			if(!p[w].equals("���") && !p[w].equals("�ٳ���")) {
				total+=m[w];	//p���� �ε��� ��ȣ�� ���� �迭���� w�� �������ְ�,
			}					//�� ���� m�� �޾Ƽ� ���� �ε�����ȣ�� �迭���� �����ϰ� ���
			w++;
		}
		System.out.println(total);
	}

}
