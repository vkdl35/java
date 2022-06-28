import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server1 {

	public static void main(String[] args) {
		
		int port = 9090;
		ServerSocket ss = null;
		Socket sc = null;
		Scanner sn = null;
		InputStream is = null; 
		OutputStream os = null;
		String msg = null;
		String msg2 = null;
		
		try {
			
			ss = new ServerSocket(port);
			System.out.println("대기중...");
			System.out.println("서버에서 사용하실 아이디를 입력해주세요.");
			sn = new Scanner(System.in);
			String user = sn.nextLine();
			sc = ss.accept();
			for(;;) {
				
				is = sc.getInputStream();
				os = sc.getOutputStream();
				byte[]data = new byte[1024];
				int n = is.read(data);
				msg2 = new String(data,0,n);
				System.out.println(msg2);
				
				System.out.println("내용을 입력해주세요.");
				msg = user+"님 : "+sn.nextLine();
				os.write(msg.getBytes());
				os.flush();
				
				
				if (msg2.equals("exit")) {

					

				} else if (msg.equals("exit")) {

					

				}
			}
			
			

			
		}catch (Exception e) {
			System.out.println("대화방 쫑났음");
		}

	}

}
