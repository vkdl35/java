import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��] 2�� �迭
		 * �����ʹ� ������ �����ϴ�.
		 * user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 * user_point : 3000 1000 25000 19800 5750 3630 0
		 * ���α׷� ���۰� ���ÿ� "����Ʈ�� �˻��� ������ �Է��ϼ���." �� ��µ˴ϴ�.
		 * �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ� ������ 
		 * �Ű������� �̿��Ͽ� ���� �� �ش� ������� ����ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ʈ�� �˻��� ������ �Է��ϼ���.");
		String user = sc.next();
		data ex = new data();
		ex.datas(user);
		sc.close();
		ex = null;
	}

}

class data {
	public void datas(String a) {
		String user_list[][] = {
				{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
				{"3000","1000","25000","19800","5750","3630","0"}
		};
		//int ea_1 = user_list.length;
		int ea_2 = user_list[0].length;
		/*
		int w = 0;
		while(w < ea_1) {
			int ww = 0;
			while(ww < ea_2) {
				if(user_list[w][ww].equals(a)) {
					System.out.println(user_list[1][ww]);
				}
				ww++;
			}
			w++;
		}
		*/
		int w = 0;
		while(w<ea_2) {
			if(a.equals(user_list[0][w])) {
				System.out.printf("%s���� ����Ʈ�� %s�Դϴ�.",user_list[0][w],user_list[1][w]);
			}
			w++;
		}
		
	}
	
}