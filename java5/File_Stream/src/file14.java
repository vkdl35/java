import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//�̹���(binary), ���� ���� ���� byte���� (Filereader (x) - ���� ���� �͸� ���� �� ����)
//FileInputStream - Stream�� �̿��ؾ� �� , read()�� ��� (readLine (x) - �̹����� �ȼ� ��ü�� �ҷ��ͼ� �б� ����)
public class file14 {

	public static void main(String[] args) {
		
		//�޼ҵ忡 throws IOException�� �����ϱ� �ָ��� �� try �ȿ� �־� ����� �� ����
				
		try {
			//FileInputStream fr = new FileInputStream("");
			InputStream is = new FileInputStream("C:\\java5\\File_Stream\\src\\img.jpg");
			//System.out.println(is.read());	//�ȼ� ������ �б� ������ �÷� ��ġ�� ��µ� (�ѹ� ����߱� ������ �Ʒ����� ���簡 ����� �ȵ�)
			/*Stream�� ���ۿ� ����Ͽ� read�� ����ϴ� ����, �ش� �޸𸮿��� ������� ������ �߻��մϴ�.*/
			
			//byte b[] = new byte[is.available()];
			//System.out.println(is.read(b));	//�迭�� �־ ��ü ũ�⸦ Ȯ���� �� ����
			
			byte b[] = new byte[is.available()/100];	//�о���̴� �迭�� ũ�⸦ ������ ������
			OutputStream os = new FileOutputStream("img_test.jpg");	//Output : ����
			/*
			 int img = is.read(b); 
			 System.out.println(img); 
			 os.write(b);	//�ݺ����� ������� �ʾƵ� ��
			 */
			int img = 0;	//�д� ����Ʈ��
			int check = 0;	//�д� Ƚ��
			/*
			while((img=is.read(b)) != -1) {	
				check += img; 
				System.out.println(check + "%");
				os.write(b,0,img);	//�ٿ�ε� %�� ǥ���� �� ����ϱ� ����
			}
			*/
			/*�ٿ�ε�� �ε带 ����ϰų�, progress�� �̿��Ͽ� ������ ��*/
			while(true) {	//����
				img = is.read(b);	//�ش� ������ �о ����Ʈ ������ �ѱ�
				if(img == -1) {
					break;
				}
				else {
					os.write(b,0,img);	//�ٿ��� %�� ǥ���� �� ����ϱ� ����
				}
				check++;
				if(check % 20 == 0) {	//20���� �ɰ�����	
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
