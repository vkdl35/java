import java.util.ArrayList;
import java.util.Arrays;
/*선생님이 푼 문제*/
public class Class4_syudy {
	public static void main(String[] args) {
		data_list2 dl2 = new data_list2();
		dl2.user_input(null);
	}
}

abstract class v_constuct2 {
	String user_name;
	public abstract void user_input(String nm);
}
class data_list2 extends v_constuct2 {
	@Override
	public void user_input(String nm) {
		if (nm == null) {
			System.out.println("사용자 이름을 입력하셔야 합니다.");
		} else {
			this.user_name = nm; // try 이용해서 예외처리 해보기
			check2 ck = new check2(); // 메인에서 호출하는게 아닌, 부모클래스에서 자식클래스를 호출
			ck.db();
		}
	}
	class check2 { // 자식 클래스에서 배열을 넣어야 처음부터 로드를 안할 수 있음
		String user_name = data_list2.this.user_name;	//부모 클래스에서 받은 값을 자식클래스로 이관
		String data_list[];	//필드에 배열을 받는 객체 생성
		ArrayList<String> ar = null;	//arraylist util을 필드에 객체 생성
		public void db() {
			//해당 필드에 있는 arraylist를 인스턴스로 적용함
			this.data_list = new String[] { "홍길동", "이순신", "유관순" };
			this.ar = new ArrayList<>(Arrays.asList(data_list));	//this로 처리
			this.compare(); //최종 DB와 사용자 정보를 비교하는 메소드
		}
		public void compare() {
			int ea = this.ar.size();
			int w;
			boolean bl = false;	//결과 확인 작업
			for (w = 0; w < ea; w++) {
				if (this.user_name.equals(this.ar.get(w))) {
					bl = true;
				}
			}
			if (bl == true) {
				System.out.println("해당 사용자가 있습니다.");
			} else {
				System.out.println("해당 사용자는 가입자가 아닙니다.");
			}
		}
	}
}