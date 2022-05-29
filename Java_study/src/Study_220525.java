import java.util.Scanner;

public class Study_220525 {

	public static void main(String[] args) {
		
		//스캐너 사용
		
		Scanner aa = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요.");
		String mid = aa.next();
		System.out.println(mid);
		
		// 스캐너를 이용한 사용자 입력값 출력
		
		System.out.print("당신의 나이는?");
		int age = aa.nextInt();
		System.out.println("해당 사용자의 나이는 " +age+ "살 입니다.");
		
		//스캐너를 사용한 조건문
		
		System.out.println("입력하실 금액을 적어주세요.");
		int money = aa.nextInt();
		
		if(money < 1000) {
			System.out.println("1000원 이상의 금액을 입력하셔야 합니다.");
		}
		else {
			System.out.println("입금이 진행됩니다.");
		}
		
		//문자열 형태의 스캐너 이용시 equals라는 함수를 사용
		
		System.out.println("아이디를 입력하세요.");
		String mid2 = aa.next();
		
		if(mid2.equals("max21")) {
			System.out.println("회원이 확인 되었습니다.");
		}
		else {
			System.out.println("회원이 확인되지 않습니다.");
		}
		
		//스캐너 nextLine();
		
		System.out.println("메모를 입력하세요.");
		String memo = aa.nextLine();
		
		System.out.println(memo);
		
		//printf
		
		String name2 = "lee";
		int age2 = 29;
		
		System.out.printf("%s님의 나이는 %d입니다.",name2,age2);
		
		System.out.println("숫자를 입력하세요.");
		int num = aa.nextInt();
		
		if(num < 10) {
			System.out.println("10이상 숫자를 입력하세요.");
		}
		else if(num >= 10 && num <= 22) {
			System.out.println("당점입니다.");
		}
		else {
			System.out.println("범위 밖의 숫자입니다.");
		}
		
		
		/*
		 * [응용문제1] 다음 해당 내용을 확인 후 코드를 작성하시오.
		 * "Q. 사용자가 원하는 숫자를 입력하세요." 라는 메시지 출력 후, 
		 * 짝수인지 홀수인지 알려주는 코드를 작성하세요.
		 */
		
		System.out.println("Q. 사용자가 원하는 숫자를 입력하세요.");
		int user = aa.nextInt();
		
		if(user % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		/*
		 * [응용문제2] "Q. 1~45까지 숫자 하나를 입력하세요."
		 * error문구
		 * 0을 입력 : 숫자 입력이 잘못 되었습니다.
		 * 45보다 큰 숫자를 입력 : 숫자는 1~45까지만 입력 가능합니다.
		 * 1~45숫자를 입력하였을 경우
		 * 7, 12, 14 세가지 숫자 입력시 당첨입니다. 라고 출력
		 * 그 외에 숫자시 "다음 기회에 참여하세요." 라고 출력
		 */
		
		System.out.println("Q. 1~45까지 숫자 하나를 입력하세요.");
		int num2 = aa.nextInt();
		
		
		if (num2 > 0 && num2 <46) {
			if(num2 == 7 || num2 == 12 || num2 == 14) {
				System.out.println("당첨입니다.");
			}
			else {
				System.out.println("다음 기회에 참여하세요.");
			}
		}
		else if(num2 == 0) {
			System.out.println("숫자 입력이 잘못 되었습니다.");
		}

		/*
		 * [응용문제3] 로그인 프로그램
		 * 회원가입 아이디는 lee , mini
		 * 패스워드는 min , love1550
		 * 해당 아이디 외에 나머지 '가입되지 않은 사용자입니다." 라고 출력합니다.
		 * 또한, 패스워드가 틀릴 경우 "회원정보를 다시 확인하세요." 라고 출력합니다.
		 * 아이디 및 패스워드가 모두 맞을 경우 "로그인 되셨습니다." 라고 출력하세요.
		 * */
		
		System.out.println("접속할 아이디를 입력하세요.");
		String userid = aa.next();		
		
		if(userid.equals("lee") || userid.equals("mini")) {
			System.out.println("패스워드를 입력하세요.");
			String userpass = aa.next();
			if(userid.equals("lee") && userpass.equals("min")) {
				System.out.println("로그인 되셨습니다");
			}
			else if(userid.equals("mini") && userpass.equals("love1550")) {
				System.out.println("로그인 되셨습니다");
			}
			else {
				System.out.println("회원정보를 다시 확인하세요.");
			}
		}
		else {
			System.out.println("가입되지 않은 사용자 입니다.");
		}
		
		/*
		 * [응용문제4] 인증번호 발송에 대한 번호 비교 코드
		 * Q. 인증받은 번호를 입력하세요.
		 * 숫자 220524
		 * 사용자가 숫자 220524 외에 입력시 
		 * "인증번호가 틀립니다." 라고 출력하고,
		 * 동일한 인증번호 숫자를 입력시 
		 * "인증 확인 되셨습니다." 라고 입력합니다.
		 * 단, 220524는 java 실행시 가장 먼저 실행되는 변수로 처리하세요.
		 */
		
		int num3 = 220524;
		System.out.println("인증받은 번호를 입력하세요.");
		int user2 = aa.nextInt();
		
		if(user2==num3) {
			System.out.println("인증 확인 되셨습니다.");
		}
		else {
			System.out.println("인증번호가 틀립니다.");
		}
		
		aa.close();
		
	}

}
