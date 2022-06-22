import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException {

		/*
		 * [응용문제] 
		 * "검색할 영화 제목을 입력하세요." 
		 * 해당 사용자가 영화 제목을 검색합니다. 
		 * 해당 영화 제목에 맞는 데이터값이 있을 경우 영화 전체에 대한 정보를 출력합니다. 
		 * **Scanner 사용 
		 * 출력 예) 데이터가 있을시 : [사용자 입력 영화제목] - 추천5 , 2022년 6월 개봉 
		 * 데이터가 없을시 : "검색한 영화는 확인되지 않습니다."
		 */

		Scanner sc = new Scanner(System.in);
		List<String> db_data = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt"));
		System.out.println("검색할 영화 제목을 입력하세요.");
		String user = sc.nextLine();
		sc.close();
		
		int w = 0;
		String msg = "";
		boolean ok = false;
		while(w < db_data.size()) {
			if(db_data.get(w).indexOf(user) != -1) {
				System.out.println(db_data.get(w));
				ok = true;
			}
			w++;
		}
		if(ok == false) {
			System.out.println("영화 정보 없음");
		}
		
		
		
		

	}

	

}
