import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

//Files �� �ش� ��� ������ �迭�� ���� ��Ű�� ���
public class file8 {

	public static void main(String[] args) throws IOException {
		
		//List�� �ֻ��� �迭 Ŭ����
		//Files : �ű� IO Ŭ���� �Դϴ�. readAllLines (��ü������ �ѹ��� ��� ����)
		//Files + Paths.get("���")
		
		
		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\buffer.txt"));
		System.out.println(data);
		
		//���� : �޸� �Ҵ��� ������, �ѱ� �����Ŷ�� ���� �ؾ���
		byte[] data2 = Files.readAllBytes(Paths.get("C:\\java5\\File_Stream\\src\\buffer.txt"));
		System.out.println(Arrays.toString(data2));

	}

}
