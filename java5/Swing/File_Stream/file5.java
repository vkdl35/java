import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner를 이용한 파일 로드 사용법
public class file5 {

	public static void main(String[] args) throws IOException {
		// System.in : input
		// System.out : output

		try {
			// File fr = new File("C:\\java5\\File_Stream\\src\\db.txt"); //이거 쓰면 언어변환이 안됨
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\db.txt", Charset.forName("UTF8"));

			// System.in(사용자가 직접 입력), FileReader(파일을 로드)
			Scanner sc = new Scanner(fr);

			// FileReader("C:\\java5\\File_Stream\\src\\db.txt"));

			/*
			 for(int w = 0; w < 3; w++) { 
			 String result = sc.nextLine(); //파일 로드된 입력값을 result 전달 
			 System.out.println(result); //출력 
			 }
			 */
			
			/*
			for (;;) {	//loop시 예외처리로 빠질 수 있음
				String result = sc.nextLine();
				if (result != null) {
					System.out.println(result);
				} else { sc.close(); break; }
			}
			*/
			
			int count = 0;
			while(sc.hasNext()) {	//hasNext() : true, false
				sc.nextLine();
				count++;
			}
			System.out.println(count);
			sc.close();
			fr.close();
			
			/*
			int count = 0;
			String result = "";
			while(true) {
				if((result=sc.nextLine())!= null) {
					sc.nextLine();
					count++;					
				}
				else {
					break;
				}
			}
			System.out.println(count);
			*/
	
		} catch (Exception t) {
			System.out.println(t);
		}

	}

}
