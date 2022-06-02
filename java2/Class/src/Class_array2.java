import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10까지 숫자를 하나 선택하세요.");
		int no = sc.nextInt();
		
		memorys m = new memorys();
		/*
		memorys m = null;
		m = new memorys();
		m.ms();
		m=null;
		m.ms();
		*/
		m.ms(no);
		m = null;	//해당 인스턴스를 비움
		
		m = new memorys();
		m.rd();
		
	}

}

class memorys {
	public void ms(int user) {
		//Math.random() 랜덤 메소드 사용법 기본은 자료형 double입니다.
		/* 
		  random -> 보안코드, 인증코드, 추첨, 룰렛
		 */
		double a = Math.random();	//0.0 ~ 1.0
		int w = 0;
		while(w<=10) {			
			int b = (int)(Math.random()*10)+1;	//0 ~ 10  double -> int 변경
			//System.out.printf("%d ",b);
			w++;
		}
		
		/*
		if(user==b) {
			System.out.println("당첨");
		}
		else {
			System.out.println("다음 기회에");
		}
		*/
		//System.out.println(b);	
	}
	
	public void rd() {	//random util 사용법
		Random r = new Random();	//random 객체 생성 및 인스턴스 적용
		int w = 0;
		while(w < 6) {
			System.out.println(r.nextInt(45)+1);	//0 ~ 9 까지 r.nextInt를 사용
			w++;
		}
//		r=null;
	}
	
	
}