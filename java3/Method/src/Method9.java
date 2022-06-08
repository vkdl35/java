import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제4] -> 숙제
		 * 관리자에서 메뉴를 활성화하는 프로세서입니다.
		 * 해당 메뉴 활성화는 2차 배열이며, 메뉴명과 활성화하는 (Y,N)으로 구분합니다.
		 * 해당 활성화 값을 대입하여 Y로 적용되는 인덱스 번호에 맞는 메뉴명을 1차 배열로 재구성 후 메인에서 출려되도록 합니다.
		 * 겨로가 : ["로켓배송","로켓프레시","골드박스","이벤트","추석"]
		 * 단 private 및 return을 활용하여 프로그램을 작성합니다.
		 * **배열 생성해야함
		 */
		
		menus m1 = new menus();
		String ap[] = m1.aaa();
		System.out.println(Arrays.toString(ap));
		
		//System.out.println(Arrays.toString(m1.get()));

	}

}

class menus {
	private String[][] m;
	private String[] box;
	private int ct;

	public menus() {
		String ms[][] = { 
				{ "로켓배송", "로켓프레시", "쿠팡비즈", "골드박스", "이벤트", "설날", "추석" },
				{ "Y", "Y", "N", "Y", "Y", "N", "Y" } 
			};
		this.m = ms;
	}

	public String[] aaa() {
		int ea = this.m[0].length;
		this.box = new String[5];
		int w = 0;
		this.ct = 0;

		while (w < ea) {
			if (this.m[1][w].equals("Y")) {
				this.box[this.ct] = m[0][w];
				this.ct++;
			}
			w++;
		}
		return this.box;
	}
}

/*

class menus {
	private String[][] m;
	private String[] r = new String[5];

	public menus() {
		String ms[][] = { { "로켓배송", "로켓프레시", "쿠팡비즈", "골드박스", "이벤트", "설날", "추석" },
				{ "Y", "Y", "N", "Y", "Y", "N", "Y" } };
		this.m = ms;
		redata();

	}

	public void redata() {
		int ea = this.m[0].length;
		int w = 0;
		int ct = 0;
		String ww[] = new String[ea];
		do {
			if (this.m[1][w].equals("Y")) {
				ww[ct] = this.m[0][w];
				ct++;
			}
			w++;
		} while (w < ea);

		this.r = ww;

	}

	public String[] get() {
		return this.r;
	}

}

*/


/*
	class{
	int a;		-> field(필드 선언)
	String b;
		public aaa(){		->constructor (제일 먼저 실행)
			
		}
		-> method (메소드): 클래스에서 빠질 일이 없음
		public void
		public static void
		public String abc
	}
*/