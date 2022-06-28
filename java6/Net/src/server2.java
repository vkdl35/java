
import java.io.*;
import java.net.*;
public class server2 {
 
 //��������
 private ServerSocket server=null;
 //Writer Ŭ���̾�Ʈ, ����
 BufferedWriter bw=null;
 //Reader Ŭ���̾�Ʈ
 BufferedReader br=null;
 //Reader ����
 BufferedReader br1=null;
 
 server2(){
  try {
   //IP �ּ� + ��Ʈ ��ȣ �����ֱ�
   InetAddress ia= InetAddress.getLocalHost();
   System.out.println("IP : "+ia+"�� ���� �Ǿ����ϴ�.");
  
   //��Ʈ ����
   server = new ServerSocket(8080);
   //���� ���
   Socket client = server.accept();
   
   //Ŭ���̾�Ʈ �о� ����
   InputStream is = client.getInputStream();
   //Ŭ���̾�Ʈ �ѷ��ֱ�
   OutputStream os = client.getOutputStream();
   System.out.println("client�� �����");
   
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
     System.out.println("��������");
     break;
    }else{
     //client ���
     System.out.println("client �� : "+msg);
     System.out.print(ia+" ���� �� : ");
     //server �޽��� �Է�
     msg1 = br1.readLine();
     bw.write(msg1+"\n");
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