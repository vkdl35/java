import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream�� �̿��� ���� �ε�
public class file11 {

	public static void main(String[] args) throws IOException {
		
		try {
			InputStream is = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
			
			//System.out.println(is.available());//available : ���� ��ü ũ��
			
			//������ �뷮 �迭 ���� (���� ũ�⿡ ���� ������ �ְ� ����)
			byte temp[] = new byte[is.available()];	
			int ea = is.read(temp);
			String data = new String(temp,"UTF-8");
			System.out.println(data);
			
			/*	-������ �� �� ���-
			//FileInputStream fs = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");	//��,�Ʒ� �� �� ��� ������ �ڵ�
			byte[] temp = new byte[1000];	//9999byte�� ����Ѵٴ� �� - byte�� �迭ó�� null�� ä������ �ʱ� ������ ũ�Ⱑ �������� ����
			int ea = is.read(temp);	//ASCII �ڵ�� ��ü�� �о ea�� �޵��� ��
			String data = new String(temp,"UTF-8");	//String �������·� �迭�� �޾Ƽ� ���
			System.out.println(data);
			*/
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
