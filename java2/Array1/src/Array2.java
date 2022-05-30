
public class Array2 {

	public static void main(String[] args) {
		

		//hong, kim, park, lee, jang, jung
		/*
		String id[] = {"hong","kim","park","lee","jang","jung"};	//배열 세팅이 잘 됐는지부터 확인
		//System.out.println(id[4]);
		int word = id[4].length();	//단어 갯수를 파악할 때도 length를 씀, 문자와 숫자의 사용법은 다름
		System.out.println(word);
		*/
		
		/*
		 * [응용문제]
		 * 해당 사용자 리스트 배열이 있습니다.
		 * 해당 배열값 중 사용자 아이디 세단어 이상만 출력하세요.
		 */
		
		String id[] = {"hong","kim","park","lee","jang","jung"};
		
		int member = id.length;	//전체 회원수를 파악하기 위함
		int w = 0;
		int word;	//각각의 배열 데이터의 문자 갯수 파악
		while(w < member) {	//총 member인원을 다 검토한다는 뜻
			word = id[w].length();	//문자 갯수 파악
			if(word > 3) {	//세단어 이상(포함or불포함)의 데이터만 출력
				//System.out.println(id[w]);
			}
			w++;
		}
		
		/*
		 * [응용문제]
		 * 배열 데이터는 다음과 같습니다.
		 * 15, 60, 11, 14, 27
		 * 다음 데이터 값을 모두 더해서 최종 결과값을 출력하세요.
		 */
		
//		int num[] = {15,60,11,14,27};
//		//System.out.println(date[0]);	//
//		int totalnum = num.length;
//		int a = 0;
//		int b = 0;
//		while(a < totalnum) {
//			b+=num[a];
//			a++;
//		}
//		System.out.println(b);
		
		int data[] = {15,60,11,14,27};
		//System.out.println(date[0]);
		int total = 0;
		int data_ea = data.length;	//data 값의 갯수를 다 불러오라는 함수
		int dw = 0;
		do {
			total += data[dw];	//data[dw] : 합산해야될 목록, 0부터 시작해야하니까 인자값은 dw가 되어야함
			dw++;
		}while(dw < data_ea);
		System.out.println("총합계 "+total);
		
		
		
		
		
	}

}
