
public class Method8 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 협업 프로그래머가 해당 DB에 값중 홀수값에 대한 총 갯수를 받고자 합니다.
		 * 해당 갯수가 출력될 수 있도록 코드를 작성하세요.*/
		
		odbc o = new odbc();
		//int r = o.name();
		int r = o.aaa();
		System.out.println(r);


	}

} 
/*
class odbc {
	//필드 선언하면 다른 메소드 함수를 만들었을 때 수정이 편함
	private int[] odata;
	private int total;	
	//total값을 건들지 못하게 하려는 용도 + 자료형태의 메소드 함수를 비워놓으려는 용도
	
	public odbc() {
		int odata2[] = {15,22,17,14,32,35,19,33};
		this.odata = odata2;
		int ea = odata.length;
		int w = 0;
		while(w < ea) {
			if(odata2[w] % 2 == 1) {
				this.total++;	//this를 사용해야 절대 값이 바뀌지 않음
			}
			w++;
		}
	}
	
	public int name() {	//인자값이 있으면 안됨
		return this.total;	//this를 사용해야 절대 값이 바뀌지 않음
		//자료형태의 메소드 함수에만 return 가능
	}
}
*/

class odbc {
	private int[] odata;	//배열값이 변경되지 않도록 사용
	private int count;	//홀수일 경우 +1씩 증가하기 위한 필드 변수값
	public odbc() {
		int odata2[] = {15,22,17,14,32,35,19,33};
		this.odata = odata2;
	}
	public int aaa() {
		int w = 0;
		int ea = this.odata.length;
		while(w < ea) {
			if(this.odata[w]%2 == 1) {
				this.count++;	//홀수이면 +1씩 증가
			}
			w++;
		}
		return this.count;	//최종값을 return시킴
	}
}