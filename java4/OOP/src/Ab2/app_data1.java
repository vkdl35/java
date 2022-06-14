package Ab2;

public interface app_data1 {	
	String a = null;	//필드에 있는 자료형의 값이 비어있을 경우 사용 불가(무조건 값 적용)
	int b = 0;
	public void user_join();	//선언 형태의 메소드는 this 사용 불가
	default void aaa() {	//default에는 this 사용이 가능함(값이 있을 경우에만 해당)
		System.out.println(this.a);
	}
}
