import java.io.FileReader;
import java.io.IOException;

public class file1 {
	/*
	  I/O : inputStream, OutputStream
	  �Է� ��Ʈ�� : ���α׷����� ������ ��Ʈ�� (inputStream : Ű����, ���콺, HDD)
	  ��� ��Ʈ�� : ���α׷����� ������ ������ �κ� (outputStream : �����, HDD, ������)
	  Stream : input, output ����� ó��
	  JAVA.io (API) 
	  File, FileReader (�Ϲ�) -> StremeAPI (FileinputStream)
	  FileWriter, StremeAPI (FileOutputStream)
	 */
	public static void main(String[] args) throws Exception,IOException {
		/*
		 FileReader 
		 1. ���� �����͸� ���Ϸκ��� �д� Ŭ����
		 2. ���� �̸��� ������ �μ���(�Ķ����)���� ����ؼ� FileReader ��ü�� �����մϴ�.
		 */
		try {			
			FileReader fr = new FileReader("C:\\java5\\File_String\\src\\list.txt");	
			//������ �Ѱ��ִ� �� �ƴ϶� throw �ʿ� ����
			String a = "a1";
			tests(a);
			
		}
		catch (IOException z) {	//IOException�� ���� ����ó��
			System.out.println(z.getMessage());
		}
		catch (Exception z1) {	//�Ϲ� Exception�� ���� ����ó�� ���
			System.out.println(z1.getMessage());
		}

	}
	static public void tests(String data) throws IOException,Exception {	
		//main�� IOException�� ��������� �Ʒ� �޼ҵ忡�� IOException�� ����ؾ���
		//�Ϲ� Exception ���� �Ʒ� IOException�� ����ϴ� �� ����
		int k = Integer.parseInt(data);
		IOException ex = new IOException();
		//���������� IOException �޼ҵ� �ȿ��� IOException�� ��� ������
		throw ex;
		
	};
	

}
