import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

//crawling ���
public class net3 {

	public static void main(String[] args) throws Exception {
		String url = "https://webmail.lh.or.kr/login";
		URL urls = new URL(url);
		URLConnection con = urls.openConnection();
		int size = con.getContentLength();
		System.out.println(urls.getProtocol());	//�������� http, https
		System.out.println(urls.getPort());	//��Ʈ��ȣ
		System.out.println(urls.getFile());	//���� ���ϸ�
		InputStream is = urls.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		byte html[] = new byte[1024];
		FileOutputStream fs = new FileOutputStream("login.html");
		String str = "";
		while((str=br.readLine())!=null) {
			System.out.println(str);
			//fs.write(html,0,size);
		}
		br.close();
		fs.flush();
		fs.close();

	}

}
