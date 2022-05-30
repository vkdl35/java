import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 사용자가 다음과 값은 질문을 받습니다.
		 * Q. "1~5번까지 숫자를 하나 입력해주세요."
		 * 결과내용
		 * 1 : 5%할인쿠폰
		 * 2 : 10%할인쿠폰
		 * 3~4 : 택배비 무료 쿠폰
		 * 5 : 다음 기회에...
		 */
		
		Scanner as = new Scanner(System.in);
		
		System.out.println("Q.1~5번까지 숫자를 하나 입력해주세요.");
		int user = as.nextInt();
		String msg = "5%할인 쿠폰 당첨";
		/*
		switch(user) {
		case 1:
			msg = "5%할인 쿠폰 당첨";
			break;
		case 2:
			msg = "10%할인 쿠폰 당첨";
			break;
		case 3:
		case 4:
			msg = "택배비 무료 쿠폰 당첨";
			break;
		default:
			msg = "다음 기회에...";
			break;
		}
		*/
		
		// switch version 형태 (14이상 버전부터 바뀜)
		switch(user) {
		case 1 -> {
			msg = "5%할인 쿠폰 당첨";
		}
		case 2 -> {
			msg = "10%할인 쿠폰 당첨";
		}
		case 3,4 -> {
			msg = "택배비 무료 쿠폰 당첨";
		}
		default -> {
			msg = "다음 기회에...";
		}
		
		}
		
		System.out.println(msg);
		as.close();
		

	}

}
