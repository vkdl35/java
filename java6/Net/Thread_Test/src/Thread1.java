//Thread는 메인 class에서 사용 안함 extends(class), implements(interface)
public class Thread1 {

	public static void main(String[] args) {
		// 순차적으로 처리함
		class_box cb = new class_box();
		for (int a = 0; a < 10; a++) {
			// cb.run("클래스 처리현황"+a);
		}

		// Thread를 이용하여 먼저 처리된 결과순으로 출력됨
		cpu_box cp = null;
		for (int a = 0; a < 10; a++) {
			cp = new cpu_box("스레드 처리현황" + a);
			// cp.start();
		}
		
		/* 스레드를 이용한 강제 예외처리 방식이며, 문제가 발생하더라도 해당 스레드만 예외처리됨, 그 외 사항은 모두 처리하는 예시*/
		call_box bb = null;
		int w = 0;
		String msg = "";
		String msg2 = "";
		while (w < 10) {
			if (w == 5) {
				msg2 = "5";
			} else {
				msg2 = "";
			}
			bb = new call_box(msg + msg2);
			bb.start();

			w++;
		}

	}

}

class cpu_box extends Thread {
	String name = null;

	public cpu_box(String a) {
		this.name = a;
	}

	@Override
	public void run() {
		System.out.println(this.name);
	}
}

class call_box extends Thread {
	String call_name = null;

	public call_box(String a) {
		this.call_name = a;
	}

	@Override
	public void run() {
		try {
			if(this.call_name.length() > 0) {
				Exception ec = new Exception();
				throw ec;
				//throw new Exception();
				}
				 else {			
						System.out.println(this.call_name.length());
					}
		}catch (Exception e) {
			System.out.println("오류");
		}
		
	}
}

class class_box {
	public void run(String name) {
		System.out.println(name);
	}
}