
public class Exception6 {

	public static void main(String[] args) {

		/*
		 * [응용문제] 사용자가 45 * 3 + 16 + 5 + 22 * 8 해당 연산값의 최종값을 외부 클래스로 전송합니다. 해당 외부 클래스에서는
		 * 해당 값이 짝수일 경우 예외 오류를 발생하고, 홀수일 경우 홀수값입니다. 로 다시 회신 되도록 합니다. 짝수일 경우
		 * "예외처리 발생으로 재확인이 필요합니다." 출력
		 */
		
		/*
		 * [숙제]
		 * 데이터 파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88} - 받을 때 오브젝트로 받으면 1차배열 받을 수 있음
		 * 해당 데이터값 중 문자값만 출력되도록 재배열하세요.
		 * 단, 메인에서는 해당 배열을 외부 클래스 (setter) 로 전송합니다.
		 * 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성합니다.
		 * getter에서 해당 배열을 return으로 보내도록 합니다.
		 * 단, 외부 클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
		 */

		ak a = new ak();
		int total = 45 * 3 + 16 + 5 + 22 * 8;
		// System.out.println(total);

		try {
			String result = a.a1(total);
			System.out.println(result);
		} catch (Exception g) {
			if (g.getMessage() != null) {
				System.out.println(g);
			}
		}

	}

}

class ak {
	public String a1(int a) throws Exception {
		String msg = "";
		if (a % 2 == 0) {
			throw new Exception("예외처리 발생으로 재확인이 필요합니다.");
		} else {
			msg = "홀수값입니다.";
		}
		return msg;
	}
}