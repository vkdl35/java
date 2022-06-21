
public class Exception2 {

	public static void main(String[] args) {
		
		try {
			//test();	//메소드 호출 자체 에러기 때문에 Exception과 관계가 없음
			Exception2 ex = new Exception2();
			String a = "홍길동2";
			ex.test(a);
		}
		catch (Exception i) {
			System.out.println(i);
		}
		
	}
	public void test(String b) throws Exception,NumberFormatException {	//throws는 main 메소드에서 예외처리 없이 해당 메소드를 호출할 경우를 막기 위해 사용
		//throws Exception 사용시 던지는 쪽에서 무조건 try~catch문을 사용해야함
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c;	//코드 맨 밑에 사용을 하며 throw = return 비슷한 성격을 가짐
		//예외처리 결과에 대한 값을 메인 메소드로 다시 return
	}

}
