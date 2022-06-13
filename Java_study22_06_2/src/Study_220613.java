import java.util.Arrays;
import java.util.Scanner;

public class Study_220613 {

	public static void main(String[] args) {
		
		/* 재귀 메소드 ▶ 74 */
		
		op_mathod op = new op_mathod();	//메인에선 호출만 
		op = null;
		
		/* 배열 신규 생성값을 정확하게 설정하여 신규 배열로 생성하기 ▶ 96 */
		
		array1 ar = new array1();
		ar = null;
		
		/* 멀티 스레드 : 내부, 외부 클래스 메소드 전부 독립적으로 실행(순차적으로 실행되지 않는다) ▶ 126*/
		
		Thread my = new mythread();	//부모 메소드에 있는 자식 메소드를 불러오는 것
		my.start(); //Thread 메소드에 기본 run을 작동시키기 위한 start 명령어
		int f = 1;
		while(f < 11) {
			System.out.println("내부 클래스" + f);
			f++;
		}
		my = null;
		
		/* 추상 클래스 및 메소드 abstract ▶ 137 */
		
		ab_2 ab = new ab_2();
		ab.ab_a();
		ab = null;
		
		/* abstract 응용 ▶ 157 */
		
		load1 ld = new load1();
		ld.datain(20, 30);
		ld.call();	/* ! 자식 클래스로 선언했으니 자식 클래스 안에 있는 메소드를 호출해도 되지 않나? */
		ld = null;
		
		/* 배열 형태의 생성자 객체 추상클래스 만들기 ▶ 174 */
		
		box[] b = {new abox(),new bbox(),new cbox()};
		int k = 0;
		while(k < b.length) {
			/* 만약 조건이 인덱스 1번에 해당하는 클래스 사용 중지라면 */
			if(k != 1) {	
				b[k].dataload();
			}
			k++;
		}
		//foreach문 단점은 특정 클래스를 중지할 수 없음
		
		
		/*
		 * [응용문제1] - abstract	▶ 195
		 * 1차 배열값이 있습니다.
		 * 해당 배열값을 모두 더한 값을 출력합니다.
		 * 단, abstract 기본 void 이름은 sender 입니다.
		 * 최종값 출력은 sender에서 출력되도록 하며, 배열은 abstract에서 사용합니다.
		 * 호출은 메인에서만 진행합니다.
		 * 배열 데이터 : 6,13,22,9,12,64,32,47,39
		 */
		
		od2 o = new od2();
		o.sender();
		o = null;
		
	}

}

class op_mathod {	//  ▶ 8
	Scanner sc = new Scanner(System.in); 
	//메소드나 메인에 선언하면 계속 new가 생성되면서 메모리를 잡아먹음. 필드로 빼줘서 한번만 사용하기
	private String nm;
	public op_mathod() {	//(1) 가장 먼저 실행되는 메소드,  m1을 호출
		this.m1();
	}
	public void m1() {	//(2) 메시지 출력과 사용자 입력 스캐너 실행
		System.out.println("찾을 이름을 입력하세요.");
		this.nm  = sc.next();
	}
	public void m2() {	 
		if(this.nm.equals("이경민")) {	//(3) 조건문에서 사용자 입력값 중에 이경민이 있다면
			sc.close();	
			System.exit(0);	//(4) 즉시 시스템 종료 (스캐너도 종료)
		}
		else {	
			System.out.println("해당 이름은 없습니다.");	//(5) 만약 위 조건이 아닐시 출력과 함께
			this.m1();	//(6) 다시 m1으로 돌아가서 재실행
		}
	}
}
class array1 {	//  ▶ 13
	private int ar1[];	//(1) 필드값부터 생성
	private int ea;
	public array1() {
		this.ar1 = new int[] {1,2,6,11,45,19,0,4,8};
		this.ea = this.ar1.length;
		int w = 0;
		String newdata = "";
		while(w < ea) {	
			/*만약 조건이 5이상의 배열값만 가져오기라면*/
			if(this.ar1[w] >= 5) {
				newdata += this.ar1[w] + ",";
				//(2) 반복문과 조건문으로 배열값 중 5이상만 string 변수에 담기(문자열로 변환)
			}
			w++;
		}
		String ar2[] = newdata.split(",");
		//(3) 저장된 문자열을 스플릿으로 구분하여 배열로 임시전환 (스플릿은 문자 자료형만 사용 가능)
		int ar2_ea = ar2.length;
		int oridata[] = new int[ar2_ea];	
		//(3) 빈 배열박스에 아까 뽑아낸 인덱스값의 갯수만큼 들어간다고 선언 (배열 신규 생성값)
		int ww = 0;
		while(ww < ar2_ea) {
			oridata[ww] = Integer.parseInt(ar2[ww]);
			//(4) 반복문을 돌려서 아직 문자 상태인 oridata 배열 데이터값을 숫자로 변환
			ww++;
		}
		System.out.println(Arrays.toString(oridata));
	}
}
class mythread extends Thread {	//  ▶ 18
	//Thread는 자바에서 기본으로 설정된 메소드다
	@Override
	public void run() {	//마찬가지로 기본으로 설정된 메소드 이름, 명령어라고 생각하면 편함
		int w = 1;
		while(w < 11) {
			System.out.println("외부 클래스" + w);
			w++;
		}
	}
}
abstract class ab_1 {	//  ▶ 29
	//추상 클래스로 외부에서 절대 로드되지 않음 - 자체 실행 불가
	public void ab_a() {
		/* 부모 클래스 안에 값이 있으면 자식 클래스에서 같은 메소드 사용 불가
			단, 인자값의 유무에 따라 사용이 가능할 수도 있음 */
	}
	public abstract int c();	
		/* 추상 메소드 - 자체 실행 불가 및 무조건 자식 클래스에서 사용해야 함
			부모 클래스에 abstract를 선언했으면 자식 메소드에서 반드시 사용해야 함 
			abstract가 없는 메소드는 무조건 중괄호가 있어야 사용 가능 */
}
class ab_2 extends ab_1{	
	public void ab_a() {
		System.out.println(this.c());
	}
	@Override
	public int c() {
		return 99;
	}
}
abstract class abc{	//  ▶ 35
	int data1, data2;
	public void datain(int d1, int d2) {	//(1) main에서 데이터를 받음
		this.data1 = d1;	//(2) 필드값에 있던 변수에 넣어줌
		this.data2 = d2;
	}
	public abstract void plus();	//(3)자식 클래스는 plus 메소드를 무조건 사용해라
	public void call() {
		this.plus();	/* ! 부모 메소드에서 호출해야 코드가 깔끔해진다는데 잘 모르겠다 */
	}
}
class load1 extends abc {
	public void plus() {	//(4) 부모 클래스가 지정한 plus 메소드를 사용
		int sum = this.data1 + this.data2;
		System.out.println(sum);	//(5) 결과값 출력, main에서 호출해주면 출력 가능
	}
}
abstract class box {	//  ▶ 42
	public abstract void dataload();
}
class abox extends box {
	@Override
	public void dataload() {
		System.out.println("test");
	}
}
class bbox extends box {
	@Override
	public void dataload() {
		System.out.println("test2");
	}
}
class cbox extends box {
	@Override
	public void dataload() {
		System.out.println("test3");
	}
}
abstract class fii {	//  ▶57
	protected int i[] = {6,13,22,9,12,64,32,47,39};
	public abstract void sender();
}
class od2 extends fii {
	public void sender() {
		int w = 0;
		int total = 0;
		while(w < i.length) {
			total += i[w];
			w++;
		}
		System.out.println(total);
	}
}