import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//OutputStream (output)
//(하위) FileOutputStream, ObjectOutputStream, 
public class file10 {

	public static void main(String[] args) {
		
		//String a = "홍길동";	//문자
		String a = "123456789";
		//byte[] : 문자열을 ASCII키 형태의 배열로 변경
		byte[] b = a.getBytes();	//getBytes("언어패킷") 메소드
		System.out.println(Arrays.toString(b));	//아스키코드 배열 출력
		OutputStream os = System.out;	//출력만 사용 System.out.print 역할
		
		try {
			os.write(b,0,b.length);	//(Byte배열이름,배열번호,배열크기)
			os.flush();	//출력파트
		}
		catch (Exception z) {
			
		}
		
		
	}

}
