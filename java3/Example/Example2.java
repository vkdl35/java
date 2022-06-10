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
	/*
	private int val1;	//pc
	private int val2; 	//user
	private String msg;	//결과 메시지
	
	public void randomck(int pc,int user) {	//setter (인수값 받음)
		this.val1 = pc;
		this.val2 = user;
		
		if(this.val1 < this.val2) {
			this.msg = "DOWN입니다.";
		}
		else if(this.val1 > this.val2) {
			this.msg = "UP입니다.";
		}
		else {
			this.msg = "정답입니다.";
		}
		
	}
	
	public String result() {	//getter(인수값x) return
		return this.msg;
	}
	*/

}
	
