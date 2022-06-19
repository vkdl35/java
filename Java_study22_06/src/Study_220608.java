import Study_package.Study_220608_connect;	//외부 클래스 호출

public class Study_220608 {

	public static void main(String[] args) {

		/* getter setter */
		
		met m = new met();
		m.setUser_name("홍길동");
		m.setUser_pass("a123456");
		m.setUser_email("abc@md.df");
		System.out.println(m.getUser_name());
		System.out.println(m.getUser_pass());
		System.out.println(m.getUser_email());
		
		
		/* replace 사용법 - 단어를 바꾸거나 공백을 제거할 때 사용 */
		
		String str = "홍길동님 환영합니다.";
		String str2 = str.replace("님", "고객님");		//단어변경
		System.out.println(str2);
		String nm = "홍 길 동";
		String nm2 = nm.replace(" ", "");	//공백제거
		System.out.println(nm2);
		
		/* 외부 클래스 호출 */
		
		Study_220608_connect a = new Study_220608_connect();	//main메소드를 로드하게 됩니다.
		//b.main(args);	//메인 클래스 호출
		//다른 파일에 있는 main class를 불러올 때 sysout 사용불가(해당 class main에서 사용해야함)
		a.abox();
		
		/* extends */
		
		bix2 b = new bix2();
		b.bc("이경민");
		
		/* extends 사용시 주의사항 */
		
		mth1 m1 = new mth1();
		mth2 m2 = new mth2(0);
		
	}

}

class met {
	private String user_name;
	private String user_pass;
	private String user_email;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
}
class bix {
	private String user_pw;
	protected String user_id;
	public String user_rpw;
	public bix() {
		this.user_pw = "a1234";
		this.user_rpw = this.user_pw.replace("a1234", "feijf##*kg");
		
	}
}
class bix2 extends bix{
	public void bc(String lee) {
		this.user_id = lee;
		System.out.println(this.user_id);
		System.out.println(this.user_rpw);
	}
}
class mth1 {	
	public int no;
	public mth1() {	//constructor에 인수값을 넣으면 main에서 상속 class를 로드할 수 없음
		//constructor를 상속하려면 인수값은 무조건 비워야함
		this.no = 20;
		System.out.println("mth1");
	}
}
class mth2 extends mth1 {
	public mth2(int a) {
		this.no = 50;
		System.out.println(this.no);
		System.out.println("mth2");
	}
}