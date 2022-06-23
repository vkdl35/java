import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {

		/*
		 * [숙제] 
		 * 데이터 파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88} - 받을 때 오브젝트로 받으면 1차배열 받을 수 있음 
		 * 해당 데이터값 중 문자값만 출력되도록 재배열하세요. 
		 * 단, 메인에서는 해당 배열을 외부 클래스 (setter) 로 전송합니다.
		 * 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성합니다. 
		 * getter에서 해당 배열을 return으로 보내도록 합니다. 
		 * 단, 외부 클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
		 */

		Object data[] = { "홍길동", 55, "유관순", "강감찬", 48, "이순신", "세종", 34, 88 };
		redata r = new redata();

		try {
			r.setter(data);
			LinkedList<String> result = r.getter(); // 리턴 받는 값이 배열 클래스이기 때문에 해당 클래스명으로 선언 후 받아야 합니다.
			System.out.println(result);	

		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e);
			}
		}

	}

}

class redata {
	LinkedList<String> redata = new LinkedList<>();
	public void setter(Object data[]) throws Exception {
		int ea = data.length;
		int w = 0;

		while (w < ea) {
			try {
				//해당 배열을 로드시 (자료형)변환을 하는 이유는 Object 배열이르모 선언하였음
				String check = String.valueOf((String) data[w]);
				this.redata.add(check);
			} catch (Exception ex) {	//자신 클래스에서 문제 발생시 출력되는 catch문
				//단, throw 사용하면 다시 메인으로 전달됩니다.
				//중요 사항은 throw로 전달시 해당 반복문은 종료하게 됩니다.
				System.out.println(ex);
			}
			w++;
		}
	}

	public LinkedList<String> getter() { 
		//배열 클래스 이름으로 getter를 만들 수 있습니다.
		return this.redata;
	}
}