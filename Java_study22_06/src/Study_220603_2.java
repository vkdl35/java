import java.util.Arrays;
import java.util.Scanner;

public class Study_220603_2 {

	public static void main(String[] args) {
		/*
		 * [���빮��5] 2�� �迭 + �⺻(Ŭ����) �޼ҵ� ����		//��101
		 * ��ϵ� ���� VIP ���� ����Ʈ�� ����ϼ���.
		 * user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 * user_level : gold vip guest gold vip vip guest
		 * ������ : �̼���, �������, ������
		 */
		
		String user2[][] = {
				{ "ȫ�浿", "�̼���", "������", "������", "�������", "������" },
				{ "gold", "vip", "guest", "gold", "vip", "vip" } 
		};
		Edata_2 ed = new Edata_2();
		ed.vip(user2);
		ed = null;
		
		/*
		 * [���빮��6] 2�� �迭		//��116
		 * �����ʹ� ������ �����ϴ�.
		 * user_list : ȫ�浿 �̼��� ������ ������ ������� ������ ����屺
		 * user_point : 3000 1000 25000 19800 5750 3630 0
		 * ���α׷� ���۰� ���ÿ� "����Ʈ�� �˻��� ������ �Է��ϼ���." �� ��µ˴ϴ�.
		 * �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ� ������ 
		 * �Ű������� �̿��Ͽ� ���� �� �ش� ������� ����ϼ���.
		 */
		
		String user3[][] = { 
				{ "ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺" },
				{ "3000", "1000", "25000", "19800", "5750", "3630", "0" } 
		};
		Scanner sc1 = new Scanner(System.in);
		System.out.println("����Ʈ�� �˻��� ������ �Է��ϼ���.");
		String name2 = sc1.next();
		Fdata_2 fd = new Fdata_2();
		fd.list(user3, name2);
		sc1.close();
		fd = null;

		/*
		 * [���빮��7] ������ �迭�� ���� + �ܺ� class �� �޼ҵ� ���		//��133
		 * [data]
		 * {"ȫ�浿","�հ�"}
		 * {"�̼���","�հ�"}
		 * {"������","���հ�"}
		 * {"������","�հ�"}
		 * {"������","���հ�"}
		 * {"�庸��","���հ�"}
		 * ������ �迭 �����̸�, �ش� ���� �հ��ڸ� ��µǵ��� �մϴ�.
		 * ��, �迭���� �ܺ� Ŭ���� �ȿ� �޼ҵ忡�� ó���� �ǵ��� �մϴ�.
		 * ��� : ȫ�浿 �̼��� ������
		 */
		
		String user4[][] = {
	            {"ȫ�浿","�հ�"},
	            {"�̼���","�հ�"},
	            {"������","���հ�"},
	            {"������","�հ�"},
	            {"������","���հ�"},
	            {"�庸��","���հ�"}
	      };
		Gdata_2 gd = new Gdata_2();
	    gd.list(user4);
	    gd = null;
	      
		/*
		 * [���빮��8]		//��147
		 * ���� ����ڰ� ���� ���� ���α׷��� ��û�Ͽ����ϴ�. 
		 * ����ڰ� �� �ټ����� ���ڸ� �Է��ϰ� �˴ϴ�.
		 * "1~46 �� ������ ���ڸ� �Է��� �ּ���." ����ڰ� �Է��� �ټ����� ���ڸ� �迭�� �����մϴ�. (mainó��)
		 * �ܺ� Ŭ������ �̿��Ͽ� pc�� ���� ��÷��ȣ �ټ����� �����ϰ� �̾Ƴ��ϴ�. 
		 * pc�� ���� �ټ����� ���ڸ� �迭�� �����մϴ�. (�ܺ� class �޼ҵ� ó��)
		 * ������ ��� �޼ҵ带 �ϳ� �� �����Ͽ� ����ڰ� �Է��� �ټ����� �迭 �����Ϳ� pc�� ���� �迭 �����͸� �ش� �޼ҵ�� �����Ͽ� ����ϼ���. 
		 * ��, ��� ����ϴ� �ݺ����� ������ do while������ �ۼ��ϼ���.
		 * [���] ������ ���� ���� �ټ���, pc�� ���� ���� �ټ���
		 */
	      
		Scanner sc2 = new Scanner(System.in);
		int user_num[] = new int[5];
		int w2 = 1;
		int ct = 0;
		while (w2 < 6) {
			System.out.println("1~46�� ������ ���ڸ� �Է����ּ���.");
			int user5 = sc2.nextInt();
			user_num[ct] += user5;
			ct++;
			w2++;
		}
		Hdata_2 hd = new Hdata_2();
		hd.pc_random(user_num);
		sc2.close();
		hd = null;
	      
	}	
}
class Edata_2 {		//��8
	public void vip(String list[][]) {
		int w = 0;
		int ea = list[0].length;
		String list_vip = " ";
		while (w < ea) {
			if (list[1][w].equals("vip")) {
				list_vip += list[0][w] + " ";

			}
			w++;
		}
		System.out.println(list_vip);
	}
}
class Fdata_2 {		//��24
	public void list(String user_2[][], String name_2) {
		int ea = user_2[0].length;
		int w = 0;
		boolean ok = false;
		while (w < ea) {
			if (name_2.equals(user_2[0][w])) {
				System.out.printf("%s���� ����Ʈ�� %s���Դϴ�.", name_2, user_2[1][w]);
				ok = true;
			}
			w++;
		}
		if (ok == false) {
			System.out.println("���� �������� �ʽ��ϴ�.");
		}
	}
}
class Gdata_2 {		//��43
public void list(String user_2[][]) {
      int ea = user_2.length;
      int w = 0;
      String user_list = " ";
      while(w < ea) {
    	  if(user_2[w][1].equals("�հ�")) {
    		  user_list = user_2[w][0]+" ";
    		  System.out.print(user_list);
         }
         w++;
      }
   }
}
class Hdata_2 {		//��72
	public void pc_random(int user_list[]) {
		int pc_num[] = new int[5];
		int total = 0;
		int w = 1;
		while (w < 6) {
			int num = (int) (Math.random() * 46) + 1;
			pc_num[total] += num;
			total++;
			w++;
		}
		total_random(user_list, pc_num);
	}
	public void total_random(int user_1[], int pc_1[]) {
		System.out.println(Arrays.toString(user_1));
		System.out.println(Arrays.toString(pc_1));
	}
}