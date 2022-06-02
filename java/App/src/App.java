
public class App {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		// 사칙연산기호 : + , - , * , /
		// c = a + b;
		// c = a - b;
		// c = a * b;
		// c = a / b;
		c = a + b;
		System.out.println(c);

		String a1 = "홍길동";
		String b1 = "환영합니다.";
		String c1;
		c1 = a1 + b1; // 문자형태 일때 +는 문자+문자열로 표현할 수 있습니다.
		System.out.println(c1);

		/*
		 응용문제 다음과 같이 출력되는 코드를 완성하시오. 홍길동님 적립금은 50000 입니다.
		 단, 홍길동 과 5000의 값은 지속적으로 변화할 수 있습니다.
		 */

		String a2 = "홍길동";
		int a3 = 50000;
		System.out.println(a2 + "님 적립금은 " + a3 + "입니다.");

		/*
		 응용문제 아마존 사이트에서 상품을 구매 했습니다. 
		 장바구니에 담은 상품 가격을 모두 더해서 총 결제 금액이 출력되도록 하시오. 
		 단, $환율로 출력 되어야합니다.
		 8.25 4.02 3.71 결과 값은 다음과 같이 출력하세요. 
		 총 결제금액 $ 입니다.
		 */

		float d = 8.25f;
		float e = 4.02f;
		float g = 3.71f;
		float d1 = d + e + g;
		System.out.println(d1);
		System.out.println("총 결제금액 " + d1 + "$ 입니다.");

		/*
		 double p1, p2, p3 p4; 
		 p1 = 8.25; 
		 p2 = 4.02; 
		 p3 = 3.71; 
		 p4 = p1 + p2 + p3;
		 system.out.println("총 결제금액 $"+p4+"입니다.");
		 */

		int k = 3;
		int j = 9;
		double aw = (double) k / j; // 연산형태의 자료형 또한 있는 코드 = 테스트 형태
		System.out.println(aw);

		/*
		 사칙연산기호는 +, -, *, /가 있다. 
		 byte a = 10; 
		 byte b = 20; 
		 byte c; 
		 란 함수를 기본값으로 주고 
		 c = a + b; System.out.ptintln(c); 
		 함수를 줬을 때, a와 b가 더해진 값이 c로 출력된다.
		 
		 c = a + b;
		 c = a - b; 
		 c = a * b; 
		 c = a / b; 
		 상황에 따라 사칙연산으로 쓰일 수 있으며(물론 변수명과 변수값은 다르게 기입해야함.)
		 
		 +는 다른 기호와는 다르게 두 개의 기능이 있다. 하나는 위에 설명한 것처럼 값을 더해주는 기능이고, 
		 String 문자 자료형을 더했을 땐 합쳐져 나오는 기능이다. 
		 또한, 문자 + 숫자를 더해도 합쳐져 나온다.
		 
		 int에 변수값을 주고 나눈 값을 double로 나타낼 때(소수점이 나오는 식일 때),
		 연산 앞에 (double)을 붙여줘야 한다.
		 int는 상수라서 나누기 연산부터 소수점을 떨어트리고 계산되기 때문에
		 소수점까지 표시하려면 꼭 연산 앞에 (double)을 붙여줘야 한다.
		 
		 예)
		 int k = 3;
		 int j = 9;
		 double aw = k / j;
		 System.out.println(aw);
		 */

		/*
		 응용문제 다음과 같이 출력되는 코드를 완성하시오. 
		 홍길동님 적립금은 500000 입니다. 
		 단, 홍길동 과 500000의 값은 지속적으로 변화할 수 있습니다.
		  
		 문제가 나오면 변수와 상수를 바로 캐치하고 다른 함수를 사용해야한다.
		 */

		String mname = "홍길동";
		int won = 500000;
		System.out.println(mname + " 님 적립금은 " + won + "원 입니다.");

		/*
		 응용문제 아마존 사이트에서 상품을 구매 했습니다.
		 장바구니에 담은 상품 가격을 모두 더해서 총 결제 금액이 출력되도록 하시오. 
		 단, $환율로 출력 되어야합니다. 
		 5.88 
		 4.15 
		 8.22 
		 결과 값은 다음과 같이 출력하세요. 
		 총 결제금액 $ 입니다.
		 */

		String codename = "홍길동";
		float v1 = 5.88f;
		float v2 = 4.15f;
		float v3 = 8.22f;
		float v4 = v1 + v2 + v3;
		System.out.println(codename + "님, 총 결제 금액은 " + v4 + "$ 입니다.");
		
		double p1, p2, p3, p4;
		p1 = 1.25;
		p2 = 5.26;
		p3 = 8.22;
		p4 = p1 + p2 + p3;
		System.out.println("총 결제금액은"+p4+"입니다.");
		
		/*
		 바로 위의 함수는 선생님이 짠 코드인데
		 double에 변수명을 여러개 놓고
		 변수명에 변수값을 준 뒤
		 변수값을 더한 변수명을 바로 입력해도 맞게 출력된다.
		 */
		

	}

}
