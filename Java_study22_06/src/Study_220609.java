import java.util.Random;
import java.util.Scanner;

public class Study_220609 extends main2{	//extends로는 두개 로드 불가능

	public static void main(String[] args) {
		
		/* 오버로딩과 오버라이드 */
		
		cd c = new cd();
		c.display("메인 내용값 출력"); // 오버로딩
		c.display(); // 오버라이드
		
		/* extends 두 번 상속 */
		
		Study_220609 ov = new Study_220609();
		ov.abc();
		ov.abc2();
		
		
		/*
		 * [응용문제1]
		 * A파트 : PC 랜덤 , Scanner(5번)
		 * B파트 : PC 랜덤 숫자와 사용자가 뽑은 숫자를 비교 및 결과처리
		 * 기회는 총 다섯번
		 * 1. PC가 숫자를 하나 선택 (힌트 random) 1 ~ 10까지
		 * 2. 총 기회는 5번 남았습니다. 1 ~ 10까지 번호 중 하나의 번호를 입력
		 * 3. 만약에 PC가 숫자 7을 선택한 기준에서 사용자 숫자와 비교
		 * -PC : 7 / 사용자 : 2 => 결과 : UP입니다
		 * 4. 총 기회는 4번 남았습니다. 1 ~ 10까지 번호 중 하나의 번호를 입력
		 * 5. PC : 7 / 사용자 : 4 => 결과 : UP입니다
		 * 6. 총 기회는 3번 남았습니다. 1 ~ 10까지 번호 중 하나의 번호를 입력
		 * PC : 7 / 사용자 : 7 => 결과 : 정답입니다. (모든 프로세서 정지)
		 */
		
		Bpart ex2 = new Bpart();
		Scanner sc = new Scanner(System.in);
		
		/* 일반 random 방식 (random double 자료형) */
		//int pc = (int)(Math.random()*10+1); 
		
		/* util을 이용한 random 방식 */
		Random r = new Random();	//랜덤이라는 객체만 선언
		int pc = r.nextInt(10)+1;	//범위와 조건 설정
		int w = 5;
		do {
			System.out.printf("총 기회 %d번 남았습니다.\n",w);
			int user = sc.nextInt();
			ex2.randomck(pc,user);
			String out = ex2.result();
			System.out.println(out);
			int check = out.indexOf("정답");	
			//indexOf : 단어검색 (-1 : 없음, 1 : 있음)
			if(check==0) {
				break;
			}
			w--;
		}while(w > 0);
		sc.close();

	}

}

class pt {
	public void display() {
		System.out.println("부모 외부 내용값");
	}
}
class cd extends pt {
	/*
	 	!- aaaa() 메소드는 에노테이션을 사용하지 못함. 부모 class에서 선언하지 않았음 -!
	 
	 	@Override -> 부모 클래스에 없는 메소드 사용시 오류, 해결하려면 부모 클래스에 같은 메소드를 만들어주면 됨 public void
	 	aaaa() { System.out.println("자식에 만들어진 메소드"); }
	 */
	@Override // 에노테이션(표시) 문제 발생시 확인 (오버라이드에만 적용)
	public void display() { // 오버라이드
		System.out.println("자식 클래스 값으로 변경");
		super.display(); // super : 부모에 있는 고유 속성 메소드값을 가져올 때 사용합니다. (필드에 선언되지 않은 값을 가져올 때)
	}
	public void display(String msg) { // 오버로딩
		System.out.println(msg);
	}
}
class main2 extends main3 {
	public void abc() {
		System.out.println("외부 메소드 클래스");
	}
}

class main3 {
	public void abc2() {
		System.out.println("외부 메소드 클래스2");
	}
}
class Inter implements Study_220609_connect { // interface > implements 사용시에만 사용되는 전용 메소드명입니다.
	@Override
	public void c1() {
		System.out.println(names);
		System.out.println("interface_1");
	}
	public static void main5() {
		Inter it = new Inter();
		it.c1();
	}
}
class Bpart {
	private int val1; // pc
	private int val2; // user
	private String msg; // 결과 메시지
	public void randomck(int pc, int user) { // setter (인수값 받음)
		this.val1 = pc;
		this.val2 = user;
		if (this.val1 < this.val2) {
			this.msg = "DOWN입니다.";
		} else if (this.val1 > this.val2) {
			this.msg = "UP입니다.";
		} else {
			this.msg = "정답입니다.";
		}
	}
	public String result() { // getter(인수값x) return
		return this.msg;
	}
}