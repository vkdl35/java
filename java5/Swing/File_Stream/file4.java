import java.io.FileWriter;
import java.io.IOException;

//���� ���� (write)
public class file4 {

	public static void main(String[] args) throws IOException, Exception {
		
		try {
			//FileWriter : ���� �����͸� ���Ͽ� ���� class 
			
			String user[] = {"�ȳ�","�ϼ���","�ݰ�","���ϴ�"};
			//FileReader�� ���� ������ �ִ��� Ȯ�� �� FileWriter�� ����ϴ°� ����
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt",true);
			//FileWriter true�� ����ϸ� ���� �Էµ� ������ �ʱ�ȭ���� ����
			//fw.write("test");
			
			for(int f=0;f<user.length;f++) {
				fw.write(user[f]);	//write : ����, �迭 ������ ���� ���Ͽ� ������
			}
			fw.close();	//���� ���� ������ �����Ͽ� �����մϴ�.
		} 
		catch (Exception z) {
			System.out.println("test");
		}
		

	}

}
