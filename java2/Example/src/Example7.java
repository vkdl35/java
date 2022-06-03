
public class Example7 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제] 다차원 배열로 생성 + 외부 class 및 메소드 사용
		 * [data]
		 * {"홍길동","합격"}
		 * {"이순신","합격"}
		 * {"강감찬","불합격"}
		 * {"김유신","합격"}
		 * {"유관순","불합격"}
		 * {"장보고","불합격"}
		 * 다차원 배열 형태이며, 해당 값중 합격자만 출력되도록 합니다.
		 * 단, 배열값을 외부 클래스 안에 메소드에서 처리가 되도록 합니다.
		 * 결과 : 홍길동 이순신 김유신
		 */
		
		data1 da = new data1();
		da.datas();
		da=null;
	}

}

class data1 {	//같은 패키지 안에 동일한 클래스명을 사용할 수 없음
	public void datas() {
		String user[][] = {
			 {"홍길동","합격"},
			 {"이순신","합격"},
			 {"강감찬","불합격"},
			 {"김유신","합격"},
			 {"유관순","불합격"},
			 {"장보고","불합격"}	
		};
		int w = 0;
		int ea = user.length;
		while(w < ea) {
			if(user[w][1].equals("합격")) {
				System.out.printf("%s님 %s입니다.\n",user[w][0],user[w][1]);
			}
			w++;
		}
	}
}
