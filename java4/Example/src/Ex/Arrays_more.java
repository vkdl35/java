package Ex;

import java.util.ArrayList;
import java.util.Arrays;

//ArrayList 2�� �迭���� (�������� ����)
// http://mekeyace.dothome.co.kr/Arraylist.txt (2���迭����)

public class Arrays_more {

	public static void main(String[] args) {
		/* ������ �迭���� ȸ���� ��ȭ��ȣ�� ���� ���� */
		String member_data[][] = {
				{ "ȫ�浿", "SKT", "010-1236-4879", "45", "���α�", "hong@gmail.com", "2200" },
				{ "�赵��", "LG", "010-1267-5879", "25", "������", "kim@nate.com", "2100" },
				{ "�̼���", "KT", "010-3738-4800", "55", "������", "sunyoung@nate.com", "4510" },
				{ "������", "SKT", "010-5242-0879", "42", "������", "chreey@gmail.com", "6720" }
		};
		//String[] : 2���迭 �̻� / Integer[] : 2���迭 �̻�
		ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data));
		/*String�̳� Integer ���� []�� �ٿ��ָ� 2���迭 �̻� �ϼ�
		  but, ArrayList�� ���� 2���迭, �������迭�� �����͸� ���� ����Ϸ��� �ݺ��� ��������*/
		
		//System.out.println(list.get(0)[1]); -> �̷������� ������ ���� �ϳ����� Ȯ�� ����.. (�������� ��ü ���� �� �𸣴°��� ����� ���°��� �Ⱦ˷���� ��)
		
		
		int w = 0;
		
		while (w < list.size()) {
			System.out.println(list.get(w)[2]);	//.get(�ݺ���)[�ε��� ����]
			w++;
		}

	}

}
