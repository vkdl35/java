
public class Method12 {

	public static void main(String[] args) {
		//extends를 사용한 자식 class를 로드하게 되면 자동으로 부모 class도 함께 사용이 가능함
		bbox2 bx = new bbox2();
		bx.b2("이순신");
		System.out.println(bx.abc());

	}

}

class bbox{	//기본 외부 class1 main에서 필요한 사항을 체크
	protected String user_info;
	private String user_pw;	//private는 extends로 상속 불가능
	public String user_rpw;
	public bbox() {
		this.user_pw = "abcd";
		this.user_rpw = this.user_pw.replace("abcd","542f3#$d451");	//메소드를 따로 만들어서 암호화 후 상속 가능
		
	}
	public String abc() {	//통째로 상속 받기 때문에 main에서 bx.abc()로 출력가능 
		String email = "hong@naver.com";
		return email;
	}
}

class bbox2 extends bbox {	//bbox에 대한 모든 정보를 bbox2와 공유하게 됨
	//단, bbox 중에서 private으로 셋팅된 값은 공유하지 않음
	public void b2(String nm) {	//main class에서 bbox2를 로드 후 
		//해당 값에 인수값을 적용하여 bbox class에 있는 필드명 중 user_info에 적용하게 되는 형태
		this.user_info = nm;
		System.out.println(this.user_info);
		System.out.println(this.user_rpw);
		
	}
}