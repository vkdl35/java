import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//server�� �������� ��Ʈ�� ���� 8001,8002
//Exception : bind Exception (PORT ����)
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
			Socket s = this.sk.accept();	//�ش� port ��� ����
			
			this.is = s.getInputStream();
			this.os = s.getOutputStream();
			System.out.println("���� ����");
			
			/*Ŭ���̾�Ʈ���� �޴� �޼���*/
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