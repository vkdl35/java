package Ex;

import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		/* 
		 * ȸ������ DB�� �ִ� ��Ȳ�Դϴ�.
		 * �ش� ���� �߿��� naver.com ���� �ּҸ� ����ϴ� �� ������ ����ϼ���.
		 * ��, DB�� �ε�� �߻�Ŭ�������� �ε尡 �ǵ��� �մϴ�.
		 * 
		 * �迭 ���� {"�̸�","��Ż�","��ȭ��ȣ","����","�ּ�","�̸���","����Ʈ"}
		 * http://mekeyace.dothome.co.kr/example2_db.txt
		 * �� ��ũ�� DB �ҽ� ����
		 */
		
		DB1 d1 = new DB1();
		d1.loc();
		
		//String a = "kim@naver.com";
		//System.out.println(a.indexOf("naver.com"));
		//�迭 ���Ұ�~
		

	}

}

abstract class DB {
	protected String database[][];
	public DB() {
		String db[][] = {
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
		this.database = db;
	}

	public abstract void loc();
}

class DB1 extends DB {
	@Override
	public void loc() {

		int w = 0;
		String ak[];
		int ct = 0;
		int ea = this.database.length; // 11
		while (w < ea) {
			ak = this.database[w][5].split("@");

			if (ak[1].equals("naver.com")) {
				ct++;
			}

			w++;
		}
		System.out.println(ct);
	}

}
