import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner�� �̿��� ���� �ε� ����
public class file5 {

	public static void main(String[] args) throws IOException {
		// System.in : input
		// System.out : output

		try {
			// File fr = new File("C:\\java5\\File_Stream\\src\\db.txt"); //�̰� ���� ��ȯ�� �ȵ�
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\db.txt", Charset.forName("UTF8"));

			// System.in(����ڰ� ���� �Է�), FileReader(������ �ε�)
			Scanner sc = new Scanner(fr);

			// FileReader("C:\\java5\\File_Stream\\src\\db.txt"));

			/*
			 for(int w = 0; w < 3; w++) { 
			 String result = sc.nextLine(); //���� �ε�� �Է°��� result ���� 
			 System.out.println(result); //��� 
			 }
			 */
			
			/*
			for (;;) {	//loop�� ����ó���� ���� �� ����
				String result = sc.nextLine();
				if (result != null) {
					System.out.println(result);
				} else { sc.close(); break; }
			}
			*/
			
			int count = 0;
			while(sc.hasNext()) {	//hasNext() : true, false
				sc.nextLine();
				count++;
			}
			System.out.println(count);
			sc.close();
			fr.close();
			
			/*
			int count = 0;
			String result = "";
			while(true) {
				if((result=sc.nextLine())!= null) {
					sc.nextLine();
					count++;					
				}
				else {
					break;
				}
			}
			System.out.println(count);
			*/
	
		} catch (Exception t) {
			System.out.println(t);
		}

	}

}
