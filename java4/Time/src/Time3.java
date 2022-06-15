
public class Time3 {

	public static void main(String[] args) {
		/*
		try {	//TimerTask는 무한 루프 가능, try-catch는 종료 가넝
			System.out.println("수업시작");
			Thread.sleep(5000);
			System.out.println("수업종료");
		}
		catch (Exception e) {
		}
		*/
		
		/*
		 * [응용문제]
		 * 외부 클래스가 있습니다.
		 * 단, 메인 클래스에서 해당 외부 클래스를 로드하면 해당 메소드에서 즉각적으로 8초동안 로딩이 발생합니다.
		 * 8초동안 "처리중입니다. 잠시만 기다려주세요."
		 * 8초 이후에 retrun으로 "입금이 모두 처리되었습니다." 라는 문자를 받도록 하세요.
		 */
		
		ake a = new ake();
		a.dk();
		
	}
			
}

class ake {
public void dk() {
		try {
			System.out.println("처리중임 ㄱㄷ");
			Thread.sleep(8000);
			System.out.println(ge());
		} catch (Exception e) {}
	}
	public String ge() {
		return "입금이 모두 처리되었ㅅㅁ";
	}
}