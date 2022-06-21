import java.io.FileReader;
import java.io.IOException;

//IOExceprion + Exceprion
public class file3 {

	public static void main(String[] args) throws IOException, Exception {
		
		filein f = new filein();

	}

}

class filein {
	FileReader fr = null;
	public filein() throws IOException, Exception {
		try {			
			this.fr = new FileReader("C:\\java5\\File_String\\src\\data.dat");
			this.word();
		}
		catch (IOException k) {
			if(k.getMessage()!=null) {				
				System.out.println(k);
			}
		}
	}
	
	public void word() throws  Exception {
		try {
			int w;
			while(true) {
				w = this.fr.read();
				if(w== -1) {
					break;
				}
				System.out.print((char)w);
			}
			this.fr.close();
		}
		catch (Exception g) {	//catch 찍을 때, 부모 자식 둘 다 IOException여도 Exception 사용 가능
			if(g.getMessage() != null) {
				System.exit(0);
			}
		}
//		catch (IOException g1) {
//			if(g1.getMessage() != null) {
//				System.out.println(g1);
//			}
//		}
		
	}
}