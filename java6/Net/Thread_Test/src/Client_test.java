import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client_test {

	public static void main(String[] args) {
		
		client_t ct = new client_t();
		ct.data2();

	}

}

class client_t {
	Socket sk = null;
	String ip = null;
	InputStream is = null;
	OutputStream os = null;
	Scanner sc = null;
	int port = 0;
	String port2 = null;
	
	public void data2() {
		try {
			
			data1();
			
			this.sk = new Socket(this.ip,this.port);
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
		} catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
	}
	
	public void data1() {
		try {
			this.sc = new Scanner(System.in);
			System.out.println("������ ������ ��ȣ�� �Է����ּ���.");
			this.ip = this.sc.next();
			System.out.println("������ ��Ʈ ��ȣ�� �Է����ּ���.");
			this.port2 = sc.next();
			this.port = Integer.valueOf(port2);
			
		} catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println("���ڸ� �Է����ּ���.");
			}
		}finally {
			data1();
		}
		
	}
}