
public class awt6_study {

	public static void main(String[] args) {

		handel2 hd2 = new handel2();
		hd2.design2();
	}

}

class handel2 extends awt6_abstract_study {
	String message2 = "";

	@Override
	public void setter(String userno) {

		if (userno.equals(pc)) {
			this.message2 = "인증 완료 되었습니다.";
		} else {
			this.message2 = "인증번호를 다시 확인하세요.";
		}
	}

	@Override
	public String getter() {

		return this.message2;
	}

}

