import java.net.*;
import java.util.Scanner;
import java.io.*;
public class client2 {
 //소켓 생성
 private Socket cli=null;
 //Writer 클라이언트, 서버
 BufferedWriter bw=null;
 //Reader 클라이언트
 BufferedReader br=null;
 //Reader 서버
 BufferedReader br1=null;
 
 Scanner sc = null;
 
 client2(String ip,int port){
  try {
   //서버 연결
	  this.sc = new Scanner(System.in);
		System.out.println("아이디를 생성하세요.");
		String mid = this.sc.nextLine();
   cli = new Socket(ip,port);
   System.out.println("새로운 채팅방에 입장했습니다." + mid + "님이 입장했습니다.");
   
   InputStream is1 = cli.getInputStream();
   OutputStream os1 =  cli.getOutputStream();
   
   //client
   br = new BufferedReader(new InputStreamReader(System.in));
   //server
   br1 = new BufferedReader(new InputStreamReader(is1));
   bw =  new BufferedWriter(new OutputStreamWriter(os1));
   
   //server 메세지 
   String msg="";
   //client 메세지
   String msg1="";
   
  do{
   //화면단
   //client 메세지 입력
   System.out.print(mid+": ");
   msg1 = br.readLine();
   bw.write(mid+":"+msg1+"\n");
   bw.flush();
   //server 메세지 출력
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