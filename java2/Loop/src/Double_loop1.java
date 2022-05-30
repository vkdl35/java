//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Double_loop1 {

	public static void main(String[] args) {
		
//		Date today = new Date();
//		System.out.println(today);
//		
//		SimpleDateFormat date = new SimpleDateFormat("YY년 MM월 dd일");	//MM:월 / mm:분
//		SimpleDateFormat time = new SimpleDateFormat("h:m:s");	//H:24시간 기준 / h:12시간 기준
//		System.out.println(date.format(today));
//		System.out.println(time.format(today));
		
		//실무에서 사용하지 않는 코드
		
		//format : 규격화된 형태로 값을 표현할 때 사용하게 됩니다.
		//ctrl+shift+o : 사용하지 않는 import를 삭제시켜줌.
		
		/*
		int f;
		for(f=1;f<=100;f=f+2) {
			System.out.print(f+" ");
		}
		//변수++ 는 기본적으로 1씩 증가, 뒤에 숫자 붙이면 그 숫자만큼 증가
		 */
		
		/*
		[응용문제]
		
		3개의 상품
		“바코드로 상품을 입력시켜주세요.” 금액을 입력하고나서 
		“할인%를 입력해주세요.” 라는 문구와 함께 해당 할인 숫자를 입력하면
		최종 금액이 변경되어 출력합니다.
		
		*/
		
//		int money = 10000;
//		int coupon = 20;
//		double a = coupon * 0.01;
//		System.out.println(a);
//		double b = money * a;
//		System.out.println(b);
//		double c = money - b;
//		System.out.println(c);
		
		int f,ff;
		int total;
		
		for(f=1;f<=3;f++) {
			for(ff=1;ff<=4;ff++) {
				total=f+ff;
				System.out.print(" "+f + "+" + ff);
			}
		}
		
		
		
		
	}

}
