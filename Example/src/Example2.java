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
		
		Scanner asc = new Scanner(System.in);
		
		int a=1;
		int b=1;
		int c=0;
		
		System.out.println("�����ܿ� ���� ���ڸ� �Է��ϼ���.");
		int dd = asc.nextInt();
		
		while(a<=9) {
			b=a*dd;
			c+=b;
			a++;
		}
		if(c%2==1) {
			System.out.println("������ "+dd+"���� ��� ���� ���� "+c+"�̸� Ȧ���Դϴ�.");
		}
		else {
			System.out.println("������ "+dd+"���� ��� ���� ���� "+c+"�̸� ¦���Դϴ�.");
		}
		
		asc.close();
		

	}

}
