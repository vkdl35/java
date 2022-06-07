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
		
		
		//메소드3
		
		
	}
	//return new String[] {user_name,user_id};	-> 바로 보내도 됨
	//값을 두개 보내야할 경우 배열로 만들어서 보낼 수 있다.
}
