
public class Over {

	public static void main(String[] args) {
		
		//pt p = new pt();
		//p.display();
		cd c = new cd();
		c.display("메인 내용값 출력");	//오버로딩
		c.display();	//오버라이드
		
		

	}

}
/*  
 	오버로딩(overloading) : 새로운 메소드를 정의하는 것을 말합니다.
 	오버라이드(override) : 부모 클래스에서 상속 받은 기존 메소드를 사용하는 것을 말합니다.
 */
class pt {
	public void display() {
		System.out.println("부모 외부 내용값");
	}
	
}

class cd extends pt{
	//aaaa() 메소드는 에노테이션을 사용하지 못함. 부모 class에서 선언하지 않았음
	/*
	@Override	-> 부모 클래스에 없는 메소드 사용시 오류, 해결하려면 부모 클래스에 같은 메소드를 만들어주면 됨
	public void aaaa() {
		System.out.println("자식에 만들어진 메소드");
	}
	*/
	
	@Override	//에노테이션(표시) 문제 발생시 확인 (오버라이드에만 적용)
	public void display() {	//오버라이드
		System.out.println("자식 클래스 값으로 변경");
		super.display();	//super : 부모에 있는 고유 속성 메소드값을 가져올 때 사용합니다.
	}
	
	public void display(String msg) {	//오버로딩
		System.out.println(msg);
	}
	
}
/*
오버로딩 : 같은 클래스 안에 메소드 이름이 같아도 메소드 형태가 다르면 (인수값 자료형 등) 전부 같이 작동된다. (서로 중복되지 않으면 됨)
public void name() 
public void name() -> x
public void name(String a) -> o
public void name(String b) -> x
public void name(int a) -> o
public void name(double a) -> o
등등
같은 메소드명과 형태를 중복으로 만들고 싶으면 자식 메소드로 오버라이드 하면 됨
*/