
public class Class2 {

	public static void main(String[] args) {
		/*
		 * [응용문제]
		 * 더블 클래스를 이용하여 자식 클래스의 결과값을 출력하는 프로세서를 제작하세요.
		 * 클래스는 두가지가 있습니다. 
		 * 부모 클래스명 : mother
		 * 자식 클래스명 : child
		 * 메인 클래스에서 mother 클래스로 값을 전달합니다.
		 * 30 50 숫자값을 적용합니다.
		 * child에서 부모 클래스에 있는 값을 받아, 두개의 숫자를 곱한 결과값을 출력하세요.*/
		
		mother m = new mother(30,50);
		mother.child mc = m.new child();
		mc.cd();
	}

}

class mother {
	int a;
	int b;
	public mother(int a1, int b1) {
		this.a = a1;
		this.b = b1;
	}
	class child {
		public void cd() {
			System.out.println(mother.this.a*mother.this.b);	//다른 메소드 생성에 대비해서 자식 class 필드에 선언해도 됨
			
		}
	}
}