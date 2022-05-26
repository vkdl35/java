
public class If_for2 {

	public static void main(String[] args) {
		/* 1~100까지 숫자 중 80이상의 숫자만 출력 */
		
//		int f;
//		for(f=1;f<=100;f++) {
//			if(f>=80) {
//				System.out.print(f+" ");
//			}
//		}

		/* 200~300까지의 숫자 중 240이하의 숫자만 출력 */
		
//		int ff;
//		for(ff=300;ff>=200;ff--) {		//내림차순
//			if(ff<=240) {
//				System.out.print(ff+" ");
//			}
//		}
		
//		int ff;
//		for(ff=200;ff<=300;ff++) {
//			if(ff<=240) {
//				System.out.print(ff+" ");
//			}
//		}
		
//		final int a = 3;	//a의 숫자를 바꾸면 a의 배수값을 출력할 수 있음.
//		int w;
//		for(w=1;w<11;w++) {
//			if(w%a == 0) {
//				System.out.print(w+" ");
//			}
//		}
		
		
		/* 응용문제 : 구구단 중 2단을 반복합니다. 
		   단, 2단 결과값 중 10이상 숫자만 출력됩니다. */
		
		//[내가 짠 코드]
		
//		final int a = 2;
//		int b;
//		for(b=1;b<20;b++) {
//			if(b%a == 0) {
//				System.out.print(b+" ");
//			}
//		}
		
		//[선생님이 짠 코드]
		
//		final int g = 2;
//		int ww;
//		int total;
//		for(ww=1;ww<=9;ww++) {
//			total = g * ww;
//			if(total >= 10) {				
//				System.out.print(total+" ");
//			}
//		}
		
		/* [응용문제] 
		 
		   다음 결과값을 보고 해당값이 출력되도록 코드를 제작하시오.
		   18 36 54 72
		 */
		
		//[내가 짠 코드]
		/*
		int a;
		int b=9;
		int t;
		for(a=2;a<9;a++) {
			t = b*a;
			if(t%2 == 0) {
				System.out.print(t+" ");
			}
		}
		*/
		
		//[선생님이 짠 코드]
		
		/*
		int bk;
		int dk;
		for(bk=1;bk<10;bk++) {
			dk=9*bk;
			if(bk%2==0) {
				System.out.print(dk+" ");
			}
		}
		*/
		
		/* 응용문제
		 	다음 결과값을 보고 해당값이 출력되도록 코드를 제작하시오.
		 	1부터 20사이의 숫자입니다.
		 	6 14 17 19
		 */
		
		int k;
		for(k=1;k<=20;k++) {
			if(k==6||k==14||k==17||k==19) {
				System.out.print(k+" ");
			}
		}
		
	
		
		
		
		
	}

}
