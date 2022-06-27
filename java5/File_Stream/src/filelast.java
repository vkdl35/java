import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * InputStream > InputStreamReader > BufferedReader (o)
 * InputStream > BufferedReader (x)
 * InputStream > BufferedInputStream (o)
 * InputStreamReader > BufferedReader (o)
 * 
 * BufferedReader - close() �޸� ����, BufferedWreiter - flush() �޸� �ʱ�ȭ
 */
public class filelast {

	public static void main(String[] args) throws IOException {
		try {			
			String url = "src\\movie_db.txt";
			FileInputStream fs = new FileInputStream(url);
			//BufferedInputStream bs = new BufferedInputStream(fs);
			//byte a[] = new byte[400];
			InputStreamReader ir = new InputStreamReader(fs,"UTF8");
			BufferedReader br = new BufferedReader(ir);
			System.out.println(br.readLine());
			br.close();
		}catch (Exception e) {
			
		}

	}

}
