import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 [���빮��]
		 
		 ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�,
		 ������ ����� ����Ͽ� ¦������ Ȧ�������� ����Ͻÿ�.
		 "�����ܿ� ���� ���ڸ� �Է��ϼ���." ��� �޼����� ��µǸ�
		 �ش� ���ڿ� ���缭 ��� ����� ���ϸ�,
		 ���� ���� ���� ¦������ Ȧ�������� ����Ͻø� �˴ϴ�.
		 ��, �ش� �ݺ����� for ~ dowhile������
		 �Ѱ����� �����ؼ� �ۼ��Ͻÿ�.
		 
		 **���ǹ��� �ݺ��� �ȿ� ������ �ȵ˴ϴ�.
		 */
		
		//[���� § �ڵ�]
		
//		Scanner asc = new Scanner(System.in);
//		
//		int a=1;
//		int b=1;
//		int total=0;
//		
//		System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���.");
//		int user = asc.nextInt();
//		
//		while(a<=9) {
//			b=a*user;
//			total+=b;
//			a++;
//		}
//			if(total%2==1) {
//			System.out.println("������ "+user+"���� ��� ���� ���� "+total+"�̸� Ȧ���Դϴ�.");
//		}
//			else {
//			System.out.println("������ "+user+"���� ��� ���� ���� "+total+"�̸� ¦���Դϴ�.");
//		}
//		
//		asc.close();
		
		
		//if() : < > <= >= == != (|| &&)
		//�ݺ���() : = < > <= >= (++ --)
		//�ݺ���{} : += -= /= *=
		
		//[�������� § �ڵ�]
		
		Scanner sc = new Scanner(System.in);
		String msg = "�����ܿ� ���� ���ڸ� �Է��ϼ���.";
		String msg2;
		System.out.println(msg);
		int user = sc.nextInt();
		int f = 1;
		int total=0;
		do {
			total = total + (user * f);
			//totla+=user*f;
			f++;
		}while(f < 10);
		//System.out.println(total);
		if(total % 2 == 0) {
			msg2 = "¦��";
		}
		else {
			msg2 = "Ȧ��";
		}
		System.out.printf("������� %s�Դϴ�.",msg2);
		sc.close();
		
		

	}

}
