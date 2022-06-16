/* 부모 클래스 및 자식(내부)클래스 연동 */
public class Class1 {

	public static void main(String[] args) {
		/* 부모가 인스턴스에 적용이 되지 않으면 자식 class는 절대 호출하지 못함 */
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child(); //부모class.자식class 이름생성 = 부모class명.new 자식class();
		//클래스는 호출하지 않으면 바로 접근할 수 없음(부모 class를 먼저 선언해서 호출해야만 자식 class를 호출할 수 있음
		//잘못된 예제) parents.child pc = parents.new child(); 
		pc.c_box();

	}

}

class parents {	//부모 클래스
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
/* 자식 클래스 안에 또 자식 클래스를 만들 수도 있고, 메소드 안에 클래스를 만들 수도 있음 */