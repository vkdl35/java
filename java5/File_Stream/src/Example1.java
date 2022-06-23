import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException {

		/*
		 * [응용문제] "검색할 영화 제목을 입력하세요." 해당 사용자가 영화 제목을 검색합니다. 해당 영화 제목에 맞는 데이터값이 있을 경우 영화
		 * 전체에 대한 정보를 출력합니다. **Scanner 사용 출력 예) 데이터가 있을시 : [사용자 입력 영화제목] - 추천5 , 2022년
		 * 6월 개봉 데이터가 없을시 : "검색한 영화는 확인되지 않습니다."
		 */

		try {
			// 파일 로드 및 메소드 전달
			Scanner sc = new Scanner(System.in);
			System.out.println("1.개봉작 2.개봉예정작 : ");
			int user = sc.nextInt();
			if (user == 1) {
				movie m = new movie("movie_db.txt");
			} else if (user == 2) {
				System.out.println("서비스 준비 중입니다.");
				sc.close();
			}
		} catch (Exception e) {

		}

		/*
		 * Scanner sc = new Scanner(System.in); List<String> db_data =
		 * Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt"));
		 * System.out.println("검색할 영화 제목을 입력하세요."); String user = sc.nextLine();
		 * sc.close();
		 * 
		 * int w = 0; boolean ok = false; while(w < db_data.size()) {
		 * if(db_data.get(w).indexOf(user) != -1) { System.out.println(db_data.get(w));
		 * ok = true; } w++; } if(ok == false) { System.out.println("영화 정보 없음"); }
		 */

	}

}

class movie {
	private String path = "C:\\java5\\File_Stream\\src\\";
	private BufferedReader bf = null;
	private FileReader fr = null;
	private ArrayList<String> list = null;
	private Scanner sc = null;

	public movie(String filename) throws IOException {
		try {
			this.fr = new FileReader(this.path + filename, Charset.forName("UTF8"));
			this.coustom();
			this.fr.close();
			this.search();
		} catch (Exception i) {
			if (i.getMessage() != null) {
				System.out.println(i);
			}
		}
	}

	public void coustom() throws IOException {
		this.bf = new BufferedReader(this.fr);
		this.list = new ArrayList<>();
		String datas = this.bf.readLine(); // datas를 null로 넣으면 초기값에 무조건 null이 들어가기 때문에 선언할 때부터 readLine을 넣어줘야함
		do {
			this.list.add(datas);
		} while ((datas = this.bf.readLine()) != null);

	}

	public void search() {
		this.sc = new Scanner(System.in);
		System.out.println("검색할 영화 제목을 입력해 주세요.");
		String subject = this.sc.nextLine().intern();
		boolean call = false;
		if (subject == "종료") {
			sc.close();
			System.exit(0);
		}
		for (String moviesb : this.list) {
			if (moviesb.contains(subject)) {
				System.out.println(moviesb);
				call = true;
			}
		}
		if (call == false) {
			System.out.println("데이터를 확인할 수 없습니다.");
		}
		//sc.close();
		this.search();

	}
}
