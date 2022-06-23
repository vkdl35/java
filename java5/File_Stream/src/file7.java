import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
/* ���� ��ɾ� ���� : read(), readLine(), next(), nextLine() */
//BufferReader (output)
public class file7 {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
			//System.out.println((char)fr.read());
			
			//BufferedReader : Temp(�ӽ������) - ȿ�������� ������ ���� ������ ������ �� �ֽ��ϴ�.
			BufferedReader bf = new BufferedReader(fr);
			//bf.close();	//bf�� ������ fr�� ����.
			//System.out.println(bf.readLine());	//FileReader�� readLine ��� �����. �ݺ��� ������ ����.
			//System.out.println(bf.readLine());	//BufferedReader ���� readLine���� �ش簪�� ��� ���� (���پ� ���)
			//�ش� �ӽ� ����ҿ��� ����� ���� �� �Ѱ��� �������� �ε��ϰ� �˴ϴ�.
			
			/* ���۴� ���ʰ��� ����Ͽ��� ��� ������ ���� ������ ���� ����ϰ� �˴ϴ�. 
			   ���ǹ� ���ÿ��� �ѹ� �۵��� �̷������ �˴ϴ�. */
//			if(bf.readLine() != null) {				
//				int w = 0;
//				while(w <= 0) {
//					String data = bf.readLine();
//					System.out.println(bf.readLine());	//�ݺ��� �ۿ��� �ѹ� ����ϴ��� �ߺ����� ��µ��� �ʰ� �������� ��µ�
//					w++;
//				}
//			}
			
			/* 
			 !-BufferedReader�� ���� �����ص� �ѹ� ������ �� �ߺ����� ������� ����! 1ȸ���̱� ������ �ٽ� �������� FileReader�� ���� �����ؾ���-! 
			 !-�ݺ���, ���ǹ� ��� �����ؼ� �ѹ� ����ϸ� ������� �ʴ��� �ش� ������ �����ʹ� ���ư�-!
			 */
			
			/* ���۴� �ӵ��� ������� ��� �κп� ������ ���� �Ǵ� �迭�� ���� �� ����ϴ� ���� �����մϴ�. */
			String line = "";
			while((line = bf.readLine()) != null) {
				System.out.println(line);
			}
			
			/* ������ ������ ���� ������ Ȯ�� - ????????????????????????????????????????????????????? */ 
			FileReader fr2 = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
			LineNumberReader li = new LineNumberReader(fr2);
			int ea = 0;
			while(li.readLine() != null) {
				ea = li.getLineNumber();
			}
			System.out.println(ea);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
