import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//�̹��� �뷮����
public class file15 {

	public static void main(String[] args) throws IOException {
		
		String file = "C:\\java5\\File_Stream\\src\\img.jpg";
		InputStream is = new FileInputStream(file);
		/*FileinputStream�� buffer�� ����ϰ� �Ǹ�, �� �̻� FileinputStream�� ������� ����*
		  �������� buffer�� new FileinputStream �����Ͽ� ������ ����� �� �ֵ��� ������*/
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		/*is�� �����ϴ� ���� ����, ����ϴ� ���� ���� ���� ����*/
		byte filesize[] = new byte[bi.available()];

		int total = bi.read(filesize);
		//System.out.println(is.read(filesize));
		if(total > 80000) {
			System.out.println("�̹��� ���� �뷮�� 70kb���� �Դϴ�.");
		}
		else {
			System.out.println("���������� ��� �Ǿ����ϴ�.");
			/*	!�̰� ����� �۵� ����
			FileOutputStream fo = new FileOutputStream("img_copy.jpg");
			fo.write(total);
			fo.close();
			*/	
		}
		is.close();
		bi.close();
	}

}
