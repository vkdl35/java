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
	/*
	private int val1;	//pc
	private int val2; 	//user
	private String msg;	//��� �޽���
	
	public void randomck(int pc,int user) {	//setter (�μ��� ����)
		this.val1 = pc;
		this.val2 = user;
		
		if(this.val1 < this.val2) {
			this.msg = "DOWN�Դϴ�.";
		}
		else if(this.val1 > this.val2) {
			this.msg = "UP�Դϴ�.";
		}
		else {
			this.msg = "�����Դϴ�.";
		}
		
	}
	
	public String result() {	//getter(�μ���x) return
		return this.msg;
	}
	*/

}
	
