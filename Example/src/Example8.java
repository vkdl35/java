import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 [���빮��8]
		 
		  ����� �н������ a1234�Դϴ�.
		  ����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ �̻� ���н� ������ ���� ��µǵ��� �մϤ���.
		  "�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�."
		  ��, �н����尡 ���� ��� "�α��� �Ǿ����ϴ�." ��� ��µǾ�� �մϴ�.
		 */
		
		// [���� §�ڵ� - ������]
		
//		Scanner ac = new Scanner(System.in);
//		String a = "a1234";
//
//		int c = 1;
//		 
////		System.out.println("�н����带 �Է��ϼ���.");
////		String b = ac.next();
//			
//		 while(c<4) {
//			System.out.println("�н����带 �Է��ϼ���.");
//			String b = ac.next();
//			if(b.equals(a)) {
//				System.out.println("�α��� �Ǿ����ϴ�.");
//				break;		//break�� �ݺ����� ���� ���� �� �� ����մϴ�.
//			}
//			if (c>=2) {
//					System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
//				}
//			c++;
//		}
		
		
			
			// [�������� § �ڵ�]
		
		
			final String pw = "a1234";
			int c = 3;
			Scanner ac = new Scanner(System.in);
			int w = 0;
			String msg = "�н����带 �Է��� �ּ���.";
			while(w < 3) {
				System.out.println(msg);
				String userpw = ac.next();
				if(pw.equals(userpw)) {					
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}
				else {		
					msg = "�ùٸ� �н����带 �־��ּ���.";
					c--;
					if(c==0) {
						System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�.");
					}
				}
				w++;
			}
			ac.close();


	}

}
