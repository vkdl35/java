
public class Method6 {

	public static void main(String[] args) {
		// private에 대한 객체 선언 형태2

		insert i = new insert();
		i.userid = "hong";
		String skey = "a12345678";
		String result = i.checks(skey);
		System.out.println(result);

	}

}

class insert {
	String userid = null;
	private String key = "a1234567";	//해당 클래스에서 적용되는 key값

	public String checks(String bb) {
		String msg = null;
		if (key.equals("a1234567")) {	//해당 키값(private)과 외부 클래스에서 넘어오는 인수값과 비교 
			if (userid.equals("hong")) {	//아이디 확인
				msg = "데이터를 확인 중에 있습니다.";
			} else {
				msg = "해당 데이터값을 확인하지 못합니다.";
			}
		} else {	//외부 클래스에서 올바른 키값이 전달되지 않을 경우
			msg = "error";
		}
		return msg;	//최종 결과에 대한 return으로 회신
	}
}
