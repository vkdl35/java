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
		 * [���빮��] 
		 * "�˻��� ��ȭ ������ �Է��ϼ���." 
		 * �ش� ����ڰ� ��ȭ ������ �˻��մϴ�. 
		 * �ش� ��ȭ ���� �´� �����Ͱ��� ���� ��� ��ȭ ��ü�� ���� ������ ����մϴ�. 
		 * **Scanner ��� 
		 * ��� ��) �����Ͱ� ������ : [����� �Է� ��ȭ����] - ��õ5 , 2022�� 6�� ���� 
		 * �����Ͱ� ������ : "�˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�."
		 */

		Scanner sc = new Scanner(System.in);
		List<String> db_data = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\movie_db.txt"));
		System.out.println("�˻��� ��ȭ ������ �Է��ϼ���.");
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
			System.out.println("��ȭ ���� ����");
		}
		
		
		
		

	}

	

}
