import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class file2 {

	public static void main(String[] args) throws IOException {
		
		try {			
			//FileReader fr = new FileReader("C:\\java5\\File_String\\src\\list.txt");	//���� 8 �� ���
			FileReader fr = new FileReader("C:\\java5\\File_String\\src\\list.txt",Charset.forName("UTF8"));	
			//Charset.forName : JAVA12 -> EUCKR(ANSI),UTF8,UTF16
			//System.out.println(fr.getEncoding());	//���ڴ� ������ Ȯ�� FileReader
			//System.out.println(fr.read());	//������ ũ��
			while (true) {	//loop�� Ȱ���Ͽ� �ش� ���Ͽ� ���ڸ� ��� ������
				int m = fr.read();	//-1 ������ ���� (�Ǵ� �� �̻� ���ڰ� ���� ���)
				System.out.print((char)m);	//char�θ� ���
				if(m == -1) {	//�� �̻� ������ ���ڰ� ���� ���
					break;
				}
			}
			fr.close();	//FilReader�� ������ (�������� ������ ������ ������ ��� �ҷ���)
		}
		catch (IOException e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}

	}

}
