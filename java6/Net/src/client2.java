import java.net.*;
import java.util.Scanner;
import java.io.*;
public class client2 {
 //���� ����
 private Socket cli=null;
 //Writer Ŭ���̾�Ʈ, ����
 BufferedWriter bw=null;
 //Reader Ŭ���̾�Ʈ
 BufferedReader br=null;
 //Reader ����
 BufferedReader br1=null;
 
 Scanner sc = null;
 
 client2(String ip,int port){
  try {
   //���� ����
	  this.sc = new Scanner(System.in);
		System.out.println("���̵� �����ϼ���.");
		String mid = this.sc.nextLine();
   cli = new Socket(ip,port);
   System.out.println("���ο� ä�ù濡 �����߽��ϴ�." + mid + "���� �����߽��ϴ�.");
   
   InputStream is1 = cli.getInputStream();
   OutputStream os1 =  cli.getOutputStream();
   
   //client
   br = new BufferedReader(new InputStreamReader(System.in));
   //server
   br1 = new BufferedReader(new InputStreamReader(is1));
   bw =  new BufferedWriter(new OutputStreamWriter(os1));
   
   //server �޼��� 
   String msg="";
   //client �޼���
   String msg1="";
   
  do{
   //ȭ���
   //client �޼��� �Է�
   System.out.print(mid+": ");
   msg1 = br.readLine();
   bw.write(mid+":"+msg1+"\n");
   bw.flush();
   //server �޼��� ���
   msg=br1.readLine();
   System.out.println(msg);
    
   }while(!(msg1.equals("exit")));
   
  } catch (UnknownHostException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }
  
  try {
   bw.close();
   br.close();
   cli.close();
  } catch (IOException e) {
   e.printStackTrace();
   
   
  }
 }
 
 public static void main(String args[]){
  new client2("127.0.0.1", 8019);
 }
 
}