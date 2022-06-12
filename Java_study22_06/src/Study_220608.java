
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
		
		//메소드 11이랑 app1 이론만 적기
		
		/* extends */
		
		bix2 b = new bix2();
		b.bc("이경민");
		
		
		
		
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