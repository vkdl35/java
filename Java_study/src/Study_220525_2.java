import java.util.Scanner;

public class Study_220525_2 {

	public static void main(String[] args) {
		
		//반복문 - for
		
		int a;
		
		for(a=1;a<11;a++) {
			System.out.println(a);
		}
		
		for(a=10;a>0;a--) {
			System.out.println(a);
		}
		
		//반복문 - while
		
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
		
		//반복문 - do~while
		
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
		
		//반복문과 연산 - for문
		
		int a6;
		int b6;
		
		for(a6=1;a6<=9;a6++) {
			b6 = a6 * 5;
			System.out.print(b6+" ");
		}
		
		//반복문과 연산 - while문
		
		int a7 = 1;
		int b7;
		
		while(a7 < 10) {
			b7 = a7 * 5;
			System.out.print(b7+" ");
			a7++;
		}
		
		//반복문과 연산 - d0~while문
		
		int a8 = 1;
		int b8;
		
		do {
			b8 = a8 * 5;
			System.out.print(b8+" ");
			a8++;
		}while(a8 < 10);
		
		//반복문과 스캐너 - for문
		
		Scanner aa = new Scanner(System.in);
		System.out.println("원하시는 구구단 숫자를 입력하세요.");
		int user = aa.nextInt();
		int a9;
		int b9 = 1;
		
		for(a9=1;a9<=9;a9++) {
			b9 = a9 * user; 
			System.out.print(b9+" ");
		}
		
		//반복문과 스캐너 - while문
		
		System.out.println("원하시는 구구단 숫자를 입력하세요.");
		int user2 = aa.nextInt();
		int a10 = 1;
		int b10 = 1;
		
		while(a10 < 10) {
			b10 = a10 * user2;
			System.out.print(b10+" ");
			a10++;
		}
		
		//반복문과 스캐너 - do~while문
		
		System.out.println("원하시는 구구단 숫자를 입력하세요.");
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
		 * [응용문제1] 20부터 27까지 출력하세요.
		 */
		
		int num1;
		
		for(num1=20;num1<28;num1++) {
			System.out.print(num1+" ");
		}
		
		/*
		 * [응용문제2] 39~21까지 출력하세요
		 */
		
		int num2;
		
		for(num2=39;num2>=21;num2--) {
			System.out.print(num2+" ");
		}
		
		/*
		 * [응용문제3] 변수 두개를 이용하여 다음 데이터를 출력하세요.
		 * 55~4까지 출력합니다.
		 */
		
		int num3;
		int num4 = 4;
		
		for(num3=55;num3>=num4;num3--) {
			System.out.print(num3+" ");
		}
		
		/*
		 * [응용문제4] 다음 사항을 while문으로 작성하세요.
		 * 22~16까지 숫자를 출력하세요. 
		 */
		
		int num5 = 22;
		
		while(num5 >= 16) {
			System.out.print(num5+" ");
			num5--;
		}
		
		/*
		 * [응용문제5] 다음 사항을 while문으로 작성하세요.
		 * 변수 2개를 이용해서 범위에 맞게 값을 출력하세요.
		 * 99~47까지 출력하세요.
		 */
		
		int num6 = 99;
		int num7 = 47;
		
		while(num6 > num7) {
			System.out.print(num6+" ");
			num6--;
		}
		
		/*
		 * [응용문제6] 다음 결과값을 보고 코드를 작성하세요.
		 * 45,40,35,30,25,20
		 */
		
		int num8;
		int num9;
		
		for(num8=9;num8>=4;num8--) {
			num9 = num8 * 5;
			System.out.print(num9+" ");
		}
		
		/*
		 * [응용문제7] 다음 결과값을 확인 후 코드를 제작하여 출력하세요.
		 * 11, 22, 33, 44, 55, 66, 77, 88, 99
		 */
		
		int num10;
		int num11;
		
		for(num10=1;num10<=9;num10++) {
			num11 = num10 * 11;
			System.out.print(num11+" ");
		}
		
		/*
		 * [응용문제8] 해당 결과값을 확인 하여 while 반복문으로 코드를 작성하세요.
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
		 * [응용문제9] 다음 결과 값을 확인하신 후,
		 * while 반복문으로 해당 결과값에 맞는 코드를 작성하세요.
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
		 * [응용문제10] 다음 결과값을 보고 do~while으로 코드를 작성하시오.
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
