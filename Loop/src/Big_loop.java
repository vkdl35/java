import java.math.BigInteger;
// import 공식은 변하지 않음
public class Big_loop {

	public static void main(String[] args) {
		/*
		int a;
		int b=0;
		for(a=1;a<=100;a++) {
			b*=a;
		}
		System.out.print(b);
		*/
		
		// 1~100까지 곱한 결과값은?
		
		int f;
		// BigInteger : java에서 모든 무한의 값을 저장할 수 있는 유일한 자료형
		BigInteger aa = new BigInteger("1"); 		// 합계치의 사용할 자료형 변수 1을 최초 값으로 설정
		for(f=1;f<=10;f++) {						// 단, ""를 무조건 사용해야합니다.
			// multiply : 사칙연산 중에 곱하기를 담당함
			// add : 사칙연산 중에 더하기를 담당함
			// subtract : 사칙연산 중에 빼기를 담당함
			// dicde : 사칙연산 중에 나누기를 담당함
			aa = aa.multiply(BigInteger.valueOf(f));
		}
		System.out.println(aa);
		
		
		
	}

}
