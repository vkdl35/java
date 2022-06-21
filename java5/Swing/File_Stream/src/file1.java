import java.io.FileReader;
import java.io.IOException;

public class file1 {
	/*
	  I/O : inputStream, OutputStream
	  입력 스트림 : 프로그램으로 들어오는 스트림 (inputStream : 키보드, 마우스, HDD)
	  출력 스트림 : 프로그램에서 밖으로 나가는 부분 (outputStream : 모니터, HDD, 프린터)
	  Stream : input, output 사용자 처리
	  JAVA.io (API) 
	  File, FileReader (일반) -> StremeAPI (FileinputStream)
	  FileWriter, StremeAPI (FileOutputStream)
	 */
	public static void main(String[] args) throws Exception,IOException {
		/*
		 FileReader 
		 1. 문자 데이터를 파일로부터 읽는 클래스
		 2. 파일 이름을 생성자 인수값(파라미터)으로 사용해서 FileReader 객체를 생성합니다.
		 */
		try {			
			FileReader fr = new FileReader("C:\\java5\\File_String\\src\\list.txt");	
			//파일을 넘겨주는 게 아니라서 throw 필요 없음
			String a = "a1";
			tests(a);
			
		}
		catch (IOException z) {	//IOException에 대한 예외처리
			System.out.println(z.getMessage());
		}
		catch (Exception z1) {	//일반 Exception에 대한 예외처리 방식
			System.out.println(z1.getMessage());
		}

	}
	static public void tests(String data) throws IOException,Exception {	
		//main에 IOException을 사용했으면 아래 메소드에도 IOException를 사용해야함
		//일반 Exception 사용시 아래 IOException을 사용하는 건 가능
		int k = Integer.parseInt(data);
		IOException ex = new IOException();
		//마찬가지로 IOException 메소드 안에는 IOException만 사용 가능함
		throw ex;
		
	};
	

}
