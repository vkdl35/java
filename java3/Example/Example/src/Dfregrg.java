public class Dfregrg {

	public static void main(String[] args) {

		/*
				[응용문제6] > 숙제!   ▶229
			다음 해당 결과값처럼 출력이 되도록 더블 반복문을 사용하세요.
			단, 밖에는 while문, 안에는 do~while문으로 작성하세요.
			1+1=2, 2+1=3, 2+2=4, 3+1=4, 3+2=5, 3+3=6, 4+1=5, 4+2=6, 4+3=7, 4+4=8

		 */
		
		
		int w = 1;
		int total=0;
		while(w < 5) {
			int d = w;
			do {
				total=w+d;
				System.out.println(total);
				d++;
			}while(d < 5);
			w++;
		}
		
		

	}

}
