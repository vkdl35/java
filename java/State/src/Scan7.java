import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		//문자와 숫자 구분 후 스캐너 적용
		/*
		[인증번호 발송에 대한 번호 비교 코드]
		Q. 인증받은 번호를 입력하세요.
		
		숫자 220524
		
		사용자가 숫자 220524 외에 입력시 
		"인증번호가 틀립니다." 라고 출력하고,
		동일한 인증번호 숫자를 입력시 
		"인증 확인 되셨습니다." 라고 입력합니다.
		
		단, 220524는 java 실행시 가장 먼저 실행되는 변수로 처리하세요.
		*/
		
		int sc = 220524;
		
		Scanner a = new Scanner(System.in);
		System.out.println("Q. 인증받은 번호를 입력하세요.");
		
		int b = a.nextInt();
		
		if(b==sc) {
			System.out.println("인증확인 되셨습니다.");
		}
		else {
			System.out.println("인증번호가 틀립니다.");
		}
		
		a.close();
		
		
		// == : =
		// != : not

	}

}
