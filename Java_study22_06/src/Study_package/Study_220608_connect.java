package Study_package;

public class Study_220608_connect {

	public static void main(String[] args) {

		blue b = new blue();
		System.out.println(b.box());

	}

	public void abox() {
		System.out.println("test import");
	}

}

class blue {
	private String msg;

	public String box() {
		this.msg = "환영합니다.";
		return this.msg;
	}
}