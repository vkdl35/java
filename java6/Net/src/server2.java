
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class server2 {
 
 //��������
 private ServerSocket server=null;
 //Writer Ŭ���̾�Ʈ, ����
 BufferedWriter bw=null;
 //Reader Ŭ���̾�Ʈ
 BufferedReader br=null;
 //Reader ����
 BufferedReader br1=null;
 
 Scanner sc = null;
 
 server2(){
  try {
		// IP �ּ� + ��Ʈ ��ȣ �����ֱ�
		this.sc = new Scanner(System.in);
		System.out.println("���̵� �����ϼ���.");
		String mid = this.sc.nextLine();
//		InetAddress ia = InetAddress.getLocalHost();
		System.out.println("���ο� ä�ù��� �����Ǿ����ϴ�." + mid + "���� �����ϼ̽��ϴ�.");
  
   //��Ʈ ����
   server = new ServerSocket(8019);
   //���� ���
   Socket client = server.accept();
   
   //Ŭ���̾�Ʈ �о� ����
   InputStream is = client.getInputStream();
   //Ŭ���̾�Ʈ �ѷ��ֱ�
   OutputStream os = client.getOutputStream();
   System.out.println("���ο� ä�� ��밡 �����߽��ϴ�.");
   
   //client
   br = new BufferedReader(new InputStreamReader(is));
   //server
   br1 = new BufferedReader(new InputStreamReader(System.in));
   bw = new BufferedWriter(new OutputStreamWriter(os));
   
   //client ���
   String msg="";
   //server �Է�
   String msg1="";
   
   while(true){
    //client �޼��� �о����
    msg = br.readLine();
    
    //ȭ���
    if(msg.equals("exit")){
        System.out.println("ä�� ��밡 �����߽��ϴ�.");
        break;
       }else{
        //client ���
        System.out.println(msg);
        System.out.print(mid+": ");
        //server �޽��� �Է�
        msg1 = br1.readLine();
        bw.write(mid+":"+msg1+"\n");
        bw.flush();
       }
    
   }
   
  } catch (UnknownHostException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }
  try {
   br.close();
   bw.close();
   server.close();
  } catch (IOException e) {
   e.printStackTrace();
  }
  
    
 }//server2 ������ ����
 
 //���� ���� ����
 public static void main(String[] args) {
  new server2();
 }
}