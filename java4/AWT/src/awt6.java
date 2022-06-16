import java.util.ArrayList;

//인증번호 발송 시스템 - awt6_abstract.java 연동
public class awt6 {

	public static void main(String[] args) {
		
		mimi m = new mimi();
		m.dy();

	}

}

class mimi extends awt6_abstract {
	
	private int ai2;
	private String msg2 = "";
	boolean k1;
	
	
	@Override
	public void num(int a) {	//setter
		k1=false;
		if(a == this.ai2) {
			k1 = true;
		}
	}
	@Override
	public boolean k() {	//getter
		return k1;
	};
	@Override
	public void db() {	
		int v; 
		int w = 0;
		String ai = "";
		
		while(w < 4) {
			v = (int)(Math.random()*10);
			ai += Integer.valueOf(v);
			w++;
		}
		
		this.ai2 = Integer.parseInt(ai);
		System.out.println(this.ai2);	
	}
}
