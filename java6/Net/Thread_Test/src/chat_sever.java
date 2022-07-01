import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//server에 여러개의 포트를 오픈 8001,8002
//Exception : bind Exception (PORT 종료)
public class chat_sever {

	public static void main(String[] args) {
		
		int port[] = {8001,8002};
		int ea = port.length;
		int w = 0;
		openchat oc = null;
		while(w < ea) {
			oc = new openchat(port[w]);
			oc.start();
			w++;
		}

	}

}
class openchat extends Thread {
	String ip = "127.0.0.1";
	int pt = 0;
	ServerSocket sk = null;
	InputStream is = null;
	OutputStream os = null;
	
	public openchat(int p) {
		this.pt = p;
	}
	
	@Override
	public void run() {
		try {
			this.sk = new ServerSocket(this.pt);
			Socket s = this.sk.accept();	//해당 port 모두 오픈
			
			this.is = s.getInputStream();
			this.os = s.getOutputStream();
			System.out.println("서버 오픈");
			
			/*클라이언트에서 받는 메세지*/
			byte[] data = new byte[1024];
			int n = is.read();
			String message = new String(data,0,n);
			System.out.println(message);
			//Scanner sc = new Scanner(System.in);  
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}