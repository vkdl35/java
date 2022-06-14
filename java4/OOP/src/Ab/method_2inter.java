package Ab;
//interface : 원래 기능은 메소드만 선언, 추가로 연산을 처리하는 형태의 default가 추가됨(java14)
public interface method_2inter {
	//인터페이스는 메소드라 필드에 자료형을 선언할 수 없음
	public String names();	//String names() return 메소드 선언
	default void setbox(String name) { //setter
		System.out.println(name);
	}
	
	default String box3() {	//getter
		//인터페이스는 디폴트를 선언하면 연산 메소드를 사용함
		return null;
	}
}
interface method_2re extends method_2inter{	
	//인터페이스에 extends로 부모 인터페이스를 로드할 수 있습니다.
	public String names();
}