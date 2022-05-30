import java.util.Scanner;

public class Study_220530 {

	public static void main(String[] args) {
		
		//���� �ݺ��� while
		
		int a = 1;
		while(a <= 3) {
			int aa = 1;
			while (aa <= 4) {
				System.out.print(a+"+"+aa+" ");
				aa++;
			}
			a++;
		}
		
		//���� �ݺ��� do while��
		
		int a1 = 1;
		do {
			int aa1 = 1;
			do {
				System.out.print(a1+"+"+aa1+" ");
				aa1++;
			}while(aa1 < 5);
			a1++;
		}while(a1 < 4);
		
		//���� �ݺ��� for, do~while
		
		int a2;
		
		for(a2=2;a2<=3;a2++) {
			int aa2 = 1;
			do {
				System.out.print(a2+"*"+aa2+"="+(a2*aa2)+" ");
				aa2++;
			}while(aa2 < 10);
		}
		
		//switch~case ���ù�
		
		int a3 = 3;
		switch(a3) {
		case 1 :
			System.out.println("�ɼ� 1�� �����ϼ̽��ϴ�.");
			break;
		case 2 :
			System.out.println("�ɼ� 2�� �����ϼ̽��ϴ�.");
			break;
		case 3 :
			System.out.println("�ɼ� 3�� �����ϼ̽��ϴ�.");
			break;
		default :
			System.out.println("������ ���� �����ϴ�.");
			break;
		}
		
		//���� case ����
		
		String a4 = "�̰��";
		switch(a4) {
		case "�̰��" :
		case "�� ���" :
		case "�� �� ��" :
			System.out.println("A�� �Դϴ�.");
			break;
		case "������" :
			System.out.println("B�� �Դϴ�.");
			break;
		case "�̼���" :
			System.out.println("C�� �Դϴ�.");
			break;
		default :
			System.out.println("�������� D�� �Դϴ�.");
			break;
		}
		
		//switch version ����
		
		String mag  = "5%���� ���� ��÷";
		int a5 = 5;
		switch(a5) {
		case 1 -> {
			mag  = "5%���� ���� ��÷";
		}
		case 2 -> {
			mag  = "10%���� ���� ��÷";
		}
		case 3,4 -> {
			mag  = "�ù�� ���� ���� ��÷";
		}
		default -> {
			mag  = "���� ��ȸ��...";
		}	
		}
		System.out.println(mag);
		
		//���ù��� �ݺ���
		
		String a6 = "*";
		int tt;
		
		switch(a6) {
		case "+" -> {
			int a7;
			tt = 0;
			for(a7=1;a7<+5;a7++) {
				tt+=a7;
			}
			System.out.printf("�� 1~5���� ���� ���� %d�Դϴ�.",tt);
		}
		case "-" -> {
			tt = 0;
			System.out.println("�������� ��µ��� �ʽ��ϴ�.");
		}
		case "*" -> {
			int a7 = 1;
			tt = 1;
			do {
				tt*=a7;
				a7++;
			}while(a7 <= 5);
			System.out.printf("�� 1~5���� ���� ���� %d�Դϴ�.",tt);
		}
		case "/" -> {
			tt = 0;
		}
		}

		
		/*
		 * [���빮��1]
		 * ���� ������� ��µǵ��� for������ �ۼ��ϼ���.
		 * 5+2=7 ~ 9+5=14
		 */
		
		int b,bb;
		int total;
		
		for(b=5;b<=9;b++) {
			for(bb=2;bb<=5;bb++) {
				total=b+bb;
				System.out.printf("%d+%d=%d ",b,bb,total);
			}
		}
		
		/*
		 * [���빮��2]
		 * ���� ������� ��µǵ��� while������ �ۼ��ϼ���
		 * 9*7=63 ~ 7*5=35
		 */
		
		int b1 = 9;
		int total2;
		
		while(b1 >= 7) {
			int bb1 = 7;
			while(bb1 >= 5) {
				total2=(b1*bb1);
				System.out.printf("%d*%d=%d ",b1,bb1,total2);
				bb1--;
			}
			b1--;
		}
		
		/*
		 * [���빮��3]
		 * ���� ������� ���� dowhile������ �����ϼ���.
		 * 5+4=9 ~ 3+7=10
		 */
		
		int b2 = 5;
		int total3;
		
		do {
			int bb2 = 4;
			do {
				total3=b2+bb2;
				System.out.printf("%d+%d=%d ",b2,bb2,total3);
				bb2++;
			}while(bb2 <= 7);
			b2--;
		}while(b2 >= 3);
		
		/*
		 * [���빮��4]
		 * ������ 7�ܺ��� 9�ܱ��� ���ϼ���.
		 * ��, �� ������ �������� 5������ �������� �ϸ�, 
		 * do~while�� �ȿ� while���� �־� �ۼ��ϼ���.
		 * ��) 7*1=7 ~ 9*5=45
		 */
		
		int b3 = 7;
		int total4;
		
		do {
			int bb3 = 1;
			while(bb3 <= 5) {
				total4=b3*bb3;
				System.out.printf("%d*%d=%d ",b3,bb3,total4);
				bb3++;
			}
			b3++;
		}while(b3 <= 9);
		
		/*
		 * [���빮��5]
		 * ���� ������� Ȯ���Ͽ� �ڵ带 �ۼ��ϼ���.
		 * ��, for������ �����Ͽ� while������ �����ϵ��� �ϼ���.
		 * 1*1=1 , 2*2=4 , 3*3=9 , �� 9*9=81
		 */
		
		int b4;
		int total5;
		
		for(b4=1;b4<=9;b4++) {
			int bb4=b4;
			while(bb4 <= b4) {
				total5=b4*bb4;
				System.out.printf("%d*%d=%d ",b4,bb4,total5);
				bb4++;
			}
		}
		
		/*
		 * [���빮��6]
		 * ���� �ش� �����ó�� ����� �ǵ��� ���� �ݺ����� ����ϼ���.
		 * ��, �ۿ��� while��, �ȿ��� do~while������ �ۼ��ϼ���.
		 * 1+1=2, 2+1=3, 2+2=4, 3+1=4, 3+2=5, 3+3=6, 4+1=5, 4+2=6, 4+3=7, 4+4=8
		 */
		
		/*
		 * [���빮��7]
		 * ����ڰ� ������ ���� ������ �޽��ϴ�.
		 * Q. "1~5������ ���ڸ� �ϳ� �Է����ּ���."
		 * �������
		 * 1 : 5%��������
		 * 2 : 10%��������
		 * 3~4 : �ù�� ���� ����
		 * 5 : ���� ��ȸ��...
		 */
		
		
		Scanner as = new Scanner(System.in);
		System.out.println("Q.1~5������ ���ڸ� �ϳ� �Է����ּ���.");
		int u = as.nextInt();
		String mag2 = "5%��������";
		
		switch(u) {
		case 1 :
			mag2 = "5%��������";
			break;
		case 2 :
			mag2 = "10%��������";
			break;
		case 3,4 :
			mag2 = "�ù�� ���� ����";
			break;
		default :
			mag2 = "���� ��ȸ��...";
			break;
		}
		System.out.println(mag2);
		as.close();
		
	}

}
