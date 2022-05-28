
public class While_plus {

	public static void main(String[] args) {
		/* 5에서 10까지 더한 합계 수를 출력  */

//		int a=5;	//초기값
//		int t=0;	//합계치를 누적시키기 위한 변수값
//		while(a < 11) {
//			t=t+a;
//			a++;
//		}
//		System.out.print("합계 :"+t);
		
		/* 응용문제 : 3에서 8까지 곱한 총 합계 수를 출력하시오 */
		
		int as=3;
		int bs=1;	//곱하기 합계를 설정시 1 기본값으로 설정
		while(as < 9) {
			bs*=as;
			as++;
		}
		System.out.println(bs);
		
		
		
		
		
		
		
	}

}
