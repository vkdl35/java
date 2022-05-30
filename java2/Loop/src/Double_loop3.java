
public class Double_loop3 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 다음 결과값이 출력되도록 for문으로 작성하세요.
		 * 5+2=7
		 * 5+3=8
		 * 5+4=9
		 * 5+5=10
		 * 6+2=8
		 * 6+3=9
		 * 6+4=10
		 * 6+5=11
		 * 7+2=9
		 * 7+3=10
		 * 7+4=11
		 * 7+5=12
		 * .
		 * .
		 * .
		 * 9+5=14*/
		
		int a,aa;
		int total;
		
		for(a=5;a<=9;a++) {
			for(aa=2;aa<=5;aa++) {
				total=(a+aa);
				//System.out.print(a+"+"+aa+"="+total+" ");
			}
		}
		
		/*
		 * [응용문제]
		 * 더블 while으로 제작
		 * 9*7=63
		 * 9*6=54
		 * 9*5=45
		 * 8*7=56
		 * ...
		 * 7*5=35
		 */
		
		int b = 9;
		int total2;
		
		while(b >= 7) {
			int bb = 7;
			while(bb >= 5) {
				total2=(b*bb);
				//System.out.print(b+"*"+bb+"="+total2+" / ");
				bb--;
			}
			b--;
		}
		
		/*
		 * [응용문제]
		 * 다음 결과값을 보고 dowhile문으로 제작하세요.
		 * 5+4=9 ~ 3+7=10
		 */
		
		int c = 5;
		int total3;
		
		do {
			int cc=4;
			do {
				total3=(c+cc);
				System.out.print(c+"+"+cc+"="+total3+" / ");
				cc++;
			}while(cc<=7);
			c--;
		}while(c>=3);

		
		
		
		
		
	}

}
