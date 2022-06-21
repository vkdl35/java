import java.io.FileWriter;
import java.io.IOException;

//파일 쓰기 (write)
public class file4 {

	public static void main(String[] args) throws IOException, Exception {
		
		try {
			//FileWriter : 문자 데이터를 파일에 쓰는 class 
			
			String user[] = {"안녕","하세영","반갑","슴니다"};
			//FileReader로 먼저 파일이 있는지 확인 후 FileWriter를 사용하는게 정석
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt",true);
			//FileWriter true를 사용하면 기존 입력된 사항을 초기화하지 않음
			//fw.write("test");
			
			for(int f=0;f<user.length;f++) {
				fw.write(user[f]);	//write : 문자, 배열 데이터 값을 파일에 적용함
			}
			fw.close();	//파일 오픈 사항을 종료하여 적용합니다.
		} 
		catch (Exception z) {
			System.out.println("test");
		}
		

	}

}
