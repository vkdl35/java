import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//bufferedwriter
//Buffered : read, writer 단독으로 사용 하진 않음
public class file17 {

	public static void main(String[] args) throws IOException {
		
		try {
			OutputStreamWriter os = new OutputStreamWriter(System.out);
			BufferedWriter bw = new BufferedWriter(os);		
			bw.write("홍길동입니다.");
			bw.close();
			System.out.println(bw);
			
			/*	//버퍼만 단독으로 사용할 수 없음
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			//BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String test = br.readLine();
			System.out.println(test);
			*/
			
		} catch (Exception e) {
		}

	}

}
