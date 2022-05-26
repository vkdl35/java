
public class If_dowhile1 {

	public static void main(String[] args) {
		/* [응용문제] : 구구단 6단 중에서 35이상 결과 숫자만 출력하시오. */
		
		// [내가 짠 코드]
		
//		int a=6;
//		int b=6;
//		int c;
//		do {
//			c=a*b;
//			System.out.print(c+" ");
//			a++;
//		}while(a<=9);
		
		// [선생님이 짠 코드]
		
//		int dw = 1;
//		int total;
//		do {
//			total = 6 * dw;
//			if(total > 35) {
//			System.out.print(total+" ");
//			}
//			dw++;
//		}while(dw < 10);
		
		/* [응용문제] : 14~27까지 숫자중 짝수값만 모두 더하여 최종 결과값을 출력하시오. 
		 	총 결과값은 140입니다.
		 */
		
		int a=14;
		int b=0;
		do {
			if(a%2==0) {
				b+=a;
			}
			a++;
		}while(a<=27);
		System.out.print(b);
		
		
		
		
		
		
	}

}
