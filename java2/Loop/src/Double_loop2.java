
public class Double_loop2 {

	public static void main(String[] args) {
		//while
		//while문은 변수를 미리 설정했기 때문에 작은 반복문이 읽을 수가 없음. 작은 반복문에 들어갈 변수를 큰 반복문 안에 넣어주어야 함.
		//변수의 위치가 중요.
		
		int w=1;
		while(w<=3) {
			int ww=1;	//작은 while문의 초기값을 큰 반복문 안에 적용 
			while(ww<=4) {
				//System.out.print(w + "+" + ww + " ");
				ww++;
			}
			w++;
		}

		//do while
		//do while문도 while문과 동일하게 초기값을 큰 반복문 안에 넣어줘야 함. 
		
		int dw = 1;
		do {
			int ddw = 1;
			do {
				//System.out.print(dw+"+"+ddw+" ");
				ddw++;
			}while(ddw<=4);	//작은 반복문 범위
			dw++;
		}while(dw<=3);	//큰 반복문 범위
		
		//
		
		
		
	}

}
