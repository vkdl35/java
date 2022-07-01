import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class file_client {

	public static void main(String[] args) {
		
		f_client sc = new f_client();
		sc.files();
	}

}

class f_client {
	Socket sk = null;
	String ip = "127.0.0.1";
	int port = 8005;
	InputStream is = null;
	OutputStream os = null;
	
	public void files() {
		try {
			this.sk = new Socket(this.ip,this.port);
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			/*첨부파일 byte 배열로 변경함*/
			String url = "C:\\or.jpg";
			//클라이언트에서 보낼 이미지,동영상,음악,문서 등 파일을 보낸 형식
			FileInputStream fs = new FileInputStream(url);
			BufferedInputStream bs = new BufferedInputStream(fs);
			/* 첨부파일 전송 형태*/
			byte img[] = new byte[bs.available()];
			int fordata = 0;
			while((fordata=bs.read(img))!=-1) {
				this.os.write(img,0,fordata);
			}
			
		} catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
	}
}