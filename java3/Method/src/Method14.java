
public class Method14 {

	public static void main(String[] args) {
		
		Mbc m = new Mbc();	//지우면 첫번째 Mbc + test 메소드 출력 안됨 
		Mbc m2 = new Mbc("이순신");
		

	}

}

class Mbc{
	/* 메소드 형태나 이름이 같아도 인수값에 따라 다르게 구분됨, 단, 순차적으로 실행되어 적용됨 */
	public Mbc() {	//일반 construct
		System.out.println("구조1");
		test();
	}
	public Mbc(String user) {	//인수값이 있는 construct
		System.out.println(user);	
		test(user);
	}
	public Mbc(int user2) {	//construct에서 인수값은 자료형으로 구분 됩니다.
		System.out.println(user2);	
		//test(user);
	}
	public void test() {	//일반 메소드
		System.out.println("메소드");
		total();
	}
	public void test(String user) {	//인수값이 있는 메소드
		System.out.println(user);
		total();
	}
	public static void total() {
		System.out.println("시스템 종료");
	}
}
