import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * 배열 데이터 : "홍길동","이순신","유관순" 
		 * 메인 클래스에서 문자를 하나 전송합니다.
		 * 단, 문자가 null 보낼 수도 있으며, 배열 데이터와 관계 없는 "강감찬"이라고 보낼 수도 있습니다.
		 * 외부 클래스명 : data_list 
		 * 추상 클래스명 : v_constuct
		 * 내부 클래스명 : check
		 * 
		 * [결과형태]
		 * 메인 class에서 강감찬을 적용할 경우
		 * 내부 클래스에서 "해당 사용자는 가입자가 아닙니다." 라고 출력
		 * 메인 class에서 이순신을 적용할 경우
		 * 내부 클래스에서 "사용자가 확인 되었습니다." 라고 출력
		 * 단, ArrayList로 배열을 로드하세요.
		 */
		
		String user_name = null;
	
		data_list dl = new data_list();
		dl.vc(user_name);
		data_list.check dc = dl.new check();
		dc.ne();
		

	}

}

abstract class v_constuct {	//추상클래스
	public ArrayList<String> ar;
	public String user_name;

	public void vc(String un) {
		String user[] = { "홍길동", "이순신", "유관순" };
		ArrayList<String> ar1 = new ArrayList<>(Arrays.asList(user));
		this.ar = ar1;
		this.user_name = un;
	}
}

class data_list extends v_constuct {	//외부메소드(상속)
	class check {	//내부클래스
		ArrayList<String> ar1 = data_list.this.ar;
		String un1 = data_list.this.user_name;
		
		public void ne() {
			String msg = "";
			int w = 0;
			int ea = this.ar1.size();
			while (w < ea) {
				if (ar1.get(w).equals(this.un1)) {
					msg = "사용자가 확인 되었습니다.";
					break;
				} else {
					msg = "해당 사용자는 가입자가 아닙니다.";
				}
				w++;
			}
			System.out.println(msg);
		}
	}
}