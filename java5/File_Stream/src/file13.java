import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class file13 {

	public static void main(String[] args) throws IOException{
		
		try {
			//createDirectories : 신규 디렉토리 생성
			//Files.createDirectories(Paths.get("C:\\java5\\File_Stream\\src\\test"));
			
			/*
			//파일 복사
			Path data1 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt");
			Path data2 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db2.txt");
			Files.copy(data1, data2);
			*/
			
			/* 해당 파일을 다른 디렉토리로 이동 */
			//Path data3 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db2.txt");
			//Path directory = Paths.get("C:\\java5\\movie_db3.txt");
			//Files.move(data3, directory,StandardCopyOption.REPLACE_EXISTING);
			
			/*해당 파일 지우기*/
			//Path data3 = Paths.get("C:\\java5\\Swing\\src\\swing1\\ty2.jpg");
			//Files.delete(data3);
			
			/*해당 파일 생성*/
			Path data3 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db3.txt");
			Files.createFile(data3);
		} 
		catch (Exception e) {
			
		}

	}

}
