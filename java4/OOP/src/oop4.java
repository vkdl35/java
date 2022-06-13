
public class oop4 {
	/*추상 클래스 및 메소드 abstract*/
	public static void main(String[] args) {
		
		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		ab.ab_a();

	}

}

abstract class ab_1 {	/*추상 클래스 (외부에서 로드가 절대 안됨) - 자체 실행이 안됨*/
	
	public void ab_a() {	//free (인수값 없는 추상 메소드)	- 사용해도 되고 안해도 됨
		//안에 값이 있으면 자식 메소드에서 사용 불가

	}
	
	public void ab_a(int a) {	//free (인수값 받는 추상 메소드)
		
	}
	//abstract 없는 public 메소드는 무조건 중괄호가 있어야 함. 
	//부모 클래스에 abstract를 선언했으면 자식 메소드에서 반드시 사용해야 빨간줄이 안뜸
	//public abstract void ab_c();	/*free 구성 무조건 자식 클래스에 사용*/
	public abstract int b();	/*추상 메소드 - 자체 실행 안됨*/
	
}

class ab_2 extends ab_1{
	
	public void ab_a() {
		
		//System.out.println(this.c());
	}
	@Override
	public int b() {	/*실제 메소드 + 추상 메소드*/
		return 55;
	}
	public int c() {
		return 99;
	}
}