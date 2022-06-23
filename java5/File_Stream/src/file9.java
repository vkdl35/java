import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//Reader(�ֻ���) - (����) BufferedReader, FileReader, CharArrayReader
//(����) InputStreamReader - �̹���, ������, �����
//InputStream (�Է�)
public class file9 {

	public static void main(String[] args) throws IOException {
		// Stream : �̹���, ������, ����� ���� ������ �ε��ϱ� ���ؼ� (���̳ʸ�)
		// InputStream : ��� �Է���ġ�� ���� ���� �޴� Ŭ�����Դϴ�. �⺻(int) - ASCII
		// InputStream (�ֻ��� �Է���ġ)
		// (���� Ŭ����) FileInputStream, AudioInputStream, ObjectInputStream

		InputStream is = new InputStream() { // �⺻ Ŭ������ �ε��Ͽ� �������̵� �޼ҵ�

			@Override
			public int read() throws IOException { // byte
				int a = 15;
				return a;
			}

		};
		//InputStreamReader (��� ��Ŷ ����)
		//InputStreamReader ("���ϸ�",�����Ŷ)
		InputStreamReader ir = new InputStreamReader(is);
		try {
			System.out.println(ir.read());

		} catch (Exception e) {
			System.out.println(e);
		}
		
		//Ű���尪 �ε�
		InputStream user = System.in;
		try {
			int code = user.read();	//Ű���� �Է� ASCII �ڵ尪�� ��ȯ��
			if (code == 13) {
				System.out.println("����Ű�� ����Ͻ� �� �����ϴ�.");
			}
			System.out.println(code);
		} catch (Exception g) {

		}

	}

}
