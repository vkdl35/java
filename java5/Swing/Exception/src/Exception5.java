
public class Exception5 {
	//역할 : 값 주고, 출력만 함
	public static void main(String[] args) {	//값을 주고 다시 받아와서 연산 등을 할 경우 throws Exception 사용
		
		words wd = new words();
		
		try {
			String result = wd.files("");
			System.out.println(result);
			
		} catch (Exception a) {

			//System.out.println("빈 값이 문제가 되어 올바른 값을 전달 받지 못함");
			
			if(a.getMessage() != null) {				
				System.out.println(a);
			}
			
		}
		finally {
			try {
				String result = wd.files("홍길동");
				System.out.println(result);
			}
			catch (Exception f) {
				System.exit(0);
			}
			
		}

	}

}

class words {
	//역할 : 값을 받고, 연산 후 return
	public String files(String aa) throws Exception {	
		//해당 메소드에서 산술 연산이 있었으면 try-catch를 사용하겠지만, 그냥 return만 보내는 것이기 때문에 사용하지 않아도 됨
		String msg = "";
		if(aa==null || aa.equals("")) {
			//Exception ex = new Exception();	//이렇게 사용해도 됨
			throw new Exception("값이 비어있음");	// -> 여기에 값을 태울 수 있음. 어디서 오류가 나는지 확인 가능
		}
		else {
			msg = aa + "님 환영합니다.";
		}
		return msg;
	}
}
