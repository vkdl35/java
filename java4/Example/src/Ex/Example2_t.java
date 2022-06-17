package Ex;

import java.util.ArrayList;
import java.util.Arrays;
/* �������� § �ڵ� */
//DB�� http://mekeyace.dothome.co.kr/example2_db.txt �� ����
public class Example2_t {

	public static void main(String[] args) {

		user_list ul = new user_list();
		ul.setter("naver.com");	//setter �޼ҵ忡 naver.com �� ����
		int total = ul.getter();	//getter���� retrun���� �޾� total �̶�� ������ �Ѱ���
		System.out.println(total);	//total ����ϸ� 3�̶� ����� ����
	}

}

abstract class basic {	//�߻� Ŭ���� ����	
	String arr[][];

	// ArrayList<String> ar1 = null;	//ArrayList ���� �ʵ忡 ���� ��������
	
	public abstract void setter(String email);	//setter�޼ҵ� ����

	public abstract int getter();	//getter �޼ҵ� ����

	public abstract void DB();	//�����ͺ��̽� �޼ҵ� ����

}

class user_list extends basic {
	
	int ea = 0;
	int total = 0;

	@Override
	public void setter(String email) {	//main���� naver.com ���� ����
		DB();	//���� ���� DB�� �ҷ���(�����ͺ��̽��� �ҷ��ͼ� �����ؾ� �ϴϱ�)
		int w = 0;	
		while (w < this.ea) {
			
			/*	!-�������� ArrayList�� ���� ���ϴ°Ŷ� �⺻ �迭�� ���� ���ϴ� �� �� ���� �˷���-!
			 * 	!-ArrayList ���� ���� : ArrayList�� ������ �޸� �Ҵ� �����Ǵ� ��Ȳ�� �� �� ����-!
			 * 	this.ar1 = new ArrayList<>(Arrays.asList(this.arr[w][5])); 
			 * 	if(this.ar1.get(0).indexOf(email) != -1) { //�迭���� indexOf�� �ٷ� ������ �� ���� ������ get(0) �� �ٿ���� ��
			 * 		this.total += 1; 
			 * }
			 */
			
			/* ���������� �迭�������� ī������ 
			   indexOf : -1(����) , -1 �� ��� ������ ���� ���� */
			if (this.arr[w][5].indexOf(email) != -1) {	//arr�迭 5��° �ε�������(�̸��϶���)�� naver.com�� �ƴ� �� �����ϰ�
				this.total += 1;	//naver.com �� ���� ī����
			}
			w++;
		}
	}

	@Override
	public int getter() {
		return this.total;	//getter�� total��(naver.com�� �Ѱ���)�� ������
	}

	@Override
	public void DB() {	
		//�߻� Ŭ���� �ʵ忡 ������ String arr[][] �� ������ �迭�� �־��ֱ�
		this.arr = new String[][] { 
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
		//�ڽ� Ŭ���� �ʵ忡 ������ int ea�� �迭�� ������ �־��� (11��)
		this.ea = this.arr.length;
		
	}

}
