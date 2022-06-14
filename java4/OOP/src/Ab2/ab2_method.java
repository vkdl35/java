

package Ab2;
import Ab.method_1;	//package Ab에서 main class를 로드함


public class ab2_method extends Ab.method_1 {	
	//자식클래스로 선언해줘야 protected 메소드 실행 가능 ,프라이빗은 못씀
	
	public static void main(String[] args) {
		Ab.method_1 at = new Ab.method_1();
		at.recall();	//public 메소드 실행
		at.main(args);	//mian 메소드 실행
		at.name(); 		//protected 메소드실행
		
	}

}

