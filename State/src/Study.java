import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		
		/*
		Scanner a = new Scanner(System.in);
		System.out.println("당신의 나이는 몇살입니까?");
		byte num = a.nextByte();
		if(num < 19) {
			System.out.println("19세 미만은 가입하실 수 없습니다.");
		}
		else {
			System.out.println("가입하실 수 있는 나이입니다.");
		}
		*/
		
		/*
		Scanner b = new Scanner(System.in);
		System.out.println("성함을 입력하세요.");
		String mid = b.next();
		if(mid.equals("이경민")) {
			System.out.println("어서오십시오.");
		}
		else {
			System.out.println("회원이 아닙니다.");
		}
		*/
		
		/*
		Scanner c = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하세요.");
		short num1 = c.nextShort();
		if(num1 % 2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		*/
		
		/*
		Scanner d = new Scanner(System.in);
		System.out.println("띄어쓰기를 포함한 문장 한 줄을 입력하십시오.");
		String memo = d.nextLine();
		System.out.println(memo);
		*/
		
		/*
		//%f을 float로 놨을 경우 오류
		double num2 = 29.25;
		String name2 = "이경민";
		System.out.printf("%s(이)는 %f살 입니다.",name2,num2);
		*/
		
		// 1~25 숫자중에 입력하세요. (당첨자 두명)
		
		/*
		 [응용문제]
		 Q. 1~45까지 숫자 하나를 입력하세요.
				 
		 error문구 
		 0을 입력 : 숫자입력이 잘못 되었습니다.
		 45보다 큰 숫자를 입력 : 숫자는 1~45까지만 입력 가능합니다.
				 
		 1~45숫자를 입력하였을 경우
		 7, 15 두가지 숫자 입력시 30퍼 쿠폰 당첨입니다. 라고 출력
		 23 숫자 입력시 50퍼 쿠폰 당첨입니다. 라고 출력
		 그 외에 숫자시 다음 기회에 참여하세요. 라고 출력 
		 */
		
		/*
		Scanner e = new Scanner(System.in);
		System.out.println("1~45 숫자중에 입력하세요.");
		short num3 = e.nextShort();
		
		if(num3 == 0) {
			System.out.println("0은 사용하실 수 없습니다.");
		}
		else if(num3 > 45) {
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		}
		else {
			if(num3 == 7 || num3 == 15) {
				System.out.println("축하합니다! 30% 쿠폰에 당첨 되셨습니다!");
			}
			else if(num3 == 23) {
				System.out.println("축하합니다! 50% 쿠폰에 당첨 되셨습니다!");
			}
			else {
				System.out.println("아쉽지만 다음 기회에...");
			}
		}
		*/
		/*
		[로그인 프로그램]
				 
		회원가입 아이디는 lee, song
		패스워드
		lee : rudals
		song : yh
		해당 아이디 외에 나머지 '가입되지 않은 사용자입니다." 라고 출력합니다.
		또한, 패스워드가 틀릴 경우 "회원정보를 다시 확인하세요." 라고 출력합니다.
		아이디 및 패스워드가 모두 맞을 경우 "환영합니다. 어서오세요." 라고 출력하세요.
		*/
		
		/*
		Scanner f = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String id2 = f.next();
		
		Scanner g = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요.");
		String pass2 = g.next();
		
		if(id2.equals("lee") || id2.equals("song")) {
			if(id2.equals("lee") && pass2.equals("rudals")) {
				System.out.println("환영합니다. 어서오세요.");
			}
			else if(id2.equals("song") && pass2.equals("yh")) {
				System.out.println("환영합니다. 어서오세요.");
			}
			else {
				System.out.println("회원정보를 다시 확인하세요.");
			}
		}
		else {
			System.out.println("가입되지 않은 사용자입니다.");
		}
		*/
		
		/*
		 [응용문제]

			사용자가 입력하여 조건에 맞는 메세지를 출력하시오.
			첫번째 숫자값을 입력하세요.
			두번째 숫자값을 입력하세요.
			
			첫번째 숫자값 * 두번째 숫자값 에 대한 결과를 출력하세요.
			단, 해당 결과값이 100 이하일 경우 
			출력 메세지 "100이하의 결과값입니다." 라고 설정하시고
			100 이상일 경우 "해당값은 100이상 결과값 입니다." 라고 출력합니다.
		 */
		
		
		
		Scanner h = new Scanner(System.in);
		System.out.println("첫번째 숫자값을 입력하세요.");
		short num1 = h.nextShort();
		
		Scanner i = new Scanner(System.in);
		System.out.println("두번째 숫자값을 입력하세요.");
		short num2 = i.nextShort();
		
		// short num3 = (num1*num2);
		
		if((num1*num2) <= 100) {
			System.out.println("100이하의 결과값입니다.");
		}
		else if((num1*num2) > 100) {
			System.out.println("해당값은 100이상 결과값 입니다.");
		}
			
		h.close();
		i.close();
		
		/*
		 if(조건) {
		 	해당 조건이 맞을 경우 실행되는 코드
		 } 
		 else if(if외에 다른 조건){				//else if는 여러번 사용 가능
		 	해당 조건이 맞을 경우 실행되는 코드
		 }
		 else {								
		 	if의 반대 또는 조건이 하나만 남아 있을 경우
		 }
		 */
		
		// boolean : true, false //""사용 불가능, 둘 중 하나만 사용
			
		/*
		 Scanner 스캐너 이름(변수명과 달라야함) = new(새로운 형태) Scanner(System.in);
		 System.out.println("");
		 자료형에 따라 뒤에 붙는 next도 달라짐
		 int aa = a.nextInt();
		 String ab = a.next();
		 */
		
		/*
		 [응용문제. 조건문 코드를 작성 하시오.]
		 
		  고객이 자신의 통장에서 입,출금을 하는 프로세서를 제작해야 합니다.
		  고객의 기본 자산 금액은 : 100,000원
		  
		  "1번 입력시 입금, 2번 입력시 출금입니다." 라는 메세지가 제일 먼저 실행 되어야 합니다.
		  
		  1번을 입력시 "해당 금액을 입력하세요."
		  사용자가 입력한 금액 + 기본 자산 금액을 합한 총 자산 금액을 출력하시면 됩니다.
		  
		  2번을 입력시 "출금할 금액을 입력하세요."
		  사용자가 입력한 금액 - 기본 자산 금액을 계산하여 총 자산 금액을 출력하시면 됩니다.
		 */
		

	}

}
