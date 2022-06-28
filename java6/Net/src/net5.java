import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Socket��� : Server, Client : �޼���, ���� ���� �ۼ��� ��� (�����)
//HTTP��� : Image, ������, ���� �����(��û)�� ����(����)�� �ۼ��� ��� (�ܹ���)
public class net5 {
	//Server
	public static void main(String[] args) {
		System.out.println("Server Connect");
		int port = 8080;	//������ ��Ʈ ��ȣ�� ������ (��, ���� �ߺ��� ��Ʈ�� ����ϸ� �ȵ�)
		//String msg = "Success Connect";
		
		try {
			while (true) {
			ServerSocket ss = new ServerSocket(port); // ServerSocket() : ���½�ų ��Ʈ�� ����
			
			System.out.println("���� �����...");
			Socket sc = ss.accept(); // accept() : Ŭ���̾�Ʈ�� ������ ���� ����ϴ� ����
			System.out.println("ȣ��Ʈ:��� ���� ����");
			
			/*Server���� Client�� �޴� ���*/
			InputStream is = sc.getInputStream();	//Client���� ������ ���� �о����
			/*Client�� ������ ���*/
			OutputStream os = sc.getOutputStream();	//Client�� ���� ����
			
			byte data[] = new byte[1024];	//Client���� �޴� ���� byte�� ����
			int n = is.read(data);	//�ش� ���� �о����
			String msgclient = new String(data,0,n);	//�ش簪�� �迭�� Ȯ���Ͽ� ������ �̰�
			System.out.println(msgclient);	//�̰��� ���� ���
			
			String aws = "�ݰ����ϴ�.";		//�������� ������ �޼���
			os.write(aws.getBytes());	//Ŭ���̾�Ʈ�� ������ ���� �޸� ����
			os.flush();
			ss.close();
			}
		} catch (Exception e) {
			System.out.println("���� ���� ��Ʈ�� �ߺ��Ǿ� ������ ���� �����մϴ�.");
		}
		
		
		

	}

}
/*
 * cmd
 * cd \
 * cd jdk -> tab
 * cd jdk - 17.0.3.1 -> ����
 * cd bin
 * java "C:\java6\Net\src\net6.java"
 */
 //ctrl + c : Ŀ��Ʈ ����