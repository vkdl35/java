import java.math.BigInteger;
import java.util.Scanner;

public class Study_220526 {

	public static void main(String[] args) {

		//�ݺ����� �����Ҵ��ȣ - for��
		
		int a;
		int total=0;
		
		for(a=1;a<=10;a++) {
			total+=a;
		}
		System.out.println(total);
		
		//�ݺ����� �����Ҵ��ȣ - while��
		
		int a4 = 5;
		int total3 = 0;
		
		while(a4 < 11) {
			total3+=a4;
			a4++;
		}
		System.out.println(total3);
		
		//�ݺ����� �����Ҵ��ȣ - do~while��

		int a6 = 30;
		int total6=0;
		
		do {
			total6+=a6;
			a6++;
		}while(a6 < 36);
		System.out.println(total6);
		
		//�Ҵ��ȣ�� ����
		
		int p = 5;
		System.out.println(p++);
		System.out.println(++p);
		
		//�ݺ����� ��ĳ�� �ޱ� - for��
		
		Scanner aa = new Scanner(System.in);
		
		int jumsu;
		int a8;
		int total8=0;
		
		for(a8=1;a8<4;a8++) {
			System.out.println("������ �Է��ϼ���.");
			jumsu = aa.nextInt();
			total8+=jumsu;
		}
		System.out.println("�� ������ "+total8+"�� �Դϴ�.");
		
		//BigInteger
		
		int b;
		BigInteger big = new BigInteger("1");
		
		for(b=1;b<=10;b++) {
			big = big.divide(BigInteger.valueOf(b));
		}
		System.out.println(big);
		
		//final ���� ������ �ʴ� ��
		
		final int a11 = 1;
		final String name = "ȫ�浿";
		System.out.println(name);
		System.out.println(a11);
		
		//���ǹ��� �ݺ��� - for��
		
		final int a12 = 5; 	//������
		int b12;	//�ݺ��ϴ� ����
		boolean ok = false;	//�ݺ��� ���� if ������ �޴� ������ �־����
		
		for(b12=1;b12<10;b12++) {
			if(b12==a12) {
				System.out.println("��ϵ� ���� Ȯ�ε˴ϴ�.");
				ok=true;
			}
		}
		if(ok==false) {
			System.out.println("Ȯ�ε��� �ʴ� �����Դϴ�.");
		}	//�ݺ��� �ȿ� ������ �ݺ��ϴµ��� ��� ��µ�
		
		//���ǹ��� �ݺ����� �̿��� ¦��, Ȧ�� ���� ���
		
		int ff;
		String odd=" ";
		for(ff=1;ff<=20;ff++) {
			if(ff%2 != 1) {
				System.out.print(ff+" ");
			}
			else {	//���࿡ Ȧ�� ���� ��� odd ������ ���������� ���� �߰��ϰ� �˴ϴ�.
				//odd = ff + " " + odd;
				odd += ff + " ";
			}
		}
		System.out.println(odd);//�߰��� ��� " " ������� Ȱ���Ͽ� ������.
		
		//���� �ݺ���
		
		int c, cc;
		
		for(c=2;c<=3;c++) {		//����� ������ ����
			for(cc=1;cc<10;cc++) {		//�������� ��ȩ�� ���ư��ٴ� ����
				System.out.print(" "+c+"*"+cc);
			}
		}
		
		
		/*
		 * [���빮��1] ��ü���� 500�� �ֽ��ϴ�. �� 8ȸ ���� �ݺ��Ǹ鼭
		 * �ѹ� �ݺ��� ������ 12�� �����ϵ��� �Ͽ� ���� ���� ����ϼ���.
		 * ������� 404�Դϴ�.
		 */
		
		int a2;
		int b2 = 12;
		int total2 = 500;
		
		for(a2=1;a2<=8;a2++) {
			total2-=b2;
		}
		System.out.println(total2);
		
		/*
		 * [���빮��2] ������ 2�� 2*1���� ~ 2*9������ �� �հ踦 ����ϼ���.
		 * �հ�� 90�Դϴ�.
		 */
		
		int a3;
		int b3=1;
		int total4=0;
		
		for(a3=1;a3<10;a3++) {
			b3=a3*2;
			total4+=b3;
		}
		System.out.println(total4);
		
		/*
		 * [���빮��3] 3���� 8���� ���� �� �հ� ���� while������ ����ϼ���.
		 */
		
		int a5 = 3;
		int total5=1;
		
		while(a5 < 9) {
			total5*=a5;
			a5++;
		}
		System.out.println(total5);
		
		/*
		 * [���빮��4] �հ���� 189�� �ֽ��ϴ�.
		 * 189���� 1~10���� �հ�ġ�� �� �� ��ġ�� do~while������ ���ϼ���.
		 */
		
		int a7 = 1;
		int total7 = 0;
		
		do {
			total7+=a7;
			a7++;
		}while(a7 < 11);
		System.out.println(189-total7);
		
		/*
		 * [���빮��5] �� 2���� ������ �ϰ� �˴ϴ�.
		 * ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� scanner�� �����ϼ���.
		 * ��, while������ �����ϼ���.
		 */
		
		int a9=1;
		int user;
		int total9=0;
		
		while(a9 < 3) {
			System.out.println("���ڸ� �Է��ϼ���.");
			user = aa.nextInt();
			total9+=user;
			a9++;
		}
		System.out.printf("�� ���� ���� %d�Դϴ�.",total9);
		
		/*
		 * [���빮��6] ����ڰ� �� 3���� ���ڸ� �Է��մϴ�.
		 * 3�� ���ڸ� ��� ���Ͽ� �� �հ� ���� ����ϼ���.
		 * ��, do~while������ �����ϼ���.
		 */
		
		int a10 = 1;
		int user2;
		int total10=1;
		
		do {
			System.out.println(a10+"��° ���ڸ� �Է����ּ���.");
			user2=aa.nextInt();
			total10*=user2;
			a10++;
		}while(a10 < 4);
		System.out.printf("�� �հ�ġ�� %d�Դϴ�.",total10);
		
		/*
		 * [���빮��7] �� �������� ���� �ݺ��մϴ�. �� �� Ȧ������ ����ϵ��� �մϴ�.
		 */
		
		int a13; //�ݺ��� ��
		
		for(a13=1;a13<21;a13++) {
			if(a13 % 2 == 1) {
				System.out.print(a13+" ");
			}
		}
		
		/*
		 * [���빮��8] while������ 10~30���� ���� �߿��� Ȧ������ ����ϼ���.
		 * ��, 20�̻��� Ȧ������ ����ϼ���.
		 */
		
		int a14=10;
		
		while(a14 < 31) {
			if(a14 % 2 == 1 && a14 >= 20 ) {
				System.out.print(a14+" ");
			}
			a14++;
		}
		
		/*
		 * [���빮��9] 1~10���� ���� �߿� ¦������ � �ִ��� ������ ����ϼ���.
		 * while������ �ۼ��ϼ���.
		 */
		
		int a15 = 1;
		int total15 = 0;	
		
		while(a15 < 11) {
			if(a15 % 2 == 0) {
				total15++;	//�ش� ������ ���� ��� 1�� ����
			}
			a15++;
		}
		System.out.println(total15);
		
		/*
		 * [���빮��10] ������ 6�� �߿��� 35�̻� ��� ���ڸ� ����Ͻÿ�.
		 * ��, do~while������ �ۼ��ϼ���.
		 */
		
		int a16 = 1;
		int total16 = 1;
		
		do {
			total16=a16*6;
			if(total16 > 34) {
				System.out.println(total16);
			}
			a16++;
		}while(a16 < 10);
		
		/*
		 * [���빮��11] 14~27���� ������ ¦������ ��� ���Ͽ� ���� ������� ����ϼ���.
		 * �� ������� 140�̸�, do~while������ �ۼ��ϼ���.
		 */
		
		int a17 = 14;
		int total17 = 0;
		
		do {
			if(a17 % 2 == 0) {
				total17+=a17;
			}
			a17++;
		}while(a17 < 28);
		System.out.println(total17);
		
		/*
		 * [���빮��12] ������ 5�ܺ��� 7�ܱ��� ����� �ϵ� 4������ ���������� ������ ���ı��� ����ϼ���.
		 * 5*1~7*4
		 * �ش� ������� �� �հ踦 ����ϼ���.
		 */
		
		int a18, b18;
		int c18=0;
		
		for(a18=5;a18<=7;a18++) {
			for(b18=1;b18<5;b18++) {
				c18+=(a18*b18);
			}
		}
		System.out.println(c18);
		
		aa.close();
		
	}

}
