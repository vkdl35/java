import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//FileOutPutStream
public class file12 {

	public static void main(String[] args) throws IOException {

		String test = "�����Դϴ�.";
		OutputStream os = new FileOutputStream("C:\\java5\\File_Stream\\src\\array.txt",true);
		byte[] data= test.getBytes();	//���� -> ASCII�ڵ�� ��ȯ
		os.write(data);
		os.flush();	//Stream�� ����� ��� ���� �޸𸮿� �ְ� �˴ϴ�. flush() : �޸𸮰��� ��� ���� �۾�

	}

}
