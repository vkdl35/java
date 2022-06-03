import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제] 2차 배열
		 * 데이터는 다음과 같습니다.
		 * user_list : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군
		 * user_point : 3000 1000 25000 19800 5750 3630 0
		 * 프로그램 시작과 동시에 "포인트를 검색할 고객명을 입력하세요." 가 출력됩니다.
		 * 입력한 값은 별도의 class를 제작하여 해당 메소드 값으로 
		 * 매개변수를 이용하여 전달 후 해당 결과값을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("포인트를 검색할 고객명을 입력하세요.");
		String user = sc.next();
		data ex = new data();
		ex.datas(user);
		sc.close();
		ex = null;
	}

}

class data {
	public void datas(String a) {
		String user_list[][] = {
				{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
				{"3000","1000","25000","19800","5750","3630","0"}
		};
		//int ea_1 = user_list.length;
		int ea_2 = user_list[0].length;
		/*
		int w = 0;
		while(w < ea_1) {
			int ww = 0;
			while(ww < ea_2) {
				if(user_list[w][ww].equals(a)) {
					System.out.println(user_list[1][ww]);
				}
				ww++;
			}
			w++;
		}
		*/
		int w = 0;
		while(w<ea_2) {
			if(a.equals(user_list[0][w])) {
				System.out.printf("%s님의 포인트는 %s입니다.",user_list[0][w],user_list[1][w]);
			}
			w++;
		}
		
	}
	
}