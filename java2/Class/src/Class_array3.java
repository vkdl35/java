import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*
		 * [���빮��]
		 * ���� ���� �迭 �����Ͱ��� �ֽ��ϴ�.
		 * a1 : ȫ�浿 �̼��� ������ ������ ������
		 * a2 : 100 80 39 60 55
		 * "�˻��ϰ��� �ϴ� �̸��� �����ּ���." ����ϰ� �˴ϴ�.
		 * �˻�� �̼����̶�� �˻��� �ϰ� �Ǹ�
		 * "�̼��Ŵ��� 80���Դϴ�." ��� ����� �Ǿ�� �մϴ�.
		 */
		
//		Scanner ac = new Scanner(System.in);
//		String su [][] = {
//				{"ȫ�浿","�̼���","������","������","������"},
//				{"100","80","39","60","55"}
//		};
//		
//		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���.");
//		String user = ac.next();
//		data.data(su,user);
		String a1[] = {"ȫ�浿","�̼���","������","������","������"};	//a1 �迭
//		int a2[] = {100,80,39,60,55};
		String a2[] = {"100","80","39","60","55"};	//a2 �迭
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���.");
		String usernm = sc.next();	//����ڰ� �Է��� ������ usernm
		
		jumsu j = new jumsu();
		j.ck(a1,a2,usernm);	//ck��� �޼ҵ忡 ���� ������ ������ ����
		//�Ű�����
		//j.ck(1,2,3)	=> �μ���(���ڰ�)
	}

}

class jumsu {
	//�޼ҵ� ()�ȿ� ��
	public void ck(String data1[],String data2[],String user) {	//main �޼ҵ忡 �ִ� ������ ���� (j.ck(a1,a2,usernm))
		//System.out.println(Arrays.toString(data1));
		//System.out.println(user);
		int w = 0;
		int ea = data1.length;
		boolean ck = false;
		do {
			if(user.equals(data1[w])) {	//�迭�� ������ ���� ���� ���
				String js = data2[w];
				System.out.printf("%s���� %s���Դϴ�.",user,js);
				ck = true;
			}
			w++;
		}while(w < ea);
		if(ck == false) {	//main class���� ����ڸ� �˻����� ��� �迭���� ���� ��Ȳ 
			System.out.println("��ϵ� ����ڰ� �ƴմϴ�.");
		}
		
		
		
	}
}



//class data {
//	public static void data(String aa[], String b) {
//		int ea = aa.length;
//		String newdata[] = new String[su[0].length];
//		int w = 0;
//		while(w == 0) {
//			int ww = 0;
//			while (ww < ea) {
//				newdata[w] = su[0][ww] + "���� " + su[1][ww] + "�� �Դϴ�.";
//				w++;
//			}
//			w++;
//		}
//		System.out.println(Arrays.toString(newdata));
//		
//	}
//}






