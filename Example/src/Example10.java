import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		/*
		 [���빮��10]
		 
		 ���� �̿����� ���� ���� ���α׷��� �����ϰ� �˴ϴ�.
		 ���� �׸��� ��ü 3�����̸�,
		 ��� true�� ���� �Ǿ�߸� ���� ���μ����� ������ �˴ϴ�.
		 ����ڿ��� �����Ǵ� ������ ������ �����ϴ�.
		 "�����׸� �����Ͻðڽ��ϱ�?" ��� �޼��� ��� ������(1), ���� ����(1)
		 
		 ���� �׸� �� �Ѱ����� �������� ���� ���
		 "��� �����ϼž߸� ����˴ϴ�." ��� ����մϴ�.
		 ��� �������� ���
		 "ȸ�������� �Ϸ�Ǿ����ϴ�." ��� ����մϴ�.
		 */
		
//		Scanner a = new Scanner(System.in);
//		String c = "���� �׸� �����Ͻðڽ��ϱ�? ������(1), ���� ����(2)";
//		String h;
//		int f=1;
//		while(f<4) {
//			System.out.println(c);		
//			int e = a.nextInt();
//			f++;
//		}
//		if(e==1) {
//			h="ȸ�������� �Ϸ� �Ǿ����ϴ�.";
//		}
//		else {
//			h="��� �����ϼž߸� ����˴ϴ�.";
//		}
		
		
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int agree;
		boolean all_agree = false;
		do {
			System.out.println("���� �׸� �����Ͻðڽ��ϱ�? ������(1), ���� ����(2)");
			agree = sc.nextInt();
			
			if(agree==1) {
				all_agree = true;
			}
			else {
				all_agree = false;
				break;
			}
			w++;
		}while(w<=3);
		
		if(all_agree==false) {
			System.out.println("��� �����ϼž߸� ����˴ϴ�.");
		}
		else {
			System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
		}
		sc.close();
	
	}

}
