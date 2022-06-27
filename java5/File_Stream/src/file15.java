import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//이미지 용량제한
public class file15 {

	public static void main(String[] args) throws IOException {
		
		String file = "C:\\java5\\File_Stream\\src\\img.jpg";
		InputStream is = new FileInputStream(file);
		/*FileinputStream을 buffer로 사용하게 되면, 더 이상 FileinputStream을 사용하지 못함*
		  수단으로 buffer에 new FileinputStream 생성하여 별도로 사용할 수 있도록 셋팅함*/
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		/*is로 복사하는 선언 따로, 출력하는 선언 따로 설정 가능*/
		byte filesize[] = new byte[bi.available()];

		int total = bi.read(filesize);
		//System.out.println(is.read(filesize));
		if(total > 80000) {
			System.out.println("이미지 제한 용량은 70kb까지 입니다.");
		}
		else {
			System.out.println("정상적으로 등록 되었습니다.");
			/*	!이거 제대로 작동 안함
			FileOutputStream fo = new FileOutputStream("img_copy.jpg");
			fo.write(total);
			fo.close();
			*/	
		}
		is.close();
		bi.close();
	}

}
