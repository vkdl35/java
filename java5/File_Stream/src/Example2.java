import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example2 {

	public static void main(String[] args) throws IOException{
		
		/* �ش� ������ �� ������ �� ������Ȳ�� ������ �������Դϴ�.
		 * �ش� ������ �� 100 �̸��� ������ ���� �︸
		 * 20220623.txt ���Ϸ� ������ ����ǵ��� �ϼ���. */
		
		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\dam.txt"));
		System.out.println(data);
		List<String> data1;
		
		int w = 0;
		while(w < data.size()) {
			
			w++;
		}
		

	}

}
