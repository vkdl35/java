import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		
		String ip = "127.0.0.1";
		int port = 8009;
		Scanner sn = null;
		OutputStream os = null;
		InputStream is = null;
		Socket sc = null;
		try {
			sc = new Socket(ip,port);
			System.out.println("���� ���� �Ǿ����ϴ�.");
			for(;;) {	//���������� ���Ͽ� ��� ���� �ǵ��� �ϴ� ����			
				
				os = sc.getOutputStream();
				is = sc.getInputStream();
				sn = new Scanner(System.in);
				System.out.println("�Է��Ͻ� ������ �����ּ���.");
				String msg = "ȫ�浿 : "+sn.nextLine();
				
				os.write(msg.getBytes());
				os.flush();
				
				byte[] data = new byte[1024];
				int n = is.read(data);
				String msg2 = new String(data,0,n);
				System.out.println(msg2);
				
			}
			
			
		}catch (Exception c) {
			if(c.getMessage()!=null) {
				System.out.println("���� ���� ����");
			}
		}finally {	//Ŭ���̾�Ʈ�� ���� ����� �ش� ���� �� ���� Stream, Scanner ��� ����
			try {
				sc.close();
				sn.close();	//���� ����� üũ	
				System.out.println("���� ���� ����");
			}catch (Exception i) {
				
			}
		}
		
		
		
	}

}
