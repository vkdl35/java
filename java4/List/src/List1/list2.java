package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * �ش� �����Ͱ� �� �޸�� �����ʹ� ��� �����ؾ� �մϴ�.
		 * �� ������ - �����, ������, ��â��, �ڵ���, �̰���, �����, ������
		 * ��� - �����, ������ (�� ���) 
		 */
		
		/* - ���� § �ڵ� ����
		String user[] = {"�����","������","��â��","�ڵ���","�̰���","�����","������"};
		int e[] = {1,1,1,1,1,0,0};
		ArrayList<String> u = new ArrayList<>(Arrays.asList(user));
		int ea = u.size();
		
		int w = 0;
		while(w < ea) {
			if(e[w] > 0) {
				u.remove(w);
			}
			w++;
		}
		System.out.println(u);
		*/
		
		String user[] = { "�����", "������", "��â��", "�ڵ���", "�̰���", "�����", "������" };
		ArrayList<String> u = new ArrayList<>(Arrays.asList(user));
		int ea = u.size();
		int w = 0;
		while (w < ea) {
			//int ea2 = u.size();	//node�� ������ �ٽ� �ľ�
			int ww = 0;
			while (ww <= 0) {
				if (!u.get(ww).equals("�����") && !u.get(ww).equals("������")) {
					u.remove(0);
					System.out.println(u);
				}
				ww++;
			}
			w++;
		}
		
		
		
		/*
		 * ���� 
		 * ¦���� ���ڸ� ��� ���� 
		 * 10,7,6,1,11,37,41,22
		 */
		
		Integer num[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(num));
		
		int no = ar2.size();
		int z = 0;
		do {
			int no2 = ar2.size();
			int zz = 0;
			do {
				if(ar2.get(zz) % 2 == 0) {			
					ar2.remove(zz);
					break;
				}
				zz++;
			}while(zz < no2);
			//ar2.remove(0);
			z++;
		}while(z < no);
		System.out.println(ar2);
		
		
		
	}

}
