import java.math.BigInteger;
import java.util.Scanner;

public class Study_220526 {

	public static void main(String[] args) {

		//반복문과 증감할당기호 - for문
		
		int a;
		int total=0;
		
		for(a=1;a<=10;a++) {
			total+=a;
		}
		System.out.println(total);
		
		//반복문과 증감할당기호 - while문
		
		int a4 = 5;
		int total3 = 0;
		
		while(a4 < 11) {
			total3+=a4;
			a4++;
		}
		System.out.println(total3);
		
		//반복문과 증감할당기호 - do~while문

		int a6 = 30;
		int total6=0;
		
		do {
			total6+=a6;
			a6++;
		}while(a6 < 36);
		System.out.println(total6);
		
		//할당기호의 순서
		
		int p = 5;
		System.out.println(p++);
		System.out.println(++p);
		
		//반복문에 스캐너 달기 - for문
		
		Scanner aa = new Scanner(System.in);
		
		int jumsu;
		int a8;
		int total8=0;
		
		for(a8=1;a8<4;a8++) {
			System.out.println("점수를 입력하세요.");
			jumsu = aa.nextInt();
			total8+=jumsu;
		}
		System.out.println("총 점수는 "+total8+"점 입니다.");
		
		//BigInteger
		
		int b;
		BigInteger big = new BigInteger("1");
		
		for(b=1;b<=10;b++) {
			big = big.divide(BigInteger.valueOf(b));
		}
		System.out.println(big);
		
		//final 절대 변하지 않는 수
		
		final int a11 = 1;
		final String name = "홍길동";
		System.out.println(name);
		System.out.println(a11);
		
		//조건문과 반복문 - for문
		
		final int a12 = 5; 	//고정값
		int b12;	//반복하는 변수
		boolean ok = false;	//반복문 밖의 if 조건을 받는 수식이 있어야함
		
		for(b12=1;b12<10;b12++) {
			if(b12==a12) {
				System.out.println("등록된 값이 확인됩니다.");
				ok=true;
			}
		}
		if(ok==false) {
			System.out.println("확인되지 않는 숫자입니다.");
		}	//반복문 안에 있으면 반복하는동안 계속 출력됨
		
		//조건문과 반복문을 이용한 짝수, 홀수 각각 출력
		
		int ff;
		String odd=" ";
		for(ff=1;ff<=20;ff++) {
			if(ff%2 != 1) {
				System.out.print(ff+" ");
			}
			else {	//만약에 홀수 값일 경우 odd 변수에 지속적으로 값을 추가하게 됩니다.
				//odd = ff + " " + odd;
				odd += ff + " ";
			}
		}
		System.out.println(odd);//추가할 경우 " " 빈공간을 활용하여 적용함.
		
		//더블 반복문
		
		int c, cc;
		
		for(c=2;c<=3;c++) {		//출력할 구구단 숫자
			for(cc=1;cc<10;cc++) {		//구구단이 아홉번 돌아간다는 변수
				System.out.print(" "+c+"*"+cc);
			}
		}
		
		
		/*
		 * [응용문제1] 전체값은 500이 있습니다. 총 8회 동안 반복되면서
		 * 한번 반복할 때마다 12씩 감소하도록 하여 최종 값을 출력하세요.
		 * 결과값은 404입니다.
		 */
		
		int a2;
		int b2 = 12;
		int total2 = 500;
		
		for(a2=1;a2<=8;a2++) {
			total2-=b2;
		}
		System.out.println(total2);
		
		/*
		 * [응용문제2] 구구단 2단 2*1부터 ~ 2*9까지의 총 합계를 출력하세요.
		 * 합계는 90입니다.
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
		 * [응용문제3] 3에서 8까지 곱한 총 합계 수를 while문으로 출력하세요.
		 */
		
		int a5 = 3;
		int total5=1;
		
		while(a5 < 9) {
			total5*=a5;
			a5++;
		}
		System.out.println(total5);
		
		/*
		 * [응용문제4] 합계숫자 189가 있습니다.
		 * 189에서 1~10까지 합계치를 뺀 총 수치를 do~while문으로 구하세요.
		 */
		
		int a7 = 1;
		int total7 = 0;
		
		do {
			total7+=a7;
			a7++;
		}while(a7 < 11);
		System.out.println(189-total7);
		
		/*
		 * [응용문제5] 총 2번의 질문을 하게 됩니다.
		 * 사용자가 숫자를 입력하여 두 수의 합을 구하는 scanner를 제작하세요.
		 * 단, while문으로 제작하세요.
		 */
		
		int a9=1;
		int user;
		int total9=0;
		
		while(a9 < 3) {
			System.out.println("숫자를 입력하세요.");
			user = aa.nextInt();
			total9+=user;
			a9++;
		}
		System.out.printf("두 수의 합은 %d입니다.",total9);
		
		/*
		 * [응용문제6] 사용자가 총 3번의 숫자를 입력합니다.
		 * 3개 숫자를 모두 곱하여 총 합계 수를 출력하세요.
		 * 단, do~while문으로 제작하세요.
		 */
		
		int a10 = 1;
		int user2;
		int total10=1;
		
		do {
			System.out.println(a10+"번째 숫자를 입력해주세요.");
			user2=aa.nextInt();
			total10*=user2;
			a10++;
		}while(a10 < 4);
		System.out.printf("총 합계치는 %d입니다.",total10);
		
		/*
		 * [응용문제7] 총 스무번의 값을 반복합니다. 그 중 홀수값만 출력하도록 합니다.
		 */
		
		int a13; //반복할 값
		
		for(a13=1;a13<21;a13++) {
			if(a13 % 2 == 1) {
				System.out.print(a13+" ");
			}
		}
		
		/*
		 * [응용문제8] while문으로 10~30까지 숫자 중에서 홀수값만 출력하세요.
		 * 단, 20이상의 홀수값만 출력하세요.
		 */
		
		int a14=10;
		
		while(a14 < 31) {
			if(a14 % 2 == 1 && a14 >= 20 ) {
				System.out.print(a14+" ");
			}
			a14++;
		}
		
		/*
		 * [응용문제9] 1~10까지 숫자 중에 짝수값이 몇개 있는지 객수를 출력하세요.
		 * while문으로 작성하세요.
		 */
		
		int a15 = 1;
		int total15 = 0;	
		
		while(a15 < 11) {
			if(a15 % 2 == 0) {
				total15++;	//해당 조건이 맞을 경우 1씩 증가
			}
			a15++;
		}
		System.out.println(total15);
		
		/*
		 * [응용문제10] 구구단 6단 중에서 35이상 결과 숫자만 출력하시오.
		 * 단, do~while문으로 작성하세요.
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
		 * [응용문제11] 14~27까지 숫자중 짝수값만 모두 더하여 최종 결과값을 출력하세요.
		 * 총 결과값은 140이며, do~while문으로 작성하세요.
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
		 * [응용문제12] 구구단 5단부터 7단까지 출력을 하되 4까지만 연속적으로 나오는 수식구를 출력하세요.
		 * 5*1~7*4
		 * 해당 결과값의 총 합계를 출력하세요.
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
