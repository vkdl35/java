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
			System.out.println("ä�ÿ� ����� ���̵� �Է����ּ���.");
			myid = sc.next();
			sc.close();
			Socket sk = new Socket(ip,port);
			
			while(true) {
				OutputStream os = sk.getOutputStream();
				InputStream is = sk.getInputStream();
				sc = new Scanner(System.in);
				System.out.println("������ �Է��� �ּ���.");
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