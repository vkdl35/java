//Thread�� ���� class���� ��� ���� extends(class), implements(interface)
public class Thread1 {

	public static void main(String[] args) {
		// ���������� ó����
		class_box cb = new class_box();
		for (int a = 0; a < 10; a++) {
			// cb.run("Ŭ���� ó����Ȳ"+a);
		}

		// Thread�� �̿��Ͽ� ���� ó���� ��������� ��µ�
		cpu_box cp = null;
		for (int a = 0; a < 10; a++) {
			cp = new cpu_box("������ ó����Ȳ" + a);
			// cp.start();
		}
		
		/* �����带 �̿��� ���� ����ó�� ����̸�, ������ �߻��ϴ��� �ش� �����常 ����ó����, �� �� ������ ��� ó���ϴ� ����*/
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
			System.out.println("����");
		}
		
	}
}

class class_box {
	public void run(String name) {
		System.out.println(name);
	}
}