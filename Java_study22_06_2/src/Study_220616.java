import java.util.ArrayList;
import java.util.Arrays;

public class Study_220616 {

	public static void main(String[] args) {
		
		/* 더블 클래스  ▶ */
		
		/* 부모가 인스턴스에 적용이 되지 않으면 자식 class는 절대 호출하지 못함
		   자식 클래스 안에 또 자식 클래스를 만들 수도 있고, 메소드 안에 클래스를 만들 수도 있음 */
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child(); //부모class.자식class 이름생성 = 부모class명.new 자식class();
		//클래스는 호출하지 않으면 바로 접근할 수 없음(부모 class를 먼저 선언해서 호출해야만 자식 class를 호출할 수 있음
		//잘못된 예제) parents.child pc = parents.new child(); 
		pc.c_box();
		
		/* 추상 클래스 + 더블 클래스  ▶ */
		
		apink m1 = new apink();
		m1.f_method("이보미");
		apink.cafe LA = m1.new cafe();
		LA.call();
		
		
		/*
		 * [응용문제1]  ▶ 
		 * 더블 클래스를 이용하여 자식 클래스의 결과값을 출력하는 프로세서를 제작하세요. 
		 * 클래스는 두가지가 있습니다. 부모 클래스명 : mother / 자식 클래스명 : child 
		 * 메인 클래스에서 mother 클래스로 30, 50의 값을 전달합니다. 
		 * child에서 부모 클래스에 있는 값을 받아, 두개의 숫자를 곱한 결과값을 출력하세요.
		 */
		
		mother m = new mother(30,50);
		mother.child2 mc = m.new child2();
		mc.cd();
		
		/*
		 * [응용문제2]  ▶ 
		 * 배열 데이터 : "홍길동","이순신","유관순" 
		 * 메인 클래스에서 문자를 하나 전송합니다. 
		 * 단, 문자가 null 보낼 수도 있으며, 배열 데이터와 관계 없는 "강감찬"이라고 보낼 수도 있습니다. 
		 * 외부 클래스명 : data_list / 추상 클래스명 : v_constuct  / 내부 클래스명 : check
		 * [결과형태] 
		 * 메인 class에서 강감찬을 적용할 경우 내부 클래스에서 "해당 사용자는 가입자가 아닙니다." 라고 출력 
		 * 메인 class에서 이순신을 적용할 경우 내부 클래스에서 "사용자가 확인 되었습니다." 라고 출력 
		 * 단, ArrayList로 배열을 로드하세요.
		 */
		
		String data1 = "강감찬";
		data_list dl = new data_list();
		dl.set(data1);
	
		
	}

}

class parents {	//부모 클래스  ▶ 8
	String a = "홍길동";	//부모 필드에 있는 전역변수
	String b;
	class child {	//자식 클래스
		int a = 20;
		public void c_box() {	//자식 메소드
			double c = 10.5;
			System.out.println(c);	//자식 메소드 전용 지역변수
			System.out.println(this.a);	//자식 클래스 전용 전역변수
			System.out.println(parents.this.a);	//부모 클래스 전용 전역변수
			/*자식class 필드나 메소드에 a변수가 없으면 a만 출력했을 때 부모class에 있는 홍길동을 호출 가능하긴하나,
			 *변수가 새로 생성되면 헷갈릴 수 있기 때문에 부모class 전역변수를 호출할 땐 양식을 맞춰주는게 좋다.*/
			System.out.println(parents.this.b);	
			/*부모class에 있는 메소드 안에 있는 지역변수는 불러올 수 없음. 부모class 필드에 전역변수로 선언한 후 끌고올 순 있음.*/
			
			/*class안에 있는 class는 상속개념이 없기 때문에 부모class 필드에 있는 전역변수를 불러오고 싶을 땐
			  부모class명.this.변수명 을 써줘야만 출력이 가능함*/	
		}
	}
	public void p_box() {	//부모 메소드
		String a = "이순신";	//해당 메소드 안에서만 사용 가능한 지역변수
		this.b = a;
		System.out.println(a);	//this를 붙이지 않으면 해당 메소드 안에 있는 변수를 불러옴
		System.out.println(this.a);	//this는 필드에 있는 전역변수를 불러온다는 뜻
	}	
}

abstract class father {	//추상클래스 (abstract을 사용하면 추상)  ▶ 19
	public String u_name;	//전역변수 선언 (abstract이 없으므로 추상이 아님)
	public abstract void f_method(String name);	//추상 메소드
}

class apink extends father {
	@Override
	public void f_method(String name) {	//추상 메소드를 실제 메소드로 전환 ()
		this.u_name = name;	//추상 메소드에 있는 전역변수로 값을 이관함
	}
	class cafe {
		String msg = apink.this.u_name;	//부모 클래스에 있는 전역변수를 자식 클래스 전역변수로 이관
		//**father class는 추상클래스기 때문에 상속받은 apink class를 써야함
		public void call() {
			String msg2 = this.msg + "님 안녕하세요.";
			System.out.println(msg2);
		}
	}
}

class mother {	//  ▶ 28
	int a;
	int b;
	public mother(int a1, int b1) {
		this.a = a1;
		this.b = b1;
	}
	class child2 {
		public void cd() {
			System.out.println(mother.this.a*mother.this.b);	//다른 메소드 생성에 대비해서 자식 class 필드에 선언해도 됨
			
		}
	}
}

abstract class v_constuct {	//  ▶40 
	public String user;
	public abstract void set(String data);
}

class data_list extends v_constuct {
	@Override
	public void set(String data) {
		if(data == null) {
			System.out.println("사용자 이름을 입력하세요.");
		}
		else {
			this.user = data;
			check ck = new check();
		}
	}
	
	class check {
		String user_name = data_list.this.user;
		String arr[];
		ArrayList<String> ar;
		public check() {
			this.arr = new String[] {"이순신","홍길동","유관순"};		
			this.ar = new ArrayList<>(Arrays.asList(arr));
			compare();
		}
		public void compare() {
			int ea = this.ar.size();
			int w = 0;
			boolean bl = false;
			while(w < ea) {
				if(this.user_name.equals(ar.get(w))) {
					bl = true;
				}
				w++;
			}
			if(bl == true) {
				System.out.println("사용자가 확인 되었습니다.");
			}
			else {
				System.out.println("사용자를 확인하지 못하였습니다.");
			}
		}
	}
}