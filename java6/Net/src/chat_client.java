import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {
	final static String ip = "127.0.0.1";
	final static int port = 9090;
	static Scanner sc = null;
	static String myid = null;
	public static void main(String[] args) {
		
		try {
			sc = new Scanner(System.in);
			System.out.println("채팅에 사용할 아이디를 입력해주세요.");
			myid = sc.next();
			sc.close();
			Socket sk = new Socket(ip,port);
			
			while(true) {
				OutputStream os = sk.getOutputStream();
				InputStream is = sk.getInputStream();
				sc = new Scanner(System.in);
				System.out.println("내용을 입력해 주세요.");
				String message = myid + ": "+sc.nextLine();
				
				os.write(message.getBytes());
				os.flush();
				
				byte[] data = new byte[1024];
				int no = is.read(data);
				String msg = new String(data,0,no);
				
				is.close();
				os.close();
			}
			
			
		}catch (Exception i) {
			
		}
		
		
		
	}

}