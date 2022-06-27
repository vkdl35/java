import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//이미지(binary), 영상 파일 설정 byte단위 (Filereader (x) - 문서 같은 것만 읽을 수 있음)
//FileInputStream - Stream을 이용해야 함 , read()만 사용 (readLine (x) - 이미지는 픽셀 전체를 불러와서 읽기 때문)
public class file14 {

	public static void main(String[] args) {
		
		//메소드에 throws IOException을 선언하기 애매할 때 try 안에 넣어 사용할 수 있음
				
		try {
			//FileInputStream fr = new FileInputStream("");
			InputStream is = new FileInputStream("C:\\java5\\File_Stream\\src\\img.jpg");
			//System.out.println(is.read());	//픽셀 단위로 읽기 때문에 컬러 수치가 출력됨 (한번 사용했기 때문에 아래에서 복사가 제대로 안됨)
			/*Stream은 버퍼와 비슷하여 read를 사용하는 순간, 해당 메모리에서 비워지는 사항이 발생합니다.*/
			
			//byte b[] = new byte[is.available()];
			//System.out.println(is.read(b));	//배열에 넣어서 전체 크기를 확인할 수 있음
			
			byte b[] = new byte[is.available()/100];	//읽어들이는 배열의 크기를 강제로 조절함
			OutputStream os = new FileOutputStream("img_test.jpg");	//Output : 복사
			/*
			 int img = is.read(b); 
			 System.out.println(img); 
			 os.write(b);	//반복문을 사용하지 않아도 됨
			 */
			int img = 0;	//읽는 바이트수
			int check = 0;	//읽는 횟수
			/*
			while((img=is.read(b)) != -1) {	
				check += img; 
				System.out.println(check + "%");
				os.write(b,0,img);	//다운로드 %를 표시할 때 사용하기 위함
			}
			*/
			/*다운로드시 로드를 출력하거나, progress를 이용하여 보여줄 때*/
			while(true) {	//루프
				img = is.read(b);	//해당 파일을 읽어서 바이트 변수로 넘김
				if(img == -1) {
					break;
				}
				else {
					os.write(b,0,img);	//다운드로 %를 표시할 때 사용하기 위함
				}
				check++;
				if(check % 20 == 0) {	//20으로 쪼개놓음	
					System.out.println(check + "%");	
				}
			}
			is.close();
			os.close();
			
		}catch (IOException i) {
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		 

	}

}
