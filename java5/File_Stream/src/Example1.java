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
		 * [���빮��] "�˻��� ��ȭ ������ �Է��ϼ���." �ش� ����ڰ� ��ȭ ������ �˻��մϴ�. �ش� ��ȭ ���� �´� �����Ͱ��� ���� ��� ��ȭ
		 * ��ü�� ���� ������ ����մϴ�. **Scanner ��� ��� ��) �����Ͱ� ������ : [����� �Է� ��ȭ����] - ��õ5 , 2022��
		 * 6�� ���� �����Ͱ� ������ : "�˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�."
		 */

		try {
			// ���� �ε� �� �޼ҵ� ����
			Scanner sc = new Scanner(System.in);
			System.out.println("1.������ 2.���������� : ");
			int user = sc.nextInt();
			if (user == 1) {
				movie m = new movie("movie_db.txt");
			} else if (user == 2) {
				System.out.println("���� �غ� ���Դϴ�.");
				sc.close();
			}
		} catch (Exception e) {

		}

		/*
		 * Scanner sc = new Scanner(System.in); List<String> db_data =
		 * Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt"));
		 * System.out.println("�˻��� ��ȭ ������ �Է��ϼ���."); String user = sc.nextLine();
		 * sc.close();
		 * 
		 * int w = 0; boolean ok = false; while(w < db_data.size()) {
		 * if(db_data.get(w).indexOf(user) != -1) { System.out.println(db_data.get(w));
		 * ok = true; } w++; } if(ok == false) { System.out.println("��ȭ ���� ����"); }
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
		String datas = this.bf.readLine(); // datas�� null�� ������ �ʱⰪ�� ������ null�� ���� ������ ������ ������ readLine�� �־������
		do {
			this.list.add(datas);
		} while ((datas = this.bf.readLine()) != null);

	}

	public void search() {
		this.sc = new Scanner(System.in);
		System.out.println("�˻��� ��ȭ ������ �Է��� �ּ���.");
		String subject = this.sc.nextLine().intern();
		boolean call = false;
		if (subject == "����") {
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
			System.out.println("�����͸� Ȯ���� �� �����ϴ�.");
		}
		//sc.close();
		this.search();

	}
}
