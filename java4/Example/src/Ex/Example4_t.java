package Ex;

import java.util.ArrayList;
import java.util.Arrays;
/*������ Ǯ��*/
//Example3 �����ͺ��̽� Ȱ�� -> ȸ�� ��ü ����Ʈ �հ� ���ϱ�
public class Example4_t {
	
	public static void main(String[] args) {
		
		aaa_1 a1 = new aaa_1();
		a1.setter();
		int k = a1.getter();	//retrun ���� total ���� k�� �ְ�
		System.out.println("ȸ�� ��ü�� ����Ʈ �հ�� : " + k + "�Դϴ�.");	//k���
	}

}
	
abstract class aaa {
	
	ArrayList<String[]> arr2;	//ArrayList 2���迭 �̻� ��ü�� ����
	public abstract void setter();
	public abstract int getter();
	public abstract void DB3();
	
}

class aaa_1 extends aaa {
	int total = 0;
	
	@Override
	public void setter() {
		DB3();
//		System.out.println(this.arr2.get(0)[6]);	//����Ʈ���� �� �ε�ǳ� Ȯ��
		int w = 0;
		while(w < this.arr2.size()) {	//�迭 ������ŭ �ݺ��� ����
			this.total += Integer.parseInt(this.arr2.get(w)[6]);	
			//��� Ŭ���� �ʵ忡 ������ total ������ Integer.parseInt�� ���ڷ� �ٲ㼭 ����Ʈ���� ���� �־���(�հ�ġ)
			w++;
		}
		
	}
	
	@Override
	public int getter() {
		return this.total;	//�հ�ġ�� ��� total ���� main�� ����
	}
	
	@Override
	public void DB3() {	//���� '����' ������
		String a[][] = new String[][] {
			{ "ȫ�浿", "SKT", "010-1236-4879", "45", "���α�", "hong@gmail.com", "2200" },
			{ "�赵��", "LG", "010-1267-5879", "25", "������", "kim@nate.com", "2100" },
			{ "���Ѽ�", "LG", "010-1267-4112", "37", "���α�", "soso4112@naver.com", "1200" },
			{ "���缺", "SKT", "010-3221-8871", "41", "������", "jsung_kks@naver.com", "700" },
			{ "�ѿ�", "KT", "010-2455-4879", "22", "��õ��", "han1004@nate.com", "920" },
			{ "������", "SKT", "010-3770-4009", "34", "���α�", "kans32@gmail.com", "1250" },
			{ "���", "KT", "010-1606-3137", "20", "����", "kimsil_love@nate.com", "4505" },
			{ "���Ѱ�", "SKT", "010-3412-0902", "31", "��õ��", "hanso12@nate.com", "2125" },
			{ "������", "LG", "010-4557-8282", "30", "����", "jehyuk@naver.com", "8160" },
			{ "�̼���", "KT", "010-3738-4800", "55", "������", "sunyoung@nate.com", "4510" },
			{ "������", "SKT", "010-5242-0879", "42", "������", "chreey@gmail.com", "6720" } 
	};
	this.arr2 = new ArrayList<>(Arrays.asList(a));	//�߻� Ŭ���� �ʵ忡 ��ü ������ arr2�� �迭���� �־���
		
	}
}
