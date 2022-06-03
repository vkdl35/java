
public class Example5 {

	public static void main(String[] args) {	//main class엔 public 만 사용 불가능, 다른 class엔 사용 가능
		
		/*
		 * [응용문제] 2차 배열 + 기본(클래스) 메소드 문제
		 * 등록된 고객중 VIP 고객만 리스트를 출력하세요.
		 * user_list : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군
		 * user_level : gold vip guest gold vip vip guest
		 * 결과출력 : 이순신, 세종대왕, 김유신
		 */
		
		String user_list[][] = {
				{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
				{"gold","vip","guest","gold","vip","vip","guest"}
		};
		Example5 ex = new Example5();
		ex.data(user_list);
		ex=null;

	}
	
//	public void data(String user[][]) {
//		String vip = "";
//		//int ea_u = user.length;
//		int ea_l = user[0].length;
//
//		int w = 0;
//		while(w < ea_l) {
//			if(user[1][w].equals("vip")) {
//				vip += user[0][w]+" ";
//			}
//			w++;
//		}
//		System.out.println(vip);
//		
//	}
	/*더블 반복문으로 답 출력*/
	public void data(String user[][]) {
		//String vip = "";
		int ea_u = user.length;	//2
		int ea_l = user[0].length;	//7

		int w = 0;
		
		while(w < ea_u) {
			int ww = 0;
			while(ww < ea_l) {
				if(user[w][ww].equals("vip")) {
					System.out.print(user[0][ww]+" ");
				}
				ww++;
			}
			w++;
		}
		/* 반복문 한번으로 강제 출력*/
		/*
		while(w < ea_l) {
			if(user[1][w].equals("vip")) {
				vip += user[0][w]+" ";
			}
			w++;
		}
		*/
		//System.out.println(vip);
		
	}

}
