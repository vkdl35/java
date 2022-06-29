import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class M_client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("접속할 아이디를 입력해주세요.");
		String user = sc.nextLine();
		chatClient cc = new chatClient(user);
		
	}

}
class chatClient {
	static final String ip = "127.0.0.1";
	static final int port = 9012;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	Scanner sc2 = null;
	public chatClient(String mid) {
		try {
			System.out.println(mid+"님 접속하셨습니다.");
			this.sk = new Socket(this.ip,this.port);
			this.os = this.sk.getOutputStream();
			this.is = this.sk.getInputStream();
			this.sc2 = new Scanner(System.in);
			this.os.flush();
			while(true) {
				System.out.println("보낼 메세지를 입력하세요.");
				this.message = mid+": "+sc2.nextLine();
				this.os.write(this.message.getBytes());
				byte[] data = new byte[4096];
				int n = this.is.read(data);
				this.result = new String(data,0,n);
				System.out.println(this.result);
			}
		} catch (Exception q) {System.out.println("서버 접속 장애");}
	}
}