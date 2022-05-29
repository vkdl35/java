
public class Study_220524 {

	public static void main(String[] args) {
		//사칙연산 기호와 산술
		int a = 10;
		int b = 20;
		int c;
		c = a + b;
		System.out.println(c);
				
		//함수가 문자형일 때 +의 다른 기능
		String a1 = "안녕하세요.";
		String b1 = "어서오세요.";
		System.out.println(a1 + b1);
		
		//if 조건문
		int a2 = 100;
		byte b2 = 10;
		if (a2 < b2) {
			System.out.println("a의 값이 더 큽니다.");
		}
		else if (a2 > b2) {
			System.out.println("b의 값이 더 큽니다");
		}
		else {
			System.out.println("두 값이 같습니다.");
		}
		
		//문자형태의 조건문
		String a3 = "오랜만입니다.";
		if (a3 == "오랜만입니다.") {
			System.out.println(a3);
		}
		
		//더블 조건문 (복합 조건문)
		String mid = "max21";
		String mpass = "lkm";
		if (mid == "max21") {
			if (mpass == "lkm") {
				System.out.println("로그인 되셨습니다.");
			} 
			else {
				System.out.println("패스워드가 틀립니다.");
			}
		} 
		else {
			System.out.println("가입되지 않은 사용자입니다.");
		}
		
		//boolean 함수
		boolean a4 = true;
		if(a4 == true) { 
			System.out.println("회원가입이 진행됩니다."); 
		}
		else { 
			System.out.println("이용약관에 동의하셔야만 진행됩니다."); 
		}
		
		//boolean 예제
		
		int a7 = 30;
		int b7 = 60;
		boolean c7 = a7 > b7;
		if (c7) {
			System.out.println("더 큽니다");
		}
		
		//boolean 예제2
		
		int a8 = 4;
		boolean b8 = a8 % 2 == 0;
		System.out.println(b8);
		
		//&& 와 || 의 차이점
		
		String mid2 = "mini";
		String mid3 = "manda";
		String mpass2 = "lee123";
		
		if (mid2=="mini" && mpass2=="lee123") {
			System.out.println("로그인 되었습니다.");
		}
		else {
			System.out.println("아이다와 패스워드를 다시 한번 확인해주세요.");
		}
		
		if (mid2=="midi" || mid3=="manda") {
			System.out.println("회원이 확인되었습니다.");
		}
		else {
			System.out.println("회원이 아닙니다.");
		}
		
		//산술연산과 조건문
		
		int a9 = (25+31*4+12);
		int b9 = (15*3+9+14);
		
		if (a9 < b9) {
			System.out.println("공식 2번 값이 더 큽니다");
		}
		else if (a9 > b9) {
			System.out.println("공식 1번 값이 더 큽니다.");
		}
		else {
			System.out.println("두 공식의 값이 같습니다.");
		}
		
		//% 기호로 홀수, 짝수 구하기
		
		int c9 = b9 % 2;
		if (c9 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		

		/* [응용문제1] 다음과 같이 출력되는 코드를 완성하시오. 
		 * 홍길동님 적립금은 5000 입니다. 
		 * 단, 홍길동 과 5000의 값은 지속적으로 변화할 수 있습니다.
		 */
		
		String a5 = "홍길동";
		int b5 = 5000;
		System.out.println(a5 + "님 적립금은 " + b5 + "입니다.");

		/* [응용문제2] 아마존 사이트에서 상품을 구매 했습니다. 
		 * 장바구니에 담은 상품 가격을 모두 더해서 총 결제 금액이 출력되도록 하시오. 
		 * 단, $환율로 출력 되어야합니다.
		 * 8.25 4.02 3.71 
		 * 결과 값은 다음과 같이 출력하세요. 
		 * “총 결제금액 $ 입니다.”
		 */
		
		float a6 = 8.25f;
		float b6 = 4.02f;
		float c6 = 3.71f;
		System.out.println("총 결제 금액 "+(a6+b6+c6)+"$입니다.");
		
		


	}

}
