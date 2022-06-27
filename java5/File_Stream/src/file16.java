import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

//�̹��� �б�, ����
public class file16 {

	public static void main(String[] args) throws IOException {
		//r,w,x => r(read) : �б� , w(write) : ���� , x(excute) : ����
		//RandomAccess : ����ڰ� �ش� ���� �Ӽ� ������ ������ �� ����
		try {
			String files = "C:\\java5\\File_Stream\\src\\img.jpg";
			String cp = "img222.jpg";
			
			RandomAccessFile file = new RandomAccessFile(files , "r");
			RandomAccessFile file2 = new RandomAccessFile(cp , "rw");
			
			//FileChannel : IO(FileInputStream, FileOutputStream) ���� ����
			//getChannel() : RandomAccessFile �ش� �޼ҵ带 �������� ����
			FileChannel fc = file.getChannel();
			FileChannel target = file2.getChannel();
			
			//transferTo, transferFrom (���� ����)
			//fc.transferTo(0, fc.size(), target);	//(�迭0, �迭����ȣ, ������ġ)
			target.transferFrom(fc, 0, fc.size());	//(����������, �迭0, �迭����ȣ)
			
			file.close();
			file2.close();
		}catch (Exception e) {
			
		}
		

	}

}
