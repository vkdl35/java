import java.util.Scanner;

public class Example2 {
	
	public String mt (int a, int b) {	//a = pc����, b = ����
		
		String msg = ""; 
		if(b < a) {
			msg = "UP";
		}
		else if(b > a) {
			msg = "DOWN";
		}
		else {
			msg = "�����Դϴ�.";
			
		}
		
		return msg;
	}
	

}
	
