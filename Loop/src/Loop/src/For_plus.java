
public class For_plus {

	public static void main(String[] args) {
		/*
		 * 1~10까지 모든 숫자를 합한 결과값을 출력하시오.
		 */
		
		int f;
		int total=0;	
		for(f=1;f<=10;f++) {	//total 변수값에 반복값을 지속적으로 증가시킴
			//total = total + f;
			total += f;
		}
		System.out.println("총합계:"+total);	//합계치는 반복문 밖에 찍어야 정상 출력됨
		//+=(더하기할당) -=(빼기할당) *=(곱하기할당) /=(나누기할당) %=
		// b = b - f; -> b -= f;
		
		
		/*
		 * 응용문제
		 * 전체값은 500이 있습니다. 총 8회 동안 반복되면서 
		 * 한번 반복할 때마다 12씩 감소하도록 하여 최종 값을 출력하시오.
		 * 결과값은 404
		 */
		
		int a;
		int b = 12;
		int total2=500;
		for(a=1;a<=8;a++) {
			total2 = total2 - b;
			//total2 -= b;
			//total2 = total2 - 12;
			//total2 -= 12;
		}
		System.out.println("총합계:"+total2);
		
		/*
		 * 응용문제
		 * 구구단 2단 2*1부터 ~ 2*9까지의 총 합계를 출력하시오.
			합계는 90

		 */
		

	}

}
