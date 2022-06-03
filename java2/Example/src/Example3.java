import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제] 배열 + 기본(클래스) 메소드 문제
		 * product : 수박,참외,사과,배,딸기,키위,바나나,망고
		 * moneys : 35000,8000,4000,5500,3800,4400,11000,18900
		 * 장바구니에 해당 상품을 모두 담았습니다.
		 * 단, 그 중 사과와 바나나는 제외하고 총 결제 금액을 출력하세요.
		 */
		
		String product[] = {"수박","참외","사과","배","딸기","키위","바나나","망고"};	//인덱스 갯수는 같음
		int moneys[] = {35000,8000,4000,5500,3800,4400,11000,18900};
		Example3 ex = new Example3();
		ex.data(moneys,product);
		
	}
	
	public void data(int m[], String p[]) {
		int ea = m.length;
		int w = 0;
		int total = 0;
		
		while(w < ea) {
			if(!p[w].equals("사과") && !p[w].equals("바나나")) {
				total+=m[w];	//p에서 인덱스 번호가 빠진 배열값을 w가 가지고있고,
			}					//그 값을 m이 받아서 빠진 인덱스번호의 배열값을 제외하고 계산
			w++;
		}
		System.out.println(total);
	}

}
