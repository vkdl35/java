import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class net6 {
	//Client
	public static void main(String[] args) throws Exception {
		System.out.println("Ŭ���̾�Ʈ");
		String ip = "127.0.0.1";	//���� ȣ��Ʈ
		int port = 8080;
		try {
			Socket sc = new Socket(ip,port);	//������ ����IP, ������ ���� PORT
			System.out.println("���� ���� �Ǿ����ϴ�.");
			String cmsg = "�ȳ��ϼ���.";
			
			/*Client���� Server�� ������ ���*/
			OutputStream os = sc.getOutputStream();
			/*Server���� ������ ���� �޴� ���*/
			
			/*Client���� ������ �޼����� �޸𸮿� ���� �� byte�� ����*/
			InputStream is = sc.getInputStream();
			os.write(cmsg.getBytes());
			os.flush();
			
			/*Server���� ȸ�ŵ� �������� byte �迭�� ���� �� ���*/
			byte data[] = new byte[1024];
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			
			sc.close();
		}catch (Exception e) {
			System.out.println("���� ���� ����");
		}
		
	}

}
