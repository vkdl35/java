
public class Example4 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 두 개의 값을 외부 클래스로 보냅니다.
		 * 해당 클래스에서 두 개의 값을 계산하게 됩니다.
		 * 계산형식은 다음과 같습니다.
		 * 3, 10을 보내게 되면 두 개의 값의 합을 구합니다.
		 * 나머지 외부 클래스에서 해당 결과값을 출력하는데,
		 * 두개의 합 값이 짝수, 홀수인지를 출력하는 extends를 구현하세요.
		 */
		
		Bdata bd = new Bdata();
		bd.name(3,10);
		bd.name2();

	}

}

class Adata {
	protected int total;	//합계
	protected String msg;
	
	public void name(int a, int b) {
		this.total=a + b;
	}
}
class Bdata extends Adata{	//extends 하게 되면 자식 클래스에 메소드 하나는 필수로 가지고 있어야 한다
	public void name2() {
		if(this.total % 2 == 1) {
			this.msg = "홀수입니da.";
		}
		else {
			this.msg = "짝수입니다.";
		}
		System.out.println(this.msg);
	}
}