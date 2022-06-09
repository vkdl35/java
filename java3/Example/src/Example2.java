import java.util.Scanner;

public class Example2 {
	
	public String mt (int a, int b) {	//a = pc랜덤, b = 유저
		
		String msg = ""; 
		if(b < a) {
			msg = "UP";
		}
		else if(b > a) {
			msg = "DOWN";
		}
		else {
			msg = "정답입니다.";
			
		}
		
		return msg;
	}
	

}
	
