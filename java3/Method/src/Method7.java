import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {

		apink ap = new apink("홍길동", 25, "test@gmail.com", 1000);
		// ap.names();
		System.out.println(ap.data());
		System.out.println(ap.data2());

	}

}

class apink {
	// private선언은 class 필드에서 생성해야 합니다.
	private String nm;
	private int age;
	private String email;
	private int point;
	private String email_cp;
	
	public void names() {
		if (this.nm == "홍길동") {
			this.nm = "hong";
			String e[] = this.email.split("@");	//이메일 중에 이메일 회사 정보만 가져오기 위한 배열로 나누는 작업
			this.email_cp = e[1];
//			System.out.println(Arrays.toString(e));
			
		}
	}

	public apink(String nm1, int age1, String email1, int point1) { // private를 안에서 사용하지 못함
		// setter 형태 : 인자값을 받아서 private로 넘기는 형태
		this.nm = nm1;
		this.email = email1;
		if (point1 < 0) {
			this.point = 0;
		} else {
			this.point = point1;
		}
	}

	public String data() {
		names();
		return this.email_cp; // return 아래에는 그 어떤 함수도 쓸 수 없음(전부 오류 발생). 항상 맨 마지막에 위치해야함
	}

	public int data2() {
		// getter 형태 : main에 private값을 보내주는 형태
		return this.point;
	}

}