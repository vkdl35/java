import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//8002
public class chat_client2 {

	public static void main(String[] args) {
		
		port_chat2 pc = new port_chat2();
		pc.connect();

	}

}
class port_chat2 {
	String ip = "127.0.0.1";
	int port = 8002;	//서버에서 오픈한 포트
	InputStream is = null;
	OutputStream os = null;
	String msg = "";
	Socket sc = null;
	public void connect() {
		try {
			this.sc = new Socket(this.ip, this.port);
			this.is = sc.getInputStream();
			this.os = sc.getOutputStream();
			/*서버로 해당 메세지를 전송*/
			this.msg = "클라이언트" + this.port;
			this.os.write(this.msg.getBytes());
			this.os.flush();
			
			Scanner sn = new Scanner(System.in);
			System.out.println("내용입력: ");
			String say = sn.nextLine();
			this.os.write(say.getBytes());
			this.os.flush();
			/*서버로 해당 메세지를 전송 끝*/
			
		} catch (Exception e) {
			
		}
	}
	
}