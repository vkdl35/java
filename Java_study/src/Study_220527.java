import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Study_220527 {

	public static void main(String[] args) {
		
		//date 유틸
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YY년 MM월 dd일");
		SimpleDateFormat time = new SimpleDateFormat("h:m:s");
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		
		//증감기호의 숫자
		
		int f;
		for(f=1;f<=50;f=f+2) {
			System.out.print(f+" ");
		}
		
		
		/* 
		 * [응용문제1] 
		 * 사용자가 입력하여 조건에 맞는 메세지를 출력하시오.
		 * 첫번째 숫자값을 입력하세요.
		 * 두번째 숫자값을 입력하세요.
		 * 첫번째 숫자값 * 두번째 숫자값 에 대한 결과를 출력하세요.
		 * 단, 해당 결과값이 100 이하일 경우 
		 * 출력 메세지 "100이하의 결과값입니다." 라고 설정하시고
		 * 100 이상일 경우 "100이상 결과값입니다." 라고 출력합니다.
		 */
		
		Scanner as = new Scanner(System.in);
		
		System.out.println("첫번째 숫자값을 입력하세요.");
		int user1 = as.nextInt();	//첫번째 숫자값
		System.out.println("두번째 숫자값을 입력하세요.");
		int user2 = as.nextInt();	//두번째 숫자값
		
		int total;
		total = user1 * user2;
		
		if(total < 100) {
			System.out.println("100이하의 결과입니다.");
		}
		else if(total >= 100) {
			System.out.println("100이상 결과값입니다.");
		}
		
		/*
		 * [응용문제2] 조건문 코드를 작성 하시오.
		 * 고객이 자신의 통장에서 입,출금을 하는 프로세서를 제작해야 합니다.
		 * 고객의 기본 자산 금액은 : 100,000원
		 * "1번 입력시 입금, 2번 입력시 출금입니다." 라는 메세지가 제일 먼저 실행 되어야 합니다.
		 * 1번을 입력시 "해당 금액을 입력하세요.
		 * 사용자가 입력한 금액 + 기본 자산 금액을 합한 총 자산 금액을 출력하시면 됩니다.
		 * 2번을 입력시 "출금할 금액을 입력하세요." 
		 * 사용자가 입력한 금액 - 기본 자산 금액을 계산하여 총 자산 금액을 출력하시면 됩니다.
		 */
		
		int money = 100000;
		System.out.println("1번 입력시 입금, 2번 입력시 출금입니다.");
		int user3 = as.nextInt();
		int userm;
		int total2;
		
		if(user3==1) {
			System.out.println("해당 금액을 입력하세요.");
			userm = as.nextInt();
			total2=userm+money;
			System.out.printf("입금 되었습니다. 총 자산 : %d원",total2);
		}
		else if(user3==2) {
			System.out.println("출금할 금액을 입력하세요.");
			userm = as.nextInt();
			total2=money-userm;
			System.out.printf("출금 되었습니다. 총 자산 : %d원",total2);
		}
		else {
			System.out.println("정상적인 코드가 아닙니다.");
		}
		
		/*
		 * [응용문제3] while문으로 코드를 작성해야 하며, 프로세서는 다음과 같습니다. 
		 * 사용자가 상품을 전체 선택하였습니다. 
		 * 질문은 "7,000원 결제하시겠습니까? 라고 출력되며, 
		 * 숫자 1이라고 입력하면 최종결제 금액에 추가됩니다. 
		 * 단, 2라고 입력시 최종결제 금액에 추가되면 안됩니다.
		 * 총 질문 횟수는 4번입니다.
		 * 마지막에 최종 결제 금액이 나오도록 코드를 작성하시오.
		 */
		
		int user4;	//사용자 입력값
		int a = 1;
		int total3=0;
		final int money2 = 7000;
		
		while(a < 5) {
			System.out.println("7000원 결제하시겠습니까?");
			user4 = as.nextInt();
			if(user4==1) {
				total3+=money2;
			}
			a++;
		}
		System.out.println("최종 금액은 "+total3+"원입니다.");

		/*
		 * [응용문제4] 사용자가 입력한 숫자에 맞춰서 구구단이 작동되며,구구단 결과를 계산하여 짝수인지 홀수인지를 출력하시오.
		 * "구구단에 대한 숫자를 입력하세요." 라고 메세지가 출력되면
		 * 해당 숫자에 맞춰서 모든 결과를 더하며,
		 * 더한 값에 따라 짝수인지 홀수인지를 출력하시면 됩니다.
		 * 단, 해당 반복문은 for ~ dowhile문까지한가지를 선택해서 작성하시오.
		 * *조건문은 반복문 안에 있으면 안됩니다.*
		 */
		
		int gugu = 1;
		int total4=0;
		System.out.println("구구단에 대한 숫자를 입력하세요.");
		int user5 = as.nextInt();
		
		while(gugu < 10) {
			total4+=gugu*user5;
			gugu++;
		}
		if(total4 % 2 == 1) {
			System.out.printf("%d는 홀수입니다.",total4);
		}
		else {
			System.out.printf("%d는 짝수입니다.",total4);
		}
		
		/*
		 * [응용문제5] 사용자가 해당 값을 입력합니다. 
		 * 사용자가 두개의 숫자를 입력하되 첫번째 숫자와 두번째 숫자 범위 안에 있는
		 * 모든 숫자를 더해서 결과값이 나오도록 제작하시오.
		 * 단, 해당 코드는 do~while문으로 작성합니다.
		 * 예시) 
		 * 첫번째 범위 숫자는? 5
		 * 두번째 범위 숫자는? 10
		 * 범위 숫자 모든 합계는 45입니다.
		 */
		
		System.out.println("첫번째 범위 숫자는?");
		int user6 = as.nextInt();
		System.out.println("두번째 범위 숫자는?");
		int user7 = as.nextInt();
		int total5 = 0;
		
		do {
			total5+=user6;
			user6++;
		}while(user6 <= user7);
		System.out.println(total5);
		
		/*
		 * [응용문제6] 다음 결과값에 맞춰서 코드가 출력 되도록 하시오.
		 * 해당 코드는 for문으로 작성합니다.
		 * 45 35 25 15 10
		 * 조건문 들어가야함*
		 */

		int a2;
		int total6 = 1;
		
		for(a2=9;a2>=2;a2--) {
			total6 = a2 * 5;
			if(total6 % 2 == 1 || total6 == 10) {
				System.out.print(total6+" ");
			}
		
		/*
		 * [응용문제7]  1~10까지 순차적으로 적용하는 반복문이 있습니다.
		 * 단, 1~5까지는 모든값을 곱하고, 6~10까지는 모든값을 더합니다.
		 * 해당 두개의 값을 비교하여 더한값이 큰지, 곱한값이 큰지를 결과로 출력하세요.
		 */
		
		int a3 = 1;
		int total7 = 1;
		int total8 = 0;
		
		while(a3 < 11) {
			if(a3 <= 5) {
				total7*=a3;
			}
			else {
				total8+=a3;
			}
			a3++;
		}
		if(total7 > total8) {
			System.out.printf("1~5까지 곱한 값이 더 큽니다. : %d",total7);
		}
		else if(total8 > total7) {
			System.out.printf("6~10까지 더한 값이 더 큽니다. : %d",total8);
		}
		
		/*
		 * [응용문제8] 사용자가 다음 질문에 확인하여 값을 입력 후, 해당 결과를 도출하는 프로세스를 제작합니다.
		 * "첫번째 입력값 단(1~10까지) 입니다."
		 * "두번째 입력값 단(1~10까지) 입니다."
		 * "세번째 입력값 단(1~10까지) 입니다."
		 * "마지막 질문입니다. 해당 세가지 값에 대한 산술기호를 적으세요."
		 * 해당 산술기호에 맞게 산술식을 적용하여 최종값을 출력하세요.
		 */
		
		System.out.println("첫번째 입력값을 입력하세요. 단,(1~10까지)입니다.");
		double first = as.nextInt();
		System.out.println("두번째 입력값을 입력하세요. 단,(1~10까지)입니다.");
		double second = as.nextInt();
		System.out.println("세번째 입력값을 입력하세요. 단,(1~10까지)입니다.");
		double third = as.nextInt();
		System.out.println("마지막 질문입니다. 해당 세가지 값에 대한 산술기호를 적으세요.");
		String sign = as.next();
		double total9;
		
		if(sign.equals("+")) {
			total9=first+second+third;
			System.out.println(total9);
		}
		else if(sign.equals("-")) {
			total9=first-second-third;
			System.out.println(total9);
		}
		else if(sign.equals("*")) {
			total9=first*second*third;
			System.out.println(total9);
		}
		else if(sign.equals("/")) {
			total9=first/second/third;
			System.out.println(total9);
		}
		else {
			System.out.println("올바른 기호를 입력하세요.");
		}
		
		/*
		 *[응용문제9]
		 *사용자 패스워드는 a1234입니다.
		 *사용자가 패스워드를 입력합니다. 단, 3회 이상 실패시 다음과 같이 출력되도록 합니다.
		 *"패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다."
		 *단, 패스워드가 맞을 경우 "로그인 되었습니다." 라고 출력되어야 합니다.
		 */
		
		final String pw = "a1234";
		int c = 3;
		int w = 0;
		String msg = "패스워드를 입력하세요.";
		
		System.out.println(msg);
		String userpw = as.next();
		while(w < 3) {
			if(pw.equals(userpw)) {
				System.out.println("로그인 되었습니다.");
				break;
			}
			else {
				msg = "올바른 패스워드를 넣어주세요.";
				c--;
				if(c==0) {
					System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다.");
				}
			}
			w++;
		}
		
		/*
		 * [응용문제10]
		 * A학생에 대한 성적을 입력 받고 평균점수가 나오는 프로그램을 제작합니다.
		 * "점수를 입력하세요." 라는 문구는 총 5번이 나오게 되며 모든 점수는 합산하여 출력합니다.
		 * 모든 점수는 합산 한 후 5개의 점수에 대한 평균값을 출력하셔야 합니다.
		 * 출력 메세지는 " 해당 점수의 평점은 " " 출력
		 * 단, 평점 점수가 40점 이하 일 경우, "재시험입니다." 라고 메시지를 출력 후 프로세서는 종료합니다.
		 * 40점 이상일경우 " 합격 " 이라고 출력하십시오.
		 * [추가기획]
		 * "입력하실 과목 수를 넣어주세요 : " 라고 제일 먼저 출력 후 해당 과목 수 만큼 반복문이 적용이 되며, 과목 수 만큼 평균값이 적용되어야 합니다.
		 **do~while으로 작성하세요.*
		 */
		
		double a10 = 1;
		double total10 = 0;
		System.out.println("입력하실 과목 수를 넣어주세요.");
		int num = as.nextInt();
		
		do {
			System.out.println("점수를 입력하세요.");
			int user10 = as.nextInt();
			total10+=(user10/num);
			a10++;
		}while(a10 <= num);
		if(total10 >= 40) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("재시험입니다.");
		}
		
		/*
		 * [응용문제11]
		 * 다음 이용약관에 대한 동의 프로그램을 제작하게 됩니다.
		 * 동의 항목은 전체 3가지이며, 모두 true가 적용 되어야만 다음 프로세서로 진행이 됩니다.
		 * 사용자에게 질문되는 사항은 다음과 같습니다.
		 * "동의항목에 동의하시겠습니까?" 라는 메세지 출력 동의함(1), 동의 안함(2)
		 * 동의 항목 중 한가지라도 동의하지 않을 경우 "모두 동의하셔야만 진행됩니다." 라고 출력합니다.
		 * 모두 동의했을 경우 "회원가입이 완료되었습니다." 라고 출력합니다.
		 */
		
		boolean mag = false;
		int a11 = 1;
		
		while(a11 <= 3) {
			System.out.println("동의항목에 동의하시겠습니까? 동의함(1), 동의 안함(2)");
			int user = as.nextInt();
			if(user==1) {
				mag = true;
			}
			else {
				mag = false;
				break;
			}
			a11++;
		}
		if(mag == false) {
			System.out.println("모두 동의하셔야만 진행됩니다.");
		}
		else {
			System.out.println("회원가입이 완료 되었습니다.");
		}
		
		/*
		 * [응용문제12]
		 * 3개의 상품이 있습니다.
		 * "바코드로 상품을 입력시켜주세요." 금액을 입력하고나서
		 * "할인%를 입력해주세요." 라는 문구와 함께 해당 할인 숫자를 입력하면
		 * 최종 금액이 변경되어 출력합니다.
		 */
		
		int money3 = 10000;
		int coupon = 20;
		
		double a12 = coupon * 0.01;
		System.out.println(a12);
		double b12 = money3 * a12;
		System.out.println(b12);
		double c12 = money3 - b12;
		System.out.println(c12);
		
		as.close();
		
		}

	}
}
