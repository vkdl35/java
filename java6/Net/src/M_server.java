import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class M_server {

	public static void main(String[] args) {
		
		chatroom cr = new chatroom();
		

	}

}
class chatroom {	//�⺻���� -> �� �����ڸ��� thread�� ����
	ServerSocket server = null;
	static final int port = 9012;	//Thread���� �������� ����ϱ� ����
	Socket sk = null;
	public chatroom() {
		try {
			this.server = new ServerSocket(this.port);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("****��Ƽ ä�� ����****");
		while(true) {
			try {
				this.sk = this.server.accept();	//client ���� �㰡 ��Ʈ
				chat_thread ct = new chat_thread(this.sk);	//accept ���� ����
				Thread t = new Thread(ct);
				t.start();
			} catch (Exception i) {
				System.out.println(i);
			}
		}
	}
}
class chat_thread implements Runnable {
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	Scanner sc = null;
	String message = null;
	String result = null;
	//�迭�� �޸𸮿� ����Ŵ
 	static ArrayList<Socket> user = new ArrayList<>();	//������
	public chat_thread(Socket s) {
		this.sk = s;
		this.user.add(this.sk);
		try {
			System.out.println("ä�ÿ� ���� �ϼ̽��ϴ�.");
			System.out.println(this.sk);
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
		} catch (Exception o) {System.out.println("Ŭ���̾�Ʈ ���� ������ �ùٸ��� �ʽ��ϴ�.");}
	}
	@Override
	public void run() {
		try {
			byte data[] = new byte[1024];
			int n = this.is.read(data);
			this.message = new String(data,0,n);
			System.out.println(this.message);
			while(true) {
				
				this.sc = new Scanner(System.in);
				System.out.println(user.size());
				System.out.println("���� �޼����� �Է��ϼ���.");
				this.result = sc.nextLine();
				
				/* �迭�� �ִ� vport�� ���� ������ ���� ����ŭ �ݺ��� �մϴ�. */
				for (int j=0;j<this.user.size();j++) {
					//�迭�� �ִ� ����� vport�� ������ �ϰ� �˴ϴ�.
					OutputStream all = this.user.get(j).getOutputStream();
					//����� ���� Stream�� ����
					all.write(this.result.getBytes());	//
					all.flush();
				}
						
//					this.os.write(this.result.getBytes());
//					this.os.flush();
				
				/*
				this.os.write(this.message.getBytes()); //ȸ��
				this.os.flush();
				
				String m = "ȯ���մϴ�. �����ο� ä���� ��������.";
				this.os.write(m.getBytes());
				this.os.flush();
				*/
			}
		} catch (Exception z) {System.out.println("Ŭ���̾�Ʈ�� ���� �Ǿ����ϴ�.");}
		finally {
			try {
				this.is.close();
				this.os.close();
				this.sk.close();
			} catch (Exception y) {}
		}
		
	}
}