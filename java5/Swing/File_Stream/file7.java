import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
/* 공통 명령어 사항 : read(), readLine(), next(), nextLine() */
//BufferReader (output)
public class file7 {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
			//System.out.println((char)fr.read());
			
			//BufferedReader : Temp(임시저장소) - 효율적으로 파일을 보다 빠르게 가져올 수 있습니다.
			BufferedReader bf = new BufferedReader(fr);
			//bf.close();	//bf를 닫으면 fr도 닫힘.
			//System.out.println(bf.readLine());	//FileReader은 readLine 사용 어려움. 반복문 돌려야 가능.
			//System.out.println(bf.readLine());	//BufferedReader 사용시 readLine으로 해당값을 출력 가능 (한줄씩 출력)
			//해당 임시 저장소에서 저장된 내용 중 한개의 라인으로 로드하게 됩니다.
			
			/* 버퍼는 최초값을 출력하였을 경우 무조건 다음 라인의 값을 출력하게 됩니다. 
			   조건문 사용시에도 한번 작동이 이루어지게 됩니다. */
//			if(bf.readLine() != null) {				
//				int w = 0;
//				while(w <= 0) {
//					String data = bf.readLine();
//					System.out.println(bf.readLine());	//반복문 밖에서 한번 출력하더라도 중복으로 출력되지 않고 다음줄이 출력됨
//					w++;
//				}
//			}
			
			/* 
			 !-BufferedReader를 새로 선언해도 한번 리더한 건 중복으로 출력하지 않음! 1회성이기 때문에 다시 찍으려면 FileReader를 새러 선언해야함-! 
			 !-반복문, 조건문 모두 포함해서 한번 사용하면 출력하지 않더라도 해당 라인의 데이터는 날아감-!
			 */
			
			/* 버퍼는 속도가 빠른대신 사용 부분에 무조건 변수 또는 배열로 받은 후 사용하는 것을 권장합니다. */
			String line = "";
			while((line = bf.readLine()) != null) {
				System.out.println(line);
			}
			
			/* 데이터 문서의 라인 갯수를 확인 - ????????????????????????????????????????????????????? */ 
			FileReader fr2 = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
			LineNumberReader li = new LineNumberReader(fr2);
			int ea = 0;
			while(li.readLine() != null) {
				ea = li.getLineNumber();
			}
			System.out.println(ea);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
