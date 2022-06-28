import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Server
public class chat_server {

	static ServerSocket server_sock = null; // Socket만 클래스안으로!!
	static Scanner sc = null;
	static InputStream is = null;
	static OutputStream os = null;
	static byte[] data = null;
	static String mid = null;

	public static void main(String[] args) {
		int port = 9090;

		try {
			server_sock = new ServerSocket(port);
			sc = new Scanner(System.in);
			System.out.println("서버에서 사용하실 아이디를 입력해주세요.");
			mid = sc.next(); // 서버 담당자 아이디
			System.out.println("대기중.....");
			sc.close();

			while (true) {
				Socket sk = server_sock.accept();
				is = sk.getInputStream();
				os = sk.getOutputStream();
				
				sc = new Scanner(System.in);
				System.out.println("내용을 입력해 주세요.");
				String msg = mid+": "+sc.nextLine();
				os.write(msg.getBytes());
				os.flush();
				
				data = new byte[1024];
				int arr = is.read(data);
				String message = new String(data,0,arr);
				System.out.println(message);
				
				is.close();
				os.close();
				sc.close();

			}

		} catch (Exception e) {

		}
	}

}