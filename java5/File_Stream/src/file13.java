import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class file13 {

	public static void main(String[] args) throws IOException{
		
		try {
			//createDirectories : �ű� ���丮 ����
			//Files.createDirectories(Paths.get("C:\\java5\\File_Stream\\src\\test"));
			
			/*
			//���� ����
			Path data1 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt");
			Path data2 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db2.txt");
			Files.copy(data1, data2);
			*/
			
			/* �ش� ������ �ٸ� ���丮�� �̵� */
			//Path data3 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db2.txt");
			//Path directory = Paths.get("C:\\java5\\movie_db3.txt");
			//Files.move(data3, directory,StandardCopyOption.REPLACE_EXISTING);
			
			/*�ش� ���� �����*/
			//Path data3 = Paths.get("C:\\java5\\Swing\\src\\swing1\\ty2.jpg");
			//Files.delete(data3);
			
			/*�ش� ���� ����*/
			Path data3 = Paths.get("C:\\java5\\File_Stream\\src\\movie_db3.txt");
			Files.createFile(data3);
		} 
		catch (Exception e) {
			
		}

	}

}
