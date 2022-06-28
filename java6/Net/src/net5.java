import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Socket통신 : Server, Client : 메세지, 파일 전달 송수신 통신 (양방향)
//HTTP통신 : Image, 동영상, 음악 사용자(요청)랑 서버(응답)랑 송수신 통신 (단방향)
public class net5 {
	//Server
	public static void main(String[] args) {
		System.out.println("Server Connect");
		int port = 8080;	//오플할 포트 번호를 셋팅함 (단, 절대 중복된 포트를 사용하면 안됨)
		//String msg = "Success Connect";
		
		try {
			while (true) {
			ServerSocket ss = new ServerSocket(port); // ServerSocket() : 오픈시킬 포트를 적용
			
			System.out.println("연결 대기중...");
			Socket sc = ss.accept(); // accept() : 클라이언트가 들어오는 것을 대기하는 역할
			System.out.println("호스트:통신 연결 성공");
			
			/*Server에서 Client로 받는 통로*/
			InputStream is = sc.getInputStream();	//Client에서 보내는 값을 읽어들임
			/*Client로 보내는 통로*/
			OutputStream os = sc.getOutputStream();	//Client로 값을 전송
			
			byte data[] = new byte[1024];	//Client에서 받는 값을 byte로 받음
			int n = is.read(data);	//해당 값을 읽어들임
			String msgclient = new String(data,0,n);	//해당값을 배열로 확인하여 변수로 이관
			System.out.println(msgclient);	//이관된 값을 출력
			
			String aws = "반갑습니다.";		//서버에서 보내는 메세지
			os.write(aws.getBytes());	//클라이언트로 보내기 위한 메모리 저장
			os.flush();
			ss.close();
			}
		} catch (Exception e) {
			System.out.println("현재 서버 포트가 중복되어 서버를 강제 종료합니다.");
		}
		
		
		

	}

}
/*
 * cmd
 * cd \
 * cd jdk -> tab
 * cd jdk - 17.0.3.1 -> 엔터
 * cd bin
 * java "C:\java6\Net\src\net6.java"
 */
 //ctrl + c : 커넥트 종료