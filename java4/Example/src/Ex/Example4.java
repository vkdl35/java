package Ex;

public class Example4 {

	public static void main(String[] args) {
		
		/*
		 * ���빮��
		 * ���Ե� ��� ȸ���� ����Ʈ �� ���� ���ϼ���.
		 * ��, abstract�� ������ ����մϴ�.
		 * ��� : "ȸ�� ��ü�� ����Ʈ �հ�� : 34390 �Դϴ�."
		 */
		
		total_a ta = new total_a();
		ta.ef();

	}

}

abstract class total {
 	protected String arr[][];
	public abstract void ef();
	public abstract void DB1();
}
class total_a extends total {
	int ea = 0;
	
	@Override
	public void ef() {
		DB1();
		int w = 0;
		int total = 0;
		while(w < this.ea) {
			//System.out.println(this.arr[w][6]);
			total += Integer.parseInt(this.arr[w][6]);
			w++;
		}
		System.out.printf("ȸ�� ��ü�� ����Ʈ �հ�� : %d �Դϴ�.",total);
		
	}
	
	@Override
	public void DB1() {
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
		this.ea = this.arr.length;
	}
}
