import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {

		/*
		 * [���빮��]
		 * extends�� ����Ͽ� ���� ����� ���� �ڵ带 �ۼ��ϼ���.
		 * ���� �� ���� �Է��մϴ�.
		 * �� ���� ���ڸ� Ȯ���Ͽ� ������ ���� üũ�մϴ�.
		 * ù��° ���ڰ� �ι�° ���ں��� ���� ��� 
		 * ù��° ���ڰ� �ι�° ���ں��� Ŭ ��� 
		 * ù��° ���ڿ� �ι�° ���ڰ� ���� ��� 
		 * 
		 * ù��° ���ڰ� ���� ��� : �ش� �� ���� ���� ��ģ ����� ���
		 * �ι�° ���ڰ� ���� ��� : �ش� ������ŭ ���ڸ� ��� ���� ��� ���� ���
		 * ù��°�� �ι�° ���ڰ� ���� ��� : "�ش� ���� �����ϴ�." ��� �޽��� ���
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int user1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int user2 = sc.nextInt();
		sc.close();
		
		BD b = new BD();
		b.ad1(user1,user2);
		b.ad2();
		System.exit(0);
		
		

	}

}

class AD {
	
	protected int a;
	protected int b;
	
	public void ad1(int u1, int u2) {
		
		this.a = u1;
		this.b = u2;
		
	}
}
class BD extends AD{
	
	public void ad2() {
		
		int total = 0;
		
		if(this.a < this.b) {
			total=a+b;
			System.out.println(total);
		}
		else if(this.b < this.a) {
			while(b <= a) {
				total+=b;
				b++;
			}
			System.out.println(total);
		}
		else {
			System.out.println("�ش� ���� �����ϴ�.");
		}
		
	}
	
}