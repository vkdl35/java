import java.util.Arrays;
import java.util.Scanner;

public class Study_220603 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��1] �迭 + �޼ҵ�		//��77
		 * 1�� �迭�� ������ ���� ���� �ֽ��ϴ�. 
		 * �迭����Ʈ 11 22 33 44 55 66 77 88 99 �̸�
		 * �ش� ��ü���� ��� ���� ���հ� ���� ������ �޼ҵ�� ó�� �ǵ��� �մϴ�. 
		 * ��, �ݺ����� ������ do~while������ �ۼ��մϴ�.
		 */

		int num[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Adata_2 ad = new Adata_2();
		ad.datas(num);
		ad = null;
		
		/*
		 * [���빮��2] �迭 + �⺻(Ŭ����) �޼ҵ� ����		//��88
		 * product : ����, ����, ���, ��, ����, Ű��, �ٳ���, ���� ��
		 * ����, ��, Ű���� ���� �߽��ϴ�.
		 * �ش� ���� �� �迭�� �ٽ� �� ����Ʈ �ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��, �ش� ó�������� ��� ������ �޼ҵ忡�� ó���� �Ǿ���ϸ� �ݺ����� �����Դϴ�.
		 * ��� : ����, ���, ����, �ٳ���, ����
		 */
		
		String fruit[] = { "����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����" };
		Bdata_2 bd = new Bdata_2();
		bd.list(fruit);
		bd = null;
		
		/*
		 * [���빮��3] �迭 + �⺻(Ŭ����) �޼ҵ� ����		//��104
		 * product : ����,����,���,��,����,Ű��,�ٳ���,����
		 * moneys : 35000,8000,4000,5500,3800,4400,11000,18900
		 * ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�.
		 * ��, �� �� ����� �ٳ����� �����ϰ� �� ���� �ݾ��� ����ϼ���.
		 */
		
		String fruit2[] = { "����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����" };
		int money[] = { 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900 };
		Cdata_2 cd = new Cdata_2();
		cd.data(fruit2, money);
		cd = null;

		/*
		 * [���빮��4] �迭 ���� + �⺻(Ŭ����) �޼ҵ� ����		//��118
		 * ����ڰ� ���� ������ ���� �Է��ϰ� �˴ϴ�. 
		 * "�б� �л� �̸��� �Է����ּ���."
		 * �� �迭 �����ʹ� 5���� �����˴ϴ�. **������ �ټ��� ����
		 * ������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� ����Ʈ�� �����Ͽ� ����ϼ���.
		 * ����) ����ڰ� �Է��� ���� : hong, kim, park, lee, jang
		 * ���) hong, kim, park, lee, jang
		 */
		
		Scanner sc = new Scanner(System.in);
		int w = 1;
		String name = "";
		while (w < 6) {
			System.out.println("�б� �л� �̸��� �Է����ּ���.");
			String user = sc.next();
			name += (user + " ");
			w++;
		}
		Ddata_2 dd = new Ddata_2();
		dd.list(name);
		sc.close();
		dd = null;
      
	}	
}

class Adata_2 {		//��9
	public void datas(int num_2[]) {
		int w = 0;
		int ea = num_2.length;
		int total = 0;
		do {
			total += num_2[w];
			w++;
		} while (w < ea);
		System.out.println(total);
	}
}
class Bdata_2 {		//��22
	public void list(String f[]) {
		String new_fruit[] = new String[5];
		int w = 0;
		int ea = f.length;
		int total = 0;
		while (w < ea) {
			if (!f[w].equals("����") && !f[w].equals("��") && !f[w].equals("Ű��")) {
				new_fruit[total] = f[w];
				total++;
			}
			w++;
		}
		System.out.println(Arrays.toString(new_fruit));
	}
}
class Cdata_2 {		//��36
	public void data(String f[], int m[]) {
		int ea = f.length;
		int w = 0;
		int total = 0;
		while (w < ea) {
			if (!f[w].equals("���") && !f[w].equals("�ٳ���")) {
				total += m[w];
			}
			w++;
		}
		System.out.println(total);
	}
}
class Ddata_2 {		//��50
	public void list(String name_2) {
		String user_2[] = name_2.split(" ");
		System.out.println(Arrays.toString(user_2));
	}
}
