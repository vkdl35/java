import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/* 
		 [���빮��]
		  
		  while������ �ڵ带 �ۼ��ؾ� �ϸ�, ���μ����� ������ �����ϴ�. 
		  ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�. 
		  ������ "7,000�� �����Ͻðڽ��ϱ�? ��� ��µǸ�, 
		  ���� 1�̶�� �Է��ϸ� �������� �ݾ׿� �߰��˴ϴ�. 
		  ��, 2��� �Է½� �������� �ݾ׿� �߰��Ǹ� �ȵ˴ϴ�.
		  
		  �� ���� Ƚ���� 4���Դϴ�.
		  �������� ���� ���� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ�.
		 */
		/*
		Scanner aa = new Scanner(System.in);
		int won=7000;
		
		int a=1;
		int c=1;
		int d=0;
		
		while(a<=4) {
			System.out.println(won+"�� �����Ͻðڽ��ϱ�?");
			int b = aa.nextInt();
			if(b==c) {
				d++;
			}
			else if(b==2) {
				
			}
			a++;
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		final int money = 7000;
		int w = 1;
		int user;
		int total = 0;
		while(w<=4) {
			System.out.println("7000�� �����Ͻðڽ��ϱ�?");
			user = sc.nextInt();
			if (user==1) {
				total += money;
			}
			w++;
		}
		System.out.println("���� �ݾ���:"+total+"�� �Դϴ�.");

		
		sc.close();
		
		
		
		
		
		
	}

}
