import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		/*
		 [���빮��3] 
		 
		 ����ڰ� �ش� ���� �Է��մϴ�. 
		 ��, ����ڰ� �ΰ��� ���ڸ� �Է��ϵ� ù��° ���ڿ� �ι�° ���� ���� �ȿ� �ִ�
		 ��� ���ڸ� ���ؼ� ������� �������� �����Ͻÿ�.
		 ��, �ش� �ڵ�� do~while������ �ۼ��մϴ�.
		 
		 ����) 
		 ù��° ���� ���ڴ�? 5
		 �ι�° ���� ���ڴ�? 10
		 ���� ���� ��� �հ�� 45�Դϴ�.
		 */
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("ù��° ���� ���ڴ�?");
//		int user = scan.nextInt();	//������ ù��° ���� �Է°�
//		
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("�ι�° ���� ���ڴ�?");
//		int user2 = scan.nextInt();	//������ �ι�° ���� �Է°�
//		
//		int c = 0;
//		
//		do {
//			c += user;
//			user++;
//		}while(user<=user2);
//		
//		System.out.println(c);
//		
//		scan.close();
//		scan2.close();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� ���ڴ�?");
		int a = sc.nextInt();
		System.out.println("�ι�° ���� ���ڴ�?");
		int b = sc.nextInt();
		int total = 0;
		
		do {
			total = total + a;
			a++;
		}while(a<=b);
		
		System.out.println("���� ���� ��� �հ�� "+total+"�Դϴ�.");
		
		sc.close();
		
		
		
		

	}

}
