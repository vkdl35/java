import java.util.Arrays;

public class Study_220607 {

	public static void main(String[] args) {
		
		/* public 자료형태의 메소드 함수 사용법 */
		
		t1 t = new t1();
		t.a1++;
		t.a2++;
		t.name1();
		t.b1 += "유관순";
		t.b2 += "유관순";
		t.name3();
		t1 tt = new t1();
		tt.a1++;
		tt.a2++;
		tt.name2();
		tt.b1 += "강감찬";
		tt.b2 += "강감찬";
		tt.name4();
		//static 사용시 메모리에 누적되기 때문에 값이 초기화되지 않음
		t = null;
		tt = null;
		
		/* return 사용법 */
		
		t2 ta = new t2();
		//ta.data1(20);
		System.out.println(ta.data2(20));	
		//public 자료형에서는 sysout 사용 불가, main에서 처리해줘야 함
		String re = ta.data3("이경민");
		System.out.println(re);
		//받는 변수를 따로 만들어서 출력해도 됨
		
		/* return 주의사항 */
		
		System.out.println(ta.mb("lee"));
		ta = null;
		
		/* return에 값 2개 사용하기 - split 사용 */
		
		per p = new per();
		String info = p.userinfo();	//배열 데이터를 info에 넘겨줌
		String info2[] = info.split(",");	//스플릿으로 만든 배열값을 배열박스에 담아줌
		System.out.println(Arrays.toString(info2));
		
		/* return에 값 2개 사용하기 - 배열 사용 */
		
		String myinfo[] = p.userinfo2();
		System.out.println(Arrays.toString(myinfo));
		//System.out.println(myinfo[0]);	//하나씩 확인
		
		/* private */
		
		t3 t3_in = new t3();
		t3_in.dtr1("안녕");
		System.out.println(t3_in.dtr2());
		t3_in = null;
		
		/* private에 대한 객체 선언 형태 */
		
		String skey = "a1234567";
		t4 t4_in = new t4();
		t4_in.user_id ="lee";
		System.out.println(t4_in.checks(skey));
		t4_in = null;
		
		/* 필드값 이용방법 */
		
		t5 t5_in = new t5("이경민",29,"vkdl35@naver.com",6500);
		System.out.println(t5_in.data());
		System.out.println(t5_in.data2());
		t5_in = null;
		
	}

}

class t1 {
	int a1 = 1;	
	//(동적변수) : 새로운 객체 생성 및 클래스 호출시 1이라는 숫자를 다시 가지게 됨
	public static int a2 = 1;	
	/* (정적변수) : 새로운 객체 생성 및 클래스를 호출해도 1이라는 숫자가 아닌, 
				  메모리에 등록된 최종값을 지속적으로 가지게 됨 */
	String b1 = "이순신";
	public static String b2 = "홍길동";
	public void name1() {
		System.out.println(a1);
		System.out.println(a2);
	}
	public void name2() {
		System.out.println(a1);
		System.out.println(a2);
	}
	public void name3() {
		System.out.println(b1);
		System.out.println(b2);
	}
	public void name4() {
		System.out.println(b1);
		System.out.println(b2);
	}
}
class t2 {
	public static void data1(int ii) {
		//static 또는 void 메소드에는 return 사용 불가
		int z = ii+20;
		System.out.println(z);
	}
	public int data2(int ii) {	//자료형 메소드에서만 리턴 사용 가능
		int z = ii+20;
		return z;
	}
	public String data3(String ii) {
		String z = ii+"님 환영합니다.";
		return z;
	}
	public String mb(String id) {
		String msg = "";
		String msg2 = "이경민";
		if(id.equals("lee")) {
			msg = "ok";
		}
		else {
			msg = "cancel";
		}
		return msg;
		//리턴에 값을 두개 보낼 수 없음, 리턴을 두번 사용할 수도 없음
	}
}
class per {
	public String userinfo() {
		String user_name = "이경민";
		String user_id = "lee";
		String user_info = user_name + "," + user_id;
		return user_info;		
	}
	public String[] userinfo2() {
		String user_name = "이경민";
		String user_id = "lee";
		String user_array[] = {user_name,user_id}; //해당 1개 이상의 값을 return으로 보낼 경우
		//값을 두개 보내야할 경우 배열로 만들어서 보낼 수 있다.
		//return new String[] {user_name,user_id};	-> 바로 보내도 됨
		return user_array;
	}
}
class t3 {	//클래스에 바로 쓰는걸 필드값이라고 한다.
	//필드값에 올려놓으면 클래스 안에 있는 여러 메소드에서 가져다 쓸 수 있음
	String ak1 = null;	//void, 자료형 메소드 로드 가능
	private String ak2;	//해당 클래스에서만 사용 가능
	//public static String ak3;	//전부 사용 가능
	
	public void dtr1 (String us) {
		this.ak2 = us;	//main에서 보낸 값을 필드에 있는 private 함수에 전달
		System.out.println(ak2);
	}
	public String dtr2() {	//자료형은 return으로 보내기 & 자료형에서 출력 못함
		ak1 = "로컬푸드";
		return ak1;
	}

}
class t4 {
	String user_id = null;
	private String key = "a1234567";
	public String checks(String key2) {
		String msg = null;
		if(key.equals(key2)) {
			if(user_id.equals("lee")) {
				msg = "데이터 확인 중";
			}
			else {
				msg = "데이터 확인 불가";
			}
		}
		else {
			msg = "error";
		}
		return msg;
	}
}
class t5 {
	private String name;
	private int age;
	private String email;
	private int point;
	private String email_cp;
	public t5(String name2, int age2, String email2, int point2) {
		//setter 형태 : 인자값을 받아서 private로 넘기는 형태
		this.name = name2;
		this.age = age2;
		this.email = email2;
		if(point2 < 0) {	//포인트는 음수값으로 떨어지면 안되니까
			this.point = 0;
		}
		else {
			this.point = point2;
		}
	}
	public void ak9() {
		if(this.name == "이경민") {
			this.name = "lee";
			String em[] = this.email.split("@");	//@기준으로 나눠서 배열로 만든다
			this.email_cp = em[1];	//이메일 회사 정보만 담음
		}
	}
	public String data() {
		ak9();	//안부르고 email_cp를 바로 리턴하면 main에서 출력할 때 null 뜸
		return email_cp;
	}
	public int data2() {
		//getter 형태 : main에 private값을 보내주는 형태
		return this.point;
	}
}