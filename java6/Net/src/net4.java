import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

//ũ�Ѹ�2
public class net4 {

	public static void main(String[] args) throws Exception {
		
		String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
		URL url = new URL(page);
		/*
		 * Stream�� ����ϸ� read�� ���(byte�̿�), Reader readLine (String)
		 * flush() ������� BufferedOutputStream
		 */
		InputStream is = url.openStream();
		BufferedInputStream bs = new BufferedInputStream(is);	//�迭 byte[]
		byte html[] = new byte[1024];
		FileOutputStream fs = new FileOutputStream("game.html");	//�迭 �� �ε��ؼ� ����
		//BufferedOutputStream os = BufferedOutputStream(new FileOutputStream("game.html"));
		int s = 0;
		while((s=bs.read(html)) != -1) {	//Stream�� read�� byte �迭���� �Է�
			fs.write(html,0,s);
		}
		
		bs.close();
		fs.flush();
		fs.close();
		
		
	}

}
