
public class oop3 {
/*멀티 쓰레드(Multi Thread) : start , run , sleep , setStop */
/*멀티 쓰레드 : CPU의 코어와 관계가 있습니다.*/
	public static void main(String[] args) {
		/*쓰레드(Thread) : 프로세스 내부에서 독립적으로 실행되는 작업*/
		/*멀티 쓰레드(Multi Thread) : 프로세서 내부에서 두가지 이상의 작업을 동시 사용*/
		Thread my = new mythread();	/*부모 메소드 = 자식 메소드*/
		my.start();
		//my.pulib();
		Thread my2 = new test2();
		my2.start();	/*Thread 메소드에 기본 run을 작동하기 위한 start 명령어입니다.*/
		int f = 1;
		while(f < 11) {
			System.out.println("내부 클래스 : "+f);
			f++;
		}
		
	}

}
class test2 extends Thread{
	@Override
	public void run() {
		int f = 1;
		while(f < 11) {
			System.out.println("외부 클래스2 : "+f);
			f++;
		}
	}
}

class mythread extends Thread{	/*Thread : JVM에 기본으로 탑재 되어 있는 메소드(Thread는 단독으로 사용하지 않음)*/
	@Override
	public void run() {	/*run이란 : 멀티메소드 기본 실행 메소드*/
		int w = 1;
		while(w < 11) {
			System.out.println("외부 클래스 : "+w);
			w++;
		}
	}
}