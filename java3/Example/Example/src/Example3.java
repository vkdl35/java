
public class Example3 {

	public static void main(String[] args) {
		ingerit2 in2 = new ingerit2();
		in2.it("홍길동", "aaa5");
		in2.print();
		
		
		

	}

}

class ingerit1 {
	
	private String nm;	//해당 클래스 안에서만 사용 가능
	protected String pw;	//외부에서 값을 넣진 못하지만 자식 클래스에게 값을 공유할 순 있음
	public String pw2;	//public으로 선언한 값은 클래스에서 모두 공유 가능함
	//public String aa = this.nm;	//필드값이 먼저 실행되기 때문에 아래 메소드에서 값을 넘겨주더라도 받아올 수 없음
	static String aa;	//private으로 받은 부분을 자식 클래스에서도 사용할 수 있도록 거쳐가는 통로를 만들어줌
	public void it(String d1, String d2) {
		this.nm = d1;
		this.pw = d2;
		this.aa = this.nm;	
	}
}
class ingerit2 extends ingerit1 {
	public void print() {
		System.out.println(this.aa + " " + this.pw);
	}
}
