import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��] �迭 ���� + �⺻(Ŭ����) �޼ҵ� ����
		 * ����ڰ� ���� ������ ���� �Է��ϰ� �˴ϴ�. 
		 * "�б� �л� �̸��� �Է����ּ���."
		 * �� �迭 �����ʹ� 5���� �����˴ϴ�. **������ �ټ��� ����
		 * ������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� ����Ʈ�� �����Ͽ� ����ϼ���.
		 * ����) ����ڰ� �Է��� ���� : hong, kim, park, lee, jang
		 * ���) hong, kim, park, lee, jang
		 */
		
		Scanner sc = new Scanner(System.in);
		int f = 0;
		String list = "";
		while(f < 5) {
			System.out.println("�б� �л� �̸��� �Է����ּ���.");
			String num = sc.next();
			list += (num+" ");
			f++;
			}
			data(list);
			sc.close();
			
		
		
	}

			
	public static void data(String a) {
		//System.out.println(a);
		//a = a.trim();
		String userin[] = a.split(" ");	
		//split : ���ڿ� �Ǵ� ���ڿ� Ư�� ���� �������� �迭�� ������ �� �ִ� ��ɾ�
		System.out.println(Arrays.toString(userin));
		
		}

}
