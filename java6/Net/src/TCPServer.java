import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
 
public class TCPServer {
 
    public static final int PORT = 8080;
 
    public static void main(String[] args) {
 
        ServerSocket serverSocket = null;
 
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
 
        OutputStream os = null;
        OutputStreamWriter osw = null;
        PrintWriter pw = null;
        Scanner sc = new Scanner(System.in);
 
        try {
            // 1. Server Socket ����
            serverSocket = new ServerSocket();
 
            // 2. Binding : Socket�� SocketAddress(IpAddress + Port) ���ε� ��
 
            InetAddress inetAddress = InetAddress.getLocalHost();
            String localhost = inetAddress.getHostAddress();
 
            serverSocket.bind(new InetSocketAddress(localhost, PORT));
 
            System.out.println("[server] binding " + localhost);
 
            // 3. accept(Ŭ���̾�Ʈ�� ���� �����û�� ��ٸ�)
 
            Socket socket = serverSocket.accept();
            InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
 
            System.out.println("[server] connected by client");
            System.out.println("[server] Connect with " + socketAddress.getHostString() + " " + socket.getPort());
 
            while (true) {
 
                // inputStream �����ͼ� (�� ��Ʈ��) StreamReader�� BufferedReader�� �����ش� (���� ��Ʈ��)
                is = socket.getInputStream();
                isr = new InputStreamReader(is, "UTF-8");
                br = new BufferedReader(isr);
 
                // outputStream �����ͼ� (�� ��Ʈ��) StreamWriter�� PrintWriter�� �����ش� (���� ��Ʈ��)
                os = socket.getOutputStream();
                osw = new OutputStreamWriter(os, "UTF-8");
                pw = new PrintWriter(osw, true);
 
                String buffer = null;
                buffer = br.readLine(); // Blocking
                if (buffer == null) {
 
                    // �������� : remote socket close()
                    // �޼ҵ带 ���ؼ� ���������� ������ ���� ���
                    System.out.println("[server] closed by client");
                    break;
 
                }
 
                System.out.println("[server] recived : " + buffer);
                pw.println(buffer);
 
            }
 
            // 3.accept(Ŭ���̾�Ʈ�� ���� �����û�� ��ٸ�)
            // .. blocking �Ǹ鼭 ��ٸ�����, connect�� ������ block�� Ǯ��
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
 
            try {
 
                if (serverSocket != null && !serverSocket.isClosed())
                    serverSocket.close();
 
            } catch (Exception e) {
                e.printStackTrace();
            }
 
            sc.close();
 
        }
 
    }
 
}
