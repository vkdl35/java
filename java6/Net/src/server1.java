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
			System.out.println("�����...");
			System.out.println("�������� ����Ͻ� ���̵� �Է����ּ���.");
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
				
				System.out.println("������ �Է����ּ���.");
				msg = user+"�� : "+sn.nextLine();
				os.write(msg.getBytes());
				os.flush();
				
				
				if (msg2.equals("exit")) {

					

				} else if (msg.equals("exit")) {

					

				}
			}
			
			

			
		}catch (Exception e) {
			System.out.println("��ȭ�� �г���");
		}

	}

}
