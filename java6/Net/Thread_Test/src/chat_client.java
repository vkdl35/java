import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//8001
public class chat_client {

	public static void main(String[] args) {
		
		/*
		 * client 8001 �Ǵ� 8002�� ����
		 * client ��� 9003 ����
		 */
		
		port_chat pc = new port_chat();
		pc.connect();
		
		
	}

}

class port_chat {
	String ip = "127.0.0.1";
	int port = 8001;	//�������� ������ ��Ʈ
	InputStream is = null;
	OutputStream os = null;
	String msg = "";
	Socket sc = null;
	public void connect() {
		try {
			this.sc = new Socket(this.ip, this.port);
			this.is = sc.getInputStream();
			this.os = sc.getOutputStream();
			/*������ �ش� �޼����� ����*/
			this.msg = "Ŭ���̾�Ʈ" + this.port;
			this.os.write(this.msg.getBytes());
			this.os.flush();
			
			Scanner sn = new Scanner(System.in);
			System.out.println("�����Է�: ");
			String say = sn.nextLine();
			this.os.write(say.getBytes());
			this.os.flush();
			/*������ �ش� �޼����� ���� ��*/
			
		} catch (Exception e) {
			
		}
	}
	
}