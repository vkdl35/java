import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڸ� �ϳ� �Է����ּ���.");
		int user = sc.nextInt();
		sc.close();
		
		int total = 1;
		int w = 1;
		
		if(user < 0) {
			System.out.println("�������� �������� �̿��� �� �����ϴ�.");
		}
		else {
			do {
				total = w * user;
				System.out.printf("%d*%d=%d ",user,w,total);
				w++;
			}while(w < 10);
			
		}

	}

}
