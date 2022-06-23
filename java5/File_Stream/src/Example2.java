import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example2 {

	public static void main(String[] args) throws IOException{
		
		/* 해당 정보는 각 지점별 댐 수위현황을 적용한 데이터입니다.
		 * 해당 데이터 중 100 미만의 수위를 가진 댐만
		 * 20220623.txt 파일로 내용이 저장되도록 하세요. */
		
		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\dam.txt"));
		System.out.println(data);
		List<String> data1;
		
		int w = 0;
		while(w < data.size()) {
			
			w++;
		}
		

	}

}
