import java.util.Scanner;

public class Study_220525_2 {

	public static void main(String[] args) {
		
		//�ݺ��� - for
		
		int a;
		
		for(a=1;a<11;a++) {
			System.out.println(a);
		}
		
		for(a=10;a>0;a--) {
			System.out.println(a);
		}
		
		//�ݺ��� - while
		
		int a2 = 1;
		
		while(a2 <= 10) {
			System.out.print(a2+" ");
			a2++;
		}
		
		int a3 = 10;
		
		while(a3 >= 1) {
			System.out.print(a3+" ");
			a3--;
		}
		
		//�ݺ��� - do~while
		
		int a4 = 1;
		
		do {
			System.out.print(a4+" ");
			a4++;
		}while(a4 <= 10);
		
		int a5 = 10;
		
		do {
			System.out.print(a5+" ");
			a5--;
		}while(a5 >= 1);
		
		//�ݺ����� ���� - for��
		
		int a6;
		int b6;
		
		for(a6=1;a6<=9;a6++) {
			b6 = a6 * 5;
			System.out.print(b6+" ");
		}
		
		//�ݺ����� ���� - while��
		
		int a7 = 1;
		int b7;
		
		while(a7 < 10) {
			b7 = a7 * 5;
			System.out.print(b7+" ");
			a7++;
		}
		
		//�ݺ����� ���� - d0~while��
		
		int a8 = 1;
		int b8;
		
		do {
			b8 = a8 * 5;
			System.out.print(b8+" ");
			a8++;
		}while(a8 < 10);
		
		//�ݺ����� ��ĳ�� - for��
		
		Scanner aa = new Scanner(System.in);
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���.");
		int user = aa.nextInt();
		int a9;
		int b9 = 1;
		
		for(a9=1;a9<=9;a9++) {
			b9 = a9 * user; 
			System.out.print(b9+" ");
		}
		
		//�ݺ����� ��ĳ�� - while��
		
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���.");
		int user2 = aa.nextInt();
		int a10 = 1;
		int b10 = 1;
		
		while(a10 < 10) {
			b10 = a10 * user2;
			System.out.print(b10+" ");
			a10++;
		}
		
		//�ݺ����� ��ĳ�� - do~while��
		
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���.");
		int user3 = aa.nextInt();
		int a11 = 1;
		int b11 = 1;
		
		while (a11 < 10) {
			b11 = a11 * user3;
			System.out.print(b11+" ");
			a11++;
		}
		
		aa.close();
		
		
		/*
		 * [���빮��1] 20���� 27���� ����ϼ���.
		 */
		
		int num1;
		
		for(num1=20;num1<28;num1++) {
			System.out.print(num1+" ");
		}
		
		/*
		 * [���빮��2] 39~21���� ����ϼ���
		 */
		
		int num2;
		
		for(num2=39;num2>=21;num2--) {
			System.out.print(num2+" ");
		}
		
		/*
		 * [���빮��3] ���� �ΰ��� �̿��Ͽ� ���� �����͸� ����ϼ���.
		 * 55~4���� ����մϴ�.
		 */
		
		int num3;
		int num4 = 4;
		
		for(num3=55;num3>=num4;num3--) {
			System.out.print(num3+" ");
		}
		
		/*
		 * [���빮��4] ���� ������ while������ �ۼ��ϼ���.
		 * 22~16���� ���ڸ� ����ϼ���. 
		 */
		
		int num5 = 22;
		
		while(num5 >= 16) {
			System.out.print(num5+" ");
			num5--;
		}
		
		/*
		 * [���빮��5] ���� ������ while������ �ۼ��ϼ���.
		 * ���� 2���� �̿��ؼ� ������ �°� ���� ����ϼ���.
		 * 99~47���� ����ϼ���.
		 */
		
		int num6 = 99;
		int num7 = 47;
		
		while(num6 > num7) {
			System.out.print(num6+" ");
			num6--;
		}
		
		/*
		 * [���빮��6] ���� ������� ���� �ڵ带 �ۼ��ϼ���.
		 * 45,40,35,30,25,20
		 */
		
		int num8;
		int num9;
		
		for(num8=9;num8>=4;num8--) {
			num9 = num8 * 5;
			System.out.print(num9+" ");
		}
		
		/*
		 * [���빮��7] ���� ������� Ȯ�� �� �ڵ带 �����Ͽ� ����ϼ���.
		 * 11, 22, 33, 44, 55, 66, 77, 88, 99
		 */
		
		int num10;
		int num11;
		
		for(num10=1;num10<=9;num10++) {
			num11 = num10 * 11;
			System.out.print(num11+" ");
		}
		
		/*
		 * [���빮��8] �ش� ������� Ȯ�� �Ͽ� while �ݺ������� �ڵ带 �ۼ��ϼ���.
		 * 56, 49, 42, 35, 28, 21
		 */
		
		int num12 = 8;
		int num13;
		
		while(num12 >= 3) {
			num13 = num12*7;
			System.out.print(num13+" ");
			num12--;
		}
		
		/*
		 * [���빮��9] ���� ��� ���� Ȯ���Ͻ� ��,
		 * while �ݺ������� �ش� ������� �´� �ڵ带 �ۼ��ϼ���.
		 * 4, 7, 10, 13, 16, 19, 22
		 */
		
		int num14 = 1;
		int num15 = 1;
		while(num14 < 8) {
			num15 = (num14 * 3)+1;
			System.out.print(num15+" ");
			num14++;
		}
		
		/*
		 * [���빮��10] ���� ������� ���� do~while���� �ڵ带 �ۼ��Ͻÿ�.
		 * 35 45 55 65 75
		 */
		
		int num16 = 3;
		int num17 = 1;
		
		do {
			num17 = (num16 * 10)+5;
			System.out.print(num17+" ");
			num16++;
		}while(num16 <= 7);
		
		
	}

}
