import java.util.Arrays;
import java.util.Scanner;

public class Study_220607_2 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��1]
		 * �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� �մϴ�.
		 * ���� ����� �޾Ƽ� ����� ����ϼ���.
		 * 157, 45
		 * 157*45
		 * ���� ����� ��� : 
		 */
		
		ak5 aa = new ak5();
		System.out.println(aa.num(157,45));
		
		/*
		 * [���빮��2]
		 * ���� ���� �ϳ��� �ش� �޼ҵ�� �����ϰ� �˴ϴ�.
		 * �ش� �޼ҵ忡���� ������ ���� ó���մϴ�.
		 * ���� 3�� �����ϸ� 3*1 ~ 3*9������ ��� ������� ���Ͽ�
		 * sysout���� ��µǵ��� �ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("������ �հ�ġ�� ���� ���ڸ� �Է��ϼ���.");
		//int user = sc.nextInt();
		//int r = aa.num2(user);
	//	System.out.println(r);
		sc.close();
		aa = null;
		
		/*
		 * [���빮��4] -> ����
		 * �����ڿ��� �޴��� Ȱ��ȭ�ϴ� ���μ����Դϴ�.
		 * �ش� �޴� Ȱ��ȭ�� 2�� �迭�̸�, �޴���� Ȱ��ȭ�ϴ� (Y,N)���� �����մϴ�.
		 * �ش� Ȱ��ȭ ���� �����Ͽ� Y�� ����Ǵ� �ε��� ��ȣ�� �´� �޴����� 1�� �迭�� �籸�� �� ���ο��� ����ǵ��� �մϴ�.
		 * �ܷΰ� : ["���Ϲ��","����������","���ڽ�","�̺�Ʈ","�߼�"]
		 * �� private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��մϴ�.
		 * **�迭 �����ؾ���
		 */
		
		menus m1 = new menus();
		String ap[] = m1.aaa();
		System.out.println(Arrays.toString(ap));

	}

}

class ak5 {
	public int num(int z, int x) {
		int total = z * x;
		return total;
	}
	public int num2(int a) {
		//�ݺ����� ���ǹ� �ȿ� ���� ��� �Ұ�, ���� �ݺ����̾ �ǰ����� ����
		int w = 1;
		int total = 0;
		while(w < 10) {
			total += w * a;
			w++;
		}
		return total;
	}
}
class menus {
	   private String[][] m;
	   public menus() {
	      String ms[][] = {
	            {"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
	            {"Y","Y","N","Y","Y","N","Y"}
	      };
	      this.m = ms;
	   }
	   public String[] aaa() {
	      int ea = this.m[0].length;
	      String box[] = new String[5];
	      int w = 0;
	      int ct = 0;
	      while(w < ea) {
	         if(this.m[1][w].equals("Y")) {
	            box[ct]=m[0][w];
	            ct++;
	         }
	         w++;
	      }
	      return box;
	   }

	}