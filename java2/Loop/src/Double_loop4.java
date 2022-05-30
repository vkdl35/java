
public class Double_loop4 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 복합반복문 for , do~while
		 */
		
		int f;
		
		for(f=2;f<=3;f++) {
			int w=1;
			do {
				//System.out.println(f+"*"+w+"="+(f*w));
				w++;
			}while(w<=9);
		}
		
		/*
		 * [응용문제]
		 * 구구단 7단부터 9단까지
		 * 단, 각 구구단 곱셈값은 5까지만 나오도록 합니다.
		 * 예) 7*1=7 ~ 9*5=45
		 * 제약) do while , while
		 */
		
		int a = 7;
		int total;
		
		do {
			int b = 1;
			while(b<=5) {
				total = (a*b);
				//System.out.printf("%d*%d=%d / ",a,b,total);
				b++;
			}
			a++;
		}while(a <= 9);
		
		/*
		 * [응용문제]
		 * 다음 결과값을 확인하여 코드를 작성하세요.
		 * 단, for문으로 시작하여 while문으로 제작하도록 하세요.
		 * 1*1=1
		 * 2*2=4
		 * 3*3=9
		 * ...
		 * 9*9=81*/
		
//		int c;
//		int total2;
//		
//		for(c=1;c<=9;c++) {
//			int c = x;
//			while(c==x) {
////				total2=c*x;
//				System.out.printf("%d*%d=%d ",c,x,total2);
//				x++;
//			}
//		}
		
		int c;
		int total3;
		for(c=1;c<=9;c++) {
			int cc=c;	
			while(cc<=c) {	
				total3=c*cc;
				//System.out.printf("%d*%d=%d / ",c,cc,total3);
				cc++;
			}
		}
		
		/*
		 * [응용문제]
		 * 다음 해당 결과값처럼 출력이 되도록 더블 반복문을 사용하세요.
		 * 단, 밖에는 while문, 안에는 do~whils문으로 작성하세요.
		 * 1+1=2 2+1=3 2+2=4 3+1=4 3+2=5 3+3=6 4+1=5 4+2=6 4+3=7 4+4=8
		 */
		

	}

}
