package App;

public class App1 {
/* App1이라는 기본 메인 class이며, abox, main이 공존해 있음 */
	public static void main(String[] args) {
		//Method11에서 로드할 경우 해당 외부 blue 클래스를 로드하여 
		//출력시켜 Method11에 로드할 수 있도록 함 
		blue b = new blue();
		System.out.println(b.box());

	}
	
	public void abox() {
		System.out.println("test import");
	}

}
//blue는 별도의 외부 class이며, Meshod11에서 직접적인 핸들링은 불가능함

class blue {
	private String msg;
	
	public String box() {
		this.msg = "환영합니다.";
		return this.msg;
	}
}
