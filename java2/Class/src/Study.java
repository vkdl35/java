import java.util.Arrays;

public class Study {

	public static void main(String[] args) {
		
		//빈공간에 배열값 담기
		
		String[] names = new String[3];	//3개가 들어갈 수 있는 빈 공간을 생성
		String m[] = {"홍길동","강감찬","이순신"};
		//System.out.println(names[0]); 	//null 값이 비었다는 뜻
		int ct = 0;
		for(String a : m) {	//a라는 변수에 m 배열값을 가져온다
			names[ct] = a;	//빈공간에 a에 담긴 값 넣기
			ct++;			//인덱스번호 0에서 증가
		}
		//System.out.println(names[0]);	//인덱스 번호에 있는 배열값 호출

		//빈 공간에 배열값 골라 넣기
		
		String[] names2 = new String[3];
		String m2[] = {"홍길동","강감찬","이순신"};
		int ct2 = 0;
		for(String a2 : m2) {
			if(a2.equals("홍길동")||a2.equals("이순신")) {	//홍길동 또는 이순신만이라는 조건
				names2[ct2] = a2;
				ct2++;
			}
		}
		int name_ea = names2.length;	//빈 공간에 값이 몇개 들어갈 수 있는지 확인
		//System.out.println(name_ea);
		//System.out.println(Arrays.toString(names2));
		
		//빈배열 변수에 데이터가 있는 배열로 커스텀
		
		int a3[] = new int[3];
		int b[] = {1,2,3,4,5,6,7};
		int ea_a3 = a3.length;
		int ea_b = b.length;
		int w = 0;
		int ct3 = 0;
		while(w < ea_b) {
			if(b[w] % 2 == 0) {
				a3[ct3] = b[w];
				ct3++;
			}
			w++;
		}
		//System.out.println(Arrays.toString(a3));
		
		//2차 배열
		
		
		
		
		/*
		 * [응용문제]
		 * 다음중 장바구니에 여러개의 상품이 담겨져 있습니다.
		 * 그 중 택배비가 별도로 측정되는 금액만 추출하세요.
		 * 택배비는 30000원 이상(포함)입니다.
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 * 결과 [48000, 67000, 118200, 49800]
		 */
		
		int money[] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int box[] = new int[4];
		int ea_m = money.length;
		int w2 = 0;
		int ct4 = 0;
		while(w2 < ea_m) {
			if(money[w2] >= 30000) {
				box[ct4] = money[w2];
				ct4++;
			}
			w2++;
		}
		//System.out.println(Arrays.toString(box));
		
		/*
		 * [응용문제]
		 * 해당 사용자 정보 데이터 및 각 레벨별 데이터도 함께 제공됩니다.
		 * 그 중 레벨 데이터 값에 3미만(미포함)의 값만 확인하여 
		 * 배열 데이터를 재가공합니다.
		 * 홍길동, 이순신, 강감찬, 세종대왕, 유관순, 김유신
		 * 4,3,1,1,2,2
		 * ["강감찬" , "세종대왕" , "유관순" , "김유신"]
		 */
		
		String member[] = {"홍길동","이순신","강감찬","세종대왕","유관순","김유신"};
		int num[] = {4,3,1,1,2,2};
		String box2[] = new String[4];
		int ea_m2 = member.length;
		int w3 = 0;
		int ct5 = 0;
		while(w3 < ea_m2) {
			if(num[w3] < 3) {
				box2[ct5] = member[w3];
				ct5++;
			}
			w3++;
		}
		//System.out.println(Arrays.toString(box2));
		
		
		
		
	}

}
