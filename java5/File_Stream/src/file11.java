import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream을 이용한 파일 로드
public class file11 {

	public static void main(String[] args) throws IOException {
		
		try {
			InputStream is = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
			
			//System.out.println(is.available());//available : 파일 전체 크기
			
			//무제한 용량 배열 파일 (파일 크기에 따라서 유동성 있게 변함)
			byte temp[] = new byte[is.available()];	
			int ea = is.read(temp);
			String data = new String(temp,"UTF-8");
			System.out.println(data);
			
			/*	-제약을 걸 때 사용-
			//FileInputStream fs = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");	//위,아래 둘 다 사용 가능한 코드
			byte[] temp = new byte[1000];	//9999byte를 사용한다는 뜻 - byte는 배열처럼 null로 채워지지 않기 때문에 크기가 넓을수록 좋음
			int ea = is.read(temp);	//ASCII 코드로 전체를 읽어서 ea에 받도록 함
			String data = new String(temp,"UTF-8");	//String 문자형태로 배열을 받아서 출력
			System.out.println(data);
			*/
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
