import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//OutputStream (output)
//(����) FileOutputStream, ObjectOutputStream, 
public class file10 {

	public static void main(String[] args) {
		
		//String a = "ȫ�浿";	//����
		String a = "123456789";
		//byte[] : ���ڿ��� ASCIIŰ ������ �迭�� ����
		byte[] b = a.getBytes();	//getBytes("�����Ŷ") �޼ҵ�
		System.out.println(Arrays.toString(b));	//�ƽ�Ű�ڵ� �迭 ���
		OutputStream os = System.out;	//��¸� ��� System.out.print ����
		
		try {
			os.write(b,0,b.length);	//(Byte�迭�̸�,�迭��ȣ,�迭ũ��)
			os.flush();	//�����Ʈ
		}
		catch (Exception z) {
			
		}
		
		
	}

}
