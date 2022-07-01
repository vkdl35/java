import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_test {

	public static void main(String[] args) {
		
		server_f sf = new server_f();
		sf.data();

	}

}

class server_f {
	ServerSocket ss = null;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	Scanner sc = null;
	int port = 0;
	String port2 = null;
	public void data() {
		try {
			data1();
			this.ss = new ServerSocket(this.port);
			System.out.println("****채팅서버 오픈["+this.port+"]****");
			this.sk = this.ss.accept();
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void data1() {
		try {
			this.sc = new Scanner(System.in);
			System.out.println("접속할 포트 번호를 입력해주세요.");
			this.port2 = sc.next();
			this.port = Integer.valueOf(port2);
			
		} catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
		
	}
	
		
}