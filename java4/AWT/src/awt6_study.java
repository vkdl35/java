
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
			this.message2 = "���� �Ϸ� �Ǿ����ϴ�.";
		} else {
			this.message2 = "������ȣ�� �ٽ� Ȯ���ϼ���.";
		}
	}

	@Override
	public String getter() {

		return this.message2;
	}

}

