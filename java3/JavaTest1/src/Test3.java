import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է��ϼ���.");
		int user = sc.nextInt();
		sc.close();
		
		if(user>60) {
			System.out.println("�ش� ���ڴ� 60������ �Է��� �Ǿ�� �մϴ�.");
		}
		else if(user<=60 && user % 2 == 1){
			System.out.println("Ȧ���Դϴ�.");
		}
		else {
			System.out.println("¦���Դϴ�.");
		}
		
	}

}
